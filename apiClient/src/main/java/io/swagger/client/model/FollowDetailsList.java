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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * FollowDetailsList
 */


public class FollowDetailsList implements Parcelable
{
	public static final Parcelable.Creator<FollowDetailsList> CREATOR = new Parcelable.Creator<FollowDetailsList>()
	{
		public FollowDetailsList createFromParcel(Parcel in) {
			return new FollowDetailsList(in);
		}

		public FollowDetailsList[] newArray(int size) {
			return new FollowDetailsList[size];
		}
	};

	@SerializedName("id")
	private UUID id = null;

	@SerializedName("title")
	private String title = null;

	@SerializedName("description")
	private String description = null;

	@SerializedName("logo")
	private String logo = null;

	@SerializedName("creationDate")
	private DateTime creationDate = null;

	@SerializedName("currency")
	private Currency currency = null;

	@SerializedName("subscribersCount")
	private Integer subscribersCount = null;

	@SerializedName("tradesCount")
	private Integer tradesCount = null;

	@SerializedName("status")
	private String status = null;

	@SerializedName("url")
	private String url = null;

	@SerializedName("color")
	private String color = null;

	@SerializedName("owner")
	private ProfilePublicShort owner = null;

	@SerializedName("statistic")
	private ProfitChart statistic = null;

	@SerializedName("personalDetails")
	private PersonalFollowDetailsList personalDetails = null;

	@SerializedName("tags")
	private List<Tag> tags = null;

	public FollowDetailsList() {
	}

	FollowDetailsList(Parcel in) {
		id = (UUID) in.readValue(UUID.class.getClassLoader());
		title = (String) in.readValue(null);
		description = (String) in.readValue(null);
		logo = (String) in.readValue(null);
		creationDate = (DateTime) in.readValue(DateTime.class.getClassLoader());
		currency = (Currency) in.readValue(Currency.class.getClassLoader());
		subscribersCount = (Integer) in.readValue(null);
		tradesCount = (Integer) in.readValue(null);
		status = (String) in.readValue(null);
		url = (String) in.readValue(null);
		color = (String) in.readValue(null);
		owner = (ProfilePublicShort) in.readValue(ProfilePublicShort.class.getClassLoader());
		statistic = (ProfitChart) in.readValue(ProfitChart.class.getClassLoader());
		personalDetails = (PersonalFollowDetailsList) in.readValue(PersonalFollowDetailsList.class.getClassLoader());
		tags = (List<Tag>) in.readValue(Tag.class.getClassLoader());
	}

	public FollowDetailsList id(UUID id) {
		this.id = id;
		return this;
	}

