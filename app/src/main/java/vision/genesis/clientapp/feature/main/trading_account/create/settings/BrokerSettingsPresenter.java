package vision.genesis.clientapp.feature.main.trading_account.create.settings;

import android.content.Context;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;
import java.util.Locale;
import java.util.UUID;

import javax.inject.Inject;

import io.swagger.client.model.Broker;
import io.swagger.client.model.BrokerAccountType;
import io.swagger.client.model.Currency;
import vision.genesis.clientapp.GenesisVisionApplication;
import vision.genesis.clientapp.R;
import vision.genesis.clientapp.model.events.OnAccountBrokerSettingsSelectedEvent;

/**
 * GenesisVisionAndroid
 * Created by Vitaly on 20/11/2019.
 */

@InjectViewState
public class BrokerSettingsPresenter extends MvpPresenter<BrokerSettingsView>
{
	@Inject
	public Context context;

	private Broker broker;

	private BrokerAccountType selectedAccountType;

	private UUID assetId;

	private UUID brokerAccountTypeId;

	private Currency currency;

	private Integer leverage;

	@Override
	protected void onFirstViewAttach() {
		super.onFirstViewAttach();

		GenesisVisionApplication.getComponent().inject(this);
	}

	void setAssetId(UUID assetId) {
		this.assetId = assetId;
	}

	void setBroker(Broker broker) {
		this.broker = broker;

		this.brokerAccountTypeId = null;
		this.currency = null;
		this.leverage = null;

		ArrayList<String> accountTypeOptions = new ArrayList<>();
		for (BrokerAccountType accountType : broker.getAccountTypes()) {
			accountTypeOptions.add(accountType.getName());
		}
		getViewState().setAccountTypeOptions(accountTypeOptions);
		onAccountTypeOptionSelected(0, accountTypeOptions.get(0));
	}

	private void updateNextButtonAvailability() {
		boolean currencyOk = assetId == null || currency != null;
		getViewState().setNextButtonEnabled(brokerAccountTypeId != null && currencyOk && leverage != null);
	}

	void onAccountTypeOptionSelected(Integer position, String text) {
		selectedAccountType = broker.getAccountTypes().get(position);
		brokerAccountTypeId = selectedAccountType.getId();
		currency = null;
		leverage = null;

		getViewState().setAccountType(text, position);
		getViewState().setAccountTypeDescription(String.format(Locale.getDefault(), "%s: %s",
				context.getString(R.string.trading_platform), selectedAccountType.getType().getValue()));

		getViewState().setCurrencyOptions(new ArrayList<>(selectedAccountType.getCurrencies()));
		onCurrencyOptionSelected(0, selectedAccountType.getCurrencies().get(0));

		ArrayList<String> leverageOptions = new ArrayList<>();
		for (Integer leverage : selectedAccountType.getLeverages()) {
			leverageOptions.add(String.format(Locale.getDefault(), "1:%d", leverage));
		}
		getViewState().setLeverageOptions(leverageOptions);
		onLeverageOptionSelected(0, leverageOptions.get(0));

		updateNextButtonAvailability();
	}

	void onCurrencyOptionSelected(Integer position, String text) {
		currency = Currency.fromValue(selectedAccountType.getCurrencies().get(position));
		getViewState().setCurrency(text, position);
		updateNextButtonAvailability();
	}

	void onLeverageOptionSelected(Integer position, String text) {
		leverage = selectedAccountType.getLeverages().get(position);
		getViewState().setLeverage(text, position);
		updateNextButtonAvailability();
	}

	void onConfirmClicked() {
		EventBus.getDefault().post(new OnAccountBrokerSettingsSelectedEvent(brokerAccountTypeId, currency, leverage));
	}
}
