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
 * SignalSubscriber
 */

public class SignalSubscriber
{
	@SerializedName("number")
	private Integer number = null;

	@SerializedName("trades")
	private Integer trades = null;

	@SerializedName("profit")
	private Double profit = null;

	@SerializedName("volume")
	private Double volume = null;

	@SerializedName("subscriptionDate")
	private DateTime subscriptionDate = null;

	@SerializedName("unsubscriptionDate")
	private DateTime unsubscriptionDate = null;

	@SerializedName("status")
	private StatusEnum status = null;

	@SerializedName("totalCommissionAmount")
	private Double totalCommissionAmount = null;

	@SerializedName("totalCommissionCurrency")
	private TotalCommissionCurrencyEnum totalCommissionCurrency = null;

	@SerializedName("totalSuccessFeeAmount")
	private Double totalSuccessFeeAmount = null;

	@SerializedName("totalSuccessFeeCurrency")
	private TotalSuccessFeeCurrencyEnum totalSuccessFeeCurrency = null;

	@SerializedName("totalVolumeFeeAmount")
	private Double totalVolumeFeeAmount = null;

	@SerializedName("totalVolumeFeeCurrency")
	private TotalVolumeFeeCurrencyEnum totalVolumeFeeCurrency = null;

	public SignalSubscriber number(Integer number) {
		this.number = number;
		return this;
	}

	/**
	 * Get number
	 *
	 * @return number
	 **/
	@ApiModelProperty(value = "")
	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public SignalSubscriber trades(Integer trades) {
		this.trades = trades;
		return this;
	}

	/**
	 * Get trades
	 *
	 * @return trades
	 **/
	@ApiModelProperty(value = "")
	public Integer getTrades() {
		return trades;
	}

	public void setTrades(Integer trades) {
		this.trades = trades;
	}

	public SignalSubscriber profit(Double profit) {
		this.profit = profit;
		return this;
	}

	/**
	 * Get profit
	 *
	 * @return profit
	 **/
	@ApiModelProperty(value = "")
	public Double getProfit() {
		return profit;
	}

	public void setProfit(Double profit) {
		this.profit = profit;
	}

	public SignalSubscriber volume(Double volume) {
		this.volume = volume;
		return this;
	}

	/**
	 * Get volume
	 *
	 * @return volume
	 **/
	@ApiModelProperty(value = "")
	public Double getVolume() {
		return volume;
	}

	public void setVolume(Double volume) {
		this.volume = volume;
	}

	public SignalSubscriber subscriptionDate(DateTime subscriptionDate) {
		this.subscriptionDate = subscriptionDate;
		return this;
	}

	/**
	 * Get subscriptionDate
	 *
	 * @return subscriptionDate
	 **/
	@ApiModelProperty(value = "")
	public DateTime getSubscriptionDate() {
		return subscriptionDate;
	}

	public void setSubscriptionDate(DateTime subscriptionDate) {
		this.subscriptionDate = subscriptionDate;
	}

	public SignalSubscriber unsubscriptionDate(DateTime unsubscriptionDate) {
		this.unsubscriptionDate = unsubscriptionDate;
		return this;
	}

	/**
	 * Get unsubscriptionDate
	 *
	 * @return unsubscriptionDate
	 **/
	@ApiModelProperty(value = "")
	public DateTime getUnsubscriptionDate() {
		return unsubscriptionDate;
	}

	public void setUnsubscriptionDate(DateTime unsubscriptionDate) {
		this.unsubscriptionDate = unsubscriptionDate;
	}

	public SignalSubscriber status(StatusEnum status) {
		this.status = status;
		return this;
	}

