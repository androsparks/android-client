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
 * PostActions
 */


public class PostActions implements Parcelable
{
	public static final Parcelable.Creator<PostActions> CREATOR = new Parcelable.Creator<PostActions>()
	{
		public PostActions createFromParcel(Parcel in) {
			return new PostActions(in);
		}

		public PostActions[] newArray(int size) {
			return new PostActions[size];
		}
	};

	@SerializedName("isLiked")
	private Boolean isLiked = null;

	@SerializedName("canEdit")
	private Boolean canEdit = null;

	@SerializedName("canDelete")
	private Boolean canDelete = null;

	@SerializedName("canPin")
	private Boolean canPin = null;

	@SerializedName("canComment")
	private Boolean canComment = null;

	public PostActions() {
	}

	PostActions(Parcel in) {
		isLiked = (Boolean) in.readValue(null);
		canEdit = (Boolean) in.readValue(null);
		canDelete = (Boolean) in.readValue(null);
		canPin = (Boolean) in.readValue(null);
		canComment = (Boolean) in.readValue(null);
	}

	public PostActions isLiked(Boolean isLiked) {
		this.isLiked = isLiked;
		return this;
	}

	/**
	 * Get isLiked
	 *
	 * @return isLiked
	 **/
	@Schema(description = "")
	public Boolean isIsLiked() {
		return isLiked;
	}

	public void setIsLiked(Boolean isLiked) {
		this.isLiked = isLiked;
	}

	public PostActions canEdit(Boolean canEdit) {
		this.canEdit = canEdit;
		return this;
	}

	/**
	 * Get canEdit
	 *
	 * @return canEdit
	 **/
	@Schema(description = "")
	public Boolean isCanEdit() {
		return canEdit;
	}

	public void setCanEdit(Boolean canEdit) {
		this.canEdit = canEdit;
	}

	public PostActions canDelete(Boolean canDelete) {
		this.canDelete = canDelete;
		return this;
	}

	/**
	 * Get canDelete
	 *
	 * @return canDelete
	 **/
	@Schema(description = "")
	public Boolean isCanDelete() {
		return canDelete;
	}

	public void setCanDelete(Boolean canDelete) {
		this.canDelete = canDelete;
	}

	public PostActions canPin(Boolean canPin) {
		this.canPin = canPin;
		return this;
	}

	/**
	 * Get canPin
	 *
	 * @return canPin
	 **/
	@Schema(description = "")
	public Boolean isCanPin() {
		return canPin;
	}

	public void setCanPin(Boolean canPin) {
		this.canPin = canPin;
	}

	public PostActions canComment(Boolean canComment) {
		this.canComment = canComment;
		return this;
	}

	/**
	 * Get canComment
	 *
	 * @return canComment
	 **/
	@Schema(description = "")
	public Boolean isCanComment() {
		return canComment;
	}

	public void setCanComment(Boolean canComment) {
		this.canComment = canComment;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PostActions postActions = (PostActions) o;
		return Objects.equals(this.isLiked, postActions.isLiked) &&
				Objects.equals(this.canEdit, postActions.canEdit) &&
				Objects.equals(this.canDelete, postActions.canDelete) &&
				Objects.equals(this.canPin, postActions.canPin) &&
				Objects.equals(this.canComment, postActions.canComment);
	}

	@Override
	public int hashCode() {
		return Objects.hash(isLiked, canEdit, canDelete, canPin, canComment);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PostActions {\n");

		sb.append("    isLiked: ").append(toIndentedString(isLiked)).append("\n");
		sb.append("    canEdit: ").append(toIndentedString(canEdit)).append("\n");
		sb.append("    canDelete: ").append(toIndentedString(canDelete)).append("\n");
		sb.append("    canPin: ").append(toIndentedString(canPin)).append("\n");
		sb.append("    canComment: ").append(toIndentedString(canComment)).append("\n");
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
		out.writeValue(isLiked);
		out.writeValue(canEdit);
		out.writeValue(canDelete);
		out.writeValue(canPin);
		out.writeValue(canComment);
	}

	public int describeContents() {
		return 0;
	}
}