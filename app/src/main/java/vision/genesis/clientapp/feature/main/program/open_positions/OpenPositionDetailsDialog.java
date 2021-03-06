package vision.genesis.clientapp.feature.main.program.open_positions;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.content.res.AppCompatResources;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.swagger.client.model.OrderModel;
import io.swagger.client.model.TradesViewModel;
import vision.genesis.clientapp.GenesisVisionApplication;
import vision.genesis.clientapp.R;
import vision.genesis.clientapp.utils.DateTimeUtil;
import vision.genesis.clientapp.utils.StringFormatUtil;
import vision.genesis.clientapp.utils.ThemeUtil;
import vision.genesis.clientapp.utils.TypefaceUtil;

/**
 * GenesisVisionAndroid
 * Created by Vitaly on 14/02/2019.
 */

public class OpenPositionDetailsDialog extends BottomSheetDialogFragment
{
	@BindView(R.id.icon_direction)
	public ImageView iconDirection;

	@BindView(R.id.direction)
	public TextView direction;

	@BindView(R.id.date)
	public TextView date;

	@BindView(R.id.symbol)
	public TextView symbol;

	@BindView(R.id.volume)
	public TextView volume;

	@BindView(R.id.price_open)
	public TextView priceOpen;

	@BindView(R.id.price)
	public TextView price;

	@BindView(R.id.profit)
	public TextView profit;

	@BindView(R.id.group_price_open)
	public ViewGroup priceOpenGroup;

	@BindView(R.id.group_price)
	public ViewGroup priceGroup;

	@BindView(R.id.group_profit)
	public ViewGroup profitGroup;

	private OrderModel openPosition;

	private TradesViewModel model;

	@SuppressLint("RestrictedApi")
	@Override
	public void setupDialog(Dialog dialog, int style) {
		super.setupDialog(dialog, style);
		View contentView = View.inflate(getContext(), R.layout.fragment_bottomsheet_open_position, null);

		dialog.setContentView(contentView);

		ButterKnife.bind(this, contentView);

		setFonts();

		updateView();
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		if (getDialog().getWindow() != null) {
			getDialog().getWindow().findViewById(R.id.design_bottom_sheet).setBackgroundResource(android.R.color.transparent);
			getDialog().getWindow().getAttributes().windowAnimations = R.style.dialog_slide_animation;
		}
	}

	public void setData(OrderModel openPosition, TradesViewModel model) {
		this.openPosition = openPosition;
		this.model = model;
		updateView();
	}

	private void setFonts() {
		direction.setTypeface(TypefaceUtil.semibold());
		symbol.setTypeface(TypefaceUtil.semibold());
		volume.setTypeface(TypefaceUtil.semibold());
		priceOpen.setTypeface(TypefaceUtil.semibold());
		price.setTypeface(TypefaceUtil.semibold());
		profit.setTypeface(TypefaceUtil.semibold());
	}

	private void updateView() {
		if (this.iconDirection != null && openPosition != null && model != null) {
			if (model.isShowDirection()) {
				int dirResId = R.drawable.icon_red_arrow_up;
				int dirColor = R.attr.colorGreen;
				switch (openPosition.getDirection()) {
					case BUY:
						dirResId = R.drawable.icon_arrow_green_down;
						dirColor = R.attr.colorGreen;
						break;
					case SELL:
						dirResId = R.drawable.icon_arrow_red_up;
						dirColor = R.attr.colorRed;
						break;
					default:
						break;
				}

				iconDirection.setImageDrawable(AppCompatResources.getDrawable(GenesisVisionApplication.INSTANCE, dirResId));
				direction.setText(openPosition.getDirection().getValue());
				direction.setTextColor(ThemeUtil.getColorByAttrId(getDialog().getContext(), dirColor));

				iconDirection.setVisibility(View.VISIBLE);
				direction.setVisibility(View.VISIBLE);
			}
			else {
				iconDirection.setVisibility(View.GONE);
				direction.setVisibility(View.GONE);
			}

			if (model.isShowDate()) {
				date.setText(DateTimeUtil.formatEventDateTime(openPosition.getDate()));
				date.setVisibility(View.VISIBLE);
			}
			else {
				date.setVisibility(View.GONE);
			}

			if (model.isShowPriceOpen()) {
				priceOpen.setText(StringFormatUtil.formatAmount(openPosition.getPrice(), 2, 8));
				priceOpenGroup.setVisibility(View.VISIBLE);
			}
			else {
				priceOpenGroup.setVisibility(View.GONE);
			}

			if (model.isShowPrice()) {
				price.setText(StringFormatUtil.formatAmount(openPosition.getPriceCurrent(), 2, 8));
				priceGroup.setVisibility(View.VISIBLE);
			}
			else {
				priceGroup.setVisibility(View.GONE);
			}

			if (model.isShowProfit()) {
				setProfit(openPosition);
				profitGroup.setVisibility(View.VISIBLE);
			}
			else {
				profitGroup.setVisibility(View.GONE);
			}

			symbol.setText(openPosition.getSymbol());
			volume.setText(StringFormatUtil.formatAmount(openPosition.getVolume(), 2, 8));
		}
	}

	private void setProfit(OrderModel trade) {
		double profit = trade.getProfit();
		this.profit.setText(StringFormatUtil.formatAmountWithoutGrouping(profit));
		this.profit.setTextColor(ThemeUtil.getColorByAttrId(getDialog().getContext(),
				profit >= 0 ? R.attr.colorGreen : R.attr.colorRed));
	}
}
