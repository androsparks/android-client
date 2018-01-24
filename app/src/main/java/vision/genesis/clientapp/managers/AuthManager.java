package vision.genesis.clientapp.managers;

import io.swagger.client.api.AccountApi;
import io.swagger.client.model.LoginViewModel;
import io.swagger.client.model.RegisterInvestorViewModel;
import io.swagger.client.model.RegisterManagerViewModel;
import rx.Observable;
import rx.Subscription;
import rx.schedulers.Schedulers;
import rx.subjects.BehaviorSubject;
import vision.genesis.clientapp.BuildConfig;
import vision.genesis.clientapp.model.User;

/**
 * GenesisVision
 * Created by Vitaly on 1/22/18.
 */

public class AuthManager
{
	public BehaviorSubject<User> userSubject = BehaviorSubject.create();

	private BehaviorSubject<String> loginResponseSubject = BehaviorSubject.create();

	private Subscription loginSubscription;

	private AccountApi api;

	public AuthManager(AccountApi api) {
		this.api = api;
		userSubject.onNext(null);
	}

	public Observable<String> login(String email, String password) {
		loginResponseSubject = BehaviorSubject.create();
		LoginViewModel model = new LoginViewModel();
		model.setEmail(email);
		model.setPassword(password);
		Observable<String> loginApiObservable = getLoginApiObservable(model);
		loginSubscription = loginApiObservable
				.subscribeOn(Schedulers.io())
				.observeOn(Schedulers.io())
				.subscribe(this::handleLoginResponse,
						error -> {
							loginSubscription.unsubscribe();
							loginResponseSubject.onError(error);
						});

		return loginResponseSubject;
	}

	private void handleLoginResponse(String response) {
		User user = new User();
		userSubject.onNext(user);
		loginResponseSubject.onNext("success");
	}

	public Observable<Void> register(String email, String password, String confirmPassword) {
		return BuildConfig.FLAVOR.equals("investor")
				? registerInvestor(email, password, confirmPassword)
				: registerManager(email, password, confirmPassword);
	}

	private Observable<Void> registerInvestor(String email, String password, String confirmPassword) {
		RegisterInvestorViewModel model = new RegisterInvestorViewModel();
		model.setEmail(email);
		model.setPassword(password);
		model.setConfirmPassword(confirmPassword);
		return api.apiInvestorAuthSignUpPost(model);
	}

	private Observable<Void> registerManager(String email, String password, String confirmPassword) {
		RegisterManagerViewModel model = new RegisterManagerViewModel();
		model.setEmail(email);
		model.setPassword(password);
		model.setConfirmPassword(confirmPassword);
		return api.apiManagerAuthSignUpPost(model);
	}

	private Observable<String> getLoginApiObservable(LoginViewModel model) {
		return BuildConfig.FLAVOR.equals("investor")
				? api.apiInvestorAuthSignInPost(model)
				: api.apiManagerAuthSignInPost(model);
	}
}
