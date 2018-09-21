/*
 * Core API v1.0
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.0
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
 * ChartProgramDetails
 */

public class ChartProgramDetails
{
	@SerializedName("equityChart")
	private List<ChartSimple> equityChart = null;

	@SerializedName("statistic")
	private StatisticProgramDetails statistic = null;

	public ChartProgramDetails equityChart(List<ChartSimple> equityChart) {
		this.equityChart = equityChart;
		return this;
	}

	public ChartProgramDetails addEquityChartItem(ChartSimple equityChartItem) {
		if (this.equityChart == null) {
			this.equityChart = new ArrayList<ChartSimple>();
		}
		this.equityChart.add(equityChartItem);
		return this;
	}

	/**
	 * Get equityChart
	 *
	 * @return equityChart
	 **/
	@ApiModelProperty(value = "")
	public List<ChartSimple> getEquityChart() {
		return equityChart;
	}

	public void setEquityChart(List<ChartSimple> equityChart) {
		this.equityChart = equityChart;
	}

	public ChartProgramDetails statistic(StatisticProgramDetails statistic) {
		this.statistic = statistic;
		return this;
	}

	/**
	 * Get statistic
	 *
	 * @return statistic
	 **/
	@ApiModelProperty(value = "")
	public StatisticProgramDetails getStatistic() {
		return statistic;
	}

	public void setStatistic(StatisticProgramDetails statistic) {
		this.statistic = statistic;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ChartProgramDetails chartProgramDetails = (ChartProgramDetails) o;
		return Objects.equals(this.equityChart, chartProgramDetails.equityChart) &&
				Objects.equals(this.statistic, chartProgramDetails.statistic);
	}

	@Override
	public int hashCode() {
		return Objects.hash(equityChart, statistic);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ChartProgramDetails {\n");

		sb.append("    equityChart: ").append(toIndentedString(equityChart)).append("\n");
		sb.append("    statistic: ").append(toIndentedString(statistic)).append("\n");
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

