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
import java.util.UUID;

import io.swagger.annotations.ApiModelProperty;

/**
 * DExchangeRequest
 */

public class DExchangeRequest
{
	@SerializedName("jsonrpc")
	private String jsonrpc = null;

	@SerializedName("id")
	private Integer id = null;

	@SerializedName("method")
	private String method = null;

	@SerializedName("params")
	private List<Object> params = null;

	@SerializedName("userId")
	private UUID userId = null;

	@SerializedName("programId")
	private UUID programId = null;

	public DExchangeRequest jsonrpc(String jsonrpc) {
		this.jsonrpc = jsonrpc;
		return this;
	}

	/**
	 * Get jsonrpc
	 *
	 * @return jsonrpc
	 **/
	@ApiModelProperty(value = "")
	public String getJsonrpc() {
		return jsonrpc;
	}

	public void setJsonrpc(String jsonrpc) {
		this.jsonrpc = jsonrpc;
	}

	public DExchangeRequest id(Integer id) {
		this.id = id;
		return this;
	}

	/**
	 * Get id
	 *
	 * @return id
	 **/
	@ApiModelProperty(value = "")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public DExchangeRequest method(String method) {
		this.method = method;
		return this;
	}

	/**
	 * Get method
	 *
	 * @return method
	 **/
	@ApiModelProperty(value = "")
	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public DExchangeRequest params(List<Object> params) {
		this.params = params;
		return this;
	}

	public DExchangeRequest addParamsItem(Object paramsItem) {
		if (this.params == null) {
			this.params = new ArrayList<Object>();
		}
		this.params.add(paramsItem);
		return this;
	}

	/**
	 * Get params
	 *
	 * @return params
	 **/
	@ApiModelProperty(value = "")
	public List<Object> getParams() {
		return params;
	}

	public void setParams(List<Object> params) {
		this.params = params;
	}

	public DExchangeRequest userId(UUID userId) {
		this.userId = userId;
		return this;
	}

	/**
	 * Get userId
	 *
	 * @return userId
	 **/
	@ApiModelProperty(value = "")
	public UUID getUserId() {
		return userId;
	}

	public void setUserId(UUID userId) {
		this.userId = userId;
	}

	public DExchangeRequest programId(UUID programId) {
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


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DExchangeRequest dexchangeRequest = (DExchangeRequest) o;
		return Objects.equals(this.jsonrpc, dexchangeRequest.jsonrpc) &&
				Objects.equals(this.id, dexchangeRequest.id) &&
				Objects.equals(this.method, dexchangeRequest.method) &&
				Objects.equals(this.params, dexchangeRequest.params) &&
				Objects.equals(this.userId, dexchangeRequest.userId) &&
				Objects.equals(this.programId, dexchangeRequest.programId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(jsonrpc, id, method, params, userId, programId);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DExchangeRequest {\n");

		sb.append("    jsonrpc: ").append(toIndentedString(jsonrpc)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    method: ").append(toIndentedString(method)).append("\n");
		sb.append("    params: ").append(toIndentedString(params)).append("\n");
		sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
		sb.append("    programId: ").append(toIndentedString(programId)).append("\n");
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
