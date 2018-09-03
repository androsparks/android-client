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

import org.joda.time.DateTime;

import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * InvestInfo
 */

public class InvestInfo
{
	@SerializedName("title")
	private String title = null;

	@SerializedName("availableToInvest")
	private Double availableToInvest = null;

	@SerializedName("availableInWallet")
	private Double availableInWallet = null;

	@SerializedName("entryFee")
	private Double entryFee = null;

	@SerializedName("periodEnds")
	private DateTime periodEnds = null;

	@SerializedName("rate")
	private Double rate = null;

	public InvestInfo title(String title) {
		this.title = title;
		return this;
	}

	/**
	 * Get title
	 *
	 * @return title
	 **/
	@ApiModelProperty(value = "")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public InvestInfo availableToInvest(Double availableToInvest) {
		this.availableToInvest = availableToInvest;
		return this;
	}

	/**
	 * Get availableToInvest
	 *
	 * @return availableToInvest
	 **/
	@ApiModelProperty(value = "")
	public Double getAvailableToInvest() {
		return availableToInvest;
	}

	public void setAvailableToInvest(Double availableToInvest) {
		this.availableToInvest = availableToInvest;
	}

	public InvestInfo availableInWallet(Double availableInWallet) {
		this.availableInWallet = availableInWallet;
		return this;
	}

	/**
	 * Get availableInWallet
	 *
	 * @return availableInWallet
	 **/
	@ApiModelProperty(value = "")
	public Double getAvailableInWallet() {
		return availableInWallet;
	}

	public void setAvailableInWallet(Double availableInWallet) {
		this.availableInWallet = availableInWallet;
	}

	public InvestInfo entryFee(Double entryFee) {
		this.entryFee = entryFee;
		return this;
	}

	/**
	 * Get entryFee
	 *
	 * @return entryFee
	 **/
	@ApiModelProperty(value = "")
	public Double getEntryFee() {
		return entryFee;
	}

	public void setEntryFee(Double entryFee) {
		this.entryFee = entryFee;
	}

	public InvestInfo periodEnds(DateTime periodEnds) {
		this.periodEnds = periodEnds;
		return this;
	}

	/**
	 * Get periodEnds
	 *
	 * @return periodEnds
	 **/
	@ApiModelProperty(value = "")
	public DateTime getPeriodEnds() {
		return periodEnds;
	}

	public void setPeriodEnds(DateTime periodEnds) {
		this.periodEnds = periodEnds;
	}

	public InvestInfo rate(Double rate) {
		this.rate = rate;
		return this;
	}

	/**
	 * Get rate
	 *
	 * @return rate
	 **/
	@ApiModelProperty(value = "")
	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		InvestInfo investInfo = (InvestInfo) o;
		return Objects.equals(this.title, investInfo.title) &&
				Objects.equals(this.availableToInvest, investInfo.availableToInvest) &&
				Objects.equals(this.availableInWallet, investInfo.availableInWallet) &&
				Objects.equals(this.entryFee, investInfo.entryFee) &&
				Objects.equals(this.periodEnds, investInfo.periodEnds) &&
				Objects.equals(this.rate, investInfo.rate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(title, availableToInvest, availableInWallet, entryFee, periodEnds, rate);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class InvestInfo {\n");

		sb.append("    title: ").append(toIndentedString(title)).append("\n");
		sb.append("    availableToInvest: ").append(toIndentedString(availableToInvest)).append("\n");
		sb.append("    availableInWallet: ").append(toIndentedString(availableInWallet)).append("\n");
		sb.append("    entryFee: ").append(toIndentedString(entryFee)).append("\n");
		sb.append("    periodEnds: ").append(toIndentedString(periodEnds)).append("\n");
		sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
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

