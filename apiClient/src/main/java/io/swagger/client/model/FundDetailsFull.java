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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import io.swagger.annotations.ApiModelProperty;

/**
 * FundDetailsFull
 */

public class FundDetailsFull
{
	@SerializedName("entryFee")
	private Double entryFee = null;

	@SerializedName("exitFee")
	private Double exitFee = null;

	@SerializedName("managementFee")
	private Double managementFee = null;

	@SerializedName("currentAssets")
	private List<FundAssetPartWithIcon> currentAssets = null;

	@SerializedName("statistic")
	private FundStatistic statistic = null;

	@SerializedName("personalFundDetails")
	private PersonalFundDetailsFull personalFundDetails = null;

	@SerializedName("id")
	private UUID id = null;

	@SerializedName("logo")
	private String logo = null;

	@SerializedName("url")
	private String url = null;

	@SerializedName("color")
	private String color = null;

	@SerializedName("description")
	private String description = null;

	@SerializedName("title")
	private String title = null;

	@SerializedName("ipfsHash")
	private String ipfsHash = null;

	@SerializedName("status")
	private StatusEnum status = null;

	@SerializedName("manager")
	private ProfilePublic manager = null;

	public FundDetailsFull entryFee(Double entryFee) {
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

	public FundDetailsFull exitFee(Double exitFee) {
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

	public FundDetailsFull managementFee(Double managementFee) {
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

	public FundDetailsFull currentAssets(List<FundAssetPartWithIcon> currentAssets) {
		this.currentAssets = currentAssets;
		return this;
	}

	public FundDetailsFull addCurrentAssetsItem(FundAssetPartWithIcon currentAssetsItem) {
		if (this.currentAssets == null) {
			this.currentAssets = new ArrayList<FundAssetPartWithIcon>();
		}
		this.currentAssets.add(currentAssetsItem);
		return this;
	}

	/**
	 * Get currentAssets
	 *
	 * @return currentAssets
	 **/
	@ApiModelProperty(value = "")
	public List<FundAssetPartWithIcon> getCurrentAssets() {
		return currentAssets;
	}

	public void setCurrentAssets(List<FundAssetPartWithIcon> currentAssets) {
		this.currentAssets = currentAssets;
	}

	public FundDetailsFull statistic(FundStatistic statistic) {
		this.statistic = statistic;
		return this;
	}

	/**
	 * Get statistic
	 *
	 * @return statistic
	 **/
	@ApiModelProperty(value = "")
	public FundStatistic getStatistic() {
		return statistic;
	}

	public void setStatistic(FundStatistic statistic) {
		this.statistic = statistic;
	}

	public FundDetailsFull personalFundDetails(PersonalFundDetailsFull personalFundDetails) {
		this.personalFundDetails = personalFundDetails;
		return this;
	}

	/**
	 * Fields for authorized user
	 *
	 * @return personalFundDetails
	 **/
	@ApiModelProperty(value = "Fields for authorized user")
	public PersonalFundDetailsFull getPersonalFundDetails() {
		return personalFundDetails;
	}

	public void setPersonalFundDetails(PersonalFundDetailsFull personalFundDetails) {
		this.personalFundDetails = personalFundDetails;
	}

	public FundDetailsFull id(UUID id) {
		this.id = id;
		return this;
	}

	/**
	 * Get id
	 *
	 * @return id
	 **/
	@ApiModelProperty(value = "")
	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public FundDetailsFull logo(String logo) {
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

	public FundDetailsFull url(String url) {
		this.url = url;
		return this;
	}

	/**
	 * Get url
	 *
	 * @return url
	 **/
	@ApiModelProperty(value = "")
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public FundDetailsFull color(String color) {
		this.color = color;
		return this;
	}

	/**
	 * Get color
	 *
	 * @return color
	 **/
	@ApiModelProperty(value = "")
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public FundDetailsFull description(String description) {
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

	public FundDetailsFull title(String title) {
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

	public FundDetailsFull ipfsHash(String ipfsHash) {
		this.ipfsHash = ipfsHash;
		return this;
	}

	/**
	 * Get ipfsHash
	 *
	 * @return ipfsHash
	 **/
	@ApiModelProperty(value = "")
	public String getIpfsHash() {
		return ipfsHash;
	}

	public void setIpfsHash(String ipfsHash) {
		this.ipfsHash = ipfsHash;
	}

	public FundDetailsFull status(StatusEnum status) {
		this.status = status;
		return this;
	}

	/**
	 * Get status
	 *
	 * @return status
	 **/
	@ApiModelProperty(value = "")
	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}

	public FundDetailsFull manager(ProfilePublic manager) {
		this.manager = manager;
		return this;
	}

	/**
	 * Get manager
	 *
	 * @return manager
	 **/
	@ApiModelProperty(value = "")
	public ProfilePublic getManager() {
		return manager;
	}

	public void setManager(ProfilePublic manager) {
		this.manager = manager;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		FundDetailsFull fundDetailsFull = (FundDetailsFull) o;
		return Objects.equals(this.entryFee, fundDetailsFull.entryFee) &&
				Objects.equals(this.exitFee, fundDetailsFull.exitFee) &&
				Objects.equals(this.managementFee, fundDetailsFull.managementFee) &&
				Objects.equals(this.currentAssets, fundDetailsFull.currentAssets) &&
				Objects.equals(this.statistic, fundDetailsFull.statistic) &&
				Objects.equals(this.personalFundDetails, fundDetailsFull.personalFundDetails) &&
				Objects.equals(this.id, fundDetailsFull.id) &&
				Objects.equals(this.logo, fundDetailsFull.logo) &&
				Objects.equals(this.url, fundDetailsFull.url) &&
				Objects.equals(this.color, fundDetailsFull.color) &&
				Objects.equals(this.description, fundDetailsFull.description) &&
				Objects.equals(this.title, fundDetailsFull.title) &&
				Objects.equals(this.ipfsHash, fundDetailsFull.ipfsHash) &&
				Objects.equals(this.status, fundDetailsFull.status) &&
				Objects.equals(this.manager, fundDetailsFull.manager);
	}

	@Override
	public int hashCode() {
		return Objects.hash(entryFee, exitFee, managementFee, currentAssets, statistic, personalFundDetails, id, logo, url, color, description, title, ipfsHash, status, manager);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class FundDetailsFull {\n");

		sb.append("    entryFee: ").append(toIndentedString(entryFee)).append("\n");
		sb.append("    exitFee: ").append(toIndentedString(exitFee)).append("\n");
		sb.append("    managementFee: ").append(toIndentedString(managementFee)).append("\n");
		sb.append("    currentAssets: ").append(toIndentedString(currentAssets)).append("\n");
		sb.append("    statistic: ").append(toIndentedString(statistic)).append("\n");
		sb.append("    personalFundDetails: ").append(toIndentedString(personalFundDetails)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
		sb.append("    url: ").append(toIndentedString(url)).append("\n");
		sb.append("    color: ").append(toIndentedString(color)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    title: ").append(toIndentedString(title)).append("\n");
		sb.append("    ipfsHash: ").append(toIndentedString(ipfsHash)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
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

	/**
	 * Gets or Sets status
	 */
	@JsonAdapter(StatusEnum.Adapter.class)
	public enum StatusEnum
	{
		NONE("None"),

		PENDING("Pending"),

		ERRORCREATING("ErrorCreating"),

		ACTIVE("Active"),

		CLOSED("Closed"),

		ARCHIVED("Archived"),

		CLOSEDDUETOINACTIVITY("ClosedDueToInactivity");

		public static StatusEnum fromValue(String text) {
			for (StatusEnum b : StatusEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}

		private String value;

		StatusEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static class Adapter extends TypeAdapter<StatusEnum>
		{
			@Override
			public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			@Override
			public StatusEnum read(final JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return StatusEnum.fromValue(String.valueOf(value));
			}
		}
	}

}

