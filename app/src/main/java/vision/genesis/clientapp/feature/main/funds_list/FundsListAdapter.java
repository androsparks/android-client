package vision.genesis.clientapp.feature.main.funds_list;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.recyclerview.widget.RecyclerView;

import com.facebook.drawee.view.SimpleDraweeView;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.swagger.client.model.AssetFacet;
import io.swagger.client.model.FundAssetPercent;
import io.swagger.client.model.FundDetailsListItem;
import timber.log.Timber;
import vision.genesis.clientapp.GenesisVisionApplication;
import vision.genesis.clientapp.R;
import vision.genesis.clientapp.feature.common.facet.FundFacetView;
import vision.genesis.clientapp.model.FundDetailsModel;
import vision.genesis.clientapp.model.events.OnListFundFavoriteClickedEvent;
import vision.genesis.clientapp.model.events.ShowFundDetailsEvent;
import vision.genesis.clientapp.ui.ProgramLogoView;
import vision.genesis.clientapp.ui.chart.ProfitSmallChartView;
import vision.genesis.clientapp.utils.ImageUtils;
import vision.genesis.clientapp.utils.StringFormatUtil;
import vision.genesis.clientapp.utils.ThemeUtil;
import vision.genesis.clientapp.utils.TypefaceUtil;

/**
 * GenesisVisionAndroid
 * Created by Vitaly on 24/10/2018.
 */

public class FundsListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>
{
	private static final int TYPE_FACET = 0;

	private static final int TYPE_CARD = 1;

	private List<FundDetailsListItem> funds = new ArrayList<FundDetailsListItem>();

	private List<AssetFacet> facets = new ArrayList<>();

	@Override
	public int getItemViewType(int position) {
		return position == 0 ? TYPE_FACET : TYPE_CARD;
	}

