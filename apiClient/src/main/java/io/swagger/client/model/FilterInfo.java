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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * FilterInfo
 */


public class FilterInfo implements Parcelable
{
	public static final Parcelable.Creator<FilterInfo> CREATOR = new Parcelable.Creator<FilterInfo>()
	{
		public FilterInfo createFromParcel(Parcel in) {
			return new FilterInfo(in);
		}

		public FilterInfo[] newArray(int size) {
			return new FilterInfo[size];
		}
	};

	@SerializedName("walletTransactions")
	private List<FilterItemInfo> walletTransactions = null;

	@SerializedName("walletExternalTransactions")
	private List<FilterItemInfo> walletExternalTransactions = null;

	@SerializedName("events")
	private EventFilters events = null;

	public FilterInfo() {
	}

	FilterInfo(Parcel in) {
		walletTransactions = (List<FilterItemInfo>) in.readValue(FilterItemInfo.class.getClassLoader());
		walletExternalTransactions = (List<FilterItemInfo>) in.readValue(FilterItemInfo.class.getClassLoader());
		events = (EventFilters) in.readValue(EventFilters.class.getClassLoader());
	}

	public FilterInfo walletTransactions(List<FilterItemInfo> walletTransactions) {
		this.walletTransactions = walletTransactions;
		return this;
	}

	public FilterInfo addWalletTransactionsItem(FilterItemInfo walletTransactionsItem) {
		if (this.walletTransactions == null) {
			this.walletTransactions = new ArrayList<FilterItemInfo>();
		}
		this.walletTransactions.add(walletTransactionsItem);
		return this;
	}

	/**
	 * Get walletTransactions
	 *
	 * @return walletTransactions
	 **/
	@Schema(description = "")
	public List<FilterItemInfo> getWalletTransactions() {
		return walletTransactions;
	}

	public void setWalletTransactions(List<FilterItemInfo> walletTransactions) {
		this.walletTransactions = walletTransactions;
	}

	public FilterInfo walletExternalTransactions(List<FilterItemInfo> walletExternalTransactions) {
		this.walletExternalTransactions = walletExternalTransactions;
		return this;
	}

	public FilterInfo addWalletExternalTransactionsItem(FilterItemInfo walletExternalTransactionsItem) {
		if (this.walletExternalTransactions == null) {
			this.walletExternalTransactions = new ArrayList<FilterItemInfo>();
		}
		this.walletExternalTransactions.add(walletExternalTransactionsItem);
		return this;
	}

	/**
	 * Get walletExternalTransactions
	 *
	 * @return walletExternalTransactions
	 **/
	@Schema(description = "")
	public List<FilterItemInfo> getWalletExternalTransactions() {
		return walletExternalTransactions;
	}

	public void setWalletExternalTransactions(List<FilterItemInfo> walletExternalTransactions) {
		this.walletExternalTransactions = walletExternalTransactions;
	}

	public FilterInfo events(EventFilters events) {
		this.events = events;
		return this;
	}

	/**
	 * Get events
	 *
	 * @return events
	 **/
	@Schema(description = "")
	public EventFilters getEvents() {
		return events;
	}

	public void setEvents(EventFilters events) {
		this.events = events;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		FilterInfo filterInfo = (FilterInfo) o;
		return Objects.equals(this.walletTransactions, filterInfo.walletTransactions) &&
				Objects.equals(this.walletExternalTransactions, filterInfo.walletExternalTransactions) &&
				Objects.equals(this.events, filterInfo.events);
	}

	@Override
	public int hashCode() {
		return Objects.hash(walletTransactions, walletExternalTransactions, events);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class FilterInfo {\n");

		sb.append("    walletTransactions: ").append(toIndentedString(walletTransactions)).append("\n");
		sb.append("    walletExternalTransactions: ").append(toIndentedString(walletExternalTransactions)).append("\n");
		sb.append("    events: ").append(toIndentedString(events)).append("\n");
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
		out.writeValue(walletTransactions);
		out.writeValue(walletExternalTransactions);
		out.writeValue(events);
	}

	public int describeContents() {
		return 0;
	}
}
