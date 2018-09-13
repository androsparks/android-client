package vision.genesis.clientapp.feature.main.dashboard.investor.header;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.arellomobile.mvp.presenter.InjectPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import io.swagger.client.model.DashboardChartValue;
import vision.genesis.clientapp.R;
import vision.genesis.clientapp.feature.BaseFragment;
import vision.genesis.clientapp.ui.chart.PortfolioChartView;
import vision.genesis.clientapp.utils.ThemeUtil;
import vision.genesis.clientapp.utils.TypefaceUtil;

/**
 * GenesisVisionAndroid
 * Created by Vitaly on 13/08/2018.
 */

public class InvestorDashboardHeaderPortfolioFragment extends BaseFragment implements InvestorDashboardHeaderPortfolioView
{
	@BindView(R.id.balance_title)
	public TextView balanceTitle;

	@BindView(R.id.balance_value)
	public TextView balanceValue;

	@BindView(R.id.balance_value_secondary)
	public TextView balanceValueSecondary;

	@BindView(R.id.change_title)
	public TextView changeTitle;

	@BindView(R.id.change_value)
	public TextView changeValue;

	@BindView(R.id.change_value_secondary)
	public TextView changeValueSecondary;

	@BindView(R.id.change_percent)
	public TextView changePercent;

	@BindView(R.id.requests_title)
	public TextView requestsTitle;

	@BindView(R.id.requests_value)
	public TextView requestsValue;

	@BindView(R.id.requests_value_secondary)
	public TextView requestsValueSecondary;

	@BindView(R.id.portfolio_chart)
	public PortfolioChartView chart;

	@InjectPresenter
	public InvestorDashboardHeaderPortfolioPresenter investorDashboardHeaderPortfolioPresenter;

	private Unbinder unbinder;

	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_investor_dashboard_header_portfolio, container, false);
	}

	@Override
	public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);

		unbinder = ButterKnife.bind(this, view);

		setFonts();

		chart.setTouchListener(new PortfolioChartView.TouchListener()
		{
			@Override
			public void onTouch(int index) {
				investorDashboardHeaderPortfolioPresenter.onPortfolioChartTouch(index);
			}

			@Override
			public void onStop() {

			}
		});
	}

	@Override
	public void onResume() {
		super.onResume();

		investorDashboardHeaderPortfolioPresenter.onShow();
	}

	@Override
	public void onDestroyView() {
		if (unbinder != null) {
			unbinder.unbind();
			unbinder = null;
		}

		super.onDestroyView();
	}

	private void setFonts() {
//		balanceTitle.setTypeface(TypefaceUtil.light());
//		changeTitle.setTypeface(TypefaceUtil.light());
//		requestsTitle.setTypeface(TypefaceUtil.light());

		balanceValue.setTypeface(TypefaceUtil.semibold());
		changeValue.setTypeface(TypefaceUtil.semibold());
		changePercent.setTypeface(TypefaceUtil.semibold());
		requestsValue.setTypeface(TypefaceUtil.semibold());

		balanceValueSecondary.setTypeface(TypefaceUtil.medium());
		changeValueSecondary.setTypeface(TypefaceUtil.medium());
		requestsValueSecondary.setTypeface(TypefaceUtil.medium());
	}

	public void setData(DashboardChartValue chartValue) {
		investorDashboardHeaderPortfolioPresenter.setData(chartValue);
		chart.setChart(chartValue);
	}

	@Override
	public void hideRequests() {

	}

	@Override
	public void setBalance(String gvtBalance, String baseBalance) {
		balanceValue.setText(gvtBalance);
		balanceValueSecondary.setText(baseBalance);
	}

	@Override
	public void setChange(Boolean isChangeNegative, String changePercent, String changeValue, String baseChangeValue) {
		this.changePercent.setTextColor(isChangeNegative
				? ThemeUtil.getColorByAttrId(getContext(), R.attr.colorRed)
				: ThemeUtil.getColorByAttrId(getContext(), R.attr.colorGreen));

		this.changePercent.setText(changePercent);
		this.changeValue.setText(changeValue);
		this.changeValueSecondary.setText(baseChangeValue);
	}
}