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
 * Post
 */


public class Post implements Parcelable
{
	public static final Parcelable.Creator<Post> CREATOR = new Parcelable.Creator<Post>()
	{
		public Post createFromParcel(Parcel in) {
			return new Post(in);
		}

		public Post[] newArray(int size) {
			return new Post[size];
		}
	};

	@SerializedName("id")
	private UUID id = null;

	@SerializedName("text")
	private String text = null;

	@SerializedName("date")
	private DateTime date = null;

	@SerializedName("likesCount")
	private Integer likesCount = null;

	@SerializedName("rePostsCount")
	private Integer rePostsCount = null;

	@SerializedName("impressionsCount")
	private Integer impressionsCount = null;

	@SerializedName("isPinned")
	private Boolean isPinned = null;

	@SerializedName("isDeleted")
	private Boolean isDeleted = null;

	@SerializedName("images")
	private List<PostImage> images = null;

	@SerializedName("tags")
	private List<PostTag> tags = null;

	@SerializedName("author")
	private ProfilePublic author = null;

	@SerializedName("actions")
	private PostActions actions = null;

	@SerializedName("comments")
	private List<Post> comments = null;

	public Post() {
	}

	Post(Parcel in) {
		id = (UUID) in.readValue(UUID.class.getClassLoader());
		text = (String) in.readValue(null);
		date = (DateTime) in.readValue(DateTime.class.getClassLoader());
		likesCount = (Integer) in.readValue(null);
		rePostsCount = (Integer) in.readValue(null);
		impressionsCount = (Integer) in.readValue(null);
		isPinned = (Boolean) in.readValue(null);
		isDeleted = (Boolean) in.readValue(null);
		images = (List<PostImage>) in.readValue(PostImage.class.getClassLoader());
		tags = (List<PostTag>) in.readValue(PostTag.class.getClassLoader());
		author = (ProfilePublic) in.readValue(ProfilePublic.class.getClassLoader());
		actions = (PostActions) in.readValue(PostActions.class.getClassLoader());
		comments = (List<Post>) in.readValue(Post.class.getClassLoader());
	}

