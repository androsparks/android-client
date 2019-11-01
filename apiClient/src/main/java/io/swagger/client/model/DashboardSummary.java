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
 * DashboardSummary
 */


public class DashboardSummary implements Parcelable
{
	public static final Parcelable.Creator<DashboardSummary> CREATOR = new Parcelable.Creator<DashboardSummary>()
	{
		public DashboardSummary createFromParcel(Parcel in) {
			return new DashboardSummary(in);
		}

		public DashboardSummary[] newArray(int size) {
			return new DashboardSummary[size];
		}
	};

	@SerializedName("total")
	private Double total = null;

	@SerializedName("invested")
	private Double invested = null;

	@SerializedName("pending")
	private Double pending = null;

	@SerializedName("available")
	private Double available = null;

	@SerializedName("profits")
	private DashboardProfits profits = null;

	public DashboardSummary() {
	}

	DashboardSummary(Parcel in) {
		total = (Double) in.readValue(null);
		invested = (Double) in.readValue(null);
		pending = (Double) in.readValue(null);
		available = (Double) in.readValue(null);
		profits = (DashboardProfits) in.readValue(DashboardProfits.class.getClassLoader());
	}

	public DashboardSummary total(Double total) {
		this.total = total;
		return this;
	}

	/**
	 * Get total
	 *
	 * @return total
	 **/
	@Schema(description = "")
	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public DashboardSummary invested(Double invested) {
		this.invested = invested;
		return this;
	}

	/**
	 * Get invested
	 *
	 * @return invested
	 **/
	@Schema(description = "")
	public Double getInvested() {
		return invested;
	}

	public void setInvested(Double invested) {
		this.invested = invested;
	}

	public DashboardSummary pending(Double pending) {
		this.pending = pending;
		return this;
	}

	/**
	 * Get pending
	 *
	 * @return pending
	 **/
	@Schema(description = "")
	public Double getPending() {
		return pending;
	}

	public void setPending(Double pending) {
		this.pending = pending;
	}

	public DashboardSummary available(Double available) {
		this.available = available;
		return this;
	}

	/**
	 * Get available
	 *
	 * @return available
	 **/
	@Schema(description = "")
	public Double getAvailable() {
		return available;
	}

	public void setAvailable(Double available) {
		this.available = available;
	}

	public DashboardSummary profits(DashboardProfits profits) {
		this.profits = profits;
		return this;
	}

	/**
	 * Get profits
	 *
	 * @return profits
	 **/
	@Schema(description = "")
	public DashboardProfits getProfits() {
		return profits;
	}

	public void setProfits(DashboardProfits profits) {
		this.profits = profits;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DashboardSummary dashboardSummary = (DashboardSummary) o;
		return Objects.equals(this.total, dashboardSummary.total) &&
				Objects.equals(this.invested, dashboardSummary.invested) &&
				Objects.equals(this.pending, dashboardSummary.pending) &&
				Objects.equals(this.available, dashboardSummary.available) &&
				Objects.equals(this.profits, dashboardSummary.profits);
	}

	@Override
	public int hashCode() {
		return Objects.hash(total, invested, pending, available, profits);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DashboardSummary {\n");

		sb.append("    total: ").append(toIndentedString(total)).append("\n");
		sb.append("    invested: ").append(toIndentedString(invested)).append("\n");
		sb.append("    pending: ").append(toIndentedString(pending)).append("\n");
		sb.append("    available: ").append(toIndentedString(available)).append("\n");
		sb.append("    profits: ").append(toIndentedString(profits)).append("\n");
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
		out.writeValue(total);
		out.writeValue(invested);
		out.writeValue(pending);
		out.writeValue(available);
		out.writeValue(profits);
	}

	public int describeContents() {
		return 0;
	}
}
