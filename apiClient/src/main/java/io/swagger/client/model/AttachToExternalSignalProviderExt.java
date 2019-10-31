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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.Objects;
import java.util.UUID;

import io.swagger.v3.oas.annotations.media.Schema;
/**
 * AttachToExternalSignalProviderExt
 */


public class AttachToExternalSignalProviderExt implements Parcelable
{
	public static final Parcelable.Creator<AttachToExternalSignalProviderExt> CREATOR = new Parcelable.Creator<AttachToExternalSignalProviderExt>()
	{
		public AttachToExternalSignalProviderExt createFromParcel(Parcel in) {
			return new AttachToExternalSignalProviderExt(in);
		}

		public AttachToExternalSignalProviderExt[] newArray(int size) {
			return new AttachToExternalSignalProviderExt[size];
		}
	};

	@SerializedName("externalKeyId")
	private UUID externalKeyId = null;

	@SerializedName("mode")
	private SubscriptionMode mode = null;

	@SerializedName("percent")
	private Double percent = null;

	@SerializedName("openTolerancePercent")
	private Double openTolerancePercent = null;

	@SerializedName("fixedVolume")
	private Double fixedVolume = null;

	@SerializedName("fixedCurrency")
	private FixedCurrencyEnum fixedCurrency = null;

	public AttachToExternalSignalProviderExt() {
	}

	AttachToExternalSignalProviderExt(Parcel in) {
		externalKeyId = (UUID) in.readValue(UUID.class.getClassLoader());
		mode = (SubscriptionMode) in.readValue(SubscriptionMode.class.getClassLoader());
		percent = (Double) in.readValue(null);
		openTolerancePercent = (Double) in.readValue(null);
		fixedVolume = (Double) in.readValue(null);
		fixedCurrency = (FixedCurrencyEnum) in.readValue(null);
	}

	public AttachToExternalSignalProviderExt externalKeyId(UUID externalKeyId) {
		this.externalKeyId = externalKeyId;
		return this;
	}

	/**
	 * Get externalKeyId
	 *
	 * @return externalKeyId
	 **/
	@Schema(description = "")
	public UUID getExternalKeyId() {
		return externalKeyId;
	}

	public void setExternalKeyId(UUID externalKeyId) {
		this.externalKeyId = externalKeyId;
	}

	public AttachToExternalSignalProviderExt mode(SubscriptionMode mode) {
		this.mode = mode;
		return this;
	}

	/**
	 * Get mode
	 *
	 * @return mode
	 **/
	@Schema(description = "")
	public SubscriptionMode getMode() {
		return mode;
	}

	public void setMode(SubscriptionMode mode) {
		this.mode = mode;
	}

	public AttachToExternalSignalProviderExt percent(Double percent) {
		this.percent = percent;
		return this;
	}

	/**
	 * Get percent
	 *
	 * @return percent
	 **/
	@Schema(description = "")
	public Double getPercent() {
		return percent;
	}

	public void setPercent(Double percent) {
		this.percent = percent;
	}

	public AttachToExternalSignalProviderExt openTolerancePercent(Double openTolerancePercent) {
		this.openTolerancePercent = openTolerancePercent;
		return this;
	}

	/**
	 * Get openTolerancePercent
	 *
	 * @return openTolerancePercent
	 **/
	@Schema(description = "")
	public Double getOpenTolerancePercent() {
		return openTolerancePercent;
	}

	public void setOpenTolerancePercent(Double openTolerancePercent) {
		this.openTolerancePercent = openTolerancePercent;
	}

	public AttachToExternalSignalProviderExt fixedVolume(Double fixedVolume) {
		this.fixedVolume = fixedVolume;
		return this;
	}

	/**
	 * Get fixedVolume
	 *
	 * @return fixedVolume
	 **/
	@Schema(description = "")
	public Double getFixedVolume() {
		return fixedVolume;
	}

	public void setFixedVolume(Double fixedVolume) {
		this.fixedVolume = fixedVolume;
	}

	public AttachToExternalSignalProviderExt fixedCurrency(FixedCurrencyEnum fixedCurrency) {
		this.fixedCurrency = fixedCurrency;
		return this;
	}

	/**
	 * Get fixedCurrency
	 *
	 * @return fixedCurrency
	 **/
	@Schema(description = "")
	public FixedCurrencyEnum getFixedCurrency() {
		return fixedCurrency;
	}

	public void setFixedCurrency(FixedCurrencyEnum fixedCurrency) {
		this.fixedCurrency = fixedCurrency;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AttachToExternalSignalProviderExt attachToExternalSignalProviderExt = (AttachToExternalSignalProviderExt) o;
		return Objects.equals(this.externalKeyId, attachToExternalSignalProviderExt.externalKeyId) &&
				Objects.equals(this.mode, attachToExternalSignalProviderExt.mode) &&
				Objects.equals(this.percent, attachToExternalSignalProviderExt.percent) &&
				Objects.equals(this.openTolerancePercent, attachToExternalSignalProviderExt.openTolerancePercent) &&
				Objects.equals(this.fixedVolume, attachToExternalSignalProviderExt.fixedVolume) &&
				Objects.equals(this.fixedCurrency, attachToExternalSignalProviderExt.fixedCurrency);
	}

	@Override
	public int hashCode() {
		return Objects.hash(externalKeyId, mode, percent, openTolerancePercent, fixedVolume, fixedCurrency);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AttachToExternalSignalProviderExt {\n");

		sb.append("    externalKeyId: ").append(toIndentedString(externalKeyId)).append("\n");
		sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
		sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
		sb.append("    openTolerancePercent: ").append(toIndentedString(openTolerancePercent)).append("\n");
		sb.append("    fixedVolume: ").append(toIndentedString(fixedVolume)).append("\n");
		sb.append("    fixedCurrency: ").append(toIndentedString(fixedCurrency)).append("\n");
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
		out.writeValue(externalKeyId);
		out.writeValue(mode);
		out.writeValue(percent);
		out.writeValue(openTolerancePercent);
		out.writeValue(fixedVolume);
		out.writeValue(fixedCurrency);
	}

	public int describeContents() {
		return 0;
	}

	/**
	 * Gets or Sets fixedCurrency
	 */
	@JsonAdapter(FixedCurrencyEnum.Adapter.class)
	public enum FixedCurrencyEnum
	{
		UNDEFINED("Undefined"),
		GVT("GVT"),
		ETH("ETH"),
		BTC("BTC"),
		ADA("ADA"),
		USDT("USDT"),
		XRP("XRP"),
		BCH("BCH"),
		LTC("LTC"),
		DOGE("DOGE"),
		BNB("BNB"),
		USD("USD"),
		EUR("EUR");

		public static FixedCurrencyEnum fromValue(String text) {
			for (FixedCurrencyEnum b : FixedCurrencyEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}

		private String value;

		FixedCurrencyEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static class Adapter extends TypeAdapter<FixedCurrencyEnum>
		{
			@Override
			public void write(final JsonWriter jsonWriter, final FixedCurrencyEnum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			@Override
			public FixedCurrencyEnum read(final JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return FixedCurrencyEnum.fromValue(String.valueOf(value));
			}
		}
	}
}