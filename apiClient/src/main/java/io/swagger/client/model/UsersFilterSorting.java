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
 * Gets or Sets UsersFilterSorting
 */
@JsonAdapter(UsersFilterSorting.Adapter.class)
public enum UsersFilterSorting
{
	BYNAMEASC("ByNameAsc"),
	BYNAMEDESC("ByNameDesc"),
	BYAGEASC("ByAgeAsc"),
	BYAGEDESC("ByAgeDesc"),
	BYAUMASC("ByAumAsc"),
	BYAUMDESC("ByAumDesc"),
	BYFOLLOWERSASC("ByFollowersAsc"),
	BYFOLLOWERSDESC("ByFollowersDesc"),
	BYINVESTORSASC("ByInvestorsAsc"),
	BYINVESTORSDESC("ByInvestorsDesc"),
	BYPOPULARITYASC("ByPopularityAsc"),
	BYPOPULARITYDESC("ByPopularityDesc"),
	BYPROFITASC("ByProfitAsc"),
	BYPROFITDESC("ByProfitDesc");

	public static UsersFilterSorting fromValue(String text) {
		for (UsersFilterSorting b : UsersFilterSorting.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}

	private String value;

	UsersFilterSorting(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

	public static class Adapter extends TypeAdapter<UsersFilterSorting>
	{
		@Override
		public void write(final JsonWriter jsonWriter, final UsersFilterSorting enumeration) throws IOException {
			jsonWriter.value(enumeration.getValue());
		}

		@Override
		public UsersFilterSorting read(final JsonReader jsonReader) throws IOException {
			String value = jsonReader.nextString();
			return UsersFilterSorting.fromValue(String.valueOf(value));
		}
	}
}
