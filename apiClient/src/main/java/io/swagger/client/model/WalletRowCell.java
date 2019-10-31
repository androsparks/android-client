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
 * WalletRowCell
 */


public class WalletRowCell implements Parcelable
{
	public static final Parcelable.Creator<WalletRowCell> CREATOR = new Parcelable.Creator<WalletRowCell>()
	{
		public WalletRowCell createFromParcel(Parcel in) {
			return new WalletRowCell(in);
		}

		public WalletRowCell[] newArray(int size) {
			return new WalletRowCell[size];
		}
	};

	@SerializedName("first")
	private CurrencyItem first = null;

	@SerializedName("second")
	private CurrencyItem second = null;

	public WalletRowCell() {
	}

	WalletRowCell(Parcel in) {
		first = (CurrencyItem) in.readValue(CurrencyItem.class.getClassLoader());
		second = (CurrencyItem) in.readValue(CurrencyItem.class.getClassLoader());
	}

	public WalletRowCell first(CurrencyItem first) {
		this.first = first;
		return this;
	}

	/**
	 * Get first
	 *
	 * @return first
	 **/
	@Schema(description = "")
	public CurrencyItem getFirst() {
		return first;
	}

	public void setFirst(CurrencyItem first) {
		this.first = first;
	}

	public WalletRowCell second(CurrencyItem second) {
		this.second = second;
		return this;
	}

	/**
	 * Get second
	 *
	 * @return second
	 **/
	@Schema(description = "")
	public CurrencyItem getSecond() {
		return second;
	}

	public void setSecond(CurrencyItem second) {
		this.second = second;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		WalletRowCell walletRowCell = (WalletRowCell) o;
		return Objects.equals(this.first, walletRowCell.first) &&
				Objects.equals(this.second, walletRowCell.second);
	}

	@Override
	public int hashCode() {
		return Objects.hash(first, second);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class WalletRowCell {\n");

		sb.append("    first: ").append(toIndentedString(first)).append("\n");
		sb.append("    second: ").append(toIndentedString(second)).append("\n");
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
		out.writeValue(first);
		out.writeValue(second);
	}

	public int describeContents() {
		return 0;
	}
}