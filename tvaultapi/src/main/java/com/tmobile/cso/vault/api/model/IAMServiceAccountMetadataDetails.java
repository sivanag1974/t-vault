/** *******************************************************************************
*  Copyright 2020 T-Mobile, US
*
*  Licensed under the Apache License, Version 2.0 (the "License");
*  you may not use this file except in compliance with the License.
*  You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing, software
*  distributed under the License is distributed on an "AS IS" BASIS,
*  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*  See the License for the specific language governing permissions and
*  limitations under the License.
*  See the readme.txt file for additional language around disclaimer of warranties.
*********************************************************************************** */
package com.tmobile.cso.vault.api.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class IAMServiceAccountMetadataDetails implements Serializable {

	private static final long serialVersionUID = 7220024674738271043L;

	private String userName;
	private String awsAccountId;
	private String awsAccountName;
	private Long createdAtEpoch;

	@JsonProperty("owner_ntid")
	private String ownerNtid;

	@JsonProperty("owner_email")
	private String ownerEmail;

	@JsonProperty("application_id")
	private String applicationId;

	@JsonProperty("application_name")
	private String applicationName;

	@JsonProperty("application_tag")
	private String applicationTag;

	@JsonProperty("isActivated")
	private boolean accountActivated;

	private List<IAMSecretsMetadata> secret;

	private String adSelfSupportGroup;

	private Long expiryDuration;

	private Long expiryDateEpoch;

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the awsAccountId
	 */
	public String getAwsAccountId() {
		return awsAccountId;
	}

	/**
	 * @param awsAccountId the awsAccountId to set
	 */
	public void setAwsAccountId(String awsAccountId) {
		this.awsAccountId = awsAccountId;
	}

	/**
	 * @return the awsAccountName
	 */
	public String getAwsAccountName() {
		return awsAccountName;
	}

	/**
	 * @param awsAccountName the awsAccountName to set
	 */
	public void setAwsAccountName(String awsAccountName) {
		this.awsAccountName = awsAccountName;
	}

	/**
	 * @return the createdAtEpoch
	 */
	public Long getCreatedAtEpoch() {
		return createdAtEpoch;
	}

	/**
	 * @param createdAtEpoch the createdAtEpoch to set
	 */
	public void setCreatedAtEpoch(Long createdAtEpoch) {
		this.createdAtEpoch = createdAtEpoch;
	}

	/**
	 * @return the ownerNtid
	 */
	public String getOwnerNtid() {
		return ownerNtid;
	}

	/**
	 * @param ownerNtid the ownerNtid to set
	 */
	public void setOwnerNtid(String ownerNtid) {
		this.ownerNtid = ownerNtid;
	}

	/**
	 * @return the ownerEmail
	 */
	public String getOwnerEmail() {
		return ownerEmail;
	}

	/**
	 * @param ownerEmail the ownerEmail to set
	 */
	public void setOwnerEmail(String ownerEmail) {
		this.ownerEmail = ownerEmail;
	}

	/**
	 * @return the applicationId
	 */
	public String getApplicationId() {
		return applicationId;
	}

	/**
	 * @param applicationId the applicationId to set
	 */
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	/**
	 * @return the applicationName
	 */
	public String getApplicationName() {
		return applicationName;
	}

	/**
	 * @param applicationName the applicationName to set
	 */
	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	/**
	 * @return the applicationTag
	 */
	public String getApplicationTag() {
		return applicationTag;
	}

	/**
	 * @param applicationTag the applicationTag to set
	 */
	public void setApplicationTag(String applicationTag) {
		this.applicationTag = applicationTag;
	}


	/**
	 * @return the accountActivated
	 */
	public boolean isAccountActivated() {
		return accountActivated;
	}

	/**
	 * @param accountActivated the accountActivated to set
	 */
	public void setAccountActivated(boolean accountActivated) {
		this.accountActivated = accountActivated;
	}

	/**
	 * @return the secret
	 */
	public List<IAMSecretsMetadata> getSecret() {
		return secret;
	}

	/**
	 * @param secret the secret to set
	 */
	public void setSecret(List<IAMSecretsMetadata> secret) {
		this.secret = secret;
	}

	public String getAdSelfSupportGroup() {
		return adSelfSupportGroup;
	}

	public void setAdSelfSupportGroup(String adSelfSupportGroup) {
		this.adSelfSupportGroup = adSelfSupportGroup;
	}

	public Long getExpiryDuration() {
		return expiryDuration;
	}

	public void setExpiryDuration(Long expiryDuration) {
		this.expiryDuration = expiryDuration;
	}

	public Long getExpiryDateEpoch() {
		return expiryDateEpoch;
	}

	public void setExpiryDateEpoch(Long expiryDateEpoch) {
		this.expiryDateEpoch = expiryDateEpoch;
	}

	@Override
	public String toString() {
		return "IAMServiceAccountMetadataDetails [userName=" + userName + ", awsAccountId=" + awsAccountId
				+ ", awsAccountName=" + awsAccountName + ", createdAtEpoch=" + createdAtEpoch + ", ownerNtid="
				+ ownerNtid + ", ownerEmail=" + ownerEmail + ", applicationId=" + applicationId + ", applicationName="
				+ applicationName + ", applicationTag=" + applicationTag + ", accountActivated=" + accountActivated
				+ ", secret=" + secret + ", adSelfSupportGroup=" + adSelfSupportGroup + ", expiryDuration="
				+ expiryDuration + ", expiryDateEpoch=" + expiryDateEpoch + "]";
	}
}