package vision.genesis.clientapp.managers;

import java.util.List;

import io.swagger.client.api.InvestorApi;
import io.swagger.client.model.DashboardPortfolioEvent;
import io.swagger.client.model.DashboardPortfolioEvents;
import io.swagger.client.model.DashboardProgramsList;
import rx.Observable;
import rx.schedulers.Schedulers;
import rx.subjects.BehaviorSubject;
import vision.genesis.clientapp.model.DateRange;

/**
 * GenesisVisionAndroid
 * Created by Vitaly on 02/07/2018.
 */

public class InvestorDashboardManager
{
	private InvestorApi investorApi;

	private BehaviorSubject<List<DashboardPortfolioEvent>> portfolioEventsSubject = BehaviorSubject.create();

	public InvestorDashboardManager(InvestorApi investorApi) {
		this.investorApi = investorApi;
	}

	public Observable<DashboardProgramsList> getPrograms(String sorting, DateRange dateRange, Integer skip, Integer take) {
		return investorApi.v10InvestorDashboardProgramListGet(AuthManager.token.getValue(), sorting, dateRange.getFrom(), dateRange.getTo(), skip, take);
	}

	public Observable<DashboardProgramsList> getPortfolioEvents(String sorting, DateRange dateRange, Integer skip, Integer take) {
		return investorApi.v10InvestorDashboardProgramListGet(AuthManager.token.getValue(), sorting, dateRange.getFrom(), dateRange.getTo(), skip, take);
	}

	public BehaviorSubject<List<DashboardPortfolioEvent>> getPortfolioEvents() {
		updatePortfolioEvents();
		return portfolioEventsSubject;
	}

	private void updatePortfolioEvents() {
		investorApi.v10InvestorDashboardEventsGet(AuthManager.token.getValue())
				.observeOn(Schedulers.io())
				.subscribeOn(Schedulers.io())
				.subscribe(this::handleUpdatePortfolioEventsResponse,
						this::handleUpdatePortfolioEventsError);
	}

	private void handleUpdatePortfolioEventsResponse(DashboardPortfolioEvents response) {
		portfolioEventsSubject.onNext(response.getEvents());
	}

	private void handleUpdatePortfolioEventsError(Throwable error) {
		portfolioEventsSubject.onError(error);
	}
}