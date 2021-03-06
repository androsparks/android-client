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
import java.util.UUID;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * EditPost
 */


public class EditPost implements Parcelable
{
	public static final Parcelable.Creator<EditPost> CREATOR = new Parcelable.Creator<EditPost>()
	{
		public EditPost createFromParcel(Parcel in) {
			return new EditPost(in);
		}

		public EditPost[] newArray(int size) {
			return new EditPost[size];
		}
	};

	@SerializedName("id")
	private UUID id = null;

	@SerializedName("text")
	private String text = null;

	@SerializedName("postId")
	private UUID postId = null;

	@SerializedName("userId")
	private UUID userId = null;

	@SerializedName("images")
	private List<NewPostImage> images = null;

	public EditPost() {
	}

	EditPost(Parcel in) {
		id = (UUID) in.readValue(UUID.class.getClassLoader());
		text = (String) in.readValue(null);
		postId = (UUID) in.readValue(UUID.class.getClassLoader());
		userId = (UUID) in.readValue(UUID.class.getClassLoader());
		images = (List<NewPostImage>) in.readValue(NewPostImage.class.getClassLoader());
	}

	public EditPost id(UUID id) {
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

	public EditPost text(String text) {
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

	public EditPost postId(UUID postId) {
		this.postId = postId;
		return this;
	}

	/**
	 * Get postId
	 *
	 * @return postId
	 **/
	@Schema(description = "")
	public UUID getPostId() {
		return postId;
	}

	public void setPostId(UUID postId) {
		this.postId = postId;
	}

	public EditPost userId(UUID userId) {
		this.userId = userId;
		return this;
	}

	/**
	 * Get userId
	 *
	 * @return userId
	 **/
	@Schema(description = "")
	public UUID getUserId() {
		return userId;
	}

	public void setUserId(UUID userId) {
		this.userId = userId;
	}

	public EditPost images(List<NewPostImage> images) {
		this.images = images;
		return this;
	}

	public EditPost addImagesItem(NewPostImage imagesItem) {
		if (this.images == null) {
			this.images = new ArrayList<NewPostImage>();
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
	public List<NewPostImage> getImages() {
		return images;
	}

	public void setImages(List<NewPostImage> images) {
		this.images = images;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		EditPost editPost = (EditPost) o;
		return Objects.equals(this.id, editPost.id) &&
				Objects.equals(this.text, editPost.text) &&
				Objects.equals(this.postId, editPost.postId) &&
				Objects.equals(this.userId, editPost.userId) &&
				Objects.equals(this.images, editPost.images);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, text, postId, userId, images);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class EditPost {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    text: ").append(toIndentedString(text)).append("\n");
		sb.append("    postId: ").append(toIndentedString(postId)).append("\n");
		sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
		sb.append("    images: ").append(toIndentedString(images)).append("\n");
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
		out.writeValue(postId);
		out.writeValue(userId);
		out.writeValue(images);
	}

	public int describeContents() {
		return 0;
	}
}
