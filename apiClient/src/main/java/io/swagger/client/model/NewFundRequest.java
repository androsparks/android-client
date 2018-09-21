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
import java.util.UUID;

import io.swagger.annotations.ApiModelProperty;

/**
 * NewFundRequest
 */

public class NewFundRequest
{
	@SerializedName("exitFee")
	private Double exitFee = null;

	@SerializedName("managementFee")
	private Double managementFee = null;

	@SerializedName("assetsParts")
	private List<OefAssetPart> assetsParts = null;

	@SerializedName("title")
	private String title = null;

	@SerializedName("description")
	private String description = null;

	@SerializedName("logo")
	private String logo = null;

	@SerializedName("tradingServerId")
	private UUID tradingServerId = null;

	@SerializedName("entryFee")
	private Double entryFee = null;

	@SerializedName("depositAmount")
	private Double depositAmount = null;

	public NewFundRequest exitFee(Double exitFee) {
		this.exitFee = exitFee;
		return this;
	}

	/**
	 * Get exitFee
	 *
	 * @return exitFee
	 **/
	@ApiModelProperty(value = "")
	public Double getExitFee() {
		return exitFee;
	}

	public void setExitFee(Double exitFee) {
		this.exitFee = exitFee;
	}

	public NewFundRequest managementFee(Double managementFee) {
		this.managementFee = managementFee;
		return this;
	}

	/**
	 * Get managementFee
	 *
	 * @return managementFee
	 **/
	@ApiModelProperty(value = "")
	public Double getManagementFee() {
		return managementFee;
	}

	public void setManagementFee(Double managementFee) {
		this.managementFee = managementFee;
	}

	public NewFundRequest assetsParts(List<OefAssetPart> assetsParts) {
		this.assetsParts = assetsParts;
		return this;
	}

	public NewFundRequest addAssetsPartsItem(OefAssetPart assetsPartsItem) {
		if (this.assetsParts == null) {
			this.assetsParts = new ArrayList<OefAssetPart>();
		}
		this.assetsParts.add(assetsPartsItem);
		return this;
	}

	/**
	 * Get assetsParts
	 *
	 * @return assetsParts
	 **/
	@ApiModelProperty(value = "")
	public List<OefAssetPart> getAssetsParts() {
		return assetsParts;
	}

	public void setAssetsParts(List<OefAssetPart> assetsParts) {
		this.assetsParts = assetsParts;
	}

	public NewFundRequest title(String title) {
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

	public NewFundRequest description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Get description
	 *
	 * @return description
	 **/
	@ApiModelProperty(value = "")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public NewFundRequest logo(String logo) {
		this.logo = logo;
		return this;
	}

	/**
	 * Get logo
	 *
	 * @return logo
	 **/
	@ApiModelProperty(value = "")
	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public NewFundRequest tradingServerId(UUID tradingServerId) {
		this.tradingServerId = tradingServerId;
		return this;
	}

	/**
	 * Get tradingServerId
	 *
	 * @return tradingServerId
	 **/
	@ApiModelProperty(value = "")
	public UUID getTradingServerId() {
		return tradingServerId;
	}

	public void setTradingServerId(UUID tradingServerId) {
		this.tradingServerId = tradingServerId;
	}

	public NewFundRequest entryFee(Double entryFee) {
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

	public NewFundRequest depositAmount(Double depositAmount) {
		this.depositAmount = depositAmount;
		return this;
	}

	/**
	 * Get depositAmount
	 *
	 * @return depositAmount
	 **/
	@ApiModelProperty(value = "")
	public Double getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(Double depositAmount) {
		this.depositAmount = depositAmount;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		NewFundRequest newFundRequest = (NewFundRequest) o;
		return Objects.equals(this.exitFee, newFundRequest.exitFee) &&
				Objects.equals(this.managementFee, newFundRequest.managementFee) &&
				Objects.equals(this.assetsParts, newFundRequest.assetsParts) &&
				Objects.equals(this.title, newFundRequest.title) &&
				Objects.equals(this.description, newFundRequest.description) &&
				Objects.equals(this.logo, newFundRequest.logo) &&
				Objects.equals(this.tradingServerId, newFundRequest.tradingServerId) &&
				Objects.equals(this.entryFee, newFundRequest.entryFee) &&
				Objects.equals(this.depositAmount, newFundRequest.depositAmount);
	}

	@Override
	public int hashCode() {
		return Objects.hash(exitFee, managementFee, assetsParts, title, description, logo, tradingServerId, entryFee, depositAmount);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class NewFundRequest {\n");

		sb.append("    exitFee: ").append(toIndentedString(exitFee)).append("\n");
		sb.append("    managementFee: ").append(toIndentedString(managementFee)).append("\n");
		sb.append("    assetsParts: ").append(toIndentedString(assetsParts)).append("\n");
		sb.append("    title: ").append(toIndentedString(title)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
		sb.append("    tradingServerId: ").append(toIndentedString(tradingServerId)).append("\n");
		sb.append("    entryFee: ").append(toIndentedString(entryFee)).append("\n");
		sb.append("    depositAmount: ").append(toIndentedString(depositAmount)).append("\n");
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

