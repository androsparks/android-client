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
 * DashboardAsset
 */


public class DashboardAsset implements Parcelable
{
	public static final Parcelable.Creator<DashboardAsset> CREATOR = new Parcelable.Creator<DashboardAsset>()
	{
		public DashboardAsset createFromParcel(Parcel in) {
			return new DashboardAsset(in);
		}

		public DashboardAsset[] newArray(int size) {
			return new DashboardAsset[size];
		}
	};

	@SerializedName("asset")
	private String asset = null;

	@SerializedName("color")
	private String color = null;

	@SerializedName("percent")
	private Double percent = null;

	public DashboardAsset() {
	}

	DashboardAsset(Parcel in) {
		asset = (String) in.readValue(null);
		color = (String) in.readValue(null);
		percent = (Double) in.readValue(null);
	}

	public DashboardAsset asset(String asset) {
		this.asset = asset;
		return this;
	}

	/**
	 * Get asset
	 *
	 * @return asset
	 **/
	@Schema(description = "")
	public String getAsset() {
		return asset;
	}

	public void setAsset(String asset) {
		this.asset = asset;
	}

	public DashboardAsset color(String color) {
		this.color = color;
		return this;
	}

	/**
	 * Get color
	 *
	 * @return color
	 **/
	@Schema(description = "")
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public DashboardAsset percent(Double percent) {
		this.percent = percent;
		return this;
	}

	/**
	 * Get percent
	 *
	 * @return percent
	 **/
	@Schema(description = "")
	public Double getPercent() {
		return percent;
	}

	public void setPercent(Double percent) {
		this.percent = percent;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DashboardAsset dashboardAsset = (DashboardAsset) o;
		return Objects.equals(this.asset, dashboardAsset.asset) &&
				Objects.equals(this.color, dashboardAsset.color) &&
				Objects.equals(this.percent, dashboardAsset.percent);
	}

	@Override
	public int hashCode() {
		return Objects.hash(asset, color, percent);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DashboardAsset {\n");

		sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
		sb.append("    color: ").append(toIndentedString(color)).append("\n");
		sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
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
		out.writeValue(asset);
		out.writeValue(color);
		out.writeValue(percent);
	}

	public int describeContents() {
		return 0;
	}
}
