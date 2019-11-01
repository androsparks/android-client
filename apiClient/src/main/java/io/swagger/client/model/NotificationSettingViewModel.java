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
import java.util.UUID;

import io.swagger.v3.oas.annotations.media.Schema;
/**
 * NotificationSettingViewModel
 */


public class NotificationSettingViewModel implements Parcelable
{
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("isEnabled")
  private Boolean isEnabled = null;

  @SerializedName("assetId")
  private UUID assetId = null;

  @SerializedName("managerId")
  private UUID managerId = null;

  @SerializedName("type")
  private NotificationType type = null;

  @SerializedName("conditionType")
  private NotificationSettingConditionType conditionType = null;

  @SerializedName("conditionAmount")
  private Double conditionAmount = null;

  public NotificationSettingViewModel() {
  }

	public NotificationSettingViewModel id(UUID id) {
		this.id = id;
		return this;
	}

	public static final Parcelable.Creator<NotificationSettingViewModel> CREATOR = new Parcelable.Creator<NotificationSettingViewModel>()
	{
		public NotificationSettingViewModel createFromParcel(Parcel in) {
			return new NotificationSettingViewModel(in);
		}

		public NotificationSettingViewModel[] newArray(int size) {
			return new NotificationSettingViewModel[size];
		}
	};

	public void setId(UUID id) {
		this.id = id;
	}

	public NotificationSettingViewModel isEnabled(Boolean isEnabled) {
		this.isEnabled = isEnabled;
		return this;
	}

  NotificationSettingViewModel(Parcel in) {
	  id = (UUID) in.readValue(UUID.class.getClassLoader());
	  isEnabled = (Boolean) in.readValue(null);
	  assetId = (UUID) in.readValue(UUID.class.getClassLoader());
	  managerId = (UUID) in.readValue(UUID.class.getClassLoader());
	  type = (NotificationType) in.readValue(NotificationType.class.getClassLoader());
	  conditionType = (NotificationSettingConditionType) in.readValue(NotificationSettingConditionType.class.getClassLoader());
	  conditionAmount = (Double) in.readValue(null);
  }

	public void setIsEnabled(Boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	public NotificationSettingViewModel assetId(UUID assetId) {
		this.assetId = assetId;
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

	public void setAssetId(UUID assetId) {
		this.assetId = assetId;
  }

	public NotificationSettingViewModel managerId(UUID managerId) {
		this.managerId = managerId;
    return this;
  }

	/**
   * Get isEnabled
   * @return isEnabled
	 **/
  @Schema(description = "")
  public Boolean isIsEnabled() {
    return isEnabled;
  }

	public void setManagerId(UUID managerId) {
		this.managerId = managerId;
  }

	public NotificationSettingViewModel type(NotificationType type) {
		this.type = type;
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

	public void setType(NotificationType type) {
		this.type = type;
  }

	public NotificationSettingViewModel conditionType(NotificationSettingConditionType conditionType) {
		this.conditionType = conditionType;
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

	public void setConditionType(NotificationSettingConditionType conditionType) {
		this.conditionType = conditionType;
  }

	public NotificationSettingViewModel conditionAmount(Double conditionAmount) {
		this.conditionAmount = conditionAmount;
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

	public void setConditionAmount(Double conditionAmount) {
		this.conditionAmount = conditionAmount;
  }

	/**
   * Get conditionType
   * @return conditionType
	 **/
  @Schema(description = "")
  public NotificationSettingConditionType getConditionType() {
    return conditionType;
  }

	@Override
	public int hashCode() {
		return Objects.hash(id, isEnabled, assetId, managerId, type, conditionType, conditionAmount);
  }

	/**
   * Get conditionAmount
   * @return conditionAmount
	 **/
  @Schema(description = "")
  public Double getConditionAmount() {
    return conditionAmount;
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
		out.writeValue(isEnabled);
		out.writeValue(assetId);
		out.writeValue(managerId);
		out.writeValue(type);
		out.writeValue(conditionType);
		out.writeValue(conditionAmount);
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationSettingViewModel notificationSettingViewModel = (NotificationSettingViewModel) o;
    return Objects.equals(this.id, notificationSettingViewModel.id) &&
		    Objects.equals(this.isEnabled, notificationSettingViewModel.isEnabled) &&
		    Objects.equals(this.assetId, notificationSettingViewModel.assetId) &&
		    Objects.equals(this.managerId, notificationSettingViewModel.managerId) &&
		    Objects.equals(this.type, notificationSettingViewModel.type) &&
		    Objects.equals(this.conditionType, notificationSettingViewModel.conditionType) &&
		    Objects.equals(this.conditionAmount, notificationSettingViewModel.conditionAmount);
  }

	public int describeContents() {
		return 0;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationSettingViewModel {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    managerId: ").append(toIndentedString(managerId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    conditionType: ").append(toIndentedString(conditionType)).append("\n");
    sb.append("    conditionAmount: ").append(toIndentedString(conditionAmount)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
