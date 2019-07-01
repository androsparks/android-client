package vision.genesis.clientapp.feature.main.dashboard.investor.open_trades;

import com.arellomobile.mvp.MvpView;

import java.util.List;

import io.swagger.client.model.OrderSignalModel;

/**
 * GenesisVisionAndroid
 * Created by Vitaly on 30/06/2019.
 */

interface DashboardOpenTradesView extends MvpView
{
	void showProgressBar(boolean show);

	void showEmpty(boolean show);

	void showSnackbarMessage(String message);

	void setOpenTrades(List<OrderSignalModel> trades);
}
