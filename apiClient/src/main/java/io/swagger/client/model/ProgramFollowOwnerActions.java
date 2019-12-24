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
 * ProgramFollowOwnerActions
 */


public class ProgramFollowOwnerActions implements Parcelable
{
	public static final Parcelable.Creator<ProgramFollowOwnerActions> CREATOR = new Parcelable.Creator<ProgramFollowOwnerActions>()
	{
		public ProgramFollowOwnerActions createFromParcel(Parcel in) {
			return new ProgramFollowOwnerActions(in);
		}

		public ProgramFollowOwnerActions[] newArray(int size) {
			return new ProgramFollowOwnerActions[size];
		}
	};

	@SerializedName("canClose")
	private Boolean canClose = null;

	@SerializedName("canClosePeriod")
	private Boolean canClosePeriod = null;

	@SerializedName("canChangePassword")
	private Boolean canChangePassword = null;

	@SerializedName("canTransferMoney")
	private Boolean canTransferMoney = null;

	@SerializedName("canMakeProgramFromPrivateTradingAccount")
	private Boolean canMakeProgramFromPrivateTradingAccount = null;

	@SerializedName("canMakeSignalProviderFromPrivateTradingAccount")
	private Boolean canMakeSignalProviderFromPrivateTradingAccount = null;

	@SerializedName("canMakeSignalProviderFromPrivateExternalTradingAccount")
	private Boolean canMakeSignalProviderFromPrivateExternalTradingAccount = null;

	@SerializedName("canMakeProgramFromSignalProvider")
	private Boolean canMakeProgramFromSignalProvider = null;

	@SerializedName("canMakeSignalProviderFromProgram")
	private Boolean canMakeSignalProviderFromProgram = null;

	@SerializedName("canEditSignalProviderSettings")
	private Boolean canEditSignalProviderSettings = null;

	@SerializedName("isEnoughMoneyToCreateProgram")
	private Boolean isEnoughMoneyToCreateProgram = null;

	public ProgramFollowOwnerActions() {
	}

	ProgramFollowOwnerActions(Parcel in) {
		canClose = (Boolean) in.readValue(null);
		canClosePeriod = (Boolean) in.readValue(null);
		canChangePassword = (Boolean) in.readValue(null);
		canTransferMoney = (Boolean) in.readValue(null);
		canMakeProgramFromPrivateTradingAccount = (Boolean) in.readValue(null);
		canMakeSignalProviderFromPrivateTradingAccount = (Boolean) in.readValue(null);
		canMakeSignalProviderFromPrivateExternalTradingAccount = (Boolean) in.readValue(null);
		canMakeProgramFromSignalProvider = (Boolean) in.readValue(null);
		canMakeSignalProviderFromProgram = (Boolean) in.readValue(null);
		canEditSignalProviderSettings = (Boolean) in.readValue(null);
		isEnoughMoneyToCreateProgram = (Boolean) in.readValue(null);
	}

	public ProgramFollowOwnerActions canClose(Boolean canClose) {
		this.canClose = canClose;
		return this;
	}

	/**
	 * Get canClose
	 *
	 * @return canClose
	 **/
	@Schema(description = "")
	public Boolean isCanClose() {
		return canClose;
	}

	public void setCanClose(Boolean canClose) {
		this.canClose = canClose;
	}

	public ProgramFollowOwnerActions canClosePeriod(Boolean canClosePeriod) {
		this.canClosePeriod = canClosePeriod;
		return this;
	}

	/**
	 * Get canClosePeriod
	 *
	 * @return canClosePeriod
	 **/
	@Schema(description = "")
	public Boolean isCanClosePeriod() {
		return canClosePeriod;
	}

	public void setCanClosePeriod(Boolean canClosePeriod) {
		this.canClosePeriod = canClosePeriod;
	}

	public ProgramFollowOwnerActions canChangePassword(Boolean canChangePassword) {
		this.canChangePassword = canChangePassword;
		return this;
	}

	/**
	 * Get canChangePassword
	 *
	 * @return canChangePassword
	 **/
	@Schema(description = "")
	public Boolean isCanChangePassword() {
		return canChangePassword;
	}

	public void setCanChangePassword(Boolean canChangePassword) {
		this.canChangePassword = canChangePassword;
	}

	public ProgramFollowOwnerActions canTransferMoney(Boolean canTransferMoney) {
		this.canTransferMoney = canTransferMoney;
		return this;
	}

	/**
	 * Get canTransferMoney
	 *
	 * @return canTransferMoney
	 **/
	@Schema(description = "")
	public Boolean isCanTransferMoney() {
		return canTransferMoney;
	}

	public void setCanTransferMoney(Boolean canTransferMoney) {
		this.canTransferMoney = canTransferMoney;
	}

	public ProgramFollowOwnerActions canMakeProgramFromPrivateTradingAccount(Boolean canMakeProgramFromPrivateTradingAccount) {
		this.canMakeProgramFromPrivateTradingAccount = canMakeProgramFromPrivateTradingAccount;
		return this;
	}