	/**
	 * Get id
	 *
	 * @return id
	 **/
	@Schema(description = "")
	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public FollowDetailsList title(String title) {
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

	public FollowDetailsList description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Get description
	 *
	 * @return description
	 **/
	@Schema(description = "")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public FollowDetailsList logo(String logo) {
		this.logo = logo;
		return this;
	}

	/**
	 * Get logo
	 *
	 * @return logo
	 **/
	@Schema(description = "")
	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public FollowDetailsList creationDate(DateTime creationDate) {
		this.creationDate = creationDate;
		return this;
	}

	/**
	 * Get creationDate
	 *
	 * @return creationDate
	 **/
	@Schema(description = "")
	public DateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(DateTime creationDate) {
		this.creationDate = creationDate;
	}

	public FollowDetailsList currency(Currency currency) {
		this.currency = currency;
		return this;
	}

	/**
	 * Get currency
	 *
	 * @return currency
	 **/
	@Schema(description = "")
	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public FollowDetailsList subscribersCount(Integer subscribersCount) {
		this.subscribersCount = subscribersCount;
		return this;
	}

	/**
	 * Get subscribersCount
	 *
	 * @return subscribersCount
	 **/
	@Schema(description = "")
	public Integer getSubscribersCount() {
		return subscribersCount;
	}

	public void setSubscribersCount(Integer subscribersCount) {
		this.subscribersCount = subscribersCount;
	}

	public FollowDetailsList tradesCount(Integer tradesCount) {
		this.tradesCount = tradesCount;
		return this;
	}

	/**
	 * Get tradesCount
	 *
	 * @return tradesCount
	 **/
	@Schema(description = "")
	public Integer getTradesCount() {
		return tradesCount;
	}

	public void setTradesCount(Integer tradesCount) {
		this.tradesCount = tradesCount;
	}

	public FollowDetailsList status(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get status
	 *
	 * @return status
	 **/
	@Schema(description = "")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public FollowDetailsList url(String url) {
		this.url = url;
		return this;
	}

	/**
	 * Get url
	 *
	 * @return url
	 **/
	@Schema(description = "")
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public FollowDetailsList color(String color) {
		this.color = color;
		return this;
	}

	/**
	 * Get color
	 *
	 * @return color
	 **/
	@Schema(description = "")
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public FollowDetailsList owner(ProfilePublicShort owner) {
		this.owner = owner;
		return this;
	}

	/**
	 * Get owner
	 *
	 * @return owner
	 **/
	@Schema(description = "")
	public ProfilePublicShort getOwner() {
		return owner;
	}

	public void setOwner(ProfilePublicShort owner) {
		this.owner = owner;
	}

	public FollowDetailsList statistic(ProfitChart statistic) {
		this.statistic = statistic;
		return this;
	}

	/**
	 * Get statistic
	 *
	 * @return statistic
	 **/
	@Schema(description = "")
	public ProfitChart getStatistic() {
		return statistic;
	}

	public void setStatistic(ProfitChart statistic) {
		this.statistic = statistic;
	}

	public FollowDetailsList personalDetails(PersonalFollowDetailsList personalDetails) {
		this.personalDetails = personalDetails;
		return this;
	}

	/**
	 * Get personalDetails
	 *
	 * @return personalDetails
	 **/
	@Schema(description = "")
	public PersonalFollowDetailsList getPersonalDetails() {
		return personalDetails;
	}

	public void setPersonalDetails(PersonalFollowDetailsList personalDetails) {
		this.personalDetails = personalDetails;
	}

	public FollowDetailsList tags(List<Tag> tags) {
		this.tags = tags;
		return this;
	}

	public FollowDetailsList addTagsItem(Tag tagsItem) {
		if (this.tags == null) {
			this.tags = new ArrayList<Tag>();
		}
		this.tags.add(tagsItem);
		return this;
	}

	/**
	 * Get tags
	 *
	 * @return tags
	 **/
	@Schema(description = "")
	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		FollowDetailsList followDetailsList = (FollowDetailsList) o;
		return Objects.equals(this.id, followDetailsList.id) &&
				Objects.equals(this.title, followDetailsList.title) &&
				Objects.equals(this.description, followDetailsList.description) &&
				Objects.equals(this.logo, followDetailsList.logo) &&
				Objects.equals(this.creationDate, followDetailsList.creationDate) &&
				Objects.equals(this.currency, followDetailsList.currency) &&
				Objects.equals(this.subscribersCount, followDetailsList.subscribersCount) &&
				Objects.equals(this.tradesCount, followDetailsList.tradesCount) &&
				Objects.equals(this.status, followDetailsList.status) &&
				Objects.equals(this.url, followDetailsList.url) &&
				Objects.equals(this.color, followDetailsList.color) &&
				Objects.equals(this.owner, followDetailsList.owner) &&
				Objects.equals(this.statistic, followDetailsList.statistic) &&
				Objects.equals(this.personalDetails, followDetailsList.personalDetails) &&
				Objects.equals(this.tags, followDetailsList.tags);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, title, description, logo, creationDate, currency, subscribersCount, tradesCount, status, url, color, owner, statistic, personalDetails, tags);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class FollowDetailsList {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    title: ").append(toIndentedString(title)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
		sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
		sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
		sb.append("    subscribersCount: ").append(toIndentedString(subscribersCount)).append("\n");
		sb.append("    tradesCount: ").append(toIndentedString(tradesCount)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    url: ").append(toIndentedString(url)).append("\n");
		sb.append("    color: ").append(toIndentedString(color)).append("\n");
		sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
		sb.append("    statistic: ").append(toIndentedString(statistic)).append("\n");
		sb.append("    personalDetails: ").append(toIndentedString(personalDetails)).append("\n");
		sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
		out.writeValue(id);
		out.writeValue(title);
		out.writeValue(description);
		out.writeValue(logo);
		out.writeValue(creationDate);
		out.writeValue(currency);
		out.writeValue(subscribersCount);
		out.writeValue(tradesCount);
		out.writeValue(status);
		out.writeValue(url);
		out.writeValue(color);
		out.writeValue(owner);
		out.writeValue(statistic);
		out.writeValue(personalDetails);
		out.writeValue(tags);
	}

	public int describeContents() {
		return 0;
	}
}
