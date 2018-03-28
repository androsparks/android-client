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

import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * Token
 */

public class Token
{
	@SerializedName("tokenName")
	private String tokenName = null;

	@SerializedName("tokenSymbol")
	private String tokenSymbol = null;

	@SerializedName("initialPrice")
	private Double initialPrice = null;

	public Token tokenName(String tokenName) {
		this.tokenName = tokenName;
		return this;
	}

	/**
	 * Get tokenName
	 *
	 * @return tokenName
	 **/
	@ApiModelProperty(value = "")
	public String getTokenName() {
		return tokenName;
	}

	public void setTokenName(String tokenName) {
		this.tokenName = tokenName;
	}

	public Token tokenSymbol(String tokenSymbol) {
		this.tokenSymbol = tokenSymbol;
		return this;
	}

	/**
	 * Get tokenSymbol
	 *
	 * @return tokenSymbol
	 **/
	@ApiModelProperty(value = "")
	public String getTokenSymbol() {
		return tokenSymbol;
	}

	public void setTokenSymbol(String tokenSymbol) {
		this.tokenSymbol = tokenSymbol;
	}

	public Token initialPrice(Double initialPrice) {
		this.initialPrice = initialPrice;
		return this;
	}

	/**
	 * Get initialPrice
	 *
	 * @return initialPrice
	 **/
	@ApiModelProperty(value = "")
	public Double getInitialPrice() {
		return initialPrice;
	}

	public void setInitialPrice(Double initialPrice) {
		this.initialPrice = initialPrice;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Token token = (Token) o;
		return Objects.equals(this.tokenName, token.tokenName) &&
				Objects.equals(this.tokenSymbol, token.tokenSymbol) &&
				Objects.equals(this.initialPrice, token.initialPrice);
	}

	@Override
	public int hashCode() {
		return Objects.hash(tokenName, tokenSymbol, initialPrice);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Token {\n");

		sb.append("    tokenName: ").append(toIndentedString(tokenName)).append("\n");
		sb.append("    tokenSymbol: ").append(toIndentedString(tokenSymbol)).append("\n");
		sb.append("    initialPrice: ").append(toIndentedString(initialPrice)).append("\n");
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

