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
 * MakeSignalProviderProgram
 */


public class MakeSignalProviderProgram implements Parcelable
{
	public static final Parcelable.Creator<MakeSignalProviderProgram> CREATOR = new Parcelable.Creator<MakeSignalProviderProgram>()
	{
		public MakeSignalProviderProgram createFromParcel(Parcel in) {
			return new MakeSignalProviderProgram(in);
		}

		public MakeSignalProviderProgram[] newArray(int size) {
			return new MakeSignalProviderProgram[size];
		}
	};

	@SerializedName("assetId")
	private UUID assetId = null;

	@SerializedName("periodLength")
	private Integer periodLength = null;

	@SerializedName("stopOutLevel")
	private Double stopOutLevel = null;

	@SerializedName("investmentLimit")
	private Double investmentLimit = null;

	@SerializedName("entryFee")
	private Double entryFee = null;

	@SerializedName("successFee")
	private Double successFee = null;

	public MakeSignalProviderProgram() {
	}

	MakeSignalProviderProgram(Parcel in) {
		assetId = (UUID) in.readValue(UUID.class.getClassLoader());
		periodLength = (Integer) in.readValue(null);
		stopOutLevel = (Double) in.readValue(null);
		investmentLimit = (Double) in.readValue(null);
		entryFee = (Double) in.readValue(null);
		successFee = (Double) in.readValue(null);
	}

	public MakeSignalProviderProgram assetId(UUID assetId) {
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

	public MakeSignalProviderProgram periodLength(Integer periodLength) {
		this.periodLength = periodLength;
		return this;
	}

	/**
	 * Get periodLength
	 *
	 * @return periodLength
	 **/
	@Schema(description = "")
	public Integer getPeriodLength() {
		return periodLength;
	}

	public void setPeriodLength(Integer periodLength) {
		this.periodLength = periodLength;
	}

	public MakeSignalProviderProgram stopOutLevel(Double stopOutLevel) {
		this.stopOutLevel = stopOutLevel;
		return this;
	}

	/**
	 * Get stopOutLevel
	 *
	 * @return stopOutLevel
	 **/
	@Schema(description = "")
	public Double getStopOutLevel() {
		return stopOutLevel;
	}

	public void setStopOutLevel(Double stopOutLevel) {
		this.stopOutLevel = stopOutLevel;
	}

	public MakeSignalProviderProgram investmentLimit(Double investmentLimit) {
		this.investmentLimit = investmentLimit;
		return this;
	}

	/**
	 * Get investmentLimit
	 *
	 * @return investmentLimit
	 **/
	@Schema(description = "")
	public Double getInvestmentLimit() {
		return investmentLimit;
	}

	public void setInvestmentLimit(Double investmentLimit) {
		this.investmentLimit = investmentLimit;
	}

	public MakeSignalProviderProgram entryFee(Double entryFee) {
		this.entryFee = entryFee;
		return this;
	}

	/**
	 * Get entryFee
	 *
	 * @return entryFee
	 **/
	@Schema(description = "")
	public Double getEntryFee() {
		return entryFee;
	}

	public void setEntryFee(Double entryFee) {
		this.entryFee = entryFee;
	}

	public MakeSignalProviderProgram successFee(Double successFee) {
		this.successFee = successFee;
		return this;
	}

	/**
	 * Get successFee
	 *
	 * @return successFee
	 **/
	@Schema(description = "")
	public Double getSuccessFee() {
		return successFee;
	}

	public void setSuccessFee(Double successFee) {
		this.successFee = successFee;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		MakeSignalProviderProgram makeSignalProviderProgram = (MakeSignalProviderProgram) o;
		return Objects.equals(this.assetId, makeSignalProviderProgram.assetId) &&
				Objects.equals(this.periodLength, makeSignalProviderProgram.periodLength) &&
				Objects.equals(this.stopOutLevel, makeSignalProviderProgram.stopOutLevel) &&
				Objects.equals(this.investmentLimit, makeSignalProviderProgram.investmentLimit) &&
				Objects.equals(this.entryFee, makeSignalProviderProgram.entryFee) &&
				Objects.equals(this.successFee, makeSignalProviderProgram.successFee);
	}

	@Override
	public int hashCode() {
		return Objects.hash(assetId, periodLength, stopOutLevel, investmentLimit, entryFee, successFee);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class MakeSignalProviderProgram {\n");

		sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
		sb.append("    periodLength: ").append(toIndentedString(periodLength)).append("\n");
		sb.append("    stopOutLevel: ").append(toIndentedString(stopOutLevel)).append("\n");
		sb.append("    investmentLimit: ").append(toIndentedString(investmentLimit)).append("\n");
		sb.append("    entryFee: ").append(toIndentedString(entryFee)).append("\n");
		sb.append("    successFee: ").append(toIndentedString(successFee)).append("\n");
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
		out.writeValue(periodLength);
		out.writeValue(stopOutLevel);
		out.writeValue(investmentLimit);
		out.writeValue(entryFee);
		out.writeValue(successFee);
	}

	public int describeContents() {
		return 0;
	}
}