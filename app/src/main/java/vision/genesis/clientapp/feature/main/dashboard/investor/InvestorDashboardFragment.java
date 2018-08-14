package vision.genesis.clientapp.feature.main.dashboard.investor;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.TextView;

import com.arellomobile.mvp.presenter.InjectPresenter;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import io.swagger.client.model.DashboardPortfolioEvent;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;
import vision.genesis.clientapp.R;
import vision.genesis.clientapp.feature.BaseFragment;
import vision.genesis.clientapp.feature.main.dashboard.investor.programs.DashboardPagerAdapter;
import vision.genesis.clientapp.feature.main.tooltip.TooltipActivity;
import vision.genesis.clientapp.model.InvestmentProgramDashboardExtended;
import vision.genesis.clientapp.model.TooltipModel;
import vision.genesis.clientapp.ui.PortfolioEventDashboardView;
import vision.genesis.clientapp.utils.ThemeUtil;
import vision.genesis.clientapp.utils.TypefaceUtil;

/**
 * GenesisVision
 * Created by Vitaly on 1/19/18.
 */

public class InvestorDashboardFragment extends BaseFragment implements InvestorDashboardView, ViewPager.OnPageChangeListener
{
	@BindView(R.id.title)
	public TextView title;

	@BindView(R.id.investor_dashboard_header_view_pager)
	public ViewPager headerViewPager;

	@BindView(R.id.indicator)
	public ScrollingPagerIndicator indicator;

	@BindView(R.id.label_portfolio_events)
	public TextView portfolioEventsLabel;

	@BindView(R.id.scroll_view_events)
	public HorizontalScrollView eventsScrollView;

	@BindView(R.id.tab_layout)
	public TabLayout tabLayout;

	@BindView(R.id.view_pager_dashboard)
	public ViewPager viewPager;

	@InjectPresenter
	InvestorDashboardPresenter investorDashboardPresenter;

	private TabLayout.OnTabSelectedListener tabSelectedListener;

	private TabLayout.TabLayoutOnPageChangeListener tabLayoutOnPageChangeListener;

	private DashboardPagerAdapter pagerAdapter;

	private Fragment currentFragment;

	private Unbinder unbinder;

	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		final Context contextThemeWrapper = new ContextThemeWrapper(getActivity(), ThemeUtil.getCurrentThemeResource());
		LayoutInflater localInflater = inflater.cloneInContext(contextThemeWrapper);
		return localInflater.inflate(R.layout.fragment_investor_dashboard, container, false);
	}

	@Override
	public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);

		unbinder = ButterKnife.bind(this, view);

		setFonts();

		initHeaderViewPager();
		initTabs();
		initViewPager();
	}

	@Override
	public void onResume() {
		super.onResume();
		investorDashboardPresenter.onResume();
	}

	@Override
	public void onDestroyView() {
		if (pagerAdapter != null)
			pagerAdapter.destroy();

		if (tabSelectedListener != null)
			tabLayout.removeOnTabSelectedListener(tabSelectedListener);

		if (tabLayoutOnPageChangeListener != null)
			viewPager.removeOnPageChangeListener(tabLayoutOnPageChangeListener);

		if (viewPager != null)
			viewPager.clearOnPageChangeListeners();

		if (unbinder != null) {
			unbinder.unbind();
			unbinder = null;
		}

		super.onDestroyView();
	}

	private void showTooltip(View view, int tooltipTextResId) {
		int[] viewLocation = new int[2];
		view.getLocationInWindow(viewLocation);
		float viewX = viewLocation[0];
		float viewY = viewLocation[1];

		TooltipModel tooltipModel = new TooltipModel(
				viewX + view.getWidth() / 2,
				viewY,
				viewY + view.getHeight(),
				getString(tooltipTextResId));

		if (getActivity() != null)
			TooltipActivity.startWith(getActivity(), tooltipModel);
	}

	private void setFonts() {
		title.setTypeface(TypefaceUtil.bold());
		portfolioEventsLabel.setTypeface(TypefaceUtil.medium());
	}

	private void initHeaderViewPager() {
		headerViewPager.setAdapter(new DashboardHeaderPagerAdapter(getChildFragmentManager()));
		indicator.attachToPager(headerViewPager);
	}

	private void initTabs() {
		tabLayout.addTab(tabLayout.newTab().setText(getContext().getResources().getString(R.string.active)), true);
		tabLayout.addTab(tabLayout.newTab().setText(getContext().getResources().getString(R.string.archived)));
		tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

		tabSelectedListener = new TabLayout.OnTabSelectedListener()
		{
			@Override
			public void onTabSelected(TabLayout.Tab tab) {
				viewPager.setCurrentItem(tab.getPosition());
			}

			@Override
			public void onTabUnselected(TabLayout.Tab tab) {

			}

			@Override
			public void onTabReselected(TabLayout.Tab tab) {

			}
		};

		tabLayout.addOnTabSelectedListener(tabSelectedListener);
	}

	private void initViewPager() {
		pagerAdapter = new DashboardPagerAdapter(getActivity().getSupportFragmentManager());
		viewPager.setAdapter(pagerAdapter);

		tabLayoutOnPageChangeListener = new TabLayout.TabLayoutOnPageChangeListener(tabLayout);
		viewPager.addOnPageChangeListener(tabLayoutOnPageChangeListener);
		viewPager.addOnPageChangeListener(this);
	}

	@Override
	public void setActivePrograms(List<InvestmentProgramDashboardExtended> programs) {
		pagerAdapter.setActivePrograms(programs);
	}

	@Override
	public void setArchivedPrograms(List<InvestmentProgramDashboardExtended> programs) {
		pagerAdapter.setArchivedPrograms(programs);
	}

	@Override
	public void showNoInternet(boolean show) {
		pagerAdapter.showNoInternet(show);
	}

	@Override
	public void showProgressBar(boolean show) {
	}

	@Override
	public void showEmpty(boolean show) {
		pagerAdapter.showEmpty(show);
	}

	@Override
	public void setRefreshing(boolean show) {
		pagerAdapter.setRefreshing(show);
	}

	@Override
	public void showSnackbarMessage(String message) {
		showSnackbar(message, viewPager);
	}

	@Override
	public void setTotalPortfolioValue(Double totalPortfolioAmount) {
//		portfolioValueProgressBar.setVisibility(View.GONE);
//		portfolioValue.setText(String.format(Locale.getDefault(), "$%s", StringFormatUtil.formatAmount(totalPortfolioAmount, 2, 2)));
	}

	@Override
	public void setPortfolioEvents(List<DashboardPortfolioEvent> events) {
		for (DashboardPortfolioEvent event : events) {
			PortfolioEventDashboardView eventView = new PortfolioEventDashboardView(getContext());
			eventView.setEvent(event);
			eventsScrollView.addView(eventView);
		}
	}

	@Override
	public void onShow() {
		investorDashboardPresenter.onResume();
	}

	@Override
	public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

	}

	@Override
	public void onPageSelected(int position) {
		if (currentFragment != null && currentFragment instanceof DashboardPagerAdapter.OnPageVisibilityChanged)
			((DashboardPagerAdapter.OnPageVisibilityChanged) currentFragment).pagerHide();
		currentFragment = pagerAdapter.getItem(position);
		if (pagerAdapter.getItem(position) instanceof DashboardPagerAdapter.OnPageVisibilityChanged) {
			((DashboardPagerAdapter.OnPageVisibilityChanged) pagerAdapter.getItem(position)).pagerShow();
		}
	}

	@Override
	public void onPageScrollStateChanged(int state) {

	}
}