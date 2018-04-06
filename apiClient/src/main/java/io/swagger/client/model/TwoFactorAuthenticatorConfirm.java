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
 * TwoFactorAuthenticatorConfirm
 */

public class TwoFactorAuthenticatorConfirm
{
	@SerializedName("code")
	private String code = null;

	@SerializedName("sharedKey")
	private String sharedKey = null;

	@SerializedName("password")
	private String password = null;

	public TwoFactorAuthenticatorConfirm code(String code) {
		this.code = code;
		return this;
	}

	/**
	 * Get code
	 *
	 * @return code
	 **/
	@ApiModelProperty(required = true, value = "")
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public TwoFactorAuthenticatorConfirm sharedKey(String sharedKey) {
		this.sharedKey = sharedKey;
		return this;
	}

	/**
	 * Get sharedKey
	 *
	 * @return sharedKey
	 **/
	@ApiModelProperty(required = true, value = "")
	public String getSharedKey() {
		return sharedKey;
	}

	public void setSharedKey(String sharedKey) {
		this.sharedKey = sharedKey;
	}

	public TwoFactorAuthenticatorConfirm password(String password) {
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


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TwoFactorAuthenticatorConfirm twoFactorAuthenticatorConfirm = (TwoFactorAuthenticatorConfirm) o;
		return Objects.equals(this.code, twoFactorAuthenticatorConfirm.code) &&
				Objects.equals(this.sharedKey, twoFactorAuthenticatorConfirm.sharedKey) &&
				Objects.equals(this.password, twoFactorAuthenticatorConfirm.password);
	}

	@Override
	public int hashCode() {
		return Objects.hash(code, sharedKey, password);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TwoFactorAuthenticatorConfirm {\n");

		sb.append("    code: ").append(toIndentedString(code)).append("\n");
		sb.append("    sharedKey: ").append(toIndentedString(sharedKey)).append("\n");
		sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

