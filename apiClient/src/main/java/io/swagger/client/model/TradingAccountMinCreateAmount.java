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
 * TradingAccountMinCreateAmount
 */


public class TradingAccountMinCreateAmount implements Parcelable
{
	public static final Parcelable.Creator<TradingAccountMinCreateAmount> CREATOR = new Parcelable.Creator<TradingAccountMinCreateAmount>()
	{
		public TradingAccountMinCreateAmount createFromParcel(Parcel in) {
			return new TradingAccountMinCreateAmount(in);
		}

		public TradingAccountMinCreateAmount[] newArray(int size) {
			return new TradingAccountMinCreateAmount[size];
		}
	};

	@SerializedName("serverType")
	private BrokerTradeServerType serverType = null;

	@SerializedName("minDepositCreateAsset")
	private List<AmountWithCurrency> minDepositCreateAsset = null;

	public TradingAccountMinCreateAmount() {
	}

	TradingAccountMinCreateAmount(Parcel in) {
		serverType = (BrokerTradeServerType) in.readValue(BrokerTradeServerType.class.getClassLoader());
		minDepositCreateAsset = (List<AmountWithCurrency>) in.readValue(AmountWithCurrency.class.getClassLoader());
	}

	public TradingAccountMinCreateAmount serverType(BrokerTradeServerType serverType) {
		this.serverType = serverType;
		return this;
	}

	/**
	 * Get serverType
	 *
	 * @return serverType
	 **/
	@Schema(description = "")
	public BrokerTradeServerType getServerType() {
		return serverType;
	}

	public void setServerType(BrokerTradeServerType serverType) {
		this.serverType = serverType;
	}

	public TradingAccountMinCreateAmount minDepositCreateAsset(List<AmountWithCurrency> minDepositCreateAsset) {
		this.minDepositCreateAsset = minDepositCreateAsset;
		return this;
	}

	public TradingAccountMinCreateAmount addMinDepositCreateAssetItem(AmountWithCurrency minDepositCreateAssetItem) {
		if (this.minDepositCreateAsset == null) {
			this.minDepositCreateAsset = new ArrayList<AmountWithCurrency>();
		}
		this.minDepositCreateAsset.add(minDepositCreateAssetItem);
		return this;
	}

	/**
	 * Get minDepositCreateAsset
	 *
	 * @return minDepositCreateAsset
	 **/
	@Schema(description = "")
	public List<AmountWithCurrency> getMinDepositCreateAsset() {
		return minDepositCreateAsset;
	}

	public void setMinDepositCreateAsset(List<AmountWithCurrency> minDepositCreateAsset) {
		this.minDepositCreateAsset = minDepositCreateAsset;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TradingAccountMinCreateAmount tradingAccountMinCreateAmount = (TradingAccountMinCreateAmount) o;
		return Objects.equals(this.serverType, tradingAccountMinCreateAmount.serverType) &&
				Objects.equals(this.minDepositCreateAsset, tradingAccountMinCreateAmount.minDepositCreateAsset);
	}

	@Override
	public int hashCode() {
		return Objects.hash(serverType, minDepositCreateAsset);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TradingAccountMinCreateAmount {\n");

		sb.append("    serverType: ").append(toIndentedString(serverType)).append("\n");
		sb.append("    minDepositCreateAsset: ").append(toIndentedString(minDepositCreateAsset)).append("\n");
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
		out.writeValue(serverType);
		out.writeValue(minDepositCreateAsset);
	}

	public int describeContents() {
		return 0;
	}
}