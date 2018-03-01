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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * BrokerInitData
 */

public class BrokerInitData
{
	@SerializedName("newManagerRequest")
	private List<ManagerRequest> newManagerRequest = null;

	@SerializedName("investments")
	private List<BrokerInvestmentProgram> investments = null;

	public BrokerInitData newManagerRequest(List<ManagerRequest> newManagerRequest) {
		this.newManagerRequest = newManagerRequest;
		return this;
	}

	public BrokerInitData addNewManagerRequestItem(ManagerRequest newManagerRequestItem) {
		if (this.newManagerRequest == null) {
			this.newManagerRequest = new ArrayList<ManagerRequest>();
		}
		this.newManagerRequest.add(newManagerRequestItem);
		return this;
	}

	/**
	 * Get newManagerRequest
	 *
	 * @return newManagerRequest
	 **/
	@ApiModelProperty(value = "")
	public List<ManagerRequest> getNewManagerRequest() {
		return newManagerRequest;
	}

	public void setNewManagerRequest(List<ManagerRequest> newManagerRequest) {
		this.newManagerRequest = newManagerRequest;
	}

	public BrokerInitData investments(List<BrokerInvestmentProgram> investments) {
		this.investments = investments;
		return this;
	}

	public BrokerInitData addInvestmentsItem(BrokerInvestmentProgram investmentsItem) {
		if (this.investments == null) {
			this.investments = new ArrayList<BrokerInvestmentProgram>();
		}
		this.investments.add(investmentsItem);
		return this;
	}

	/**
	 * Get investments
	 *
	 * @return investments
	 **/
	@ApiModelProperty(value = "")
	public List<BrokerInvestmentProgram> getInvestments() {
		return investments;
	}

	public void setInvestments(List<BrokerInvestmentProgram> investments) {
		this.investments = investments;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BrokerInitData brokerInitData = (BrokerInitData) o;
		return Objects.equals(this.newManagerRequest, brokerInitData.newManagerRequest) &&
				Objects.equals(this.investments, brokerInitData.investments);
	}

	@Override
	public int hashCode() {
		return Objects.hash(newManagerRequest, investments);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BrokerInitData {\n");

		sb.append("    newManagerRequest: ").append(toIndentedString(newManagerRequest)).append("\n");
		sb.append("    investments: ").append(toIndentedString(investments)).append("\n");
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

