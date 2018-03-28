/*
 * Core API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
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
 * InvestmentProgramRequestsFilter
 */

public class InvestmentProgramRequestsFilter
{
	@SerializedName("investmentProgramId")
	private UUID investmentProgramId = null;

	@SerializedName("dateFrom")
	private DateTime dateFrom = null;

	@SerializedName("dateTo")
	private DateTime dateTo = null;

	@SerializedName("status")
	private StatusEnum status = null;

	@SerializedName("type")
	private TypeEnum type = null;

	@SerializedName("skip")
	private Integer skip = null;

	@SerializedName("take")
	private Integer take = null;

	public InvestmentProgramRequestsFilter investmentProgramId(UUID investmentProgramId) {
		this.investmentProgramId = investmentProgramId;
		return this;
	}

	/**
	 * Get investmentProgramId
	 *
	 * @return investmentProgramId
	 **/
	@ApiModelProperty(required = true, value = "")
	public UUID getInvestmentProgramId() {
		return investmentProgramId;
	}

	public void setInvestmentProgramId(UUID investmentProgramId) {
		this.investmentProgramId = investmentProgramId;
	}

	public InvestmentProgramRequestsFilter dateFrom(DateTime dateFrom) {
		this.dateFrom = dateFrom;
		return this;
	}

	/**
	 * Get dateFrom
	 *
	 * @return dateFrom
	 **/
	@ApiModelProperty(value = "")
	public DateTime getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(DateTime dateFrom) {
		this.dateFrom = dateFrom;
	}

	public InvestmentProgramRequestsFilter dateTo(DateTime dateTo) {
		this.dateTo = dateTo;
		return this;
	}

	/**
	 * Get dateTo
	 *
	 * @return dateTo
	 **/
	@ApiModelProperty(value = "")
	public DateTime getDateTo() {
		return dateTo;
	}

	public void setDateTo(DateTime dateTo) {
		this.dateTo = dateTo;
	}

	public InvestmentProgramRequestsFilter status(StatusEnum status) {
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

	public InvestmentProgramRequestsFilter type(TypeEnum type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 *
	 * @return type
	 **/
	@ApiModelProperty(value = "")
	public TypeEnum getType() {
		return type;
	}

	public void setType(TypeEnum type) {
		this.type = type;
	}

	public InvestmentProgramRequestsFilter skip(Integer skip) {
		this.skip = skip;
		return this;
	}

	/**
	 * Get skip
	 *
	 * @return skip
	 **/
	@ApiModelProperty(value = "")
	public Integer getSkip() {
		return skip;
	}

	public void setSkip(Integer skip) {
		this.skip = skip;
	}

	public InvestmentProgramRequestsFilter take(Integer take) {
		this.take = take;
		return this;
	}

	/**
	 * Get take
	 *
	 * @return take
	 **/
	@ApiModelProperty(value = "")
	public Integer getTake() {
		return take;
	}

	public void setTake(Integer take) {
		this.take = take;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		InvestmentProgramRequestsFilter investmentProgramRequestsFilter = (InvestmentProgramRequestsFilter) o;
		return Objects.equals(this.investmentProgramId, investmentProgramRequestsFilter.investmentProgramId) &&
				Objects.equals(this.dateFrom, investmentProgramRequestsFilter.dateFrom) &&
				Objects.equals(this.dateTo, investmentProgramRequestsFilter.dateTo) &&
				Objects.equals(this.status, investmentProgramRequestsFilter.status) &&
				Objects.equals(this.type, investmentProgramRequestsFilter.type) &&
				Objects.equals(this.skip, investmentProgramRequestsFilter.skip) &&
				Objects.equals(this.take, investmentProgramRequestsFilter.take);
	}

	@Override
	public int hashCode() {
		return Objects.hash(investmentProgramId, dateFrom, dateTo, status, type, skip, take);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class InvestmentProgramRequestsFilter {\n");

		sb.append("    investmentProgramId: ").append(toIndentedString(investmentProgramId)).append("\n");
		sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
		sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    skip: ").append(toIndentedString(skip)).append("\n");
		sb.append("    take: ").append(toIndentedString(take)).append("\n");
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
		NEW("New"),

		EXECUTED("Executed"),

		CANCELLED("Cancelled");

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

	/**
	 * Gets or Sets type
	 */
	@JsonAdapter(TypeEnum.Adapter.class)
	public enum TypeEnum
	{
		INVEST("Invest"),

		WITHDRAWAL("Withdrawal");

		public static TypeEnum fromValue(String text) {
			for (TypeEnum b : TypeEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}

		private String value;

		TypeEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static class Adapter extends TypeAdapter<TypeEnum>
		{
			@Override
			public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			@Override
			public TypeEnum read(final JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return TypeEnum.fromValue(String.valueOf(value));
			}
		}
	}

}

