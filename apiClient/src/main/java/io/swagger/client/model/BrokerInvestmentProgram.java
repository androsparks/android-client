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

import com.google.gson.annotations.SerializedName;

import org.joda.time.DateTime;

import java.util.Objects;
import java.util.UUID;

import io.swagger.annotations.ApiModelProperty;

/**
 * BrokerInvestmentProgram
 */

public class BrokerInvestmentProgram
{
	@SerializedName("id")
	private UUID id = null;

	@SerializedName("managerAccountId")
	private UUID managerAccountId = null;

	@SerializedName("dateFrom")
	private DateTime dateFrom = null;

	@SerializedName("dateTo")
	private DateTime dateTo = null;

	@SerializedName("description")
	private String description = null;

	@SerializedName("isEnabled")
	private Boolean isEnabled = null;

	@SerializedName("period")
	private Integer period = null;

	@SerializedName("feeSuccess")
	private Double feeSuccess = null;

	@SerializedName("feeManagement")
	private Double feeManagement = null;

	@SerializedName("feeEntrance")
	private Double feeEntrance = null;

	@SerializedName("investMinAmount")
	private Double investMinAmount = null;

	@SerializedName("investMaxAmount")
	private Double investMaxAmount = null;

	@SerializedName("lastPeriod")
	private Period lastPeriod = null;

	@SerializedName("login")
	private String login = null;

	@SerializedName("ipfsHash")
	private String ipfsHash = null;

	@SerializedName("tradeIpfsHash")
	private String tradeIpfsHash = null;

