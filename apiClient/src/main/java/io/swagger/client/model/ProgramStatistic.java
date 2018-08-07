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

import org.joda.time.DateTime;

import java.io.IOException;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * ProgramStatistic
 */

public class ProgramStatistic
{
	@SerializedName("balanceBase")
	private AmountWithCurrency balanceBase = null;

	@SerializedName("balanceGVT")
	private AmountWithCurrency balanceGVT = null;

	@SerializedName("balanceSecondary")
	private AmountWithCurrency balanceSecondary = null;

	@SerializedName("investorsCount")
	private Integer investorsCount = null;

	@SerializedName("startDate")
	private DateTime startDate = null;

	@SerializedName("startBalance")
	private Double startBalance = null;

	@SerializedName("startCurrency")
	private StartCurrencyEnum startCurrency = null;

	@SerializedName("investedAmount")
	private Double investedAmount = null;

	@SerializedName("investedCurrency")
	private InvestedCurrencyEnum investedCurrency = null;

	@SerializedName("tradesCount")
	private Integer tradesCount = null;

	@SerializedName("tradesSuccessCount")
	private Integer tradesSuccessCount = null;

	@SerializedName("profitFactorPercent")
	private Double profitFactorPercent = null;

	@SerializedName("sharpeRatioPercent")
	private Double sharpeRatioPercent = null;

	@SerializedName("drawdownPercent")
	private Double drawdownPercent = null;

	@SerializedName("profitPercent")
	private Double profitPercent = null;

	public ProgramStatistic balanceBase(AmountWithCurrency balanceBase) {
		this.balanceBase = balanceBase;
		return this;
	}

	/**
	 * Get balanceBase
	 *
	 * @return balanceBase
	 **/
	@ApiModelProperty(value = "")
	public AmountWithCurrency getBalanceBase() {
		return balanceBase;
	}

	public void setBalanceBase(AmountWithCurrency balanceBase) {
		this.balanceBase = balanceBase;
	}

	public ProgramStatistic balanceGVT(AmountWithCurrency balanceGVT) {
		this.balanceGVT = balanceGVT;
		return this;
	}

	/**
	 * Get balanceGVT
	 *
	 * @return balanceGVT
	 **/
	@ApiModelProperty(value = "")
	public AmountWithCurrency getBalanceGVT() {
		return balanceGVT;
	}

	public void setBalanceGVT(AmountWithCurrency balanceGVT) {
		this.balanceGVT = balanceGVT;
	}

	public ProgramStatistic balanceSecondary(AmountWithCurrency balanceSecondary) {
		this.balanceSecondary = balanceSecondary;
		return this;
	}

	/**
	 * Get balanceSecondary
	 *
	 * @return balanceSecondary
	 **/
	@ApiModelProperty(value = "")
	public AmountWithCurrency getBalanceSecondary() {
		return balanceSecondary;
	}

	public void setBalanceSecondary(AmountWithCurrency balanceSecondary) {
		this.balanceSecondary = balanceSecondary;
	}

	public ProgramStatistic investorsCount(Integer investorsCount) {
		this.investorsCount = investorsCount;
		return this;
	}

	/**
	 * Get investorsCount
	 *
	 * @return investorsCount
	 **/
	@ApiModelProperty(value = "")
	public Integer getInvestorsCount() {
		return investorsCount;
	}

	public void setInvestorsCount(Integer investorsCount) {
		this.investorsCount = investorsCount;
	}

	public ProgramStatistic startDate(DateTime startDate) {
		this.startDate = startDate;
		return this;
	}

	/**
	 * Get startDate
	 *
	 * @return startDate
	 **/
	@ApiModelProperty(value = "")
	public DateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(DateTime startDate) {
		this.startDate = startDate;
	}

	public ProgramStatistic startBalance(Double startBalance) {
		this.startBalance = startBalance;
		return this;
	}

	/**
	 * Get startBalance
	 *
	 * @return startBalance
	 **/
	@ApiModelProperty(value = "")
	public Double getStartBalance() {
		return startBalance;
	}

	public void setStartBalance(Double startBalance) {
		this.startBalance = startBalance;
	}

	public ProgramStatistic startCurrency(StartCurrencyEnum startCurrency) {
		this.startCurrency = startCurrency;
		return this;
	}

	/**
	 * Get startCurrency
	 *
	 * @return startCurrency
	 **/
	@ApiModelProperty(value = "")
	public StartCurrencyEnum getStartCurrency() {
		return startCurrency;
	}

