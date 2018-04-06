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
 * TwoFactorAuthenticator
 */

public class TwoFactorAuthenticator
{
	@SerializedName("sharedKey")
	private String sharedKey = null;

	@SerializedName("authenticatorUri")
	private String authenticatorUri = null;

	public TwoFactorAuthenticator sharedKey(String sharedKey) {
		this.sharedKey = sharedKey;
		return this;
	}

	/**
	 * Get sharedKey
	 *
	 * @return sharedKey
	 **/
	@ApiModelProperty(value = "")
	public String getSharedKey() {
		return sharedKey;
	}

	public void setSharedKey(String sharedKey) {
		this.sharedKey = sharedKey;
	}

	public TwoFactorAuthenticator authenticatorUri(String authenticatorUri) {
		this.authenticatorUri = authenticatorUri;
		return this;
	}

	/**
	 * Get authenticatorUri
	 *
	 * @return authenticatorUri
	 **/
	@ApiModelProperty(value = "")
	public String getAuthenticatorUri() {
		return authenticatorUri;
	}

	public void setAuthenticatorUri(String authenticatorUri) {
		this.authenticatorUri = authenticatorUri;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TwoFactorAuthenticator twoFactorAuthenticator = (TwoFactorAuthenticator) o;
		return Objects.equals(this.sharedKey, twoFactorAuthenticator.sharedKey) &&
				Objects.equals(this.authenticatorUri, twoFactorAuthenticator.authenticatorUri);
	}

	@Override
	public int hashCode() {
		return Objects.hash(sharedKey, authenticatorUri);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TwoFactorAuthenticator {\n");

		sb.append("    sharedKey: ").append(toIndentedString(sharedKey)).append("\n");
		sb.append("    authenticatorUri: ").append(toIndentedString(authenticatorUri)).append("\n");
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

