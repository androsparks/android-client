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

import org.joda.time.DateTime;

import java.io.IOException;
import java.util.Objects;
import java.util.UUID;

import io.swagger.annotations.ApiModelProperty;

/**
 * ProgramDetailsFull
 */

public class ProgramDetailsFull
{
	@SerializedName("id")
	private UUID id = null;

	@SerializedName("logo")
	private String logo = null;

	@SerializedName("description")
	private String description = null;

	@SerializedName("title")
	private String title = null;

	@SerializedName("currency")
	private CurrencyEnum currency = null;

	@SerializedName("level")
	private Integer level = null;

	@SerializedName("periodDuration")
	private Integer periodDuration = null;

	@SerializedName("periodDateStart")
	private DateTime periodDateStart = null;

	@SerializedName("periodDateEnd")
	private DateTime periodDateEnd = null;

	@SerializedName("successFee")
	private Double successFee = null;

	@SerializedName("availableForInvestment")
	private Double availableForInvestment = null;

	@SerializedName("manager")
	private ProfilePublic manager = null;

	@SerializedName("statistic")
	private ProgramStatistic statistic = null;

	@SerializedName("personalProgramDetails")
	private PersonalProgramDetailsFull personalProgramDetails = null;

	public ProgramDetailsFull id(UUID id) {
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

	public ProgramDetailsFull logo(String logo) {
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

	public ProgramDetailsFull description(String description) {
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

	public ProgramDetailsFull title(String title) {
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

	public ProgramDetailsFull currency(CurrencyEnum currency) {
		this.currency = currency;
		return this;
	}

	/**
	 * Get currency
	 *
	 * @return currency
	 **/
	@ApiModelProperty(value = "")
	public CurrencyEnum getCurrency() {
		return currency;
	}

	public void setCurrency(CurrencyEnum currency) {
		this.currency = currency;
	}

	public ProgramDetailsFull level(Integer level) {
		this.level = level;
		return this;
	}

	/**
	 * Get level
	 *
	 * @return level
	 **/
	@ApiModelProperty(value = "")
	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public ProgramDetailsFull periodDuration(Integer periodDuration) {
		this.periodDuration = periodDuration;
		return this;
	}

	/**
	 * Get periodDuration
	 *
	 * @return periodDuration
	 **/
	@ApiModelProperty(value = "")
	public Integer getPeriodDuration() {
		return periodDuration;
	}

	public void setPeriodDuration(Integer periodDuration) {
		this.periodDuration = periodDuration;
	}

	public ProgramDetailsFull periodDateStart(DateTime periodDateStart) {
		this.periodDateStart = periodDateStart;
		return this;
	}

	/**
	 * Get periodDateStart
	 *
	 * @return periodDateStart
	 **/
	@ApiModelProperty(value = "")
	public DateTime getPeriodDateStart() {
		return periodDateStart;
	}

	public void setPeriodDateStart(DateTime periodDateStart) {
		this.periodDateStart = periodDateStart;
	}

	public ProgramDetailsFull periodDateEnd(DateTime periodDateEnd) {
		this.periodDateEnd = periodDateEnd;
		return this;
	}

	/**
	 * Get periodDateEnd
	 *
	 * @return periodDateEnd
	 **/
	@ApiModelProperty(value = "")
	public DateTime getPeriodDateEnd() {
		return periodDateEnd;
	}

	public void setPeriodDateEnd(DateTime periodDateEnd) {
		this.periodDateEnd = periodDateEnd;
	}

	public ProgramDetailsFull successFee(Double successFee) {
		this.successFee = successFee;
		return this;
	}

	/**
	 * Get successFee
	 *
	 * @return successFee
	 **/
	@ApiModelProperty(value = "")
	public Double getSuccessFee() {
		return successFee;
	}

	public void setSuccessFee(Double successFee) {
		this.successFee = successFee;
	}

	public ProgramDetailsFull availableForInvestment(Double availableForInvestment) {
		this.availableForInvestment = availableForInvestment;
		return this;
	}

	/**
	 * Get availableForInvestment
	 *
	 * @return availableForInvestment
	 **/
	@ApiModelProperty(value = "")
	public Double getAvailableForInvestment() {
		return availableForInvestment;
	}

	public void setAvailableForInvestment(Double availableForInvestment) {
		this.availableForInvestment = availableForInvestment;
	}

	public ProgramDetailsFull manager(ProfilePublic manager) {
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

	public ProgramDetailsFull statistic(ProgramStatistic statistic) {
		this.statistic = statistic;
		return this;
	}

	/**
	 * Get statistic
	 *
	 * @return statistic
	 **/
	@ApiModelProperty(value = "")
	public ProgramStatistic getStatistic() {
		return statistic;
	}

	public void setStatistic(ProgramStatistic statistic) {
		this.statistic = statistic;
	}

	public ProgramDetailsFull personalProgramDetails(PersonalProgramDetailsFull personalProgramDetails) {
		this.personalProgramDetails = personalProgramDetails;
		return this;
	}

	/**
	 * Fields for authorized user
	 *
	 * @return personalProgramDetails
	 **/
	@ApiModelProperty(value = "Fields for authorized user")
	public PersonalProgramDetailsFull getPersonalProgramDetails() {
		return personalProgramDetails;
	}

	public void setPersonalProgramDetails(PersonalProgramDetailsFull personalProgramDetails) {
		this.personalProgramDetails = personalProgramDetails;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ProgramDetailsFull programDetailsFull = (ProgramDetailsFull) o;
		return Objects.equals(this.id, programDetailsFull.id) &&
				Objects.equals(this.logo, programDetailsFull.logo) &&
				Objects.equals(this.description, programDetailsFull.description) &&
				Objects.equals(this.title, programDetailsFull.title) &&
				Objects.equals(this.currency, programDetailsFull.currency) &&
				Objects.equals(this.level, programDetailsFull.level) &&
				Objects.equals(this.periodDuration, programDetailsFull.periodDuration) &&
				Objects.equals(this.periodDateStart, programDetailsFull.periodDateStart) &&
				Objects.equals(this.periodDateEnd, programDetailsFull.periodDateEnd) &&
				Objects.equals(this.successFee, programDetailsFull.successFee) &&
				Objects.equals(this.availableForInvestment, programDetailsFull.availableForInvestment) &&
				Objects.equals(this.manager, programDetailsFull.manager) &&
				Objects.equals(this.statistic, programDetailsFull.statistic) &&
				Objects.equals(this.personalProgramDetails, programDetailsFull.personalProgramDetails);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, logo, description, title, currency, level, periodDuration, periodDateStart, periodDateEnd, successFee, availableForInvestment, manager, statistic, personalProgramDetails);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ProgramDetailsFull {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    title: ").append(toIndentedString(title)).append("\n");
		sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
		sb.append("    level: ").append(toIndentedString(level)).append("\n");
		sb.append("    periodDuration: ").append(toIndentedString(periodDuration)).append("\n");
		sb.append("    periodDateStart: ").append(toIndentedString(periodDateStart)).append("\n");
		sb.append("    periodDateEnd: ").append(toIndentedString(periodDateEnd)).append("\n");
		sb.append("    successFee: ").append(toIndentedString(successFee)).append("\n");
		sb.append("    availableForInvestment: ").append(toIndentedString(availableForInvestment)).append("\n");
		sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
		sb.append("    statistic: ").append(toIndentedString(statistic)).append("\n");
		sb.append("    personalProgramDetails: ").append(toIndentedString(personalProgramDetails)).append("\n");
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
	 * Gets or Sets currency
	 */
	@JsonAdapter(CurrencyEnum.Adapter.class)
	public enum CurrencyEnum
	{
		UNDEFINED("Undefined"),

		GVT("GVT"),

		ETH("ETH"),

		BTC("BTC"),

		ADA("ADA"),

		USD("USD"),

		EUR("EUR");

		public static CurrencyEnum fromValue(String text) {
			for (CurrencyEnum b : CurrencyEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}

		private String value;

		CurrencyEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static class Adapter extends TypeAdapter<CurrencyEnum>
		{
			@Override
			public void write(final JsonWriter jsonWriter, final CurrencyEnum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			@Override
			public CurrencyEnum read(final JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return CurrencyEnum.fromValue(String.valueOf(value));
			}
		}
	}

}