	public void setStartCurrency(StartCurrencyEnum startCurrency) {
		this.startCurrency = startCurrency;
	}

	public ProgramStatistic investedAmount(Double investedAmount) {
		this.investedAmount = investedAmount;
		return this;
	}

	/**
	 * Get investedAmount
	 *
	 * @return investedAmount
	 **/
	@ApiModelProperty(value = "")
	public Double getInvestedAmount() {
		return investedAmount;
	}

	public void setInvestedAmount(Double investedAmount) {
		this.investedAmount = investedAmount;
	}

	public ProgramStatistic investedCurrency(InvestedCurrencyEnum investedCurrency) {
		this.investedCurrency = investedCurrency;
		return this;
	}

	/**
	 * Get investedCurrency
	 *
	 * @return investedCurrency
	 **/
	@ApiModelProperty(value = "")
	public InvestedCurrencyEnum getInvestedCurrency() {
		return investedCurrency;
	}

	public void setInvestedCurrency(InvestedCurrencyEnum investedCurrency) {
		this.investedCurrency = investedCurrency;
	}

	public ProgramStatistic tradesCount(Integer tradesCount) {
		this.tradesCount = tradesCount;
		return this;
	}

	/**
	 * Get tradesCount
	 *
	 * @return tradesCount
	 **/
	@ApiModelProperty(value = "")
	public Integer getTradesCount() {
		return tradesCount;
	}

	public void setTradesCount(Integer tradesCount) {
		this.tradesCount = tradesCount;
	}

	public ProgramStatistic tradesSuccessCount(Integer tradesSuccessCount) {
		this.tradesSuccessCount = tradesSuccessCount;
		return this;
	}

	/**
	 * Get tradesSuccessCount
	 *
	 * @return tradesSuccessCount
	 **/
	@ApiModelProperty(value = "")
	public Integer getTradesSuccessCount() {
		return tradesSuccessCount;
	}

	public void setTradesSuccessCount(Integer tradesSuccessCount) {
		this.tradesSuccessCount = tradesSuccessCount;
	}

	public ProgramStatistic profitFactorPercent(Double profitFactorPercent) {
		this.profitFactorPercent = profitFactorPercent;
		return this;
	}

	/**
	 * Get profitFactorPercent
	 *
	 * @return profitFactorPercent
	 **/
	@ApiModelProperty(value = "")
	public Double getProfitFactorPercent() {
		return profitFactorPercent;
	}

	public void setProfitFactorPercent(Double profitFactorPercent) {
		this.profitFactorPercent = profitFactorPercent;
	}

	public ProgramStatistic sharpeRatioPercent(Double sharpeRatioPercent) {
		this.sharpeRatioPercent = sharpeRatioPercent;
		return this;
	}

	/**
	 * Get sharpeRatioPercent
	 *
	 * @return sharpeRatioPercent
	 **/
	@ApiModelProperty(value = "")
	public Double getSharpeRatioPercent() {
		return sharpeRatioPercent;
	}

	public void setSharpeRatioPercent(Double sharpeRatioPercent) {
		this.sharpeRatioPercent = sharpeRatioPercent;
	}

	public ProgramStatistic drawdownPercent(Double drawdownPercent) {
		this.drawdownPercent = drawdownPercent;
		return this;
	}

	/**
	 * Get drawdownPercent
	 *
	 * @return drawdownPercent
	 **/
	@ApiModelProperty(value = "")
	public Double getDrawdownPercent() {
		return drawdownPercent;
	}

	public void setDrawdownPercent(Double drawdownPercent) {
		this.drawdownPercent = drawdownPercent;
	}

	public ProgramStatistic profitPercent(Double profitPercent) {
		this.profitPercent = profitPercent;
		return this;
	}

	/**
	 * Get profitPercent
	 *
	 * @return profitPercent
	 **/
	@ApiModelProperty(value = "")
	public Double getProfitPercent() {
		return profitPercent;
	}

