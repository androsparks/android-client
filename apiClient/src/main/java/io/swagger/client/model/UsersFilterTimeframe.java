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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * Gets or Sets UsersFilterTimeframe
 */
@JsonAdapter(UsersFilterTimeframe.Adapter.class)
public enum UsersFilterTimeframe
{
	DAY("Day"),
	WEEK("Week"),
	MONTH("Month");

	public static UsersFilterTimeframe fromValue(String text) {
		for (UsersFilterTimeframe b : UsersFilterTimeframe.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}

	private String value;

	UsersFilterTimeframe(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

	public static class Adapter extends TypeAdapter<UsersFilterTimeframe>
	{
		@Override
		public void write(final JsonWriter jsonWriter, final UsersFilterTimeframe enumeration) throws IOException {
			jsonWriter.value(enumeration.getValue());
		}

		@Override
		public UsersFilterTimeframe read(final JsonReader jsonReader) throws IOException {
			String value = jsonReader.nextString();
			return UsersFilterTimeframe.fromValue(String.valueOf(value));
		}
	}
}