	public Post id(UUID id) {
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

	public Post text(String text) {
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

	public Post date(DateTime date) {
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

	public Post likesCount(Integer likesCount) {
		this.likesCount = likesCount;
		return this;
	}

	/**
	 * Get likesCount
	 *
	 * @return likesCount
	 **/
	@Schema(description = "")
	public Integer getLikesCount() {
		return likesCount;
	}

	public void setLikesCount(Integer likesCount) {
		this.likesCount = likesCount;
	}

	public Post rePostsCount(Integer rePostsCount) {
		this.rePostsCount = rePostsCount;
		return this;
	}

	/**
	 * Get rePostsCount
	 *
	 * @return rePostsCount
	 **/
	@Schema(description = "")
	public Integer getRePostsCount() {
		return rePostsCount;
	}

	public void setRePostsCount(Integer rePostsCount) {
		this.rePostsCount = rePostsCount;
	}

	public Post impressionsCount(Integer impressionsCount) {
		this.impressionsCount = impressionsCount;
		return this;
	}

	/**
	 * Get impressionsCount
	 *
	 * @return impressionsCount
	 **/
	@Schema(description = "")
	public Integer getImpressionsCount() {
		return impressionsCount;
	}

	public void setImpressionsCount(Integer impressionsCount) {
		this.impressionsCount = impressionsCount;
	}

	public Post isPinned(Boolean isPinned) {
		this.isPinned = isPinned;
		return this;
	}

	/**
	 * Get isPinned
	 *
	 * @return isPinned
	 **/
	@Schema(description = "")
	public Boolean isIsPinned() {
		return isPinned;
	}

	public void setIsPinned(Boolean isPinned) {
		this.isPinned = isPinned;
	}

	public Post isDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
		return this;
	}

	/**
	 * Get isDeleted
	 *
	 * @return isDeleted
	 **/
	@Schema(description = "")
	public Boolean isIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Post images(List<PostImage> images) {
		this.images = images;
		return this;
	}

	public Post addImagesItem(PostImage imagesItem) {
		if (this.images == null) {
			this.images = new ArrayList<PostImage>();
		}
		this.images.add(imagesItem);
		return this;
	}

	/**
	 * Get images
	 *
	 * @return images
	 **/
	@Schema(description = "")
	public List<PostImage> getImages() {
		return images;
	}

	public void setImages(List<PostImage> images) {
		this.images = images;
	}

	public Post tags(List<PostTag> tags) {
		this.tags = tags;
		return this;
	}

	public Post addTagsItem(PostTag tagsItem) {
		if (this.tags == null) {
			this.tags = new ArrayList<PostTag>();
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
	public List<PostTag> getTags() {
		return tags;
	}

	public void setTags(List<PostTag> tags) {
		this.tags = tags;
	}

	public Post author(ProfilePublic author) {
		this.author = author;
		return this;
	}

	/**
	 * Get author
	 *
	 * @return author
	 **/
	@Schema(description = "")
	public ProfilePublic getAuthor() {
		return author;
	}

	public void setAuthor(ProfilePublic author) {
		this.author = author;
	}

	public Post actions(PostActions actions) {
		this.actions = actions;
		return this;
	}

	/**
	 * Get actions
	 *
	 * @return actions
	 **/
	@Schema(description = "")
	public PostActions getActions() {
		return actions;
	}

	public void setActions(PostActions actions) {
		this.actions = actions;
	}

	public Post comments(List<Post> comments) {
		this.comments = comments;
		return this;
	}

	public Post addCommentsItem(Post commentsItem) {
		if (this.comments == null) {
			this.comments = new ArrayList<Post>();
		}
		this.comments.add(commentsItem);
		return this;
	}

	/**
	 * Get comments
	 *
	 * @return comments
	 **/
	@Schema(description = "")
	public List<Post> getComments() {
		return comments;
	}

	public void setComments(List<Post> comments) {
		this.comments = comments;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Post post = (Post) o;
		return Objects.equals(this.id, post.id) &&
				Objects.equals(this.text, post.text) &&
				Objects.equals(this.date, post.date) &&
				Objects.equals(this.likesCount, post.likesCount) &&
				Objects.equals(this.rePostsCount, post.rePostsCount) &&
				Objects.equals(this.impressionsCount, post.impressionsCount) &&
				Objects.equals(this.isPinned, post.isPinned) &&
				Objects.equals(this.isDeleted, post.isDeleted) &&
				Objects.equals(this.images, post.images) &&
				Objects.equals(this.tags, post.tags) &&
				Objects.equals(this.author, post.author) &&
				Objects.equals(this.actions, post.actions) &&
				Objects.equals(this.comments, post.comments);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, text, date, likesCount, rePostsCount, impressionsCount, isPinned, isDeleted, images, tags, author, actions, comments);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Post {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    text: ").append(toIndentedString(text)).append("\n");
		sb.append("    date: ").append(toIndentedString(date)).append("\n");
		sb.append("    likesCount: ").append(toIndentedString(likesCount)).append("\n");
		sb.append("    rePostsCount: ").append(toIndentedString(rePostsCount)).append("\n");
		sb.append("    impressionsCount: ").append(toIndentedString(impressionsCount)).append("\n");
		sb.append("    isPinned: ").append(toIndentedString(isPinned)).append("\n");
		sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
		sb.append("    images: ").append(toIndentedString(images)).append("\n");
		sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
		sb.append("    author: ").append(toIndentedString(author)).append("\n");
		sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
		sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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
		out.writeValue(text);
		out.writeValue(date);
		out.writeValue(likesCount);
		out.writeValue(rePostsCount);
		out.writeValue(impressionsCount);
		out.writeValue(isPinned);
		out.writeValue(isDeleted);
		out.writeValue(images);
		out.writeValue(tags);
		out.writeValue(author);
		out.writeValue(actions);
		out.writeValue(comments);
	}

	public int describeContents() {
		return 0;
	}
}