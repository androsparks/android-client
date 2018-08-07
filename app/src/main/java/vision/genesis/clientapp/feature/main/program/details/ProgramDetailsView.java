package vision.genesis.clientapp.feature.main.program.details;

import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType;

import java.util.List;

import io.swagger.client.model.ChartProgramDetails;
import io.swagger.client.model.ProgramDetailsFull;

/**
 * GenesisVisionAndroid
 * Created by Vitaly on 17/04/2018.
 */

interface ProgramDetailsView extends MvpView
{
	@StateStrategyType(AddToEndSingleStrategy.class)
	void setProgramDetails(ProgramDetailsFull programDetails);

	@StateStrategyType(AddToEndSingleStrategy.class)
	void showInvestWithdrawButtons(boolean show);

	@StateStrategyType(AddToEndSingleStrategy.class)
	void showProgress(boolean show);

	@StateStrategyType(AddToEndSingleStrategy.class)
	void setRefreshing(boolean show);

	void setChartData(List<ChartProgramDetails> chart);
}