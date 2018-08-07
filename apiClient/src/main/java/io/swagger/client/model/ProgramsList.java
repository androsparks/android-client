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
 * ProgramsList
 */

public class ProgramsList
{
	@SerializedName("programs")
	private List<ProgramDetails> programs = null;

	@SerializedName("total")
	private Integer total = null;

	public ProgramsList programs(List<ProgramDetails> programs) {
		this.programs = programs;
		return this;
	}

	public ProgramsList addProgramsItem(ProgramDetails programsItem) {
		if (this.programs == null) {
			this.programs = new ArrayList<ProgramDetails>();
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
	public List<ProgramDetails> getPrograms() {
		return programs;
	}

	public void setPrograms(List<ProgramDetails> programs) {
		this.programs = programs;
	}

	public ProgramsList total(Integer total) {
		this.total = total;
		return this;
	}

	/**
	 * Get total
	 *
	 * @return total
	 **/
	@ApiModelProperty(value = "")
	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ProgramsList programsList = (ProgramsList) o;
		return Objects.equals(this.programs, programsList.programs) &&
				Objects.equals(this.total, programsList.total);
	}

	@Override
	public int hashCode() {
		return Objects.hash(programs, total);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ProgramsList {\n");

		sb.append("    programs: ").append(toIndentedString(programs)).append("\n");
		sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

