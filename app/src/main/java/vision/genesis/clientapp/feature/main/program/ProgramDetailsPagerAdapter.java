package vision.genesis.clientapp.feature.main.program;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.google.android.material.tabs.TabLayout;

import java.util.UUID;

import io.swagger.client.model.FollowDetailsFull;
import io.swagger.client.model.ProgramDetailsFull;
import io.swagger.client.model.ProgramFollowDetailsFull;
import vision.genesis.clientapp.feature.main.follow.balance.FollowBalanceFragment;
import vision.genesis.clientapp.feature.main.program.balance.ProgramBalanceFragment;
import vision.genesis.clientapp.feature.main.program.events.ProgramEventsFragment;
import vision.genesis.clientapp.feature.main.program.info.follow.FollowInfoFragment;
import vision.genesis.clientapp.feature.main.program.info.owner.OwnerInfoFragment;
import vision.genesis.clientapp.feature.main.program.info.program.ProgramInfoFragment;
import vision.genesis.clientapp.feature.main.program.open_positions.OpenPositionsFragment;
import vision.genesis.clientapp.feature.main.program.period_history.PeriodHistoryFragment;
import vision.genesis.clientapp.feature.main.program.profit.ProgramProfitFragment;
import vision.genesis.clientapp.feature.main.program.trades.ProgramTradesFragment;

/**
 * GenesisVisionAndroid
 * Created by Vitaly on 17/04/2018.
 */

public class ProgramDetailsPagerAdapter extends FragmentStatePagerAdapter
{
	public interface OnPageVisibilityChanged
	{
		void pagerShow();

		void pagerHide();
	}

	private ProgramInfoFragment programInfoFragment;

	private FollowInfoFragment followInfoFragment;

	private OwnerInfoFragment ownerInfoFragment;

	private OpenPositionsFragment openPositionsFragment;

	private ProgramProfitFragment programProfitFragment;

	private ProgramBalanceFragment programEquityFragment;

	private FollowBalanceFragment followEquityFragment;

	private ProgramTradesFragment programTradesFragment;

	private PeriodHistoryFragment periodHistoryFragment;

	private ProgramEventsFragment programEventsFragment;

	private TabLayout tabLayout;

	ProgramDetailsPagerAdapter(FragmentManager fm, TabLayout tabLayout, ProgramFollowDetailsFull details) {
		super(fm);
		this.tabLayout = tabLayout;

		UUID assetId = details.getId();
		ProgramDetailsFull programDetails = details.getProgramDetails();
		FollowDetailsFull followDetails = details.getFollowDetails();

		if (details.getPublicInfo().isIsOwnAsset()) {
			ownerInfoFragment = OwnerInfoFragment.with(details);
			openPositionsFragment = OpenPositionsFragment.with(assetId);
			programProfitFragment = ProgramProfitFragment.with(details);
			programTradesFragment = ProgramTradesFragment.with(assetId);
			if (programDetails != null) {
				programEquityFragment = ProgramBalanceFragment.with(details);
				periodHistoryFragment = PeriodHistoryFragment.with(assetId, details.getTradingAccountInfo().getCurrency().getValue(), programDetails.getPeriodDuration());
			}
			else {
				followEquityFragment = FollowBalanceFragment.with(details);
			}
			programEventsFragment = ProgramEventsFragment.with(ProgramEventsFragment.LOCATION_PROGRAM, assetId);
		}
		else if (programDetails != null) {
			programInfoFragment = ProgramInfoFragment.with(details);
			openPositionsFragment = OpenPositionsFragment.with(assetId);
			programProfitFragment = ProgramProfitFragment.with(details);
			programEquityFragment = ProgramBalanceFragment.with(details);
			programTradesFragment = ProgramTradesFragment.with(assetId);
			periodHistoryFragment = PeriodHistoryFragment.with(assetId, details.getTradingAccountInfo().getCurrency().getValue(), programDetails.getPeriodDuration());
			programEventsFragment = ProgramEventsFragment.with(ProgramEventsFragment.LOCATION_PROGRAM, assetId);
		}
		else if (followDetails != null) {
			followInfoFragment = FollowInfoFragment.with(details);
			openPositionsFragment = OpenPositionsFragment.with(assetId);
			programProfitFragment = ProgramProfitFragment.with(details);
			followEquityFragment = FollowBalanceFragment.with(details);
			programTradesFragment = ProgramTradesFragment.with(assetId);
			programEventsFragment = ProgramEventsFragment.with(ProgramEventsFragment.LOCATION_PROGRAM, assetId);
		}
	}

	@Override
	public Fragment getItem(int position) {
		switch (tabLayout.getTabAt(position).getTag().toString()) {
			case "program_info":
				return programInfoFragment;
			case "follow_info":
				return followInfoFragment;
			case "owner_info":
				return ownerInfoFragment;
			case "open_positions":
				return openPositionsFragment;
			case "profit":
				return programProfitFragment;
			case "equity":
				return programEquityFragment != null ? programEquityFragment : followEquityFragment;
			case "trades":
				return programTradesFragment;
			case "period_history":
				return periodHistoryFragment;
			case "events":
				return programEventsFragment;
			default:
				return null;
		}
	}

	@Override
	public int getCount() {
		return tabLayout.getTabCount();
	}

	public void destroy() {
	}

	public void sendUpdate() {
		if (programInfoFragment != null) {
			programInfoFragment.pagerShow();
		}
		if (followInfoFragment != null) {
			followInfoFragment.pagerShow();
		}
		if (ownerInfoFragment != null) {
			ownerInfoFragment.pagerShow();
		}
		if (openPositionsFragment != null) {
			openPositionsFragment.pagerShow();
		}
		if (programProfitFragment != null) {
			programProfitFragment.pagerShow();
		}
		if (programEquityFragment != null) {
			programEquityFragment.pagerShow();
		}
		if (followEquityFragment != null) {
			followEquityFragment.pagerShow();
		}
		if (programTradesFragment != null) {
			programTradesFragment.pagerShow();
		}
		if (periodHistoryFragment != null) {
			periodHistoryFragment.pagerShow();
		}
		if (programEventsFragment != null) {
			programEventsFragment.pagerShow();
		}
	}

	public void sendSwipeRefresh() {
		if (openPositionsFragment != null) {
			openPositionsFragment.onSwipeRefresh();
		}
		if (programTradesFragment != null) {
			programTradesFragment.onSwipeRefresh();
		}
		if (periodHistoryFragment != null) {
			periodHistoryFragment.onSwipeRefresh();
		}
		if (programEventsFragment != null) {
			programEventsFragment.onSwipeRefresh();
		}
	}

	public void onOffsetChanged(int verticalOffset) {
		if (programProfitFragment != null) {
			programProfitFragment.onOffsetChanged(verticalOffset);
		}
		if (programEquityFragment != null) {
			programEquityFragment.onOffsetChanged(verticalOffset);
		}
		if (followEquityFragment != null) {
			followEquityFragment.onOffsetChanged(verticalOffset);
		}
		if (programTradesFragment != null) {
			programTradesFragment.onOffsetChanged(verticalOffset);
		}
		if (periodHistoryFragment != null) {
			periodHistoryFragment.onOffsetChanged(verticalOffset);
		}
		if (programEventsFragment != null) {
			programEventsFragment.onOffsetChanged(verticalOffset);
		}
	}

	void updateOwnerInfo(ProgramFollowDetailsFull details) {
		if (ownerInfoFragment != null) {
			ownerInfoFragment.updateInfo(details);
		}
	}
}