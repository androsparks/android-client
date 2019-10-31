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

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * PersonalProgramDetailsList
 */


public class PersonalProgramDetailsList implements Parcelable
{
	public static final Parcelable.Creator<PersonalProgramDetailsList> CREATOR = new Parcelable.Creator<PersonalProgramDetailsList>()
	{
		public PersonalProgramDetailsList createFromParcel(Parcel in) {
			return new PersonalProgramDetailsList(in);
		}

		public PersonalProgramDetailsList[] newArray(int size) {
			return new PersonalProgramDetailsList[size];
		}
	};

	@SerializedName("isOwnProgram")
	private Boolean isOwnProgram = null;

	@SerializedName("isFavorite")
	private Boolean isFavorite = null;

	public PersonalProgramDetailsList() {
	}

	PersonalProgramDetailsList(Parcel in) {
		isOwnProgram = (Boolean) in.readValue(null);
		isFavorite = (Boolean) in.readValue(null);
	}

	public PersonalProgramDetailsList isOwnProgram(Boolean isOwnProgram) {
		this.isOwnProgram = isOwnProgram;
		return this;
	}

	/**
	 * Get isOwnProgram
	 *
	 * @return isOwnProgram
	 **/
	@Schema(description = "")
	public Boolean isIsOwnProgram() {
		return isOwnProgram;
	}

	public void setIsOwnProgram(Boolean isOwnProgram) {
		this.isOwnProgram = isOwnProgram;
	}

	public PersonalProgramDetailsList isFavorite(Boolean isFavorite) {
		this.isFavorite = isFavorite;
		return this;
	}

	/**
	 * Get isFavorite
	 *
	 * @return isFavorite
	 **/
	@Schema(description = "")
	public Boolean isIsFavorite() {
		return isFavorite;
	}

	public void setIsFavorite(Boolean isFavorite) {
		this.isFavorite = isFavorite;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PersonalProgramDetailsList personalProgramDetailsList = (PersonalProgramDetailsList) o;
		return Objects.equals(this.isOwnProgram, personalProgramDetailsList.isOwnProgram) &&
				Objects.equals(this.isFavorite, personalProgramDetailsList.isFavorite);
	}

	@Override
	public int hashCode() {
		return Objects.hash(isOwnProgram, isFavorite);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PersonalProgramDetailsList {\n");

		sb.append("    isOwnProgram: ").append(toIndentedString(isOwnProgram)).append("\n");
		sb.append("    isFavorite: ").append(toIndentedString(isFavorite)).append("\n");
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
		out.writeValue(isOwnProgram);
		out.writeValue(isFavorite);
	}

	public int describeContents() {
		return 0;
	}
}