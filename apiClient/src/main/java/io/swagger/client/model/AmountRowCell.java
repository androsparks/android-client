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
 * AmountRowCell
 */


public class AmountRowCell implements Parcelable
{
	public static final Parcelable.Creator<AmountRowCell> CREATOR = new Parcelable.Creator<AmountRowCell>()
	{
		public AmountRowCell createFromParcel(Parcel in) {
			return new AmountRowCell(in);
		}

		public AmountRowCell[] newArray(int size) {
			return new AmountRowCell[size];
		}
	};

	@SerializedName("first")
	private AmountItem first = null;

	@SerializedName("second")
	private AmountItem second = null;

	@SerializedName("title")
	private String title = null;

	public AmountRowCell() {
	}

	AmountRowCell(Parcel in) {
		first = (AmountItem) in.readValue(AmountItem.class.getClassLoader());
		second = (AmountItem) in.readValue(AmountItem.class.getClassLoader());
		title = (String) in.readValue(null);
	}

	public AmountRowCell first(AmountItem first) {
		this.first = first;
		return this;
	}

	/**
	 * Get first
	 *
	 * @return first
	 **/
	@Schema(description = "")
	public AmountItem getFirst() {
		return first;
	}

	public void setFirst(AmountItem first) {
		this.first = first;
	}

	public AmountRowCell second(AmountItem second) {
		this.second = second;
		return this;
	}

	/**
	 * Get second
	 *
	 * @return second
	 **/
	@Schema(description = "")
	public AmountItem getSecond() {
		return second;
	}

	public void setSecond(AmountItem second) {
		this.second = second;
	}

	public AmountRowCell title(String title) {
		this.title = title;
		return this;
	}

	/**
	 * Get title
	 *
	 * @return title
	 **/
	@Schema(description = "")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AmountRowCell amountRowCell = (AmountRowCell) o;
		return Objects.equals(this.first, amountRowCell.first) &&
				Objects.equals(this.second, amountRowCell.second) &&
				Objects.equals(this.title, amountRowCell.title);
	}

	@Override
	public int hashCode() {
		return Objects.hash(first, second, title);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AmountRowCell {\n");

		sb.append("    first: ").append(toIndentedString(first)).append("\n");
		sb.append("    second: ").append(toIndentedString(second)).append("\n");
		sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
		out.writeValue(title);
	}

	public int describeContents() {
		return 0;
	}
}