	/**
	 * Get status
	 *
	 * @return status
	 **/
	@ApiModelProperty(value = "")
	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}

	public SignalSubscriber totalCommissionAmount(Double totalCommissionAmount) {
		this.totalCommissionAmount = totalCommissionAmount;
		return this;
	}

	/**
	 * Get totalCommissionAmount
	 *
	 * @return totalCommissionAmount
	 **/
	@ApiModelProperty(value = "")
	public Double getTotalCommissionAmount() {
		return totalCommissionAmount;
	}

	public void setTotalCommissionAmount(Double totalCommissionAmount) {
		this.totalCommissionAmount = totalCommissionAmount;
	}

	public SignalSubscriber totalCommissionCurrency(TotalCommissionCurrencyEnum totalCommissionCurrency) {
		this.totalCommissionCurrency = totalCommissionCurrency;
		return this;
	}

	/**
	 * Get totalCommissionCurrency
	 *
	 * @return totalCommissionCurrency
	 **/
	@ApiModelProperty(value = "")
	public TotalCommissionCurrencyEnum getTotalCommissionCurrency() {
		return totalCommissionCurrency;
	}

	public void setTotalCommissionCurrency(TotalCommissionCurrencyEnum totalCommissionCurrency) {
		this.totalCommissionCurrency = totalCommissionCurrency;
	}

	public SignalSubscriber totalSuccessFeeAmount(Double totalSuccessFeeAmount) {
		this.totalSuccessFeeAmount = totalSuccessFeeAmount;
		return this;
	}

	/**
	 * Get totalSuccessFeeAmount
	 *
	 * @return totalSuccessFeeAmount
	 **/
	@ApiModelProperty(value = "")
	public Double getTotalSuccessFeeAmount() {
		return totalSuccessFeeAmount;
	}

	public void setTotalSuccessFeeAmount(Double totalSuccessFeeAmount) {
		this.totalSuccessFeeAmount = totalSuccessFeeAmount;
	}

	public SignalSubscriber totalSuccessFeeCurrency(TotalSuccessFeeCurrencyEnum totalSuccessFeeCurrency) {
		this.totalSuccessFeeCurrency = totalSuccessFeeCurrency;
		return this;
	}

	/**
	 * Get totalSuccessFeeCurrency
	 *
	 * @return totalSuccessFeeCurrency
	 **/
	@ApiModelProperty(value = "")
	public TotalSuccessFeeCurrencyEnum getTotalSuccessFeeCurrency() {
		return totalSuccessFeeCurrency;
	}

	public void setTotalSuccessFeeCurrency(TotalSuccessFeeCurrencyEnum totalSuccessFeeCurrency) {
		this.totalSuccessFeeCurrency = totalSuccessFeeCurrency;
	}

	public SignalSubscriber totalVolumeFeeAmount(Double totalVolumeFeeAmount) {
		this.totalVolumeFeeAmount = totalVolumeFeeAmount;
		return this;
	}

	/**
	 * Get totalVolumeFeeAmount
	 *
	 * @return totalVolumeFeeAmount
	 **/
	@ApiModelProperty(value = "")
	public Double getTotalVolumeFeeAmount() {
		return totalVolumeFeeAmount;
	}

	public void setTotalVolumeFeeAmount(Double totalVolumeFeeAmount) {
		this.totalVolumeFeeAmount = totalVolumeFeeAmount;
	}

	public SignalSubscriber totalVolumeFeeCurrency(TotalVolumeFeeCurrencyEnum totalVolumeFeeCurrency) {
		this.totalVolumeFeeCurrency = totalVolumeFeeCurrency;
		return this;
	}

	/**
	 * Get totalVolumeFeeCurrency
	 *
	 * @return totalVolumeFeeCurrency
	 **/
	@ApiModelProperty(value = "")
	public TotalVolumeFeeCurrencyEnum getTotalVolumeFeeCurrency() {
		return totalVolumeFeeCurrency;
	}

	public void setTotalVolumeFeeCurrency(TotalVolumeFeeCurrencyEnum totalVolumeFeeCurrency) {
		this.totalVolumeFeeCurrency = totalVolumeFeeCurrency;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SignalSubscriber signalSubscriber = (SignalSubscriber) o;
		return Objects.equals(this.number, signalSubscriber.number) &&
				Objects.equals(this.trades, signalSubscriber.trades) &&
				Objects.equals(this.profit, signalSubscriber.profit) &&
				Objects.equals(this.volume, signalSubscriber.volume) &&
				Objects.equals(this.subscriptionDate, signalSubscriber.subscriptionDate) &&
				Objects.equals(this.unsubscriptionDate, signalSubscriber.unsubscriptionDate) &&
				Objects.equals(this.status, signalSubscriber.status) &&
				Objects.equals(this.totalCommissionAmount, signalSubscriber.totalCommissionAmount) &&
				Objects.equals(this.totalCommissionCurrency, signalSubscriber.totalCommissionCurrency) &&
				Objects.equals(this.totalSuccessFeeAmount, signalSubscriber.totalSuccessFeeAmount) &&
				Objects.equals(this.totalSuccessFeeCurrency, signalSubscriber.totalSuccessFeeCurrency) &&
				Objects.equals(this.totalVolumeFeeAmount, signalSubscriber.totalVolumeFeeAmount) &&
				Objects.equals(this.totalVolumeFeeCurrency, signalSubscriber.totalVolumeFeeCurrency);
	}

	@Override
	public int hashCode() {
		return Objects.hash(number, trades, profit, volume, subscriptionDate, unsubscriptionDate, status, totalCommissionAmount, totalCommissionCurrency, totalSuccessFeeAmount, totalSuccessFeeCurrency, totalVolumeFeeAmount, totalVolumeFeeCurrency);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SignalSubscriber {\n");

		sb.append("    number: ").append(toIndentedString(number)).append("\n");
		sb.append("    trades: ").append(toIndentedString(trades)).append("\n");
		sb.append("    profit: ").append(toIndentedString(profit)).append("\n");
		sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
		sb.append("    subscriptionDate: ").append(toIndentedString(subscriptionDate)).append("\n");
		sb.append("    unsubscriptionDate: ").append(toIndentedString(unsubscriptionDate)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    totalCommissionAmount: ").append(toIndentedString(totalCommissionAmount)).append("\n");
		sb.append("    totalCommissionCurrency: ").append(toIndentedString(totalCommissionCurrency)).append("\n");
		sb.append("    totalSuccessFeeAmount: ").append(toIndentedString(totalSuccessFeeAmount)).append("\n");
		sb.append("    totalSuccessFeeCurrency: ").append(toIndentedString(totalSuccessFeeCurrency)).append("\n");
		sb.append("    totalVolumeFeeAmount: ").append(toIndentedString(totalVolumeFeeAmount)).append("\n");
		sb.append("    totalVolumeFeeCurrency: ").append(toIndentedString(totalVolumeFeeCurrency)).append("\n");
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
	 * Gets or Sets status
	 */
	@JsonAdapter(StatusEnum.Adapter.class)
	public enum StatusEnum
	{
		ACTIVE("Active"),

		ENDED("Ended");

		public static StatusEnum fromValue(String text) {
			for (StatusEnum b : StatusEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}

		private String value;

		StatusEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static class Adapter extends TypeAdapter<StatusEnum>
		{
			@Override
			public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			@Override
			public StatusEnum read(final JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return StatusEnum.fromValue(String.valueOf(value));
			}
		}
	}

	/**
	 * Gets or Sets totalCommissionCurrency
	 */
	@JsonAdapter(TotalCommissionCurrencyEnum.Adapter.class)
	public enum TotalCommissionCurrencyEnum
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

		public static TotalCommissionCurrencyEnum fromValue(String text) {
			for (TotalCommissionCurrencyEnum b : TotalCommissionCurrencyEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}

		private String value;

		TotalCommissionCurrencyEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static class Adapter extends TypeAdapter<TotalCommissionCurrencyEnum>
		{
			@Override
			public void write(final JsonWriter jsonWriter, final TotalCommissionCurrencyEnum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			@Override
			public TotalCommissionCurrencyEnum read(final JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return TotalCommissionCurrencyEnum.fromValue(String.valueOf(value));
			}
		}
	}


	/**
	 * Gets or Sets totalSuccessFeeCurrency
	 */
	@JsonAdapter(TotalSuccessFeeCurrencyEnum.Adapter.class)
	public enum TotalSuccessFeeCurrencyEnum
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

		public static TotalSuccessFeeCurrencyEnum fromValue(String text) {
			for (TotalSuccessFeeCurrencyEnum b : TotalSuccessFeeCurrencyEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}

		private String value;

		TotalSuccessFeeCurrencyEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static class Adapter extends TypeAdapter<TotalSuccessFeeCurrencyEnum>
		{
			@Override
			public void write(final JsonWriter jsonWriter, final TotalSuccessFeeCurrencyEnum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			@Override
			public TotalSuccessFeeCurrencyEnum read(final JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return TotalSuccessFeeCurrencyEnum.fromValue(String.valueOf(value));
			}
		}
	}

	/**
	 * Gets or Sets totalVolumeFeeCurrency
	 */
	@JsonAdapter(TotalVolumeFeeCurrencyEnum.Adapter.class)
	public enum TotalVolumeFeeCurrencyEnum
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

		public static TotalVolumeFeeCurrencyEnum fromValue(String text) {
			for (TotalVolumeFeeCurrencyEnum b : TotalVolumeFeeCurrencyEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}

		private String value;

		TotalVolumeFeeCurrencyEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static class Adapter extends TypeAdapter<TotalVolumeFeeCurrencyEnum>
		{
			@Override
			public void write(final JsonWriter jsonWriter, final TotalVolumeFeeCurrencyEnum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			@Override
			public TotalVolumeFeeCurrencyEnum read(final JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return TotalVolumeFeeCurrencyEnum.fromValue(String.valueOf(value));
			}
		}
	}

}

