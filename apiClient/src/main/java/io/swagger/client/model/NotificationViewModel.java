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

import org.joda.time.DateTime;

import java.util.Objects;
import java.util.UUID;

import io.swagger.v3.oas.annotations.media.Schema;
/**
 * NotificationViewModel
 */


public class NotificationViewModel implements Parcelable
{
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("date")
  private DateTime date = null;

  @SerializedName("type")
  private NotificationType type = null;

  @SerializedName("assetId")
  private UUID assetId = null;

  @SerializedName("managerId")
  private UUID managerId = null;

  @SerializedName("logo")
  private String logo = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("color")
  private String color = null;

  @SerializedName("isUnread")
  private Boolean isUnread = null;

  @SerializedName("assetType")
  private InvestmentProgramType assetType = null;

  public NotificationViewModel() {
  }

	public NotificationViewModel id(UUID id) {
		this.id = id;
		return this;
	}

	public static final Parcelable.Creator<NotificationViewModel> CREATOR = new Parcelable.Creator<NotificationViewModel>()
	{
		public NotificationViewModel createFromParcel(Parcel in) {
			return new NotificationViewModel(in);
		}

		public NotificationViewModel[] newArray(int size) {
			return new NotificationViewModel[size];
		}
	};

	public void setId(UUID id) {
		this.id = id;
	}

	public NotificationViewModel text(String text) {
		this.text = text;
		return this;
	}

  NotificationViewModel(Parcel in) {
	  id = (UUID) in.readValue(UUID.class.getClassLoader());
	  text = (String) in.readValue(null);
	  date = (DateTime) in.readValue(DateTime.class.getClassLoader());
	  type = (NotificationType) in.readValue(NotificationType.class.getClassLoader());
	  assetId = (UUID) in.readValue(UUID.class.getClassLoader());
	  managerId = (UUID) in.readValue(UUID.class.getClassLoader());
	  logo = (String) in.readValue(null);
	  url = (String) in.readValue(null);
	  color = (String) in.readValue(null);
	  isUnread = (Boolean) in.readValue(null);
	  assetType = (InvestmentProgramType) in.readValue(InvestmentProgramType.class.getClassLoader());
  }

	public void setText(String text) {
		this.text = text;
	}

	public NotificationViewModel date(DateTime date) {
		this.date = date;
    return this;
  }

	/**
   * Get id
   * @return id
	 **/
  @Schema(description = "")
  public UUID getId() {
    return id;
  }

	public void setDate(DateTime date) {
		this.date = date;
  }

	public NotificationViewModel type(NotificationType type) {
		this.type = type;
    return this;
  }

	/**
   * Get text
   * @return text
	 **/
  @Schema(description = "")
  public String getText() {
    return text;
  }

	public void setType(NotificationType type) {
		this.type = type;
  }

	public NotificationViewModel assetId(UUID assetId) {
		this.assetId = assetId;
    return this;
  }

	/**
   * Get date
   * @return date
	 **/
  @Schema(description = "")
  public DateTime getDate() {
    return date;
  }

	public void setAssetId(UUID assetId) {
		this.assetId = assetId;
  }

	public NotificationViewModel managerId(UUID managerId) {
		this.managerId = managerId;
    return this;
  }

	/**
   * Get type
   * @return type
	 **/
  @Schema(description = "")
  public NotificationType getType() {
    return type;
  }

	public void setManagerId(UUID managerId) {
		this.managerId = managerId;
  }

	public NotificationViewModel logo(String logo) {
		this.logo = logo;
    return this;
  }

	/**
   * Get assetId
   * @return assetId
	 **/
  @Schema(description = "")
  public UUID getAssetId() {
    return assetId;
  }

	public void setLogo(String logo) {
		this.logo = logo;
  }

	public NotificationViewModel url(String url) {
		this.url = url;
    return this;
  }

	/**
   * Get managerId
   * @return managerId
	 **/
  @Schema(description = "")
  public UUID getManagerId() {
    return managerId;
  }

	public void setUrl(String url) {
		this.url = url;
  }

	public NotificationViewModel color(String color) {
		this.color = color;
    return this;
  }

	/**
   * Get logo
   * @return logo
	 **/
  @Schema(description = "")
  public String getLogo() {
    return logo;
  }

	public void setColor(String color) {
		this.color = color;
  }

	public NotificationViewModel isUnread(Boolean isUnread) {
		this.isUnread = isUnread;
    return this;
  }

	/**
   * Get url
   * @return url
	 **/
  @Schema(description = "")
  public String getUrl() {
    return url;
  }

	public void setIsUnread(Boolean isUnread) {
		this.isUnread = isUnread;
  }

	public NotificationViewModel assetType(InvestmentProgramType assetType) {
		this.assetType = assetType;
    return this;
  }

	/**
   * Get color
   * @return color
	 **/
  @Schema(description = "")
  public String getColor() {
    return color;
  }

	public void setAssetType(InvestmentProgramType assetType) {
		this.assetType = assetType;
  }

	/**
   * Get isUnread
   * @return isUnread
	 **/
  @Schema(description = "")
  public Boolean isIsUnread() {
    return isUnread;
  }

	@Override
	public int hashCode() {
		return Objects.hash(id, text, date, type, assetId, managerId, logo, url, color, isUnread, assetType);
  }

	/**
   * Get assetType
   * @return assetType
	 **/
  @Schema(description = "")
  public InvestmentProgramType getAssetType() {
    return assetType;
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
		out.writeValue(id);
		out.writeValue(text);
		out.writeValue(date);
		out.writeValue(type);
		out.writeValue(assetId);
		out.writeValue(managerId);
		out.writeValue(logo);
		out.writeValue(url);
		out.writeValue(color);
		out.writeValue(isUnread);
		out.writeValue(assetType);
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationViewModel notificationViewModel = (NotificationViewModel) o;
    return Objects.equals(this.id, notificationViewModel.id) &&
		    Objects.equals(this.text, notificationViewModel.text) &&
		    Objects.equals(this.date, notificationViewModel.date) &&
		    Objects.equals(this.type, notificationViewModel.type) &&
		    Objects.equals(this.assetId, notificationViewModel.assetId) &&
		    Objects.equals(this.managerId, notificationViewModel.managerId) &&
		    Objects.equals(this.logo, notificationViewModel.logo) &&
		    Objects.equals(this.url, notificationViewModel.url) &&
		    Objects.equals(this.color, notificationViewModel.color) &&
		    Objects.equals(this.isUnread, notificationViewModel.isUnread) &&
		    Objects.equals(this.assetType, notificationViewModel.assetType);
  }

	public int describeContents() {
		return 0;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationViewModel {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    managerId: ").append(toIndentedString(managerId)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    isUnread: ").append(toIndentedString(isUnread)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
