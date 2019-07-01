/*
 * Core API v1.0
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.Objects;
import java.util.UUID;

import io.swagger.annotations.ApiModelProperty;

/**
 * NewProgramRequest
 */

public class NewProgramRequest
{
	@SerializedName("currency")
	private CurrencyEnum currency = null;

	@SerializedName("periodLength")
	private Integer periodLength = null;

	@SerializedName("successFee")
	private Double successFee = null;

	@SerializedName("stopOutLevel")
	private Double stopOutLevel = null;

	@SerializedName("leverage")
	private Integer leverage = null;

	@SerializedName("brokerAccountTypeId")
	private UUID brokerAccountTypeId = null;

	@SerializedName("signalSuccessFee")
	private Double signalSuccessFee = null;

	@SerializedName("signalVolumeFee")
	private Double signalVolumeFee = null;

	@SerializedName("isSignalProgram")
	private Boolean isSignalProgram = null;

	@SerializedName("investmentLimit")
	private Double investmentLimit = null;

	@SerializedName("title")
	private String title = null;

	@SerializedName("description")
	private String description = null;

	@SerializedName("logo")
	private String logo = null;

	@SerializedName("entryFee")
	private Double entryFee = null;

	@SerializedName("depositAmount")
	private Double depositAmount = null;

	@SerializedName("depositWalletId")
	private UUID depositWalletId = null;

	public NewProgramRequest currency(CurrencyEnum currency) {
		this.currency = currency;
		return this;
	}

	/**
	 * Get currency
	 *
	 * @return currency
	 **/
	@ApiModelProperty(value = "")
	public CurrencyEnum getCurrency() {
		return currency;
	}

	public void setCurrency(CurrencyEnum currency) {
		this.currency = currency;
	}

	public NewProgramRequest periodLength(Integer periodLength) {
		this.periodLength = periodLength;
		return this;
	}

	/**
	 * Get periodLength
	 *
	 * @return periodLength
	 **/
	@ApiModelProperty(value = "")
	public Integer getPeriodLength() {
		return periodLength;
	}

	public void setPeriodLength(Integer periodLength) {
		this.periodLength = periodLength;
	}

	public NewProgramRequest successFee(Double successFee) {
		this.successFee = successFee;
		return this;
	}

	/**
	 * Get successFee
	 *
	 * @return successFee
	 **/
	@ApiModelProperty(value = "")
	public Double getSuccessFee() {
		return successFee;
	}

	public void setSuccessFee(Double successFee) {
		this.successFee = successFee;
	}

	public NewProgramRequest stopOutLevel(Double stopOutLevel) {
		this.stopOutLevel = stopOutLevel;
		return this;
	}

	/**
	 * Get stopOutLevel
	 *
	 * @return stopOutLevel
	 **/
	@ApiModelProperty(value = "")
	public Double getStopOutLevel() {
		return stopOutLevel;
	}

	public void setStopOutLevel(Double stopOutLevel) {
		this.stopOutLevel = stopOutLevel;
	}

	public NewProgramRequest leverage(Integer leverage) {
		this.leverage = leverage;
		return this;
	}

	/**
	 * Get leverage
	 *
	 * @return leverage
	 **/
	@ApiModelProperty(value = "")
	public Integer getLeverage() {
		return leverage;
	}

	public void setLeverage(Integer leverage) {
		this.leverage = leverage;
	}

	public NewProgramRequest brokerAccountTypeId(UUID brokerAccountTypeId) {
		this.brokerAccountTypeId = brokerAccountTypeId;
		return this;
	}

	/**
	 * Get brokerAccountTypeId
	 *
	 * @return brokerAccountTypeId
	 **/
	@ApiModelProperty(value = "")
	public UUID getBrokerAccountTypeId() {
		return brokerAccountTypeId;
	}

	public void setBrokerAccountTypeId(UUID brokerAccountTypeId) {
		this.brokerAccountTypeId = brokerAccountTypeId;
	}

	public NewProgramRequest signalSuccessFee(Double signalSuccessFee) {
		this.signalSuccessFee = signalSuccessFee;
		return this;
	}

	/**
	 * Get signalSuccessFee
	 *
	 * @return signalSuccessFee
	 **/
	@ApiModelProperty(value = "")
	public Double getSignalSuccessFee() {
		return signalSuccessFee;
	}

	public void setSignalSuccessFee(Double signalSuccessFee) {
		this.signalSuccessFee = signalSuccessFee;
	}

	public NewProgramRequest signalVolumeFee(Double signalVolumeFee) {
		this.signalVolumeFee = signalVolumeFee;
		return this;
	}

	/**
	 * Get signalVolumeFee
	 *
	 * @return signalVolumeFee
	 **/
	@ApiModelProperty(value = "")
	public Double getSignalVolumeFee() {
		return signalVolumeFee;
	}

	public void setSignalVolumeFee(Double signalVolumeFee) {
		this.signalVolumeFee = signalVolumeFee;
	}

	public NewProgramRequest isSignalProgram(Boolean isSignalProgram) {
		this.isSignalProgram = isSignalProgram;
		return this;
	}

	/**
	 * Get isSignalProgram
	 *
	 * @return isSignalProgram
	 **/
	@ApiModelProperty(value = "")
	public Boolean isIsSignalProgram() {
		return isSignalProgram;
	}

	public void setIsSignalProgram(Boolean isSignalProgram) {
		this.isSignalProgram = isSignalProgram;
	}

	public NewProgramRequest investmentLimit(Double investmentLimit) {
		this.investmentLimit = investmentLimit;
		return this;
	}

	/**
	 * Get investmentLimit
	 *
	 * @return investmentLimit
	 **/
	@ApiModelProperty(value = "")
	public Double getInvestmentLimit() {
		return investmentLimit;
	}