	/**
	 * Get canMakeProgramFromPrivateTradingAccount
	 *
	 * @return canMakeProgramFromPrivateTradingAccount
	 **/
	@Schema(description = "")
	public Boolean isCanMakeProgramFromPrivateTradingAccount() {
		return canMakeProgramFromPrivateTradingAccount;
	}

	public void setCanMakeProgramFromPrivateTradingAccount(Boolean canMakeProgramFromPrivateTradingAccount) {
		this.canMakeProgramFromPrivateTradingAccount = canMakeProgramFromPrivateTradingAccount;
	}

	public ProgramFollowOwnerActions canMakeSignalProviderFromPrivateTradingAccount(Boolean canMakeSignalProviderFromPrivateTradingAccount) {
		this.canMakeSignalProviderFromPrivateTradingAccount = canMakeSignalProviderFromPrivateTradingAccount;
		return this;
	}

	/**
	 * Get canMakeSignalProviderFromPrivateTradingAccount
	 *
	 * @return canMakeSignalProviderFromPrivateTradingAccount
	 **/
	@Schema(description = "")
	public Boolean isCanMakeSignalProviderFromPrivateTradingAccount() {
		return canMakeSignalProviderFromPrivateTradingAccount;
	}

	public void setCanMakeSignalProviderFromPrivateTradingAccount(Boolean canMakeSignalProviderFromPrivateTradingAccount) {
		this.canMakeSignalProviderFromPrivateTradingAccount = canMakeSignalProviderFromPrivateTradingAccount;
	}

	public ProgramFollowOwnerActions canMakeSignalProviderFromPrivateExternalTradingAccount(Boolean canMakeSignalProviderFromPrivateExternalTradingAccount) {
		this.canMakeSignalProviderFromPrivateExternalTradingAccount = canMakeSignalProviderFromPrivateExternalTradingAccount;
		return this;
	}

	/**
	 * Get canMakeSignalProviderFromPrivateExternalTradingAccount
	 *
	 * @return canMakeSignalProviderFromPrivateExternalTradingAccount
	 **/
	@Schema(description = "")
	public Boolean isCanMakeSignalProviderFromPrivateExternalTradingAccount() {
		return canMakeSignalProviderFromPrivateExternalTradingAccount;
	}

	public void setCanMakeSignalProviderFromPrivateExternalTradingAccount(Boolean canMakeSignalProviderFromPrivateExternalTradingAccount) {
		this.canMakeSignalProviderFromPrivateExternalTradingAccount = canMakeSignalProviderFromPrivateExternalTradingAccount;
	}

	public ProgramFollowOwnerActions canMakeProgramFromSignalProvider(Boolean canMakeProgramFromSignalProvider) {
		this.canMakeProgramFromSignalProvider = canMakeProgramFromSignalProvider;
		return this;
	}

	/**
	 * Get canMakeProgramFromSignalProvider
	 *
	 * @return canMakeProgramFromSignalProvider
	 **/
	@Schema(description = "")
	public Boolean isCanMakeProgramFromSignalProvider() {
		return canMakeProgramFromSignalProvider;
	}

	public void setCanMakeProgramFromSignalProvider(Boolean canMakeProgramFromSignalProvider) {
		this.canMakeProgramFromSignalProvider = canMakeProgramFromSignalProvider;
	}

	public ProgramFollowOwnerActions canMakeSignalProviderFromProgram(Boolean canMakeSignalProviderFromProgram) {
		this.canMakeSignalProviderFromProgram = canMakeSignalProviderFromProgram;
		return this;
	}

	/**
	 * Get canMakeSignalProviderFromProgram
	 *
	 * @return canMakeSignalProviderFromProgram
	 **/
	@Schema(description = "")
	public Boolean isCanMakeSignalProviderFromProgram() {
		return canMakeSignalProviderFromProgram;
	}

	public void setCanMakeSignalProviderFromProgram(Boolean canMakeSignalProviderFromProgram) {
		this.canMakeSignalProviderFromProgram = canMakeSignalProviderFromProgram;
	}

	public ProgramFollowOwnerActions canEditSignalProviderSettings(Boolean canEditSignalProviderSettings) {
		this.canEditSignalProviderSettings = canEditSignalProviderSettings;
		return this;
	}

	/**
	 * Get canEditSignalProviderSettings
	 *
	 * @return canEditSignalProviderSettings
	 **/
	@Schema(description = "")
	public Boolean isCanEditSignalProviderSettings() {
		return canEditSignalProviderSettings;
	}

	public void setCanEditSignalProviderSettings(Boolean canEditSignalProviderSettings) {
		this.canEditSignalProviderSettings = canEditSignalProviderSettings;
	}

