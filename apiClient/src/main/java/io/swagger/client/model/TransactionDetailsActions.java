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
 * TransactionDetailsActions
 */


public class TransactionDetailsActions implements Parcelable
{
	public static final Parcelable.Creator<TransactionDetailsActions> CREATOR = new Parcelable.Creator<TransactionDetailsActions>()
	{
		public TransactionDetailsActions createFromParcel(Parcel in) {
			return new TransactionDetailsActions(in);
		}

		public TransactionDetailsActions[] newArray(int size) {
			return new TransactionDetailsActions[size];
		}
	};

	@SerializedName("canResend")
	private Boolean canResend = null;

	@SerializedName("canCancel")
	private Boolean canCancel = null;

	public TransactionDetailsActions() {
	}

	TransactionDetailsActions(Parcel in) {
		canResend = (Boolean) in.readValue(null);
		canCancel = (Boolean) in.readValue(null);
	}

	public TransactionDetailsActions canResend(Boolean canResend) {
		this.canResend = canResend;
		return this;
	}

	/**
	 * Get canResend
	 *
	 * @return canResend
	 **/
	@Schema(description = "")
	public Boolean isCanResend() {
		return canResend;
	}

	public void setCanResend(Boolean canResend) {
		this.canResend = canResend;
	}

	public TransactionDetailsActions canCancel(Boolean canCancel) {
		this.canCancel = canCancel;
		return this;
	}

	/**
	 * Get canCancel
	 *
	 * @return canCancel
	 **/
	@Schema(description = "")
	public Boolean isCanCancel() {
		return canCancel;
	}

	public void setCanCancel(Boolean canCancel) {
		this.canCancel = canCancel;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TransactionDetailsActions transactionDetailsActions = (TransactionDetailsActions) o;
		return Objects.equals(this.canResend, transactionDetailsActions.canResend) &&
				Objects.equals(this.canCancel, transactionDetailsActions.canCancel);
	}

	@Override
	public int hashCode() {
		return Objects.hash(canResend, canCancel);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TransactionDetailsActions {\n");

		sb.append("    canResend: ").append(toIndentedString(canResend)).append("\n");
		sb.append("    canCancel: ").append(toIndentedString(canCancel)).append("\n");
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
		out.writeValue(canResend);
		out.writeValue(canCancel);
	}

	public int describeContents() {
		return 0;
	}
}