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
 * TradingAccountPwdUpdate
 */


public class TradingAccountPwdUpdate implements Parcelable
{
	public static final Parcelable.Creator<TradingAccountPwdUpdate> CREATOR = new Parcelable.Creator<TradingAccountPwdUpdate>()
	{
		public TradingAccountPwdUpdate createFromParcel(Parcel in) {
			return new TradingAccountPwdUpdate(in);
		}

		public TradingAccountPwdUpdate[] newArray(int size) {
			return new TradingAccountPwdUpdate[size];
		}
	};

	@SerializedName("password")
	private String password = null;

	@SerializedName("twoFactorCode")
	private String twoFactorCode = null;

	public TradingAccountPwdUpdate() {
	}

	TradingAccountPwdUpdate(Parcel in) {
		password = (String) in.readValue(null);
		twoFactorCode = (String) in.readValue(null);
	}

	public TradingAccountPwdUpdate password(String password) {
		this.password = password;
		return this;
	}

	/**
	 * Get password
	 *
	 * @return password
	 **/
	@Schema(description = "")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public TradingAccountPwdUpdate twoFactorCode(String twoFactorCode) {
		this.twoFactorCode = twoFactorCode;
		return this;
	}

	/**
	 * Get twoFactorCode
	 *
	 * @return twoFactorCode
	 **/
	@Schema(description = "")
	public String getTwoFactorCode() {
		return twoFactorCode;
	}

	public void setTwoFactorCode(String twoFactorCode) {
		this.twoFactorCode = twoFactorCode;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TradingAccountPwdUpdate tradingAccountPwdUpdate = (TradingAccountPwdUpdate) o;
		return Objects.equals(this.password, tradingAccountPwdUpdate.password) &&
				Objects.equals(this.twoFactorCode, tradingAccountPwdUpdate.twoFactorCode);
	}

	@Override
	public int hashCode() {
		return Objects.hash(password, twoFactorCode);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TradingAccountPwdUpdate {\n");

		sb.append("    password: ").append(toIndentedString(password)).append("\n");
		sb.append("    twoFactorCode: ").append(toIndentedString(twoFactorCode)).append("\n");
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
		out.writeValue(password);
		out.writeValue(twoFactorCode);
	}

	public int describeContents() {
		return 0;
	}
}
