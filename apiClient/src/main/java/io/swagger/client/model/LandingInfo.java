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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * LandingInfo
 */


public class LandingInfo implements Parcelable
{
	public static final Parcelable.Creator<LandingInfo> CREATOR = new Parcelable.Creator<LandingInfo>()
	{
		public LandingInfo createFromParcel(Parcel in) {
			return new LandingInfo(in);
		}

		public LandingInfo[] newArray(int size) {
			return new LandingInfo[size];
		}
	};

	@SerializedName("events")
	private List<PlatformEvent> events = null;

	@SerializedName("news")
	private List<PlatformNews> news = null;

	@SerializedName("follows")
	private ItemsViewModelFollowDetailsListItem follows = null;

	@SerializedName("programs")
	private ItemsViewModelProgramDetailsListItem programs = null;

	@SerializedName("funds")
	private ItemsViewModelFundDetailsListItem funds = null;

	public LandingInfo() {
	}

	LandingInfo(Parcel in) {
		events = (List<PlatformEvent>) in.readValue(PlatformEvent.class.getClassLoader());
		news = (List<PlatformNews>) in.readValue(PlatformNews.class.getClassLoader());
		follows = (ItemsViewModelFollowDetailsListItem) in.readValue(ItemsViewModelFollowDetailsListItem.class.getClassLoader());
		programs = (ItemsViewModelProgramDetailsListItem) in.readValue(ItemsViewModelProgramDetailsListItem.class.getClassLoader());
		funds = (ItemsViewModelFundDetailsListItem) in.readValue(ItemsViewModelFundDetailsListItem.class.getClassLoader());
	}

	public LandingInfo events(List<PlatformEvent> events) {
		this.events = events;
		return this;
	}

	public LandingInfo addEventsItem(PlatformEvent eventsItem) {
		if (this.events == null) {
			this.events = new ArrayList<PlatformEvent>();
		}
		this.events.add(eventsItem);
		return this;
	}

	/**
	 * Get events
	 *
	 * @return events
	 **/
	@Schema(description = "")
	public List<PlatformEvent> getEvents() {
		return events;
	}

	public void setEvents(List<PlatformEvent> events) {
		this.events = events;
	}

	public LandingInfo news(List<PlatformNews> news) {
		this.news = news;
		return this;
	}

	public LandingInfo addNewsItem(PlatformNews newsItem) {
		if (this.news == null) {
			this.news = new ArrayList<PlatformNews>();
		}
		this.news.add(newsItem);
		return this;
	}

	/**
	 * Get news
	 *
	 * @return news
	 **/
	@Schema(description = "")
	public List<PlatformNews> getNews() {
		return news;
	}

	public void setNews(List<PlatformNews> news) {
		this.news = news;
	}

	public LandingInfo follows(ItemsViewModelFollowDetailsListItem follows) {
		this.follows = follows;
		return this;
	}

	/**
	 * Get follows
	 *
	 * @return follows
	 **/
	@Schema(description = "")
	public ItemsViewModelFollowDetailsListItem getFollows() {
		return follows;
	}

	public void setFollows(ItemsViewModelFollowDetailsListItem follows) {
		this.follows = follows;
	}

	public LandingInfo programs(ItemsViewModelProgramDetailsListItem programs) {
		this.programs = programs;
		return this;
	}

	/**
	 * Get programs
	 *
	 * @return programs
	 **/
	@Schema(description = "")
	public ItemsViewModelProgramDetailsListItem getPrograms() {
		return programs;
	}

	public void setPrograms(ItemsViewModelProgramDetailsListItem programs) {
		this.programs = programs;
	}

	public LandingInfo funds(ItemsViewModelFundDetailsListItem funds) {
		this.funds = funds;
		return this;
	}

	/**
	 * Get funds
	 *
	 * @return funds
	 **/
	@Schema(description = "")
	public ItemsViewModelFundDetailsListItem getFunds() {
		return funds;
	}

	public void setFunds(ItemsViewModelFundDetailsListItem funds) {
		this.funds = funds;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		LandingInfo landingInfo = (LandingInfo) o;
		return Objects.equals(this.events, landingInfo.events) &&
				Objects.equals(this.news, landingInfo.news) &&
				Objects.equals(this.follows, landingInfo.follows) &&
				Objects.equals(this.programs, landingInfo.programs) &&
				Objects.equals(this.funds, landingInfo.funds);
	}

	@Override
	public int hashCode() {
		return Objects.hash(events, news, follows, programs, funds);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LandingInfo {\n");

		sb.append("    events: ").append(toIndentedString(events)).append("\n");
		sb.append("    news: ").append(toIndentedString(news)).append("\n");
		sb.append("    follows: ").append(toIndentedString(follows)).append("\n");
		sb.append("    programs: ").append(toIndentedString(programs)).append("\n");
		sb.append("    funds: ").append(toIndentedString(funds)).append("\n");
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
		out.writeValue(events);
		out.writeValue(news);
		out.writeValue(follows);
		out.writeValue(programs);
		out.writeValue(funds);
	}

	public int describeContents() {
		return 0;
	}
}
