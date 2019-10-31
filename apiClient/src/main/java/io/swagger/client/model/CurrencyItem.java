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
 * CurrencyItem
 */


public class CurrencyItem implements Parcelable
{
	public static final Parcelable.Creator<CurrencyItem> CREATOR = new Parcelable.Creator<CurrencyItem>()
	{
		public CurrencyItem createFromParcel(Parcel in) {
			return new CurrencyItem(in);
		}

		public CurrencyItem[] newArray(int size) {
			return new CurrencyItem[size];
		}
	};

	@SerializedName("logo")
	private String logo = null;

	@SerializedName("currency")
	private Currency currency = null;

	public CurrencyItem() {
	}

	CurrencyItem(Parcel in) {
		logo = (String) in.readValue(null);
		currency = (Currency) in.readValue(Currency.class.getClassLoader());
	}

	public CurrencyItem logo(String logo) {
		this.logo = logo;
		return this;
	}

	/**
	 * Get logo
	 *
	 * @return logo
	 **/
	@Schema(description = "")
	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public CurrencyItem currency(Currency currency) {
		this.currency = currency;
		return this;
	}

	/**
	 * Get currency
	 *
	 * @return currency
	 **/
	@Schema(description = "")
	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CurrencyItem currencyItem = (CurrencyItem) o;
		return Objects.equals(this.logo, currencyItem.logo) &&
				Objects.equals(this.currency, currencyItem.currency);
	}

	@Override
	public int hashCode() {
		return Objects.hash(logo, currency);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CurrencyItem {\n");

		sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
		sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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
		out.writeValue(logo);
		out.writeValue(currency);
	}

	public int describeContents() {
		return 0;
	}
}