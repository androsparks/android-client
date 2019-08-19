/*
 * Core API v1.0
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * SocialLinksViewModel
 */

public class SocialLinksViewModel
{
	@SerializedName("socialLinks")
	private List<SocialLinkViewModel> socialLinks = null;

	public SocialLinksViewModel socialLinks(List<SocialLinkViewModel> socialLinks) {
		this.socialLinks = socialLinks;
		return this;
	}

	public SocialLinksViewModel addSocialLinksItem(SocialLinkViewModel socialLinksItem) {
		if (this.socialLinks == null) {
			this.socialLinks = new ArrayList<SocialLinkViewModel>();
		}
		this.socialLinks.add(socialLinksItem);
		return this;
	}

	/**
	 * Get socialLinks
	 *
	 * @return socialLinks
	 **/
	@ApiModelProperty(value = "")
	public List<SocialLinkViewModel> getSocialLinks() {
		return socialLinks;
	}

	public void setSocialLinks(List<SocialLinkViewModel> socialLinks) {
		this.socialLinks = socialLinks;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SocialLinksViewModel socialLinksViewModel = (SocialLinksViewModel) o;
		return Objects.equals(this.socialLinks, socialLinksViewModel.socialLinks);
	}

	@Override
	public int hashCode() {
		return Objects.hash(socialLinks);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SocialLinksViewModel {\n");

		sb.append("    socialLinks: ").append(toIndentedString(socialLinks)).append("\n");
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

}