	public ProgramFollowOwnerActions isEnoughMoneyToCreateProgram(Boolean isEnoughMoneyToCreateProgram) {
		this.isEnoughMoneyToCreateProgram = isEnoughMoneyToCreateProgram;
		return this;
	}

	/**
	 * Get isEnoughMoneyToCreateProgram
	 *
	 * @return isEnoughMoneyToCreateProgram
	 **/
	@Schema(description = "")
	public Boolean isIsEnoughMoneyToCreateProgram() {
		return isEnoughMoneyToCreateProgram;
	}

	public void setIsEnoughMoneyToCreateProgram(Boolean isEnoughMoneyToCreateProgram) {
		this.isEnoughMoneyToCreateProgram = isEnoughMoneyToCreateProgram;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ProgramFollowOwnerActions programFollowOwnerActions = (ProgramFollowOwnerActions) o;
		return Objects.equals(this.canClose, programFollowOwnerActions.canClose) &&
				Objects.equals(this.canClosePeriod, programFollowOwnerActions.canClosePeriod) &&
				Objects.equals(this.canChangePassword, programFollowOwnerActions.canChangePassword) &&
				Objects.equals(this.canTransferMoney, programFollowOwnerActions.canTransferMoney) &&
				Objects.equals(this.canMakeProgramFromPrivateTradingAccount, programFollowOwnerActions.canMakeProgramFromPrivateTradingAccount) &&
				Objects.equals(this.canMakeSignalProviderFromPrivateTradingAccount, programFollowOwnerActions.canMakeSignalProviderFromPrivateTradingAccount) &&
				Objects.equals(this.canMakeSignalProviderFromPrivateExternalTradingAccount, programFollowOwnerActions.canMakeSignalProviderFromPrivateExternalTradingAccount) &&
				Objects.equals(this.canMakeProgramFromSignalProvider, programFollowOwnerActions.canMakeProgramFromSignalProvider) &&
				Objects.equals(this.canMakeSignalProviderFromProgram, programFollowOwnerActions.canMakeSignalProviderFromProgram) &&
				Objects.equals(this.canEditSignalProviderSettings, programFollowOwnerActions.canEditSignalProviderSettings) &&
				Objects.equals(this.isEnoughMoneyToCreateProgram, programFollowOwnerActions.isEnoughMoneyToCreateProgram);
	}

	@Override
	public int hashCode() {
		return Objects.hash(canClose, canClosePeriod, canChangePassword, canTransferMoney, canMakeProgramFromPrivateTradingAccount, canMakeSignalProviderFromPrivateTradingAccount, canMakeSignalProviderFromPrivateExternalTradingAccount, canMakeProgramFromSignalProvider, canMakeSignalProviderFromProgram, canEditSignalProviderSettings, isEnoughMoneyToCreateProgram);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ProgramFollowOwnerActions {\n");

		sb.append("    canClose: ").append(toIndentedString(canClose)).append("\n");
		sb.append("    canClosePeriod: ").append(toIndentedString(canClosePeriod)).append("\n");
		sb.append("    canChangePassword: ").append(toIndentedString(canChangePassword)).append("\n");
		sb.append("    canTransferMoney: ").append(toIndentedString(canTransferMoney)).append("\n");
		sb.append("    canMakeProgramFromPrivateTradingAccount: ").append(toIndentedString(canMakeProgramFromPrivateTradingAccount)).append("\n");
		sb.append("    canMakeSignalProviderFromPrivateTradingAccount: ").append(toIndentedString(canMakeSignalProviderFromPrivateTradingAccount)).append("\n");
		sb.append("    canMakeSignalProviderFromPrivateExternalTradingAccount: ").append(toIndentedString(canMakeSignalProviderFromPrivateExternalTradingAccount)).append("\n");
		sb.append("    canMakeProgramFromSignalProvider: ").append(toIndentedString(canMakeProgramFromSignalProvider)).append("\n");
		sb.append("    canMakeSignalProviderFromProgram: ").append(toIndentedString(canMakeSignalProviderFromProgram)).append("\n");
		sb.append("    canEditSignalProviderSettings: ").append(toIndentedString(canEditSignalProviderSettings)).append("\n");
		sb.append("    isEnoughMoneyToCreateProgram: ").append(toIndentedString(isEnoughMoneyToCreateProgram)).append("\n");
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
		out.writeValue(canClose);
		out.writeValue(canClosePeriod);
		out.writeValue(canChangePassword);
		out.writeValue(canTransferMoney);
		out.writeValue(canMakeProgramFromPrivateTradingAccount);
		out.writeValue(canMakeSignalProviderFromPrivateTradingAccount);
		out.writeValue(canMakeSignalProviderFromPrivateExternalTradingAccount);
		out.writeValue(canMakeProgramFromSignalProvider);
		out.writeValue(canMakeSignalProviderFromProgram);
		out.writeValue(canEditSignalProviderSettings);
		out.writeValue(isEnoughMoneyToCreateProgram);
	}

	public int describeContents() {
		return 0;
	}
}
