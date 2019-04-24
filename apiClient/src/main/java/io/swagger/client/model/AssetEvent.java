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
 * AssetEvent
 */

public class AssetEvent
{
	@SerializedName("programs")
	private List<String> programs = null;

	@SerializedName("funds")
	private List<String> funds = null;

	public AssetEvent programs(List<String> programs) {
		this.programs = programs;
		return this;
	}

	public AssetEvent addProgramsItem(String programsItem) {
		if (this.programs == null) {
			this.programs = new ArrayList<String>();
		}
		this.programs.add(programsItem);
		return this;
	}

	/**
	 * Get programs
	 *
	 * @return programs
	 **/
	@ApiModelProperty(value = "")
	public List<String> getPrograms() {
		return programs;
	}

	public void setPrograms(List<String> programs) {
		this.programs = programs;
	}

	public AssetEvent funds(List<String> funds) {
		this.funds = funds;
		return this;
	}

	public AssetEvent addFundsItem(String fundsItem) {
		if (this.funds == null) {
			this.funds = new ArrayList<String>();
		}
		this.funds.add(fundsItem);
		return this;
	}

	/**
	 * Get funds
	 *
	 * @return funds
	 **/
	@ApiModelProperty(value = "")
	public List<String> getFunds() {
		return funds;
	}

	public void setFunds(List<String> funds) {
		this.funds = funds;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AssetEvent assetEvent = (AssetEvent) o;
		return Objects.equals(this.programs, assetEvent.programs) &&
				Objects.equals(this.funds, assetEvent.funds);
	}

	@Override
	public int hashCode() {
		return Objects.hash(programs, funds);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AssetEvent {\n");

		sb.append("    programs: ").append(toIndentedString(programs)).append("\n");
		sb.append("    funds: ").append(toIndentedString(funds)).append("\n");
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

