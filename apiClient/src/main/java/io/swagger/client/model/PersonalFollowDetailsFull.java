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
 * PersonalFollowDetailsFull
 */


public class PersonalFollowDetailsFull implements Parcelable
{
	public static final Parcelable.Creator<PersonalFollowDetailsFull> CREATOR = new Parcelable.Creator<PersonalFollowDetailsFull>()
	{
		public PersonalFollowDetailsFull createFromParcel(Parcel in) {
			return new PersonalFollowDetailsFull(in);
		}

		public PersonalFollowDetailsFull[] newArray(int size) {
			return new PersonalFollowDetailsFull[size];
		}
	};

	@SerializedName("isOwnAsset")
	private Boolean isOwnAsset = null;

	@SerializedName("isFavorite")
	private Boolean isFavorite = null;

	@SerializedName("isProgram")
	private Boolean isProgram = null;

	@SerializedName("ownerActions")
	private FollowOwnerActions ownerActions = null;

	@SerializedName("guestActions")
	private AssetGuestActions guestActions = null;

	@SerializedName("hasNotifications")
	private Boolean hasNotifications = null;

	@SerializedName("balance")
	private Double balance = null;

	@SerializedName("leverage")
	private Integer leverage = null;

	public PersonalFollowDetailsFull() {
	}

	PersonalFollowDetailsFull(Parcel in) {
		isOwnAsset = (Boolean) in.readValue(null);
		isFavorite = (Boolean) in.readValue(null);
		isProgram = (Boolean) in.readValue(null);
		ownerActions = (FollowOwnerActions) in.readValue(FollowOwnerActions.class.getClassLoader());
		guestActions = (AssetGuestActions) in.readValue(AssetGuestActions.class.getClassLoader());
		hasNotifications = (Boolean) in.readValue(null);
		balance = (Double) in.readValue(null);
		leverage = (Integer) in.readValue(null);
	}

	public PersonalFollowDetailsFull isOwnAsset(Boolean isOwnAsset) {
		this.isOwnAsset = isOwnAsset;
		return this;
	}

	/**
	 * Get isOwnAsset
	 *
	 * @return isOwnAsset
	 **/
	@Schema(description = "")
	public Boolean isIsOwnAsset() {
		return isOwnAsset;
	}

	public void setIsOwnAsset(Boolean isOwnAsset) {
		this.isOwnAsset = isOwnAsset;
	}

	public PersonalFollowDetailsFull isFavorite(Boolean isFavorite) {
		this.isFavorite = isFavorite;
		return this;
	}

	/**
	 * Get isFavorite
	 *
	 * @return isFavorite
	 **/
	@Schema(description = "")
	public Boolean isIsFavorite() {
		return isFavorite;
	}

	public void setIsFavorite(Boolean isFavorite) {
		this.isFavorite = isFavorite;
	}

	public PersonalFollowDetailsFull isProgram(Boolean isProgram) {
		this.isProgram = isProgram;
		return this;
	}

	/**
	 * Get isProgram
	 *
	 * @return isProgram
	 **/
	@Schema(description = "")
	public Boolean isIsProgram() {
		return isProgram;
	}

	public void setIsProgram(Boolean isProgram) {
		this.isProgram = isProgram;
	}

	public PersonalFollowDetailsFull ownerActions(FollowOwnerActions ownerActions) {
		this.ownerActions = ownerActions;
		return this;
	}

	/**
	 * Get ownerActions
	 *
	 * @return ownerActions
	 **/
	@Schema(description = "")
	public FollowOwnerActions getOwnerActions() {
		return ownerActions;
	}

	public void setOwnerActions(FollowOwnerActions ownerActions) {
		this.ownerActions = ownerActions;
	}

	public PersonalFollowDetailsFull guestActions(AssetGuestActions guestActions) {
		this.guestActions = guestActions;
		return this;
	}

	/**
	 * Get guestActions
	 *
	 * @return guestActions
	 **/
	@Schema(description = "")
	public AssetGuestActions getGuestActions() {
		return guestActions;
	}

	public void setGuestActions(AssetGuestActions guestActions) {
		this.guestActions = guestActions;
	}

	public PersonalFollowDetailsFull hasNotifications(Boolean hasNotifications) {
		this.hasNotifications = hasNotifications;
		return this;
	}

	/**
	 * Get hasNotifications
	 *
	 * @return hasNotifications
	 **/
	@Schema(description = "")
	public Boolean isHasNotifications() {
		return hasNotifications;
	}

	public void setHasNotifications(Boolean hasNotifications) {
		this.hasNotifications = hasNotifications;
	}

	public PersonalFollowDetailsFull balance(Double balance) {
		this.balance = balance;
		return this;
	}

	/**
	 * Get balance
	 *
	 * @return balance
	 **/
	@Schema(description = "")
	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public PersonalFollowDetailsFull leverage(Integer leverage) {
		this.leverage = leverage;
		return this;
	}

	/**
	 * Get leverage
	 *
	 * @return leverage
	 **/
	@Schema(description = "")
	public Integer getLeverage() {
		return leverage;
	}

	public void setLeverage(Integer leverage) {
		this.leverage = leverage;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PersonalFollowDetailsFull personalFollowDetailsFull = (PersonalFollowDetailsFull) o;
		return Objects.equals(this.isOwnAsset, personalFollowDetailsFull.isOwnAsset) &&
				Objects.equals(this.isFavorite, personalFollowDetailsFull.isFavorite) &&
				Objects.equals(this.isProgram, personalFollowDetailsFull.isProgram) &&
				Objects.equals(this.ownerActions, personalFollowDetailsFull.ownerActions) &&
				Objects.equals(this.guestActions, personalFollowDetailsFull.guestActions) &&
				Objects.equals(this.hasNotifications, personalFollowDetailsFull.hasNotifications) &&
				Objects.equals(this.balance, personalFollowDetailsFull.balance) &&
				Objects.equals(this.leverage, personalFollowDetailsFull.leverage);
	}

	@Override
	public int hashCode() {
		return Objects.hash(isOwnAsset, isFavorite, isProgram, ownerActions, guestActions, hasNotifications, balance, leverage);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PersonalFollowDetailsFull {\n");

		sb.append("    isOwnAsset: ").append(toIndentedString(isOwnAsset)).append("\n");
		sb.append("    isFavorite: ").append(toIndentedString(isFavorite)).append("\n");
		sb.append("    isProgram: ").append(toIndentedString(isProgram)).append("\n");
		sb.append("    ownerActions: ").append(toIndentedString(ownerActions)).append("\n");
		sb.append("    guestActions: ").append(toIndentedString(guestActions)).append("\n");
		sb.append("    hasNotifications: ").append(toIndentedString(hasNotifications)).append("\n");
		sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
		sb.append("    leverage: ").append(toIndentedString(leverage)).append("\n");
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
		out.writeValue(isOwnAsset);
		out.writeValue(isFavorite);
		out.writeValue(isProgram);
		out.writeValue(ownerActions);
		out.writeValue(guestActions);
		out.writeValue(hasNotifications);
		out.writeValue(balance);
		out.writeValue(leverage);
	}

	public int describeContents() {
		return 0;
	}
}
