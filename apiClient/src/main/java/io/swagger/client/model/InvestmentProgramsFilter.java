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

import java.io.IOException;
import java.util.Objects;
import java.util.UUID;

import io.swagger.annotations.ApiModelProperty;

/**
 * InvestmentProgramsFilter
 */

public class InvestmentProgramsFilter
{
	@SerializedName("managerId")
	private UUID managerId = null;

	@SerializedName("brokerId")
	private UUID brokerId = null;

	@SerializedName("brokerTradeServerId")
	private UUID brokerTradeServerId = null;

	@SerializedName("investMaxAmountFrom")
	private Double investMaxAmountFrom = null;

	@SerializedName("investMaxAmountTo")
	private Double investMaxAmountTo = null;

	@SerializedName("sorting")
	private SortingEnum sorting = null;

	@SerializedName("name")
	private String name = null;

	@SerializedName("levelMin")
	private Integer levelMin = null;

	@SerializedName("levelMax")
	private Integer levelMax = null;

	@SerializedName("profitAvgMin")
	private Integer profitAvgMin = null;

	@SerializedName("profitAvgMax")
	private Integer profitAvgMax = null;

	@SerializedName("profitTotalMin")
	private Integer profitTotalMin = null;

	@SerializedName("profitTotalMax")
	private Integer profitTotalMax = null;

	@SerializedName("profitTotalPercentMin")
	private Integer profitTotalPercentMin = null;

	@SerializedName("profitTotalPercentMax")
	private Integer profitTotalPercentMax = null;

	@SerializedName("profitAvgPercentMin")
	private Integer profitAvgPercentMin = null;

	@SerializedName("profitAvgPercentMax")
	private Integer profitAvgPercentMax = null;

	@SerializedName("profitTotalChange")
	private ProfitTotalChangeEnum profitTotalChange = null;

	@SerializedName("periodMin")
	private Integer periodMin = null;

	@SerializedName("periodMax")
	private Integer periodMax = null;

	@SerializedName("showActivePrograms")
	private Boolean showActivePrograms = null;

	@SerializedName("equityChartLength")
	private Integer equityChartLength = null;

	@SerializedName("showMyFavorites")
	private Boolean showMyFavorites = null;

	@SerializedName("roundNumber")
	private Integer roundNumber = null;

	@SerializedName("skip")
	private Integer skip = null;

	@SerializedName("take")
	private Integer take = null;

	public InvestmentProgramsFilter managerId(UUID managerId) {
		this.managerId = managerId;
		return this;
	}

	/**
	 * Get managerId
	 *
	 * @return managerId
	 **/
	@ApiModelProperty(value = "")
	public UUID getManagerId() {
		return managerId;
	}

	public void setManagerId(UUID managerId) {
		this.managerId = managerId;
	}

	public InvestmentProgramsFilter brokerId(UUID brokerId) {
		this.brokerId = brokerId;
		return this;
	}

	/**
	 * Get brokerId
	 *
	 * @return brokerId
	 **/
	@ApiModelProperty(value = "")
	public UUID getBrokerId() {
		return brokerId;
	}

	public void setBrokerId(UUID brokerId) {
		this.brokerId = brokerId;
	}

	public InvestmentProgramsFilter brokerTradeServerId(UUID brokerTradeServerId) {
		this.brokerTradeServerId = brokerTradeServerId;
		return this;
	}

	/**
	 * Get brokerTradeServerId
	 *
	 * @return brokerTradeServerId
	 **/
	@ApiModelProperty(value = "")
	public UUID getBrokerTradeServerId() {
		return brokerTradeServerId;
	}

	public void setBrokerTradeServerId(UUID brokerTradeServerId) {
		this.brokerTradeServerId = brokerTradeServerId;
	}

	public InvestmentProgramsFilter investMaxAmountFrom(Double investMaxAmountFrom) {
		this.investMaxAmountFrom = investMaxAmountFrom;
		return this;
	}

	/**
	 * Get investMaxAmountFrom
	 *
	 * @return investMaxAmountFrom
	 **/
	@ApiModelProperty(value = "")
	public Double getInvestMaxAmountFrom() {
		return investMaxAmountFrom;
	}

	public void setInvestMaxAmountFrom(Double investMaxAmountFrom) {
		this.investMaxAmountFrom = investMaxAmountFrom;
	}

