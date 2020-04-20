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
 * LimitWithoutKyc
 */


public class LimitWithoutKyc implements Parcelable
{
	public static final Parcelable.Creator<LimitWithoutKyc> CREATOR = new Parcelable.Creator<LimitWithoutKyc>()
	{
		public LimitWithoutKyc createFromParcel(Parcel in) {
			return new LimitWithoutKyc(in);
		}

		public LimitWithoutKyc[] newArray(int size) {
			return new LimitWithoutKyc[size];
		}
	};

	@SerializedName("limit")
	private Double limit = null;

	@SerializedName("currency")
	private Currency currency = null;

	@SerializedName("invested")
	private Double invested = null;

	public LimitWithoutKyc() {
	}

	LimitWithoutKyc(Parcel in) {
		limit = (Double) in.readValue(null);
		currency = (Currency) in.readValue(Currency.class.getClassLoader());
		invested = (Double) in.readValue(null);
	}

	public LimitWithoutKyc limit(Double limit) {
		this.limit = limit;
		return this;
	}

	/**
	 * Get limit
	 *
	 * @return limit
	 **/
	@Schema(description = "")
	public Double getLimit() {
		return limit;
	}

	public void setLimit(Double limit) {
		this.limit = limit;
	}

	public LimitWithoutKyc currency(Currency currency) {
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

	public LimitWithoutKyc invested(Double invested) {
		this.invested = invested;
		return this;
	}

	/**
	 * Get invested
	 *
	 * @return invested
	 **/
	@Schema(description = "")
	public Double getInvested() {
		return invested;
	}

	public void setInvested(Double invested) {
		this.invested = invested;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		LimitWithoutKyc limitWithoutKyc = (LimitWithoutKyc) o;
		return Objects.equals(this.limit, limitWithoutKyc.limit) &&
				Objects.equals(this.currency, limitWithoutKyc.currency) &&
				Objects.equals(this.invested, limitWithoutKyc.invested);
	}

	@Override
	public int hashCode() {
		return Objects.hash(limit, currency, invested);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LimitWithoutKyc {\n");

		sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
		sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
		sb.append("    invested: ").append(toIndentedString(invested)).append("\n");
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
		out.writeValue(limit);
		out.writeValue(currency);
		out.writeValue(invested);
	}

	public int describeContents() {
		return 0;
	}
}