	public void setInvestmentLimit(Double investmentLimit) {
		this.investmentLimit = investmentLimit;
	}

	public NewProgramRequest title(String title) {
		this.title = title;
		return this;
	}

	/**
	 * Get title
	 *
	 * @return title
	 **/
	@ApiModelProperty(value = "")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public NewProgramRequest description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Get description
	 *
	 * @return description
	 **/
	@ApiModelProperty(value = "")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public NewProgramRequest logo(String logo) {
		this.logo = logo;
		return this;
	}

	/**
	 * Get logo
	 *
	 * @return logo
	 **/
	@ApiModelProperty(value = "")
	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public NewProgramRequest entryFee(Double entryFee) {
		this.entryFee = entryFee;
		return this;
	}

	/**
	 * Get entryFee
	 *
	 * @return entryFee
	 **/
	@ApiModelProperty(value = "")
	public Double getEntryFee() {
		return entryFee;
	}

	public void setEntryFee(Double entryFee) {
		this.entryFee = entryFee;
	}

	public NewProgramRequest depositAmount(Double depositAmount) {
		this.depositAmount = depositAmount;
		return this;
	}

	/**
	 * Get depositAmount
	 *
	 * @return depositAmount
	 **/
	@ApiModelProperty(value = "")
	public Double getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(Double depositAmount) {
		this.depositAmount = depositAmount;
	}

	public NewProgramRequest depositWalletId(UUID depositWalletId) {
		this.depositWalletId = depositWalletId;
		return this;
	}

	/**
	 * Get depositWalletId
	 *
	 * @return depositWalletId
	 **/
	@ApiModelProperty(value = "")
	public UUID getDepositWalletId() {
		return depositWalletId;
	}

	public void setDepositWalletId(UUID depositWalletId) {
		this.depositWalletId = depositWalletId;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		NewProgramRequest newProgramRequest = (NewProgramRequest) o;
		return Objects.equals(this.currency, newProgramRequest.currency) &&
				Objects.equals(this.periodLength, newProgramRequest.periodLength) &&
				Objects.equals(this.successFee, newProgramRequest.successFee) &&
				Objects.equals(this.stopOutLevel, newProgramRequest.stopOutLevel) &&
				Objects.equals(this.leverage, newProgramRequest.leverage) &&
				Objects.equals(this.brokerAccountTypeId, newProgramRequest.brokerAccountTypeId) &&
				Objects.equals(this.signalSuccessFee, newProgramRequest.signalSuccessFee) &&
				Objects.equals(this.signalVolumeFee, newProgramRequest.signalVolumeFee) &&
				Objects.equals(this.isSignalProgram, newProgramRequest.isSignalProgram) &&
				Objects.equals(this.investmentLimit, newProgramRequest.investmentLimit) &&
				Objects.equals(this.title, newProgramRequest.title) &&
				Objects.equals(this.description, newProgramRequest.description) &&
				Objects.equals(this.logo, newProgramRequest.logo) &&
				Objects.equals(this.entryFee, newProgramRequest.entryFee) &&
				Objects.equals(this.depositAmount, newProgramRequest.depositAmount) &&
				Objects.equals(this.depositWalletId, newProgramRequest.depositWalletId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(currency, periodLength, successFee, stopOutLevel, leverage, brokerAccountTypeId, signalSuccessFee, signalVolumeFee, isSignalProgram, investmentLimit, title, description, logo, entryFee, depositAmount, depositWalletId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class NewProgramRequest {\n");

		sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
		sb.append("    periodLength: ").append(toIndentedString(periodLength)).append("\n");
		sb.append("    successFee: ").append(toIndentedString(successFee)).append("\n");
		sb.append("    stopOutLevel: ").append(toIndentedString(stopOutLevel)).append("\n");
		sb.append("    leverage: ").append(toIndentedString(leverage)).append("\n");
		sb.append("    brokerAccountTypeId: ").append(toIndentedString(brokerAccountTypeId)).append("\n");
		sb.append("    signalSuccessFee: ").append(toIndentedString(signalSuccessFee)).append("\n");
		sb.append("    signalVolumeFee: ").append(toIndentedString(signalVolumeFee)).append("\n");
		sb.append("    isSignalProgram: ").append(toIndentedString(isSignalProgram)).append("\n");
		sb.append("    investmentLimit: ").append(toIndentedString(investmentLimit)).append("\n");
		sb.append("    title: ").append(toIndentedString(title)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
		sb.append("    entryFee: ").append(toIndentedString(entryFee)).append("\n");
		sb.append("    depositAmount: ").append(toIndentedString(depositAmount)).append("\n");
		sb.append("    depositWalletId: ").append(toIndentedString(depositWalletId)).append("\n");
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

	/**
	 * Gets or Sets currency
	 */
	@JsonAdapter(CurrencyEnum.Adapter.class)
	public enum CurrencyEnum
	{
		UNDEFINED("Undefined"),

		GVT("GVT"),

		ETH("ETH"),

		BTC("BTC"),

		ADA("ADA"),

		USDT("USDT"),

		XRP("XRP"),

		BCH("BCH"),

		LTC("LTC"),

		DOGE("DOGE"),

		BNB("BNB"),

		USD("USD"),

		EUR("EUR");

		public static CurrencyEnum fromValue(String text) {
			for (CurrencyEnum b : CurrencyEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}

		private String value;

		CurrencyEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static class Adapter extends TypeAdapter<CurrencyEnum>
		{
			@Override
			public void write(final JsonWriter jsonWriter, final CurrencyEnum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			@Override
			public CurrencyEnum read(final JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return CurrencyEnum.fromValue(String.valueOf(value));
			}
		}
	}

}