	public InvestmentProgramsFilter investMaxAmountTo(Double investMaxAmountTo) {
		this.investMaxAmountTo = investMaxAmountTo;
		return this;
	}

	/**
	 * Get investMaxAmountTo
	 *
	 * @return investMaxAmountTo
	 **/
	@ApiModelProperty(value = "")
	public Double getInvestMaxAmountTo() {
		return investMaxAmountTo;
	}

	public void setInvestMaxAmountTo(Double investMaxAmountTo) {
		this.investMaxAmountTo = investMaxAmountTo;
	}

	public InvestmentProgramsFilter sorting(SortingEnum sorting) {
		this.sorting = sorting;
		return this;
	}

	/**
	 * Get sorting
	 *
	 * @return sorting
	 **/
	@ApiModelProperty(value = "")
	public SortingEnum getSorting() {
		return sorting;
	}

	public void setSorting(SortingEnum sorting) {
		this.sorting = sorting;
	}

	public InvestmentProgramsFilter name(String name) {
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

	public InvestmentProgramsFilter levelMin(Integer levelMin) {
		this.levelMin = levelMin;
		return this;
	}

	/**
	 * Get levelMin
	 *
	 * @return levelMin
	 **/
	@ApiModelProperty(value = "")
	public Integer getLevelMin() {
		return levelMin;
	}

	public void setLevelMin(Integer levelMin) {
		this.levelMin = levelMin;
	}

	public InvestmentProgramsFilter levelMax(Integer levelMax) {
		this.levelMax = levelMax;
		return this;
	}

	/**
	 * Get levelMax
	 *
	 * @return levelMax
	 **/
	@ApiModelProperty(value = "")
	public Integer getLevelMax() {
		return levelMax;
	}

	public void setLevelMax(Integer levelMax) {
		this.levelMax = levelMax;
	}

	public InvestmentProgramsFilter profitAvgMin(Integer profitAvgMin) {
		this.profitAvgMin = profitAvgMin;
		return this;
	}

	/**
	 * Get profitAvgMin
	 *
	 * @return profitAvgMin
	 **/
	@ApiModelProperty(value = "")
	public Integer getProfitAvgMin() {
		return profitAvgMin;
	}

	public void setProfitAvgMin(Integer profitAvgMin) {
		this.profitAvgMin = profitAvgMin;
	}

	public InvestmentProgramsFilter profitAvgMax(Integer profitAvgMax) {
		this.profitAvgMax = profitAvgMax;
		return this;
	}

	/**
	 * Get profitAvgMax
	 *
	 * @return profitAvgMax
	 **/
	@ApiModelProperty(value = "")
	public Integer getProfitAvgMax() {
		return profitAvgMax;
	}

	public void setProfitAvgMax(Integer profitAvgMax) {
		this.profitAvgMax = profitAvgMax;
	}

	public InvestmentProgramsFilter profitTotalMin(Integer profitTotalMin) {
		this.profitTotalMin = profitTotalMin;
		return this;
	}

	/**
	 * Get profitTotalMin
	 *
	 * @return profitTotalMin
	 **/
	@ApiModelProperty(value = "")
	public Integer getProfitTotalMin() {
		return profitTotalMin;
	}

	public void setProfitTotalMin(Integer profitTotalMin) {
		this.profitTotalMin = profitTotalMin;
	}

	public InvestmentProgramsFilter profitTotalMax(Integer profitTotalMax) {
		this.profitTotalMax = profitTotalMax;
		return this;
	}

	/**
	 * Get profitTotalMax
	 *
	 * @return profitTotalMax
	 **/
	@ApiModelProperty(value = "")
	public Integer getProfitTotalMax() {
		return profitTotalMax;
	}

	public void setProfitTotalMax(Integer profitTotalMax) {
		this.profitTotalMax = profitTotalMax;
	}

	public InvestmentProgramsFilter profitTotalPercentMin(Integer profitTotalPercentMin) {
		this.profitTotalPercentMin = profitTotalPercentMin;
		return this;
	}

	/**
	 * Get profitTotalPercentMin
	 *
	 * @return profitTotalPercentMin
	 **/
	@ApiModelProperty(value = "")
	public Integer getProfitTotalPercentMin() {
		return profitTotalPercentMin;
	}

	public void setProfitTotalPercentMin(Integer profitTotalPercentMin) {
		this.profitTotalPercentMin = profitTotalPercentMin;
	}

	public InvestmentProgramsFilter profitTotalPercentMax(Integer profitTotalPercentMax) {
		this.profitTotalPercentMax = profitTotalPercentMax;
		return this;
	}

	/**
	 * Get profitTotalPercentMax
	 *
	 * @return profitTotalPercentMax
	 **/
	@ApiModelProperty(value = "")
	public Integer getProfitTotalPercentMax() {
		return profitTotalPercentMax;
	}

	public void setProfitTotalPercentMax(Integer profitTotalPercentMax) {
		this.profitTotalPercentMax = profitTotalPercentMax;
	}

	public InvestmentProgramsFilter profitAvgPercentMin(Integer profitAvgPercentMin) {
		this.profitAvgPercentMin = profitAvgPercentMin;
		return this;
	}

	/**
	 * Get profitAvgPercentMin
	 *
	 * @return profitAvgPercentMin
	 **/
	@ApiModelProperty(value = "")
	public Integer getProfitAvgPercentMin() {
		return profitAvgPercentMin;
	}

	public void setProfitAvgPercentMin(Integer profitAvgPercentMin) {
		this.profitAvgPercentMin = profitAvgPercentMin;
	}

	public InvestmentProgramsFilter profitAvgPercentMax(Integer profitAvgPercentMax) {
		this.profitAvgPercentMax = profitAvgPercentMax;
		return this;
	}

	/**
	 * Get profitAvgPercentMax
	 *
	 * @return profitAvgPercentMax
	 **/
	@ApiModelProperty(value = "")
	public Integer getProfitAvgPercentMax() {
		return profitAvgPercentMax;
	}

	public void setProfitAvgPercentMax(Integer profitAvgPercentMax) {
		this.profitAvgPercentMax = profitAvgPercentMax;
	}

	public InvestmentProgramsFilter profitTotalChange(ProfitTotalChangeEnum profitTotalChange) {
		this.profitTotalChange = profitTotalChange;
		return this;
	}

	/**
	 * Get profitTotalChange
	 *
	 * @return profitTotalChange
	 **/
	@ApiModelProperty(value = "")
	public ProfitTotalChangeEnum getProfitTotalChange() {
		return profitTotalChange;
	}

	public void setProfitTotalChange(ProfitTotalChangeEnum profitTotalChange) {
		this.profitTotalChange = profitTotalChange;
	}

	public InvestmentProgramsFilter periodMin(Integer periodMin) {
		this.periodMin = periodMin;
		return this;
	}

	/**
	 * Get periodMin
	 *
	 * @return periodMin
	 **/
	@ApiModelProperty(value = "")
	public Integer getPeriodMin() {
		return periodMin;
	}

	public void setPeriodMin(Integer periodMin) {
		this.periodMin = periodMin;
	}

	public InvestmentProgramsFilter periodMax(Integer periodMax) {
		this.periodMax = periodMax;
		return this;
	}

	/**
	 * Get periodMax
	 *
	 * @return periodMax
	 **/
	@ApiModelProperty(value = "")
	public Integer getPeriodMax() {
		return periodMax;
	}

	public void setPeriodMax(Integer periodMax) {
		this.periodMax = periodMax;
	}

	public InvestmentProgramsFilter showActivePrograms(Boolean showActivePrograms) {
		this.showActivePrograms = showActivePrograms;
		return this;
	}

	/**
	 * Get showActivePrograms
	 *
	 * @return showActivePrograms
	 **/
	@ApiModelProperty(value = "")
	public Boolean isShowActivePrograms() {
		return showActivePrograms;
	}

	public void setShowActivePrograms(Boolean showActivePrograms) {
		this.showActivePrograms = showActivePrograms;
	}

	public InvestmentProgramsFilter equityChartLength(Integer equityChartLength) {
		this.equityChartLength = equityChartLength;
		return this;
	}

	/**
	 * Get equityChartLength
	 *
	 * @return equityChartLength
	 **/
	@ApiModelProperty(value = "")
	public Integer getEquityChartLength() {
		return equityChartLength;
	}

	public void setEquityChartLength(Integer equityChartLength) {
		this.equityChartLength = equityChartLength;
	}

	public InvestmentProgramsFilter showMyFavorites(Boolean showMyFavorites) {
		this.showMyFavorites = showMyFavorites;
		return this;
	}

	/**
	 * Get showMyFavorites
	 *
	 * @return showMyFavorites
	 **/
	@ApiModelProperty(value = "")
	public Boolean isShowMyFavorites() {
		return showMyFavorites;
	}

	public void setShowMyFavorites(Boolean showMyFavorites) {
		this.showMyFavorites = showMyFavorites;
	}

	public InvestmentProgramsFilter roundNumber(Integer roundNumber) {
		this.roundNumber = roundNumber;
		return this;
	}

	/**
	 * Get roundNumber
	 *
	 * @return roundNumber
	 **/
	@ApiModelProperty(value = "")
	public Integer getRoundNumber() {
		return roundNumber;
	}

	public void setRoundNumber(Integer roundNumber) {
		this.roundNumber = roundNumber;
	}

	public InvestmentProgramsFilter skip(Integer skip) {
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

	public InvestmentProgramsFilter take(Integer take) {
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
		InvestmentProgramsFilter investmentProgramsFilter = (InvestmentProgramsFilter) o;
		return Objects.equals(this.managerId, investmentProgramsFilter.managerId) &&
				Objects.equals(this.brokerId, investmentProgramsFilter.brokerId) &&
				Objects.equals(this.brokerTradeServerId, investmentProgramsFilter.brokerTradeServerId) &&
				Objects.equals(this.investMaxAmountFrom, investmentProgramsFilter.investMaxAmountFrom) &&
				Objects.equals(this.investMaxAmountTo, investmentProgramsFilter.investMaxAmountTo) &&
				Objects.equals(this.sorting, investmentProgramsFilter.sorting) &&
				Objects.equals(this.name, investmentProgramsFilter.name) &&
				Objects.equals(this.levelMin, investmentProgramsFilter.levelMin) &&
				Objects.equals(this.levelMax, investmentProgramsFilter.levelMax) &&
				Objects.equals(this.profitAvgMin, investmentProgramsFilter.profitAvgMin) &&
				Objects.equals(this.profitAvgMax, investmentProgramsFilter.profitAvgMax) &&
				Objects.equals(this.profitTotalMin, investmentProgramsFilter.profitTotalMin) &&
				Objects.equals(this.profitTotalMax, investmentProgramsFilter.profitTotalMax) &&
				Objects.equals(this.profitTotalPercentMin, investmentProgramsFilter.profitTotalPercentMin) &&
				Objects.equals(this.profitTotalPercentMax, investmentProgramsFilter.profitTotalPercentMax) &&
				Objects.equals(this.profitAvgPercentMin, investmentProgramsFilter.profitAvgPercentMin) &&
				Objects.equals(this.profitAvgPercentMax, investmentProgramsFilter.profitAvgPercentMax) &&
				Objects.equals(this.profitTotalChange, investmentProgramsFilter.profitTotalChange) &&
				Objects.equals(this.periodMin, investmentProgramsFilter.periodMin) &&
				Objects.equals(this.periodMax, investmentProgramsFilter.periodMax) &&
				Objects.equals(this.showActivePrograms, investmentProgramsFilter.showActivePrograms) &&
				Objects.equals(this.equityChartLength, investmentProgramsFilter.equityChartLength) &&
				Objects.equals(this.showMyFavorites, investmentProgramsFilter.showMyFavorites) &&
				Objects.equals(this.roundNumber, investmentProgramsFilter.roundNumber) &&
				Objects.equals(this.skip, investmentProgramsFilter.skip) &&
				Objects.equals(this.take, investmentProgramsFilter.take);
	}

	@Override
	public int hashCode() {
		return Objects.hash(managerId, brokerId, brokerTradeServerId, investMaxAmountFrom, investMaxAmountTo, sorting, name, levelMin, levelMax, profitAvgMin, profitAvgMax, profitTotalMin, profitTotalMax, profitTotalPercentMin, profitTotalPercentMax, profitAvgPercentMin, profitAvgPercentMax, profitTotalChange, periodMin, periodMax, showActivePrograms, equityChartLength, showMyFavorites, roundNumber, skip, take);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class InvestmentProgramsFilter {\n");

		sb.append("    managerId: ").append(toIndentedString(managerId)).append("\n");
		sb.append("    brokerId: ").append(toIndentedString(brokerId)).append("\n");
		sb.append("    brokerTradeServerId: ").append(toIndentedString(brokerTradeServerId)).append("\n");
		sb.append("    investMaxAmountFrom: ").append(toIndentedString(investMaxAmountFrom)).append("\n");
		sb.append("    investMaxAmountTo: ").append(toIndentedString(investMaxAmountTo)).append("\n");
		sb.append("    sorting: ").append(toIndentedString(sorting)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    levelMin: ").append(toIndentedString(levelMin)).append("\n");
		sb.append("    levelMax: ").append(toIndentedString(levelMax)).append("\n");
		sb.append("    profitAvgMin: ").append(toIndentedString(profitAvgMin)).append("\n");
		sb.append("    profitAvgMax: ").append(toIndentedString(profitAvgMax)).append("\n");
		sb.append("    profitTotalMin: ").append(toIndentedString(profitTotalMin)).append("\n");
		sb.append("    profitTotalMax: ").append(toIndentedString(profitTotalMax)).append("\n");
		sb.append("    profitTotalPercentMin: ").append(toIndentedString(profitTotalPercentMin)).append("\n");
		sb.append("    profitTotalPercentMax: ").append(toIndentedString(profitTotalPercentMax)).append("\n");
		sb.append("    profitAvgPercentMin: ").append(toIndentedString(profitAvgPercentMin)).append("\n");
		sb.append("    profitAvgPercentMax: ").append(toIndentedString(profitAvgPercentMax)).append("\n");
		sb.append("    profitTotalChange: ").append(toIndentedString(profitTotalChange)).append("\n");
		sb.append("    periodMin: ").append(toIndentedString(periodMin)).append("\n");
		sb.append("    periodMax: ").append(toIndentedString(periodMax)).append("\n");
		sb.append("    showActivePrograms: ").append(toIndentedString(showActivePrograms)).append("\n");
		sb.append("    equityChartLength: ").append(toIndentedString(equityChartLength)).append("\n");
		sb.append("    showMyFavorites: ").append(toIndentedString(showMyFavorites)).append("\n");
		sb.append("    roundNumber: ").append(toIndentedString(roundNumber)).append("\n");
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
	 * Gets or Sets sorting
	 */
	@JsonAdapter(SortingEnum.Adapter.class)
	public enum SortingEnum
	{
		BYLEVELASC("ByLevelAsc"),

		BYLEVELDESC("ByLevelDesc"),

		BYPROFITASC("ByProfitAsc"),

		BYPROFITDESC("ByProfitDesc"),

		BYORDERSASC("ByOrdersAsc"),

		BYORDERSDESC("ByOrdersDesc"),

		BYENDOFPERIODASC("ByEndOfPeriodAsc"),

		BYENDOFPERIODDESC("ByEndOfPeriodDesc"),

		BYTITLEASC("ByTitleAsc"),

		BYTITLEDESC("ByTitleDesc");

		public static SortingEnum fromValue(String text) {
			for (SortingEnum b : SortingEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}

		private String value;

		SortingEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static class Adapter extends TypeAdapter<SortingEnum>
		{
			@Override
			public void write(final JsonWriter jsonWriter, final SortingEnum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			@Override
			public SortingEnum read(final JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return SortingEnum.fromValue(String.valueOf(value));
			}
		}
	}

	/**
	 * Gets or Sets profitTotalChange
	 */
	@JsonAdapter(ProfitTotalChangeEnum.Adapter.class)
	public enum ProfitTotalChangeEnum
	{
		UNCHANGED("Unchanged"),

		UP("Up"),

		DOWN("Down");

		public static ProfitTotalChangeEnum fromValue(String text) {
			for (ProfitTotalChangeEnum b : ProfitTotalChangeEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}

		private String value;

		ProfitTotalChangeEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static class Adapter extends TypeAdapter<ProfitTotalChangeEnum>
		{
			@Override
			public void write(final JsonWriter jsonWriter, final ProfitTotalChangeEnum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			@Override
			public ProfitTotalChangeEnum read(final JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return ProfitTotalChangeEnum.fromValue(String.valueOf(value));
			}
		}
	}

}

