/*
 * Tournament Core API
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

import java.util.Objects;
import java.util.UUID;

import io.swagger.annotations.ApiModelProperty;

/**
 * AccountCreated
 */

public class AccountCreated
{
	@SerializedName("participantId")
	private UUID participantId = null;

	@SerializedName("tradeServerId")
	private UUID tradeServerId = null;

	@SerializedName("login")
	private Long login = null;

	@SerializedName("password")
	private String password = null;

	@SerializedName("startBalance")
	private Double startBalance = null;

	public AccountCreated participantId(UUID participantId) {
		this.participantId = participantId;
		return this;
	}

	/**
	 * Get participantId
	 *
	 * @return participantId
	 **/
	@ApiModelProperty(value = "")
	public UUID getParticipantId() {
		return participantId;
	}

	public void setParticipantId(UUID participantId) {
		this.participantId = participantId;
	}

	public AccountCreated tradeServerId(UUID tradeServerId) {
		this.tradeServerId = tradeServerId;
		return this;
	}

	/**
	 * Get tradeServerId
	 *
	 * @return tradeServerId
	 **/
	@ApiModelProperty(value = "")
	public UUID getTradeServerId() {
		return tradeServerId;
	}

	public void setTradeServerId(UUID tradeServerId) {
		this.tradeServerId = tradeServerId;
	}

	public AccountCreated login(Long login) {
		this.login = login;
		return this;
	}

	/**
	 * Get login
	 *
	 * @return login
	 **/
	@ApiModelProperty(value = "")
	public Long getLogin() {
		return login;
	}

	public void setLogin(Long login) {
		this.login = login;
	}

	public AccountCreated password(String password) {
		this.password = password;
		return this;
	}

	/**
	 * Get password
	 *
	 * @return password
	 **/
	@ApiModelProperty(value = "")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public AccountCreated startBalance(Double startBalance) {
		this.startBalance = startBalance;
		return this;
	}

	/**
	 * Get startBalance
	 *
	 * @return startBalance
	 **/
	@ApiModelProperty(value = "")
	public Double getStartBalance() {
		return startBalance;
	}

	public void setStartBalance(Double startBalance) {
		this.startBalance = startBalance;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AccountCreated accountCreated = (AccountCreated) o;
		return Objects.equals(this.participantId, accountCreated.participantId) &&
				Objects.equals(this.tradeServerId, accountCreated.tradeServerId) &&
				Objects.equals(this.login, accountCreated.login) &&
				Objects.equals(this.password, accountCreated.password) &&
				Objects.equals(this.startBalance, accountCreated.startBalance);
	}

	@Override
	public int hashCode() {
		return Objects.hash(participantId, tradeServerId, login, password, startBalance);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AccountCreated {\n");

		sb.append("    participantId: ").append(toIndentedString(participantId)).append("\n");
		sb.append("    tradeServerId: ").append(toIndentedString(tradeServerId)).append("\n");
		sb.append("    login: ").append(toIndentedString(login)).append("\n");
		sb.append("    password: ").append(toIndentedString(password)).append("\n");
		sb.append("    startBalance: ").append(toIndentedString(startBalance)).append("\n");
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

