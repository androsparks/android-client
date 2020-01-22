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
 * Enums
 */


public class Enums implements Parcelable
{
	public static final Parcelable.Creator<Enums> CREATOR = new Parcelable.Creator<Enums>()
	{
		public Enums createFromParcel(Parcel in) {
			return new Enums(in);
		}

		public Enums[] newArray(int size) {
			return new Enums[size];
		}
	};

	@SerializedName("event")
	private EventFilters event = null;

	public Enums() {
	}

	Enums(Parcel in) {
		event = (EventFilters) in.readValue(EventFilters.class.getClassLoader());
	}

	public Enums event(EventFilters event) {
		this.event = event;
		return this;
	}

	/**
	 * Get event
	 *
	 * @return event
	 **/
	@Schema(description = "")
	public EventFilters getEvent() {
		return event;
	}

	public void setEvent(EventFilters event) {
		this.event = event;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Enums enums = (Enums) o;
		return Objects.equals(this.event, enums.event);
	}

	@Override
	public int hashCode() {
		return Objects.hash(event);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Enums {\n");

		sb.append("    event: ").append(toIndentedString(event)).append("\n");
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
		out.writeValue(event);
	}

	public int describeContents() {
		return 0;
	}
}