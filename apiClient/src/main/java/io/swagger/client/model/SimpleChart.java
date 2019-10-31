/*
 * Core API v2.0
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v2.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.v3.oas.annotations.media.Schema;
/**
 * SimpleChart
 */


public class SimpleChart implements Parcelable
{
	public static final Parcelable.Creator<SimpleChart> CREATOR = new Parcelable.Creator<SimpleChart>()
	{
		public SimpleChart createFromParcel(Parcel in) {
			return new SimpleChart(in);
		}

		public SimpleChart[] newArray(int size) {
			return new SimpleChart[size];
		}
	};

	@SerializedName("currency")
	private Currency currency = null;

	@SerializedName("chart")
	private List<SimpleChartPoint> chart = null;

	public SimpleChart() {
	}

	SimpleChart(Parcel in) {
		currency = (Currency) in.readValue(Currency.class.getClassLoader());
		chart = (List<SimpleChartPoint>) in.readValue(SimpleChartPoint.class.getClassLoader());
	}

	public SimpleChart currency(Currency currency) {
		this.currency = currency;
		return this;
	}

	/**
	 * Get currency
	 *
	 * @return currency
	 **/
	@Schema(description = "")
	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public SimpleChart chart(List<SimpleChartPoint> chart) {
		this.chart = chart;
		return this;
	}

	public SimpleChart addChartItem(SimpleChartPoint chartItem) {
		if (this.chart == null) {
			this.chart = new ArrayList<SimpleChartPoint>();
		}
		this.chart.add(chartItem);
		return this;
	}

	/**
	 * Get chart
	 *
	 * @return chart
	 **/
	@Schema(description = "")
	public List<SimpleChartPoint> getChart() {
		return chart;
	}

	public void setChart(List<SimpleChartPoint> chart) {
		this.chart = chart;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SimpleChart simpleChart = (SimpleChart) o;
		return Objects.equals(this.currency, simpleChart.currency) &&
				Objects.equals(this.chart, simpleChart.chart);
	}

	@Override
	public int hashCode() {
		return Objects.hash(currency, chart);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SimpleChart {\n");

		sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
		sb.append("    chart: ").append(toIndentedString(chart)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

	public void writeToParcel(Parcel out, int flags) {
		out.writeValue(currency);
		out.writeValue(chart);
	}

	public int describeContents() {
		return 0;
	}
}