	public BrokerInvestmentProgram id(UUID id) {
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

	public BrokerInvestmentProgram managerAccountId(UUID managerAccountId) {
		this.managerAccountId = managerAccountId;
		return this;
	}

	/**
	 * Get managerAccountId
	 *
	 * @return managerAccountId
	 **/
	@ApiModelProperty(value = "")
	public UUID getManagerAccountId() {
		return managerAccountId;
	}

	public void setManagerAccountId(UUID managerAccountId) {
		this.managerAccountId = managerAccountId;
	}

	public BrokerInvestmentProgram dateFrom(DateTime dateFrom) {
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

	public BrokerInvestmentProgram dateTo(DateTime dateTo) {
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

	public BrokerInvestmentProgram description(String description) {
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

	public BrokerInvestmentProgram isEnabled(Boolean isEnabled) {
		this.isEnabled = isEnabled;
		return this;
	}

	/**
	 * Get isEnabled
	 *
	 * @return isEnabled
	 **/
	@ApiModelProperty(value = "")
	public Boolean isIsEnabled() {
		return isEnabled;
	}

	public void setIsEnabled(Boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	public BrokerInvestmentProgram period(Integer period) {
		this.period = period;
		return this;
	}

	/**
	 * Get period
	 *
	 * @return period
	 **/
	@ApiModelProperty(value = "")
	public Integer getPeriod() {
		return period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
	}

	public BrokerInvestmentProgram feeSuccess(Double feeSuccess) {
		this.feeSuccess = feeSuccess;
		return this;
	}

	/**
	 * Get feeSuccess
	 *
	 * @return feeSuccess
	 **/
	@ApiModelProperty(value = "")
	public Double getFeeSuccess() {
		return feeSuccess;
	}

	public void setFeeSuccess(Double feeSuccess) {
		this.feeSuccess = feeSuccess;
	}

	public BrokerInvestmentProgram feeManagement(Double feeManagement) {
		this.feeManagement = feeManagement;
		return this;
	}

	/**
	 * Get feeManagement
	 *
	 * @return feeManagement
	 **/
	@ApiModelProperty(value = "")
	public Double getFeeManagement() {
		return feeManagement;
	}

	public void setFeeManagement(Double feeManagement) {
		this.feeManagement = feeManagement;
	}

	public BrokerInvestmentProgram feeEntrance(Double feeEntrance) {
		this.feeEntrance = feeEntrance;
		return this;
	}

	/**
	 * Get feeEntrance
	 *
	 * @return feeEntrance
	 **/
	@ApiModelProperty(value = "")
	public Double getFeeEntrance() {
		return feeEntrance;
	}

	public void setFeeEntrance(Double feeEntrance) {
		this.feeEntrance = feeEntrance;
	}

	public BrokerInvestmentProgram investMinAmount(Double investMinAmount) {
		this.investMinAmount = investMinAmount;
		return this;
	}

	/**
	 * Get investMinAmount
	 *
	 * @return investMinAmount
	 **/
	@ApiModelProperty(value = "")
	public Double getInvestMinAmount() {
		return investMinAmount;
	}

	public void setInvestMinAmount(Double investMinAmount) {
		this.investMinAmount = investMinAmount;
	}

	public BrokerInvestmentProgram investMaxAmount(Double investMaxAmount) {
		this.investMaxAmount = investMaxAmount;
		return this;
	}

	/**
	 * Get investMaxAmount
	 *
	 * @return investMaxAmount
	 **/
	@ApiModelProperty(value = "")
	public Double getInvestMaxAmount() {
		return investMaxAmount;
	}

	public void setInvestMaxAmount(Double investMaxAmount) {
		this.investMaxAmount = investMaxAmount;
	}

	public BrokerInvestmentProgram lastPeriod(Period lastPeriod) {
		this.lastPeriod = lastPeriod;
		return this;
	}

	/**
	 * Get lastPeriod
	 *
	 * @return lastPeriod
	 **/
	@ApiModelProperty(value = "")
	public Period getLastPeriod() {
		return lastPeriod;
	}

	public void setLastPeriod(Period lastPeriod) {
		this.lastPeriod = lastPeriod;
	}

	public BrokerInvestmentProgram login(String login) {
		this.login = login;
		return this;
	}

	/**
	 * Get login
	 *
	 * @return login
	 **/
	@ApiModelProperty(value = "")
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public BrokerInvestmentProgram ipfsHash(String ipfsHash) {
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

	public BrokerInvestmentProgram tradeIpfsHash(String tradeIpfsHash) {
		this.tradeIpfsHash = tradeIpfsHash;
		return this;
	}

	/**
	 * Get tradeIpfsHash
	 *
	 * @return tradeIpfsHash
	 **/
	@ApiModelProperty(value = "")
	public String getTradeIpfsHash() {
		return tradeIpfsHash;
	}

	public void setTradeIpfsHash(String tradeIpfsHash) {
		this.tradeIpfsHash = tradeIpfsHash;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BrokerInvestmentProgram brokerInvestmentProgram = (BrokerInvestmentProgram) o;
		return Objects.equals(this.id, brokerInvestmentProgram.id) &&
				Objects.equals(this.managerAccountId, brokerInvestmentProgram.managerAccountId) &&
				Objects.equals(this.dateFrom, brokerInvestmentProgram.dateFrom) &&
				Objects.equals(this.dateTo, brokerInvestmentProgram.dateTo) &&
				Objects.equals(this.description, brokerInvestmentProgram.description) &&
				Objects.equals(this.isEnabled, brokerInvestmentProgram.isEnabled) &&
				Objects.equals(this.period, brokerInvestmentProgram.period) &&
				Objects.equals(this.feeSuccess, brokerInvestmentProgram.feeSuccess) &&
				Objects.equals(this.feeManagement, brokerInvestmentProgram.feeManagement) &&
				Objects.equals(this.feeEntrance, brokerInvestmentProgram.feeEntrance) &&
				Objects.equals(this.investMinAmount, brokerInvestmentProgram.investMinAmount) &&
				Objects.equals(this.investMaxAmount, brokerInvestmentProgram.investMaxAmount) &&
				Objects.equals(this.lastPeriod, brokerInvestmentProgram.lastPeriod) &&
				Objects.equals(this.login, brokerInvestmentProgram.login) &&
				Objects.equals(this.ipfsHash, brokerInvestmentProgram.ipfsHash) &&
				Objects.equals(this.tradeIpfsHash, brokerInvestmentProgram.tradeIpfsHash);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, managerAccountId, dateFrom, dateTo, description, isEnabled, period, feeSuccess, feeManagement, feeEntrance, investMinAmount, investMaxAmount, lastPeriod, login, ipfsHash, tradeIpfsHash);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BrokerInvestmentProgram {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    managerAccountId: ").append(toIndentedString(managerAccountId)).append("\n");
		sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
		sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
		sb.append("    period: ").append(toIndentedString(period)).append("\n");
		sb.append("    feeSuccess: ").append(toIndentedString(feeSuccess)).append("\n");
		sb.append("    feeManagement: ").append(toIndentedString(feeManagement)).append("\n");
		sb.append("    feeEntrance: ").append(toIndentedString(feeEntrance)).append("\n");
		sb.append("    investMinAmount: ").append(toIndentedString(investMinAmount)).append("\n");
		sb.append("    investMaxAmount: ").append(toIndentedString(investMaxAmount)).append("\n");
		sb.append("    lastPeriod: ").append(toIndentedString(lastPeriod)).append("\n");
		sb.append("    login: ").append(toIndentedString(login)).append("\n");
		sb.append("    ipfsHash: ").append(toIndentedString(ipfsHash)).append("\n");
		sb.append("    tradeIpfsHash: ").append(toIndentedString(tradeIpfsHash)).append("\n");
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

