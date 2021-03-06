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
 * DashboardRecommendations
 */


public class DashboardRecommendations implements Parcelable
{
	public static final Parcelable.Creator<DashboardRecommendations> CREATOR = new Parcelable.Creator<DashboardRecommendations>()
	{
		public DashboardRecommendations createFromParcel(Parcel in) {
			return new DashboardRecommendations(in);
		}

		public DashboardRecommendations[] newArray(int size) {
			return new DashboardRecommendations[size];
		}
	};

	@SerializedName("assets")
	private List<RecommendedAsset> assets = null;

	public DashboardRecommendations() {
	}

	DashboardRecommendations(Parcel in) {
		assets = (List<RecommendedAsset>) in.readValue(RecommendedAsset.class.getClassLoader());
	}

	public DashboardRecommendations assets(List<RecommendedAsset> assets) {
		this.assets = assets;
		return this;
	}

	public DashboardRecommendations addAssetsItem(RecommendedAsset assetsItem) {
		if (this.assets == null) {
			this.assets = new ArrayList<RecommendedAsset>();
		}
		this.assets.add(assetsItem);
		return this;
	}

	/**
	 * Get assets
	 *
	 * @return assets
	 **/
	@Schema(description = "")
	public List<RecommendedAsset> getAssets() {
		return assets;
	}

	public void setAssets(List<RecommendedAsset> assets) {
		this.assets = assets;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DashboardRecommendations dashboardRecommendations = (DashboardRecommendations) o;
		return Objects.equals(this.assets, dashboardRecommendations.assets);
	}

	@Override
	public int hashCode() {
		return Objects.hash(assets);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DashboardRecommendations {\n");

		sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
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
		out.writeValue(assets);
	}

	public int describeContents() {
		return 0;
	}
}
