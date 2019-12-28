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

import org.joda.time.DateTime;

import java.util.Objects;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * PlatformEvent
 */


public class PlatformEvent implements Parcelable
{
	public static final Parcelable.Creator<PlatformEvent> CREATOR = new Parcelable.Creator<PlatformEvent>()
	{
		public PlatformEvent createFromParcel(Parcel in) {
			return new PlatformEvent(in);
		}

		public PlatformEvent[] newArray(int size) {
			return new PlatformEvent[size];
		}
	};

	@SerializedName("title")
	private String title = null;

	@SerializedName("text")
	private String text = null;

	@SerializedName("icon")
	private String icon = null;

	@SerializedName("assetUrl")
	private String assetUrl = null;

	@SerializedName("userUrl")
	private String userUrl = null;

	@SerializedName("value")
	private String value = null;

	@SerializedName("date")
	private DateTime date = null;

	@SerializedName("type")
	private PlatformEventType type = null;

	public PlatformEvent() {
	}

	PlatformEvent(Parcel in) {
		title = (String) in.readValue(null);
		text = (String) in.readValue(null);
		icon = (String) in.readValue(null);
		assetUrl = (String) in.readValue(null);
		userUrl = (String) in.readValue(null);
		value = (String) in.readValue(null);
		date = (DateTime) in.readValue(DateTime.class.getClassLoader());
		type = (PlatformEventType) in.readValue(PlatformEventType.class.getClassLoader());
	}

	public PlatformEvent title(String title) {
		this.title = title;
		return this;
	}

	/**
	 * Get title
	 *
	 * @return title
	 **/
	@Schema(description = "")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public PlatformEvent text(String text) {
		this.text = text;
		return this;
	}

	/**
	 * Get text
	 *
	 * @return text
	 **/
	@Schema(description = "")
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public PlatformEvent icon(String icon) {
		this.icon = icon;
		return this;
	}

	/**
	 * Get icon
	 *
	 * @return icon
	 **/
	@Schema(description = "")
	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public PlatformEvent assetUrl(String assetUrl) {
		this.assetUrl = assetUrl;
		return this;
	}

	/**
	 * Get assetUrl
	 *
	 * @return assetUrl
	 **/
	@Schema(description = "")
	public String getAssetUrl() {
		return assetUrl;
	}

	public void setAssetUrl(String assetUrl) {
		this.assetUrl = assetUrl;
	}

	public PlatformEvent userUrl(String userUrl) {
		this.userUrl = userUrl;
		return this;
	}

	/**
	 * Get userUrl
	 *
	 * @return userUrl
	 **/
	@Schema(description = "")
	public String getUserUrl() {
		return userUrl;
	}

	public void setUserUrl(String userUrl) {
		this.userUrl = userUrl;
	}

	public PlatformEvent value(String value) {
		this.value = value;
		return this;
	}

	/**
	 * Get value
	 *
	 * @return value
	 **/
	@Schema(description = "")
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public PlatformEvent date(DateTime date) {
		this.date = date;
		return this;
	}

	/**
	 * Get date
	 *
	 * @return date
	 **/
	@Schema(description = "")
	public DateTime getDate() {
		return date;
	}

	public void setDate(DateTime date) {
		this.date = date;
	}

	public PlatformEvent type(PlatformEventType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 *
	 * @return type
	 **/
	@Schema(description = "")
	public PlatformEventType getType() {
		return type;
	}

	public void setType(PlatformEventType type) {
		this.type = type;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PlatformEvent platformEvent = (PlatformEvent) o;
		return Objects.equals(this.title, platformEvent.title) &&
				Objects.equals(this.text, platformEvent.text) &&
				Objects.equals(this.icon, platformEvent.icon) &&
				Objects.equals(this.assetUrl, platformEvent.assetUrl) &&
				Objects.equals(this.userUrl, platformEvent.userUrl) &&
				Objects.equals(this.value, platformEvent.value) &&
				Objects.equals(this.date, platformEvent.date) &&
				Objects.equals(this.type, platformEvent.type);
	}

	@Override
	public int hashCode() {
		return Objects.hash(title, text, icon, assetUrl, userUrl, value, date, type);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PlatformEvent {\n");

		sb.append("    title: ").append(toIndentedString(title)).append("\n");
		sb.append("    text: ").append(toIndentedString(text)).append("\n");
		sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
		sb.append("    assetUrl: ").append(toIndentedString(assetUrl)).append("\n");
		sb.append("    userUrl: ").append(toIndentedString(userUrl)).append("\n");
		sb.append("    value: ").append(toIndentedString(value)).append("\n");
		sb.append("    date: ").append(toIndentedString(date)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
		out.writeValue(text);
		out.writeValue(icon);
		out.writeValue(assetUrl);
		out.writeValue(userUrl);
		out.writeValue(value);
		out.writeValue(date);
		out.writeValue(type);
	}

	public int describeContents() {
		return 0;
	}
}
