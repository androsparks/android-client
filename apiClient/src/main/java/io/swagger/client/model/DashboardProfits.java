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

import java.util.Objects;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * DashboardProfits
 */


public class DashboardProfits implements Parcelable
{
	public static final Parcelable.Creator<DashboardProfits> CREATOR = new Parcelable.Creator<DashboardProfits>()
	{
		public DashboardProfits createFromParcel(Parcel in) {
			return new DashboardProfits(in);
		}

		public DashboardProfits[] newArray(int size) {
			return new DashboardProfits[size];
		}
	};

	@SerializedName("dayProfit")
	private DashboardTimeframeProfit dayProfit = null;

	@SerializedName("weekProfit")
	private DashboardTimeframeProfit weekProfit = null;

	@SerializedName("monthProfit")
	private DashboardTimeframeProfit monthProfit = null;

	public DashboardProfits() {
	}

	DashboardProfits(Parcel in) {
		dayProfit = (DashboardTimeframeProfit) in.readValue(DashboardTimeframeProfit.class.getClassLoader());
		weekProfit = (DashboardTimeframeProfit) in.readValue(DashboardTimeframeProfit.class.getClassLoader());
		monthProfit = (DashboardTimeframeProfit) in.readValue(DashboardTimeframeProfit.class.getClassLoader());
	}

	public DashboardProfits dayProfit(DashboardTimeframeProfit dayProfit) {
		this.dayProfit = dayProfit;
		return this;
	}

	/**
	 * Get dayProfit
	 *
	 * @return dayProfit
	 **/
	@Schema(description = "")
	public DashboardTimeframeProfit getDayProfit() {
		return dayProfit;
	}

	public void setDayProfit(DashboardTimeframeProfit dayProfit) {
		this.dayProfit = dayProfit;
	}

	public DashboardProfits weekProfit(DashboardTimeframeProfit weekProfit) {
		this.weekProfit = weekProfit;
		return this;
	}

	/**
	 * Get weekProfit
	 *
	 * @return weekProfit
	 **/
	@Schema(description = "")
	public DashboardTimeframeProfit getWeekProfit() {
		return weekProfit;
	}

	public void setWeekProfit(DashboardTimeframeProfit weekProfit) {
		this.weekProfit = weekProfit;
	}

	public DashboardProfits monthProfit(DashboardTimeframeProfit monthProfit) {
		this.monthProfit = monthProfit;
		return this;
	}

	/**
	 * Get monthProfit
	 *
	 * @return monthProfit
	 **/
	@Schema(description = "")
	public DashboardTimeframeProfit getMonthProfit() {
		return monthProfit;
	}

	public void setMonthProfit(DashboardTimeframeProfit monthProfit) {
		this.monthProfit = monthProfit;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DashboardProfits dashboardProfits = (DashboardProfits) o;
		return Objects.equals(this.dayProfit, dashboardProfits.dayProfit) &&
				Objects.equals(this.weekProfit, dashboardProfits.weekProfit) &&
				Objects.equals(this.monthProfit, dashboardProfits.monthProfit);
	}

	@Override
	public int hashCode() {
		return Objects.hash(dayProfit, weekProfit, monthProfit);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DashboardProfits {\n");

		sb.append("    dayProfit: ").append(toIndentedString(dayProfit)).append("\n");
		sb.append("    weekProfit: ").append(toIndentedString(weekProfit)).append("\n");
		sb.append("    monthProfit: ").append(toIndentedString(monthProfit)).append("\n");
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
		out.writeValue(dayProfit);
		out.writeValue(weekProfit);
		out.writeValue(monthProfit);
	}

	public int describeContents() {
		return 0;
	}
}