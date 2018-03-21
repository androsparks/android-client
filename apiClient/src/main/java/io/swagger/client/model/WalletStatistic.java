/*
 * Core API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * WalletStatistic
 */

public class WalletStatistic
{
	@SerializedName("chart")
	private List<DateChart> chart = null;

	public WalletStatistic chart(List<DateChart> chart) {
		this.chart = chart;
		return this;
	}

	public WalletStatistic addChartItem(DateChart chartItem) {
		if (this.chart == null) {
			this.chart = new ArrayList<DateChart>();
		}
		this.chart.add(chartItem);
		return this;
	}

	/**
	 * Get chart
	 *
	 * @return chart
	 **/
	@ApiModelProperty(value = "")
	public List<DateChart> getChart() {
		return chart;
	}

	public void setChart(List<DateChart> chart) {
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
		WalletStatistic walletStatistic = (WalletStatistic) o;
		return Objects.equals(this.chart, walletStatistic.chart);
	}

	@Override
	public int hashCode() {
		return Objects.hash(chart);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class WalletStatistic {\n");

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

}

