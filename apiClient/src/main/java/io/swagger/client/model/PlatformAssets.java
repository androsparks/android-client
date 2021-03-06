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
 * PlatformAssets
 */


public class PlatformAssets implements Parcelable
{
	public static final Parcelable.Creator<PlatformAssets> CREATOR = new Parcelable.Creator<PlatformAssets>()
	{
		public PlatformAssets createFromParcel(Parcel in) {
			return new PlatformAssets(in);
		}

		public PlatformAssets[] newArray(int size) {
			return new PlatformAssets[size];
		}
	};

	@SerializedName("assets")
	private List<PlatformAsset> assets = null;

	public PlatformAssets() {
	}

	PlatformAssets(Parcel in) {
		assets = (List<PlatformAsset>) in.readValue(PlatformAsset.class.getClassLoader());
	}

	public PlatformAssets assets(List<PlatformAsset> assets) {
		this.assets = assets;
		return this;
	}

	public PlatformAssets addAssetsItem(PlatformAsset assetsItem) {
		if (this.assets == null) {
			this.assets = new ArrayList<PlatformAsset>();
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
	public List<PlatformAsset> getAssets() {
		return assets;
	}

	public void setAssets(List<PlatformAsset> assets) {
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
		PlatformAssets platformAssets = (PlatformAssets) o;
		return Objects.equals(this.assets, platformAssets.assets);
	}

	@Override
	public int hashCode() {
		return Objects.hash(assets);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PlatformAssets {\n");

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
