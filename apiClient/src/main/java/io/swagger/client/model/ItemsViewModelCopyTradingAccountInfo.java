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

import java.util.List;
import java.util.Objects;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ItemsViewModelCopyTradingAccountInfo
 */


public class ItemsViewModelCopyTradingAccountInfo implements Parcelable
{
	public static final Parcelable.Creator<ItemsViewModelCopyTradingAccountInfo> CREATOR = new Parcelable.Creator<ItemsViewModelCopyTradingAccountInfo>()
	{
		public ItemsViewModelCopyTradingAccountInfo createFromParcel(Parcel in) {
			return new ItemsViewModelCopyTradingAccountInfo(in);
		}

		public ItemsViewModelCopyTradingAccountInfo[] newArray(int size) {
			return new ItemsViewModelCopyTradingAccountInfo[size];
		}
	};

	@SerializedName("items")
	private List<CopyTradingAccountInfo> items = null;

	@SerializedName("total")
	private Integer total = null;

	public ItemsViewModelCopyTradingAccountInfo() {
	}

	ItemsViewModelCopyTradingAccountInfo(Parcel in) {
		items = (List<CopyTradingAccountInfo>) in.readValue(CopyTradingAccountInfo.class.getClassLoader());
		total = (Integer) in.readValue(null);
	}

	/**
	 * Get items
	 *
	 * @return items
	 **/
	@Schema(description = "")
	public List<CopyTradingAccountInfo> getItems() {
		return items;
	}

	/**
	 * Get total
	 *
	 * @return total
	 **/
	@Schema(description = "")
	public Integer getTotal() {
		return total;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ItemsViewModelCopyTradingAccountInfo itemsViewModelCopyTradingAccountInfo = (ItemsViewModelCopyTradingAccountInfo) o;
		return Objects.equals(this.items, itemsViewModelCopyTradingAccountInfo.items) &&
				Objects.equals(this.total, itemsViewModelCopyTradingAccountInfo.total);
	}

	@Override
	public int hashCode() {
		return Objects.hash(items, total);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ItemsViewModelCopyTradingAccountInfo {\n");

		sb.append("    items: ").append(toIndentedString(items)).append("\n");
		sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
		out.writeValue(items);
		out.writeValue(total);
	}

	public int describeContents() {
		return 0;
	}
}