	public void setProfitPercent(Double profitPercent) {
		this.profitPercent = profitPercent;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ProgramStatistic programStatistic = (ProgramStatistic) o;
		return Objects.equals(this.balanceBase, programStatistic.balanceBase) &&
				Objects.equals(this.balanceGVT, programStatistic.balanceGVT) &&
				Objects.equals(this.balanceSecondary, programStatistic.balanceSecondary) &&
				Objects.equals(this.investorsCount, programStatistic.investorsCount) &&
				Objects.equals(this.startDate, programStatistic.startDate) &&
				Objects.equals(this.startBalance, programStatistic.startBalance) &&
				Objects.equals(this.startCurrency, programStatistic.startCurrency) &&
				Objects.equals(this.investedAmount, programStatistic.investedAmount) &&
				Objects.equals(this.investedCurrency, programStatistic.investedCurrency) &&
				Objects.equals(this.tradesCount, programStatistic.tradesCount) &&
				Objects.equals(this.tradesSuccessCount, programStatistic.tradesSuccessCount) &&
				Objects.equals(this.profitFactorPercent, programStatistic.profitFactorPercent) &&
				Objects.equals(this.sharpeRatioPercent, programStatistic.sharpeRatioPercent) &&
				Objects.equals(this.drawdownPercent, programStatistic.drawdownPercent) &&
				Objects.equals(this.profitPercent, programStatistic.profitPercent);
	}

	@Override
	public int hashCode() {
		return Objects.hash(balanceBase, balanceGVT, balanceSecondary, investorsCount, startDate, startBalance, startCurrency, investedAmount, investedCurrency, tradesCount, tradesSuccessCount, profitFactorPercent, sharpeRatioPercent, drawdownPercent, profitPercent);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ProgramStatistic {\n");

		sb.append("    balanceBase: ").append(toIndentedString(balanceBase)).append("\n");
		sb.append("    balanceGVT: ").append(toIndentedString(balanceGVT)).append("\n");
		sb.append("    balanceSecondary: ").append(toIndentedString(balanceSecondary)).append("\n");
		sb.append("    investorsCount: ").append(toIndentedString(investorsCount)).append("\n");
		sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
		sb.append("    startBalance: ").append(toIndentedString(startBalance)).append("\n");
		sb.append("    startCurrency: ").append(toIndentedString(startCurrency)).append("\n");
		sb.append("    investedAmount: ").append(toIndentedString(investedAmount)).append("\n");
		sb.append("    investedCurrency: ").append(toIndentedString(investedCurrency)).append("\n");
		sb.append("    tradesCount: ").append(toIndentedString(tradesCount)).append("\n");
		sb.append("    tradesSuccessCount: ").append(toIndentedString(tradesSuccessCount)).append("\n");
		sb.append("    profitFactorPercent: ").append(toIndentedString(profitFactorPercent)).append("\n");
		sb.append("    sharpeRatioPercent: ").append(toIndentedString(sharpeRatioPercent)).append("\n");
		sb.append("    drawdownPercent: ").append(toIndentedString(drawdownPercent)).append("\n");
		sb.append("    profitPercent: ").append(toIndentedString(profitPercent)).append("\n");
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
	 * Gets or Sets startCurrency
	 */
	@JsonAdapter(StartCurrencyEnum.Adapter.class)
	public enum StartCurrencyEnum
	{
		UNDEFINED("Undefined"),

		GVT("GVT"),

		ETH("ETH"),

		BTC("BTC"),

		ADA("ADA"),

		USD("USD"),

		EUR("EUR");

		public static StartCurrencyEnum fromValue(String text) {
			for (StartCurrencyEnum b : StartCurrencyEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}

		private String value;

		StartCurrencyEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static class Adapter extends TypeAdapter<StartCurrencyEnum>
		{
			@Override
			public void write(final JsonWriter jsonWriter, final StartCurrencyEnum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			@Override
			public StartCurrencyEnum read(final JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return StartCurrencyEnum.fromValue(String.valueOf(value));
			}
		}
	}

	/**
	 * Gets or Sets investedCurrency
	 */
	@JsonAdapter(InvestedCurrencyEnum.Adapter.class)
	public enum InvestedCurrencyEnum
	{
		UNDEFINED("Undefined"),

		GVT("GVT"),

		ETH("ETH"),

		BTC("BTC"),

		ADA("ADA"),

		USD("USD"),

		EUR("EUR");

		public static InvestedCurrencyEnum fromValue(String text) {
			for (InvestedCurrencyEnum b : InvestedCurrencyEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}

		private String value;

		InvestedCurrencyEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static class Adapter extends TypeAdapter<InvestedCurrencyEnum>
		{
			@Override
			public void write(final JsonWriter jsonWriter, final InvestedCurrencyEnum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			@Override
			public InvestedCurrencyEnum read(final JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return InvestedCurrencyEnum.fromValue(String.valueOf(value));
			}
		}
	}

}

