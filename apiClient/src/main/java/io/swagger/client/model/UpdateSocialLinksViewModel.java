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
 * UpdateSocialLinksViewModel
 */


public class UpdateSocialLinksViewModel implements Parcelable
{
	public static final Parcelable.Creator<UpdateSocialLinksViewModel> CREATOR = new Parcelable.Creator<UpdateSocialLinksViewModel>()
	{
		public UpdateSocialLinksViewModel createFromParcel(Parcel in) {
			return new UpdateSocialLinksViewModel(in);
		}

		public UpdateSocialLinksViewModel[] newArray(int size) {
			return new UpdateSocialLinksViewModel[size];
		}
	};

	@SerializedName("links")
	private List<UpdateSocialLinkViewModel> links = null;

	public UpdateSocialLinksViewModel() {
	}

	UpdateSocialLinksViewModel(Parcel in) {
		links = (List<UpdateSocialLinkViewModel>) in.readValue(UpdateSocialLinkViewModel.class.getClassLoader());
	}

	public UpdateSocialLinksViewModel links(List<UpdateSocialLinkViewModel> links) {
		this.links = links;
		return this;
	}

	public UpdateSocialLinksViewModel addLinksItem(UpdateSocialLinkViewModel linksItem) {
		if (this.links == null) {
			this.links = new ArrayList<UpdateSocialLinkViewModel>();
		}
		this.links.add(linksItem);
		return this;
	}

	/**
	 * Get links
	 *
	 * @return links
	 **/
	@Schema(description = "")
	public List<UpdateSocialLinkViewModel> getLinks() {
		return links;
	}

	public void setLinks(List<UpdateSocialLinkViewModel> links) {
		this.links = links;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		UpdateSocialLinksViewModel updateSocialLinksViewModel = (UpdateSocialLinksViewModel) o;
		return Objects.equals(this.links, updateSocialLinksViewModel.links);
	}

	@Override
	public int hashCode() {
		return Objects.hash(links);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class UpdateSocialLinksViewModel {\n");

		sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
		out.writeValue(links);
	}

	public int describeContents() {
		return 0;
	}
}
