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
import java.util.UUID;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * FundNotificationSettingList
 */


public class FundNotificationSettingList implements Parcelable
{
	public static final Parcelable.Creator<FundNotificationSettingList> CREATOR = new Parcelable.Creator<FundNotificationSettingList>()
	{
		public FundNotificationSettingList createFromParcel(Parcel in) {
			return new FundNotificationSettingList(in);
		}

		public FundNotificationSettingList[] newArray(int size) {
			return new FundNotificationSettingList[size];
		}
	};

	@SerializedName("assetId")
	private UUID assetId = null;

	@SerializedName("title")
	private String title = null;

	@SerializedName("url")
	private String url = null;

	@SerializedName("logoUrl")
	private String logoUrl = null;

	@SerializedName("color")
	private String color = null;

	@SerializedName("settingsGeneral")
	private List<NotificationSettingViewModel> settingsGeneral = null;

	public FundNotificationSettingList() {
	}

	FundNotificationSettingList(Parcel in) {
		assetId = (UUID) in.readValue(UUID.class.getClassLoader());
		title = (String) in.readValue(null);
		url = (String) in.readValue(null);
		logoUrl = (String) in.readValue(null);
		color = (String) in.readValue(null);
		settingsGeneral = (List<NotificationSettingViewModel>) in.readValue(NotificationSettingViewModel.class.getClassLoader());
	}

	public FundNotificationSettingList assetId(UUID assetId) {
		this.assetId = assetId;
		return this;
	}

	/**
	 * Get assetId
	 *
	 * @return assetId
	 **/
	@Schema(description = "")
	public UUID getAssetId() {
		return assetId;
	}

	public void setAssetId(UUID assetId) {
		this.assetId = assetId;
	}

	public FundNotificationSettingList title(String title) {
		this.title = title;
		return this;
	}

	/**
	 * Get title
	 *
	 * @return title
	 **/
	@Schema(description = "")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public FundNotificationSettingList url(String url) {
		this.url = url;
		return this;
	}

	/**
	 * Get url
	 *
	 * @return url
	 **/
	@Schema(description = "")
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public FundNotificationSettingList logoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
		return this;
	}

	/**
	 * Get logoUrl
	 *
	 * @return logoUrl
	 **/
	@Schema(description = "")
	public String getLogoUrl() {
		return logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public FundNotificationSettingList color(String color) {
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

	public FundNotificationSettingList settingsGeneral(List<NotificationSettingViewModel> settingsGeneral) {
		this.settingsGeneral = settingsGeneral;
		return this;
	}

	public FundNotificationSettingList addSettingsGeneralItem(NotificationSettingViewModel settingsGeneralItem) {
		if (this.settingsGeneral == null) {
			this.settingsGeneral = new ArrayList<NotificationSettingViewModel>();
		}
		this.settingsGeneral.add(settingsGeneralItem);
		return this;
	}

	/**
	 * Get settingsGeneral
	 *
	 * @return settingsGeneral
	 **/
	@Schema(description = "")
	public List<NotificationSettingViewModel> getSettingsGeneral() {
		return settingsGeneral;
	}

	public void setSettingsGeneral(List<NotificationSettingViewModel> settingsGeneral) {
		this.settingsGeneral = settingsGeneral;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		FundNotificationSettingList fundNotificationSettingList = (FundNotificationSettingList) o;
		return Objects.equals(this.assetId, fundNotificationSettingList.assetId) &&
				Objects.equals(this.title, fundNotificationSettingList.title) &&
				Objects.equals(this.url, fundNotificationSettingList.url) &&
				Objects.equals(this.logoUrl, fundNotificationSettingList.logoUrl) &&
				Objects.equals(this.color, fundNotificationSettingList.color) &&
				Objects.equals(this.settingsGeneral, fundNotificationSettingList.settingsGeneral);
	}

	@Override
	public int hashCode() {
		return Objects.hash(assetId, title, url, logoUrl, color, settingsGeneral);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class FundNotificationSettingList {\n");

		sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
		sb.append("    title: ").append(toIndentedString(title)).append("\n");
		sb.append("    url: ").append(toIndentedString(url)).append("\n");
		sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
		sb.append("    color: ").append(toIndentedString(color)).append("\n");
		sb.append("    settingsGeneral: ").append(toIndentedString(settingsGeneral)).append("\n");
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
		out.writeValue(assetId);
		out.writeValue(title);
		out.writeValue(url);
		out.writeValue(logoUrl);
		out.writeValue(color);
		out.writeValue(settingsGeneral);
	}

	public int describeContents() {
		return 0;
	}
}
