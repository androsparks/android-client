/*
 * Core API v2.0
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v2.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;
import java.util.UUID;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ExternalKeyAddViewModel
 */


public class ExternalKeyAddViewModel implements Parcelable
{
	public static final Parcelable.Creator<ExternalKeyAddViewModel> CREATOR = new Parcelable.Creator<ExternalKeyAddViewModel>()
	{
		public ExternalKeyAddViewModel createFromParcel(Parcel in) {
			return new ExternalKeyAddViewModel(in);
		}

		public ExternalKeyAddViewModel[] newArray(int size) {
			return new ExternalKeyAddViewModel[size];
		}
	};

	@SerializedName("title")
	private String title = null;

	@SerializedName("exchangeId")
	private UUID exchangeId = null;

	@SerializedName("key")
	private String key = null;

	@SerializedName("secret")
	private String secret = null;

	public ExternalKeyAddViewModel() {
	}

	ExternalKeyAddViewModel(Parcel in) {
		title = (String) in.readValue(null);
		exchangeId = (UUID) in.readValue(UUID.class.getClassLoader());
		key = (String) in.readValue(null);
		secret = (String) in.readValue(null);
	}

	public ExternalKeyAddViewModel title(String title) {
		this.title = title;
		return this;
	}

	/**
	 * Get title
	 *
	 * @return title
	 **/
	@Schema(required = true, description = "")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public ExternalKeyAddViewModel exchangeId(UUID exchangeId) {
		this.exchangeId = exchangeId;
		return this;
	}

	/**
	 * Get exchangeId
	 *
	 * @return exchangeId
	 **/
	@Schema(required = true, description = "")
	public UUID getExchangeId() {
		return exchangeId;
	}

	public void setExchangeId(UUID exchangeId) {
		this.exchangeId = exchangeId;
	}

	public ExternalKeyAddViewModel key(String key) {
		this.key = key;
		return this;
	}

	/**
	 * Get key
	 *
	 * @return key
	 **/
	@Schema(required = true, description = "")
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public ExternalKeyAddViewModel secret(String secret) {
		this.secret = secret;
		return this;
	}

	/**
	 * Get secret
	 *
	 * @return secret
	 **/
	@Schema(description = "")
	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ExternalKeyAddViewModel externalKeyAddViewModel = (ExternalKeyAddViewModel) o;
		return Objects.equals(this.title, externalKeyAddViewModel.title) &&
				Objects.equals(this.exchangeId, externalKeyAddViewModel.exchangeId) &&
				Objects.equals(this.key, externalKeyAddViewModel.key) &&
				Objects.equals(this.secret, externalKeyAddViewModel.secret);
	}

	@Override
	public int hashCode() {
		return Objects.hash(title, exchangeId, key, secret);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ExternalKeyAddViewModel {\n");

		sb.append("    title: ").append(toIndentedString(title)).append("\n");
		sb.append("    exchangeId: ").append(toIndentedString(exchangeId)).append("\n");
		sb.append("    key: ").append(toIndentedString(key)).append("\n");
		sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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

	public void writeToParcel(Parcel out, int flags) {
		out.writeValue(title);
		out.writeValue(exchangeId);
		out.writeValue(key);
		out.writeValue(secret);
	}

	public int describeContents() {
		return 0;
	}
}
