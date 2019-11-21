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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import org.joda.time.DateTime;

import java.io.IOException;
import java.util.Objects;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * DashboardTradingAssetCommonDetails
 */


public class DashboardTradingAssetCommonDetails implements Parcelable
{
	public static final Parcelable.Creator<DashboardTradingAssetCommonDetails> CREATOR = new Parcelable.Creator<DashboardTradingAssetCommonDetails>()
	{
		public DashboardTradingAssetCommonDetails createFromParcel(Parcel in) {
			return new DashboardTradingAssetCommonDetails(in);
		}

		public DashboardTradingAssetCommonDetails[] newArray(int size) {
			return new DashboardTradingAssetCommonDetails[size];
		}
	};

	@SerializedName("status")
	private DashboardTradingAssetStatus status = null;

	@SerializedName("creationDate")
	private DateTime creationDate = null;

	@SerializedName("balance")
	private Double balance = null;

	@SerializedName("login")
	private String login = null;

	@SerializedName("currency")
	private CurrencyEnum currency = null;

	@SerializedName("leverage")
	private Integer leverage = null;

	public DashboardTradingAssetCommonDetails() {
	}

	DashboardTradingAssetCommonDetails(Parcel in) {
		status = (DashboardTradingAssetStatus) in.readValue(DashboardTradingAssetStatus.class.getClassLoader());
		creationDate = (DateTime) in.readValue(DateTime.class.getClassLoader());
		balance = (Double) in.readValue(null);
		login = (String) in.readValue(null);
		currency = (CurrencyEnum) in.readValue(null);
		leverage = (Integer) in.readValue(null);
	}

	public DashboardTradingAssetCommonDetails status(DashboardTradingAssetStatus status) {
		this.status = status;
		return this;
	}

	/**
	 * Get status
	 *
	 * @return status
	 **/
	@Schema(description = "")
	public DashboardTradingAssetStatus getStatus() {
		return status;
	}

	public void setStatus(DashboardTradingAssetStatus status) {
		this.status = status;
	}

	public DashboardTradingAssetCommonDetails creationDate(DateTime creationDate) {
		this.creationDate = creationDate;
		return this;
	}

	/**
	 * Get creationDate
	 *
	 * @return creationDate
	 **/
	@Schema(description = "")
	public DateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(DateTime creationDate) {
		this.creationDate = creationDate;
	}

	public DashboardTradingAssetCommonDetails balance(Double balance) {
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

	public DashboardTradingAssetCommonDetails login(String login) {
		this.login = login;
		return this;
	}

	/**
	 * Get login
	 *
	 * @return login
	 **/
	@Schema(description = "")
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public DashboardTradingAssetCommonDetails currency(CurrencyEnum currency) {
		this.currency = currency;
		return this;
	}

	/**
	 * Get currency
	 *
	 * @return currency
	 **/
	@Schema(description = "")
	public CurrencyEnum getCurrency() {
		return currency;
	}

	public void setCurrency(CurrencyEnum currency) {
		this.currency = currency;
	}

	public DashboardTradingAssetCommonDetails leverage(Integer leverage) {
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
		DashboardTradingAssetCommonDetails dashboardTradingAssetCommonDetails = (DashboardTradingAssetCommonDetails) o;
		return Objects.equals(this.status, dashboardTradingAssetCommonDetails.status) &&
				Objects.equals(this.creationDate, dashboardTradingAssetCommonDetails.creationDate) &&
				Objects.equals(this.balance, dashboardTradingAssetCommonDetails.balance) &&
				Objects.equals(this.login, dashboardTradingAssetCommonDetails.login) &&
				Objects.equals(this.currency, dashboardTradingAssetCommonDetails.currency) &&
				Objects.equals(this.leverage, dashboardTradingAssetCommonDetails.leverage);
	}

	@Override
	public int hashCode() {
		return Objects.hash(status, creationDate, balance, login, currency, leverage);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DashboardTradingAssetCommonDetails {\n");

		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
		sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
		sb.append("    login: ").append(toIndentedString(login)).append("\n");
		sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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
		out.writeValue(status);
		out.writeValue(creationDate);
		out.writeValue(balance);
		out.writeValue(login);
		out.writeValue(currency);
		out.writeValue(leverage);
	}

	public int describeContents() {
		return 0;
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