package vision.genesis.clientapp.ui.chart;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.util.TypedValue;

import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.utils.EntryXComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import io.swagger.client.model.Chart;
import io.swagger.client.model.ChartByDate;
import vision.genesis.clientapp.GenesisVisionApplication;
import vision.genesis.clientapp.R;

/**
 * GenesisVision
 * Created by Vitaly on 2/2/18.
 */

public class ProfitSmallChartView extends com.github.mikephil.charting.charts.LineChart
{
	private int lineGreenColor = R.color.transactionGreen;

	private int lineRedColor = R.color.transactionRed;

	public ProfitSmallChartView(Context context) {
		super(context);
		initView();
	}

	public ProfitSmallChartView(Context context, AttributeSet attrs) {
		super(context, attrs);
		initView();
	}

	public ProfitSmallChartView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		initView();
	}

	private void initView() {
		this.getDescription().setEnabled(false);
		this.setDrawGridBackground(false);
		this.setDragEnabled(false);
		this.setTouchEnabled(false);
		this.getXAxis().setEnabled(false);
		this.getLegend().setEnabled(false);
		this.getAxisLeft().setEnabled(true);
		this.getAxisRight().setEnabled(false);
		this.setDrawBorders(false);
		this.setAutoScaleMinMaxEnabled(true);
		this.setNoDataText(GenesisVisionApplication.INSTANCE.getResources().getString(R.string.no_chart));
		this.setNoDataTextColor(ContextCompat.getColor(GenesisVisionApplication.INSTANCE, R.color.colorPrimaryDark));
		this.setViewPortOffsets(0f, 0f, 0f, 0f);

		YAxis yAxis = this.getAxisLeft();
		yAxis.setDrawLabels(false);
		yAxis.setDrawAxisLine(false);
		yAxis.setDrawGridLines(false);

		LimitLine ll = new LimitLine(0f, "");
		ll.setLineColor(ContextCompat.getColor(GenesisVisionApplication.INSTANCE, R.color.grey400));
		ll.setLineWidth(1f);
		int lineLength = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 2, GenesisVisionApplication.INSTANCE.getResources().getDisplayMetrics());
		int spaceLength = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 2, GenesisVisionApplication.INSTANCE.getResources().getDisplayMetrics());
		ll.enableDashedLine(lineLength, spaceLength, 0);

		yAxis.setDrawLimitLinesBehindData(true);
		yAxis.addLimitLine(ll);

		this.setHardwareAccelerationEnabled(false);
	}

	public void setEquityChart(List<ChartByDate> charts) {
		if (charts.size() <= 1) {
			this.clear();
			return;
		}
		List<Entry> lineEntries = new ArrayList<>();

		for (ChartByDate chart : charts) {
			lineEntries.add(new Entry(chart.getDate().getMillis(), chart.getValue().floatValue()));
		}

		this.setData(getLineData(lineEntries));
		this.invalidate();
	}

	public void setChart(List<Chart> charts) {
		if (charts.size() <= 1) {
			this.clear();
			return;
		}
		List<Entry> lineEntries = new ArrayList<>();
		float index = 0;
		for (Chart chart : charts) {
			lineEntries.add(new Entry(index, chart.getTotalProfit().floatValue()));
			index++;
		}

		this.setData(getLineData(lineEntries));
		this.invalidate();
	}

	private LineData getLineData(List<Entry> data) {
		Collections.sort(data, new EntryXComparator());
		LineData lineData = new LineData();

		lineData.addDataSet(createLineDataSet(data));

		return lineData;
	}

	private LineDataSet createLineDataSet(List<Entry> data) {
		LineDataSet dataSet = new LineDataSet(data, "");

		dataSet.setLabel("");
		dataSet.setDrawValues(false);
		dataSet.setDrawCircles(false);
		boolean isProfitable = data.get(0).getY() <= data.get(data.size() - 1).getY();
		dataSet.setColor(ContextCompat.getColor(GenesisVisionApplication.INSTANCE, isProfitable ? lineGreenColor : lineRedColor));
//		dataSet.setMode(LineDataSet.Mode.CUBIC_BEZIER);
		dataSet.setLineWidth(1.5f);

		return dataSet;
	}

	public void onDestroy() {
		this.invalidate();
	}
}