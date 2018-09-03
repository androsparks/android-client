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

import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * WalletSummary
 */

public class WalletSummary
{
	@SerializedName("totalBalanceGVT")
	private Double totalBalanceGVT = null;

	@SerializedName("totalBalanceCurrency")
	private Double totalBalanceCurrency = null;

	@SerializedName("investedGVT")
	private Double investedGVT = null;

	@SerializedName("investedCurrency")
	private Double investedCurrency = null;

	@SerializedName("availableGVT")
	private Double availableGVT = null;

	@SerializedName("availableCurrency")
	private Double availableCurrency = null;

	public WalletSummary totalBalanceGVT(Double totalBalanceGVT) {
		this.totalBalanceGVT = totalBalanceGVT;
		return this;
	}

	/**
	 * Get totalBalanceGVT
	 *
	 * @return totalBalanceGVT
	 **/
	@ApiModelProperty(value = "")
	public Double getTotalBalanceGVT() {
		return totalBalanceGVT;
	}

	public void setTotalBalanceGVT(Double totalBalanceGVT) {
		this.totalBalanceGVT = totalBalanceGVT;
	}

	public WalletSummary totalBalanceCurrency(Double totalBalanceCurrency) {
		this.totalBalanceCurrency = totalBalanceCurrency;
		return this;
	}

	/**
	 * Get totalBalanceCurrency
	 *
	 * @return totalBalanceCurrency
	 **/
	@ApiModelProperty(value = "")
	public Double getTotalBalanceCurrency() {
		return totalBalanceCurrency;
	}

	public void setTotalBalanceCurrency(Double totalBalanceCurrency) {
		this.totalBalanceCurrency = totalBalanceCurrency;
	}

	public WalletSummary investedGVT(Double investedGVT) {
		this.investedGVT = investedGVT;
		return this;
	}

	/**
	 * Get investedGVT
	 *
	 * @return investedGVT
	 **/
	@ApiModelProperty(value = "")
	public Double getInvestedGVT() {
		return investedGVT;
	}

	public void setInvestedGVT(Double investedGVT) {
		this.investedGVT = investedGVT;
	}

	public WalletSummary investedCurrency(Double investedCurrency) {
		this.investedCurrency = investedCurrency;
		return this;
	}

	/**
	 * Get investedCurrency
	 *
	 * @return investedCurrency
	 **/
	@ApiModelProperty(value = "")
	public Double getInvestedCurrency() {
		return investedCurrency;
	}

	public void setInvestedCurrency(Double investedCurrency) {
		this.investedCurrency = investedCurrency;
	}

	public WalletSummary availableGVT(Double availableGVT) {
		this.availableGVT = availableGVT;
		return this;
	}

	/**
	 * Get availableGVT
	 *
	 * @return availableGVT
	 **/
	@ApiModelProperty(value = "")
	public Double getAvailableGVT() {
		return availableGVT;
	}

	public void setAvailableGVT(Double availableGVT) {
		this.availableGVT = availableGVT;
	}

	public WalletSummary availableCurrency(Double availableCurrency) {
		this.availableCurrency = availableCurrency;
		return this;
	}

	/**
	 * Get availableCurrency
	 *
	 * @return availableCurrency
	 **/
	@ApiModelProperty(value = "")
	public Double getAvailableCurrency() {
		return availableCurrency;
	}

	public void setAvailableCurrency(Double availableCurrency) {
		this.availableCurrency = availableCurrency;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		WalletSummary walletSummary = (WalletSummary) o;
		return Objects.equals(this.totalBalanceGVT, walletSummary.totalBalanceGVT) &&
				Objects.equals(this.totalBalanceCurrency, walletSummary.totalBalanceCurrency) &&
				Objects.equals(this.investedGVT, walletSummary.investedGVT) &&
				Objects.equals(this.investedCurrency, walletSummary.investedCurrency) &&
				Objects.equals(this.availableGVT, walletSummary.availableGVT) &&
				Objects.equals(this.availableCurrency, walletSummary.availableCurrency);
	}

	@Override
	public int hashCode() {
		return Objects.hash(totalBalanceGVT, totalBalanceCurrency, investedGVT, investedCurrency, availableGVT, availableCurrency);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class WalletSummary {\n");

		sb.append("    totalBalanceGVT: ").append(toIndentedString(totalBalanceGVT)).append("\n");
		sb.append("    totalBalanceCurrency: ").append(toIndentedString(totalBalanceCurrency)).append("\n");
		sb.append("    investedGVT: ").append(toIndentedString(investedGVT)).append("\n");
		sb.append("    investedCurrency: ").append(toIndentedString(investedCurrency)).append("\n");
		sb.append("    availableGVT: ").append(toIndentedString(availableGVT)).append("\n");
		sb.append("    availableCurrency: ").append(toIndentedString(availableCurrency)).append("\n");
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

