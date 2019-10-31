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
 * AssetPlatformInfo
 */


public class AssetPlatformInfo implements Parcelable
{
	public static final Parcelable.Creator<AssetPlatformInfo> CREATOR = new Parcelable.Creator<AssetPlatformInfo>()
	{
		public AssetPlatformInfo createFromParcel(Parcel in) {
			return new AssetPlatformInfo(in);
		}

		public AssetPlatformInfo[] newArray(int size) {
			return new AssetPlatformInfo[size];
		}
	};

	@SerializedName("programInfo")
	private ProgramAssetPlatformInfo programInfo = null;

	@SerializedName("fundInfo")
	private FundAssetPlatformInfo fundInfo = null;

	public AssetPlatformInfo() {
	}

	AssetPlatformInfo(Parcel in) {
		programInfo = (ProgramAssetPlatformInfo) in.readValue(ProgramAssetPlatformInfo.class.getClassLoader());
		fundInfo = (FundAssetPlatformInfo) in.readValue(FundAssetPlatformInfo.class.getClassLoader());
	}

	public AssetPlatformInfo programInfo(ProgramAssetPlatformInfo programInfo) {
		this.programInfo = programInfo;
		return this;
	}

	/**
	 * Get programInfo
	 *
	 * @return programInfo
	 **/
	@Schema(description = "")
	public ProgramAssetPlatformInfo getProgramInfo() {
		return programInfo;
	}

	public void setProgramInfo(ProgramAssetPlatformInfo programInfo) {
		this.programInfo = programInfo;
	}

	public AssetPlatformInfo fundInfo(FundAssetPlatformInfo fundInfo) {
		this.fundInfo = fundInfo;
		return this;
	}

	/**
	 * Get fundInfo
	 *
	 * @return fundInfo
	 **/
	@Schema(description = "")
	public FundAssetPlatformInfo getFundInfo() {
		return fundInfo;
	}

	public void setFundInfo(FundAssetPlatformInfo fundInfo) {
		this.fundInfo = fundInfo;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AssetPlatformInfo assetPlatformInfo = (AssetPlatformInfo) o;
		return Objects.equals(this.programInfo, assetPlatformInfo.programInfo) &&
				Objects.equals(this.fundInfo, assetPlatformInfo.fundInfo);
	}

	@Override
	public int hashCode() {
		return Objects.hash(programInfo, fundInfo);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AssetPlatformInfo {\n");

		sb.append("    programInfo: ").append(toIndentedString(programInfo)).append("\n");
		sb.append("    fundInfo: ").append(toIndentedString(fundInfo)).append("\n");
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
		out.writeValue(programInfo);
		out.writeValue(fundInfo);
	}

	public int describeContents() {
		return 0;
	}
}