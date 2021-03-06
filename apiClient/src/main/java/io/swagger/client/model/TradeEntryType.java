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
 * Gets or Sets TradeEntryType
 */
@JsonAdapter(TradeEntryType.Adapter.class)
public enum TradeEntryType
{
	IN("In"),
	OUT("Out"),
	INOUT("InOut"),
	OUTBY("OutBy");

	public static TradeEntryType fromValue(String text) {
		for (TradeEntryType b : TradeEntryType.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}

	private String value;

	TradeEntryType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

	public static class Adapter extends TypeAdapter<TradeEntryType>
	{
		@Override
		public void write(final JsonWriter jsonWriter, final TradeEntryType enumeration) throws IOException {
			jsonWriter.value(enumeration.getValue());
		}

		@Override
		public TradeEntryType read(final JsonReader jsonReader) throws IOException {
			String value = jsonReader.nextString();
			return TradeEntryType.fromValue(String.valueOf(value));
		}
	}
}
