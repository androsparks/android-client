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

import java.util.Objects;
import java.util.UUID;

import io.swagger.annotations.ApiModelProperty;

/**
 * OrderSignalProgramInfo
 */

public class OrderSignalProgramInfo
{
	@SerializedName("manager")
	private ProfilePublic manager = null;

	@SerializedName("program")
	private OrderProgramData program = null;

	@SerializedName("programId")
	private UUID programId = null;

	@SerializedName("volume")
	private Double volume = null;

	public OrderSignalProgramInfo manager(ProfilePublic manager) {
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

	public OrderSignalProgramInfo program(OrderProgramData program) {
		this.program = program;
		return this;
	}

	/**
	 * Get program
	 *
	 * @return program
	 **/
	@ApiModelProperty(value = "")
	public OrderProgramData getProgram() {
		return program;
	}

	public void setProgram(OrderProgramData program) {
		this.program = program;
	}

	public OrderSignalProgramInfo programId(UUID programId) {
		this.programId = programId;
		return this;
	}

	/**
	 * Get programId
	 *
	 * @return programId
	 **/
	@ApiModelProperty(value = "")
	public UUID getProgramId() {
		return programId;
	}

	public void setProgramId(UUID programId) {
		this.programId = programId;
	}

	public OrderSignalProgramInfo volume(Double volume) {
		this.volume = volume;
		return this;
	}

	/**
	 * Get volume
	 *
	 * @return volume
	 **/
	@ApiModelProperty(value = "")
	public Double getVolume() {
		return volume;
	}

	public void setVolume(Double volume) {
		this.volume = volume;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		OrderSignalProgramInfo orderSignalProgramInfo = (OrderSignalProgramInfo) o;
		return Objects.equals(this.manager, orderSignalProgramInfo.manager) &&
				Objects.equals(this.program, orderSignalProgramInfo.program) &&
				Objects.equals(this.programId, orderSignalProgramInfo.programId) &&
				Objects.equals(this.volume, orderSignalProgramInfo.volume);
	}

	@Override
	public int hashCode() {
		return Objects.hash(manager, program, programId, volume);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class OrderSignalProgramInfo {\n");

		sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
		sb.append("    program: ").append(toIndentedString(program)).append("\n");
		sb.append("    programId: ").append(toIndentedString(programId)).append("\n");
		sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
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

