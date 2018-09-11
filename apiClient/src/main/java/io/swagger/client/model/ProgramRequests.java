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
 * ProgramRequests
 */

public class ProgramRequests
{
	@SerializedName("requests")
	private List<ProgramRequest> requests = null;

	@SerializedName("total")
	private Integer total = null;

	@SerializedName("totalValue")
	private Double totalValue = null;

	public ProgramRequests requests(List<ProgramRequest> requests) {
		this.requests = requests;
		return this;
	}

	public ProgramRequests addRequestsItem(ProgramRequest requestsItem) {
		if (this.requests == null) {
			this.requests = new ArrayList<ProgramRequest>();
		}
		this.requests.add(requestsItem);
		return this;
	}

	/**
	 * Get requests
	 *
	 * @return requests
	 **/
	@ApiModelProperty(value = "")
	public List<ProgramRequest> getRequests() {
		return requests;
	}

	public void setRequests(List<ProgramRequest> requests) {
		this.requests = requests;
	}

	public ProgramRequests total(Integer total) {
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

	public ProgramRequests totalValue(Double totalValue) {
		this.totalValue = totalValue;
		return this;
	}

	/**
	 * Get totalValue
	 *
	 * @return totalValue
	 **/
	@ApiModelProperty(value = "")
	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ProgramRequests programRequests = (ProgramRequests) o;
		return Objects.equals(this.requests, programRequests.requests) &&
				Objects.equals(this.total, programRequests.total) &&
				Objects.equals(this.totalValue, programRequests.totalValue);
	}

	@Override
	public int hashCode() {
		return Objects.hash(requests, total, totalValue);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ProgramRequests {\n");

		sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
		sb.append("    total: ").append(toIndentedString(total)).append("\n");
		sb.append("    totalValue: ").append(toIndentedString(totalValue)).append("\n");
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
