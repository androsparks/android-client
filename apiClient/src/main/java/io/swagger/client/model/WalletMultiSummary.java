/*
 * Core API v1.0
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * WalletMultiSummary
 */

public class WalletMultiSummary
{
	@SerializedName("grandTotal")
	private WalletsGrandTotal grandTotal = null;

	@SerializedName("wallets")
	private List<WalletData> wallets = null;

	@SerializedName("payFeesWithGvt")
	private Boolean payFeesWithGvt = null;

	public WalletMultiSummary grandTotal(WalletsGrandTotal grandTotal) {
		this.grandTotal = grandTotal;
		return this;
	}

	/**
	 * Get grandTotal
	 *
	 * @return grandTotal
	 **/
	@ApiModelProperty(value = "")
	public WalletsGrandTotal getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(WalletsGrandTotal grandTotal) {
		this.grandTotal = grandTotal;
	}

	public WalletMultiSummary wallets(List<WalletData> wallets) {
		this.wallets = wallets;
		return this;
	}

	public WalletMultiSummary addWalletsItem(WalletData walletsItem) {
		if (this.wallets == null) {
			this.wallets = new ArrayList<WalletData>();
		}
		this.wallets.add(walletsItem);
		return this;
	}

	/**
	 * Get wallets
	 *
	 * @return wallets
	 **/
	@ApiModelProperty(value = "")
	public List<WalletData> getWallets() {
		return wallets;
	}

	public void setWallets(List<WalletData> wallets) {
		this.wallets = wallets;
	}

	public WalletMultiSummary payFeesWithGvt(Boolean payFeesWithGvt) {
		this.payFeesWithGvt = payFeesWithGvt;
		return this;
	}

	/**
	 * Get payFeesWithGvt
	 *
	 * @return payFeesWithGvt
	 **/
	@ApiModelProperty(value = "")
	public Boolean isPayFeesWithGvt() {
		return payFeesWithGvt;
	}

	public void setPayFeesWithGvt(Boolean payFeesWithGvt) {
		this.payFeesWithGvt = payFeesWithGvt;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		WalletMultiSummary walletMultiSummary = (WalletMultiSummary) o;
		return Objects.equals(this.grandTotal, walletMultiSummary.grandTotal) &&
				Objects.equals(this.wallets, walletMultiSummary.wallets) &&
				Objects.equals(this.payFeesWithGvt, walletMultiSummary.payFeesWithGvt);
	}

	@Override
	public int hashCode() {
		return Objects.hash(grandTotal, wallets, payFeesWithGvt);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class WalletMultiSummary {\n");

		sb.append("    grandTotal: ").append(toIndentedString(grandTotal)).append("\n");
		sb.append("    wallets: ").append(toIndentedString(wallets)).append("\n");
		sb.append("    payFeesWithGvt: ").append(toIndentedString(payFeesWithGvt)).append("\n");
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

}