	@NonNull
	@Override
	public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		switch (viewType) {
			case TYPE_FACET:
				return new FacetsViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_facets, parent, false));
			case TYPE_CARD:
			default:
				return new FundViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_fund, parent, false));
		}
	}

	@Override
	public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
		switch (holder.getItemViewType()) {
			case TYPE_FACET:
				((FacetsViewHolder) holder).setFacets(facets);
				break;
			case TYPE_CARD:
				((FundViewHolder) holder).setFund(funds.get(position - 1));
				break;
		}
	}

	@Override
	public long getItemId(int position) {
		return position == 0 ? 0 : funds.get(position - 1).hashCode();
	}

	@Override
	public int getItemCount() {
		return funds.size() + 1;
	}

	public void setFacets(List<AssetFacet> facets) {
		this.facets = facets;
		notifyDataSetChanged();
	}

	public void setFunds(List<FundDetailsListItem> funds) {
		this.funds.clear();
		this.funds.addAll(funds);
		notifyDataSetChanged();
	}

	public void addFunds(List<FundDetailsListItem> funds) {
		this.funds.addAll(funds);
		notifyDataSetChanged();
	}

	public void setFundFavorite(UUID fundId, Boolean favorite) {
		for (FundDetailsListItem fund : funds) {
			if (fund.getId().equals(fundId)) {
				if (fund.getPersonalDetails() != null && !fund.getPersonalDetails().isIsFavorite().equals(favorite)) {
					fund.getPersonalDetails().setIsFavorite(favorite);
					notifyItemChanged(funds.indexOf(fund));
				}
				break;
			}
		}
	}

	public void removeFund(UUID fundId) {
		for (int i = 0; i < funds.size(); i++) {
			if (funds.get(i).getId().equals(fundId)) {
				funds.remove(i);
				notifyItemRemoved(i);
				break;
			}
		}
	}

	static class FacetsViewHolder extends RecyclerView.ViewHolder
	{
		@BindView(R.id.group_facets)
		public ViewGroup facetsGroup;

		private List<AssetFacet> facets;

		FacetsViewHolder(View itemView) {
			super(itemView);

			ButterKnife.bind(this, itemView);
		}

		void setFacets(List<AssetFacet> facets) {
			this.facets = facets;
			updateView();
		}

		private void updateView() {
			facetsGroup.removeAllViews();
			for (AssetFacet facet : facets) {
				FundFacetView view = new FundFacetView(itemView.getContext());
				view.setData(facet);
				facetsGroup.addView(view);
			}
		}
	}

	static class FundViewHolder extends RecyclerView.ViewHolder
	{
		@BindView(R.id.fund_logo)
		public ProgramLogoView fundLogo;

		@BindView(R.id.fund_name)
		public TextView fundName;

		@BindView(R.id.manager_name)
		public TextView managerName;

		@BindView(R.id.favorite)
		public ImageView favorite;

		@BindView(R.id.chart)
		public ProfitSmallChartView chart;

		@BindView(R.id.profit_percent)
		public TextView profitPercent;

		@BindView(R.id.balance)
		public TextView balance;

		@BindView(R.id.balance_label)
		public TextView balanceLabel;

		@BindView(R.id.investors)
		public TextView investors;

		@BindView(R.id.investors_label)
		public TextView investorsLabel;

		@BindView(R.id.drawdown)
		public TextView drawdown;

		@BindView(R.id.drawdown_label)
		public TextView drawdownLabel;

		@BindView(R.id.group_asset1)
		public ViewGroup groupAsset1;

		@BindView(R.id.group_asset2)
		public ViewGroup groupAsset2;

		@BindView(R.id.group_asset3)
		public ViewGroup groupAsset3;

		@BindView(R.id.icon_asset1)
		public SimpleDraweeView iconAsset1;

		@BindView(R.id.icon_asset2)
		public SimpleDraweeView iconAsset2;

		@BindView(R.id.icon_asset3)
		public SimpleDraweeView iconAsset3;

		@BindView(R.id.name_asset1)
		public TextView nameAsset1;

		@BindView(R.id.name_asset2)
		public TextView nameAsset2;

		@BindView(R.id.name_asset3)
		public TextView nameAsset3;

		@BindView(R.id.group_assets_left)
		public ViewGroup groupAssetsLeft;

		@BindView(R.id.text_assets_left)
		public TextView assetsLeft;

		private FundDetailsListItem fund;

		FundViewHolder(View itemView) {
			super(itemView);

			ButterKnife.bind(this, itemView);

			fundLogo.setLevelBackground(R.attr.colorCard);

			setFonts();

			itemView.setOnClickListener(v -> {
				if (fund != null) {
					FundDetailsModel fundDetailsModel = new FundDetailsModel(fund.getId(),
							fund.getLogoUrl(),
							fund.getColor(),
							fund.getTitle(),
							fund.getOwner().getUsername(),
							fund.getPersonalDetails() != null ?
									fund.getPersonalDetails().isIsFavorite()
									: false,
//TODO:
//							fund.getPersonalDetails() != null ?
//									fund.getPersonalDetails().isHasNotifications()
//									: false);
							false);
					EventBus.getDefault().post(new ShowFundDetailsEvent(fundDetailsModel));
				}
			});
		}

		@OnClick(R.id.favorite)
		public void onFavoriteClicked() {
			if (fund != null && fund.getPersonalDetails() != null) {
				fund.getPersonalDetails().setIsFavorite(!fund.getPersonalDetails().isIsFavorite());
				updateData();
				EventBus.getDefault().post(new OnListFundFavoriteClickedEvent(fund.getId(), fund.getPersonalDetails().isIsFavorite()));
			}
		}

		private void setFonts() {
			fundName.setTypeface(TypefaceUtil.semibold());
			managerName.setTypeface(TypefaceUtil.medium());
			profitPercent.setTypeface(TypefaceUtil.semibold());
			balance.setTypeface(TypefaceUtil.semibold());
			investors.setTypeface(TypefaceUtil.semibold());
			drawdown.setTypeface(TypefaceUtil.semibold());

			balanceLabel.setText(balanceLabel.getText().toString().toLowerCase());
			investorsLabel.setText(investorsLabel.getText().toString().toLowerCase());
			drawdownLabel.setText(drawdownLabel.getText().toString().toLowerCase());

			nameAsset1.setTypeface(TypefaceUtil.semibold());
			nameAsset2.setTypeface(TypefaceUtil.semibold());
			nameAsset3.setTypeface(TypefaceUtil.semibold());
			assetsLeft.setTypeface(TypefaceUtil.semibold());
		}

		void setFund(FundDetailsListItem fund) {
			this.fund = fund;
			updateData();
		}

		private void updateData() {
			fundLogo.setImage(fund.getLogoUrl(), fund.getColor(), 100, 100);
			fundLogo.hideLevel();

			if (fund.getPersonalDetails() != null) {
				favorite.setImageDrawable(AppCompatResources.getDrawable(GenesisVisionApplication.INSTANCE, fund.getPersonalDetails().isIsFavorite()
						? R.drawable.icon_favorite_fill
						: R.drawable.icon_favorite));
				favorite.setAlpha(fund.getPersonalDetails().isIsFavorite() ? 1f : 0.3f);
			}
			favorite.setVisibility(fund.getPersonalDetails() != null ? View.VISIBLE : View.INVISIBLE);

			this.fundName.setText(fund.getTitle());
			this.managerName.setText(fund.getOwner().getUsername());

			Double profitPercent = 0.0;
			if (fund.getStatistic() != null) {
				this.chart.setChart(fund.getStatistic().getChart());
				profitPercent = fund.getStatistic().getProfit();
				this.drawdown.setText(String.format(Locale.getDefault(), "%s%%",
						StringFormatUtil.formatAmount(fund.getStatistic().getDrawdown(), 0, 2)));
			}

			this.profitPercent.setText(String.format(Locale.getDefault(), "%s%%",
					StringFormatUtil.formatAmount(profitPercent, 0, 2)));
			this.profitPercent.setTextColor(profitPercent >= 0
					? ThemeUtil.getColorByAttrId(itemView.getContext(), R.attr.colorGreen)
					: ThemeUtil.getColorByAttrId(itemView.getContext(), R.attr.colorRed));

			this.balance.setText(String.format(Locale.getDefault(), "%s %s",
					StringFormatUtil.getShortenedAmount(fund.getBalance().getAmount()), fund.getBalance().getCurrency().getValue()));

			this.investors.setText(String.format(Locale.getDefault(), "%s",
					StringFormatUtil.getShortenedAmount(fund.getInvestorsCount())));

			updateAssets();

		}

		private void updateAssets() {
			groupAsset1.setVisibility(View.INVISIBLE);
			groupAsset2.setVisibility(View.INVISIBLE);
			groupAsset3.setVisibility(View.INVISIBLE);
			groupAssetsLeft.setVisibility(View.INVISIBLE);

			try {
				updateAsset(groupAsset1, iconAsset1, nameAsset1, fund.getTopFundAssets().get(0));
				updateAsset(groupAsset2, iconAsset2, nameAsset2, fund.getTopFundAssets().get(1));
				updateAsset(groupAsset3, iconAsset3, nameAsset3, fund.getTopFundAssets().get(2));
				updateAssetsLeft();
			} catch (IndexOutOfBoundsException e) {
				Timber.d(e.getMessage());
			} catch (NullPointerException e) {
				Timber.e(e.getMessage());
			}
		}

		private void updateAssetsLeft() {
			int assetsLeft = fund.getTotalAssetsCount();
			if (fund.getTopFundAssets() != null) {
				assetsLeft -= fund.getTopFundAssets().size();
			}

			if (assetsLeft > 0) {
				groupAssetsLeft.setVisibility(View.VISIBLE);
				this.assetsLeft.setText(String.format(Locale.getDefault(), "+%d", assetsLeft));

			}
		}

		private void updateAsset(ViewGroup groupAsset, SimpleDraweeView iconAsset, TextView nameAsset, FundAssetPercent fundAsset) {
			groupAsset.setVisibility(View.VISIBLE);
			iconAsset.setImageURI(ImageUtils.getImageUri(fundAsset.getLogoUrl()));
			nameAsset.setText(String.format(Locale.getDefault(), "%s%%", StringFormatUtil.formatAmount(fundAsset.getPercent(), 0, 0)));
		}

//		private Double getProfitPercent() {
//			Double first = fund.getChart().get(0).getValue();
//			Double last = fund.getChart().get(fund.getChart().size() - 1).getValue();
//
//			return Math.abs(first != 0 ? 100 / first * (first - last) : 0);
//		}
//
//		private Double getProfitValue() {
//			Double first = fund.getChart().get(0).getValue();
//			Double last = fund.getChart().get(fund.getChart().size() - 1).getValue();
//
//			return last - first;
//		}
	}
}
