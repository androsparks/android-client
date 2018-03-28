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
 * RegisterInvestorViewModel
 */

public class RegisterInvestorViewModel
{
	@SerializedName("email")
	private String email = null;

	@SerializedName("password")
	private String password = null;

	@SerializedName("confirmPassword")
	private String confirmPassword = null;

	public RegisterInvestorViewModel email(String email) {
		this.email = email;
		return this;
	}

	/**
	 * Get email
	 *
	 * @return email
	 **/
	@ApiModelProperty(required = true, value = "")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public RegisterInvestorViewModel password(String password) {
		this.password = password;
		return this;
	}

	/**
	 * Get password
	 *
	 * @return password
	 **/
	@ApiModelProperty(required = true, value = "")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public RegisterInvestorViewModel confirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
		return this;
	}

	/**
	 * Get confirmPassword
	 *
	 * @return confirmPassword
	 **/
	@ApiModelProperty(value = "")
	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		RegisterInvestorViewModel registerInvestorViewModel = (RegisterInvestorViewModel) o;
		return Objects.equals(this.email, registerInvestorViewModel.email) &&
				Objects.equals(this.password, registerInvestorViewModel.password) &&
				Objects.equals(this.confirmPassword, registerInvestorViewModel.confirmPassword);
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, password, confirmPassword);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RegisterInvestorViewModel {\n");

		sb.append("    email: ").append(toIndentedString(email)).append("\n");
		sb.append("    password: ").append(toIndentedString(password)).append("\n");
		sb.append("    confirmPassword: ").append(toIndentedString(confirmPassword)).append("\n");
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

