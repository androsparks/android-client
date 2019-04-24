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
 * Broker
 */

public class Broker
{
	@SerializedName("name")
	private String name = null;

	@SerializedName("description")
	private String description = null;

	@SerializedName("logo")
	private String logo = null;

	@SerializedName("terms")
	private String terms = null;

	@SerializedName("assets")
	private String assets = null;

	@SerializedName("fee")
	private Double fee = null;

	@SerializedName("leverageMin")
	private Integer leverageMin = null;

	@SerializedName("leverageMax")
	private Integer leverageMax = null;

	@SerializedName("accountTypes")
	private List<BrokerAccountType> accountTypes = null;

	@SerializedName("isForex")
	private Boolean isForex = null;

	@SerializedName("isSignalsAvailable")
	private Boolean isSignalsAvailable = null;

	@SerializedName("tags")
	private List<ProgramTag> tags = null;

	public Broker name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get name
	 *
	 * @return name
	 **/
	@ApiModelProperty(value = "")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Broker description(String description) {
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

	public Broker logo(String logo) {
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

	public Broker terms(String terms) {
		this.terms = terms;
		return this;
	}

	/**
	 * Get terms
	 *
	 * @return terms
	 **/
	@ApiModelProperty(value = "")
	public String getTerms() {
		return terms;
	}

	public void setTerms(String terms) {
		this.terms = terms;
	}

	public Broker assets(String assets) {
		this.assets = assets;
		return this;
	}

	/**
	 * Get assets
	 *
	 * @return assets
	 **/
	@ApiModelProperty(value = "")
	public String getAssets() {
		return assets;
	}

	public void setAssets(String assets) {
		this.assets = assets;
	}

	public Broker fee(Double fee) {
		this.fee = fee;
		return this;
	}

	/**
	 * Get fee
	 *
	 * @return fee
	 **/
	@ApiModelProperty(value = "")
	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}

	/**
	 * Get leverageMin
	 *
	 * @return leverageMin
	 **/
	@ApiModelProperty(value = "")
	public Integer getLeverageMin() {
		return leverageMin;
	}

	/**
	 * Get leverageMax
	 *
	 * @return leverageMax
	 **/
	@ApiModelProperty(value = "")
	public Integer getLeverageMax() {
		return leverageMax;
	}

	public Broker accountTypes(List<BrokerAccountType> accountTypes) {
		this.accountTypes = accountTypes;
		return this;
	}

	public Broker addAccountTypesItem(BrokerAccountType accountTypesItem) {
		if (this.accountTypes == null) {
			this.accountTypes = new ArrayList<BrokerAccountType>();
		}
		this.accountTypes.add(accountTypesItem);
		return this;
	}

	/**
	 * Get accountTypes
	 *
	 * @return accountTypes
	 **/
	@ApiModelProperty(value = "")
	public List<BrokerAccountType> getAccountTypes() {
		return accountTypes;
	}

	public void setAccountTypes(List<BrokerAccountType> accountTypes) {
		this.accountTypes = accountTypes;
	}

	public Broker isForex(Boolean isForex) {
		this.isForex = isForex;
		return this;
	}

	/**
	 * Get isForex
	 *
	 * @return isForex
	 **/
	@ApiModelProperty(value = "")
	public Boolean isIsForex() {
		return isForex;
	}

	public void setIsForex(Boolean isForex) {
		this.isForex = isForex;
	}

	public Broker isSignalsAvailable(Boolean isSignalsAvailable) {
		this.isSignalsAvailable = isSignalsAvailable;
		return this;
	}

	/**
	 * Get isSignalsAvailable
	 *
	 * @return isSignalsAvailable
	 **/
	@ApiModelProperty(value = "")
	public Boolean isIsSignalsAvailable() {
		return isSignalsAvailable;
	}

	public void setIsSignalsAvailable(Boolean isSignalsAvailable) {
		this.isSignalsAvailable = isSignalsAvailable;
	}

	public Broker tags(List<ProgramTag> tags) {
		this.tags = tags;
		return this;
	}

	public Broker addTagsItem(ProgramTag tagsItem) {
		if (this.tags == null) {
			this.tags = new ArrayList<ProgramTag>();
		}
		this.tags.add(tagsItem);
		return this;
	}

	/**
	 * Get tags
	 *
	 * @return tags
	 **/
	@ApiModelProperty(value = "")
	public List<ProgramTag> getTags() {
		return tags;
	}

	public void setTags(List<ProgramTag> tags) {
		this.tags = tags;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Broker broker = (Broker) o;
		return Objects.equals(this.name, broker.name) &&
				Objects.equals(this.description, broker.description) &&
				Objects.equals(this.logo, broker.logo) &&
				Objects.equals(this.terms, broker.terms) &&
				Objects.equals(this.assets, broker.assets) &&
				Objects.equals(this.fee, broker.fee) &&
				Objects.equals(this.leverageMin, broker.leverageMin) &&
				Objects.equals(this.leverageMax, broker.leverageMax) &&
				Objects.equals(this.accountTypes, broker.accountTypes) &&
				Objects.equals(this.isForex, broker.isForex) &&
				Objects.equals(this.isSignalsAvailable, broker.isSignalsAvailable) &&
				Objects.equals(this.tags, broker.tags);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, description, logo, terms, assets, fee, leverageMin, leverageMax, accountTypes, isForex, isSignalsAvailable, tags);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Broker {\n");

		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
		sb.append("    terms: ").append(toIndentedString(terms)).append("\n");
		sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
		sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
		sb.append("    leverageMin: ").append(toIndentedString(leverageMin)).append("\n");
		sb.append("    leverageMax: ").append(toIndentedString(leverageMax)).append("\n");
		sb.append("    accountTypes: ").append(toIndentedString(accountTypes)).append("\n");
		sb.append("    isForex: ").append(toIndentedString(isForex)).append("\n");
		sb.append("    isSignalsAvailable: ").append(toIndentedString(isSignalsAvailable)).append("\n");
		sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

