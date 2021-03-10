package com.tmobile.cso.vault.api.common;

/**
 * SSLCertificate Constants
 */
public final class SSLCertificateConstants {
	
	private SSLCertificateConstants() {}

    public static final String ACCESS_TOKEN = "access_token";
    public static final String TOKEN_TYPE = "token_type";
    public static final String CERTIFICATES="certificates";
    public static final String ACTIVE="ACTIVE";
    public static final String CERTIFICATE_STATUS="certificateStatus";
    public static final String TARGETSYSTEM_SERVICES="targetsystemservices";
    public static final String NAME="name";
    public static final String TARGETSYSTEM_SERVICE_ID="targetSystemServiceId";
    public static final String TARGETSYSTEMS="targetSystems";
    public static final String TARGETSYSTEM_ID="targetSystemID";
    public static final String SUBJECT="subject";
    public static final String TYPENAME="typeName";
    public static final String CN="cn";
    public static final String VALUE="value";
    public static final String ITEMS="items";
    public static final String SELECTED_ID="selectedId";
    public static final String SSL_CERT_PATH = "metadata/sslcerts";
    public static final String SSL_CREATE_EXCEPTION="SSL Certificate creation failed";
    public static final String SSL_CERT_SUCCESS="Certificate Created Successfully";
    public static final String CUSTOMER_LOGIN="CertManager Login";
    public static final String ACCESS_ID="accessid";
    public static final String ADDRESS="address";
    public static final String DESCRIPTION="description";
    public static final String HOSTNAME="hostname";
    public static final String MONITORINGENABLED="monitoringEnabled";
    public static final String MULTIIPMONITORINGENABLED="multiIpMonitoringEnabled";
    public static final String PORT="port";
    public static final String SSL_CERTFICATE_REASONS_FAILED="SSL Get Certificate reasons failed";
    public static final String SSL_CERTFICATE_WRITE_PERMISSION="write";
    public static final String SSL_CERT_PATH_VALUE = "sslcerts/";
    public static final String ERROR_INVALID_ACCESS_POLICY_MSG = "Invalid access policy";
    public static final String ADD_USER_TO_CERT_MSG = "Add User to Certificate";
    public static final String ADD_GROUP_TO_CERT_MSG = "Add Group to Certificate";
    public static final String SSL_OWNER_PERMISSION_EXCEPTION="Add sudo permission to certificate owner failed";
    public static final String ADD_APPROLE_TO_CERT_MSG = "Add Approle to Certificate";
    public static final String DELETE_APPROLE_TO_CERT_MSG = "Delete Approle from Certificate";
    public static final String OWNER_PERMISSION_CERTIFICATE = "o_cert_";
    public static final String CERT_DOWNLOAD_TYPE_PKCS12DERR = "pkcs12der";
    public static final String CERT_DOWNLOAD_TYPE_PEMBUNDLE = "pembundle";
    public static final String CERT_DOWNLOAD_TYPE_PKCS12PEM = "pkcs12pem";
    public static final String REMOVE_USER_FROM_CERT_MSG = "Remove User from Certificate";
    public static final String REMOVE_GROUP_FROM_CERT_MSG = "Remove Group from Certificate";
    public static final String SSL_EXTERNAL_CERT_PATH = "metadata/externalcerts";
    public static final String INTERNAL_POLICY_NAME="cert";
    public static final String EXTERNAL_POLICY_NAME="externalcerts";
    public static final String SSL_CERT_PATH_VALUE_EXT="externalcerts/";

    public static final String READ_CERT_POLICY_PREFIX="r_";
    public static final String WRITE_CERT_POLICY_PREFIX="w_";
    public static final String DENY_CERT_POLICY_PREFIX="d_";
    public static final String SUDO_CERT_POLICY_PREFIX="o_";

    public static final String ACCESS_UPDATE_ENDPOINT="/access/update";
    public static final String ACCESS_DELETE_ENDPOINT="/access/delete";
    public static final String ACCESS_STRING="access";
    public static final String POLICY_CREATION_TITLE="Policies Creation For Certificate";
    public static final String PROPERTY_VALUE="value";
    public static final String DNS_LABEL="dns";
    public static final String POLICY_LABEL="Policy";
    public static final String SERVICE_LABEL="SERVICE";
    public static final String SUBJECT_ALTERNATIVE_NAMES="subjectAlternativeName";
    public static final String REQUEST_PENDING_APPROVAL="Pending Approval";
    public static final String REQUEST_FOR_APPROVAL= "REQUEST FOR APPROVAL";
    public static final String INVALID_INPUT_MSG="Invalid user inputs";
    public static final String EXTERNAL= "external";
    public static final String VALIDATE_CERTIFICATE_DETAILS_MSG = "Validate Certificate Details";
    public static final String VALIDATION_RESULT_LABEL="validationResult";
    public static final String OWNER_PERMISSION_EXT_CERTIFICATE = "o_externalcerts_";
    public static final String CERT_CREATION_SUBJECT = "Certificate Created Successfully";
    public static final String EX_CERT_CREATION_SUBJECT = "Certificate Create Request Received";
    public static final String EX_CERT_RENEW_SUBJECT = "Certificate Renew Request Received";
    public static final String CERT_RENEW_SUBJECT = "Certificate Renewed Successfully";
    public static final String CERT_DELETE_SUBJECT = "Certificate Deleted Successfully";
    public static final String CERT_REVOKED_SUBJECT = "Certificate Revoked Successfully";
    public static final String INTERNAL_CERT_ENROLL_STRING ="T-Mobile Issuing CA 01 - SHA2";
    public static final String EXTERNAL_CERT_ENROLL_STRING ="Entrust CA";
    public static final String INTERNAL_KEY_USAGE ="serverAuth";
    public static final String INTERNAL_KEY_USAGE_CLIENT ="clientAuth";
    public static final String EXTERNAL_KEY_USAGE ="serverAuth, clientAuth";
    public static final String INTERNAL="internal";
    public static final String RENEW_PENDING="Renew Pending";
    public static final String CERT_TYPE_MATCH_STRING="internal|external";
    public static final String CONCLUSION="conclusion";
    public static final String STATUS_REJECTED="rejected";
    public static final String DELETE_METADATA_PERMISSIONS="deleteMetaDataAndPermissions";
    public static final String GET_CERTIFICATE_DETAILS_PROCESS_METADATA="getCertificateDetailsAndProcessMetadata";
    public static final String TRANSFER_EMAIL_SUBJECT="Transfer of Certificate Ownership";
    public static final String NCLM_TARGET_PORT_NUMBER="443";
    public static final String GET_ID_USER_STRING="getIdOfTheUser";
    public static final String GET_SELF_SERVICE_GROUPS_STRING="getSelfServiceGroupsFromAADById";
    public static final String GET_ALL_APPLICATIONS_STRING="getAllSelfServiceGroups";
    public static final String  SSL_EXT_CERT_SUCCESS="Certificate Request received.Please check your email and follow" +
            " the instructions";
    public static final String  DOWNLOAD_CERT="downloadcert";

    public static final String ADD_AWS_ROLE_TO_CERT_MSG = "Add AWS Role to Certificate";
    public static final String REMOVE_AWS_ROLE_FROM_CERT_MSG = "Remove AWS Role from Certificate";
    public static final String GET_ALL_PENDING_CERT_MSG = "Get All Pending Certificates";
    public static final String VENAFIBIN_CONTAINER="VenafiBin_12345";
    public static final String CERTIFICATE_TYPE_INTERNAL="Private Certificates";
	public static final String CERTIFICATE_TYPE_EXTERNAL = "Public Certificates";
	public static final String NCLM_DOWN_MSG = "NCLM services are down. Please try after some time.";
	public static final String TEMPLATE_ID = "templateId";
	public static final String ENTITY_ID = "entityid";
	public static final String CERT_TYPE = "certType";
	public static final String CERT_NAME = "certName";
	public static final String CONTACT_LINK = "contactLink";
	public static final String DNS_NAMES = "dnsNames";
	public static final String APPROVED = "Approved";
	public static final String CERT_OWNER_NTID = "certOwnerNtid";
	public static final String CERT_OWNER_EMAILID = "certOwnerEmailId";
	public static final String GENERATE_SSL_CERTIFICTAE = "generateSSLCertificate";
	public static final String ACTION_ID = "actionId";
	public static final String PRIVATE_SINGLE_SAN = "PRIVATE_SINGLE_SAN";
	public static final String PUBLIC_SINGLE_SAN = "PUBLIC_SINGLE_SAN";
	public static final String POPULATE_ONBOARD_METADATA ="populateSSLCertificateMetadataForOnboard";
	public static final String ONBOARD = "onboard";
	public static final String CERTIFICATE_UNAVAILABLE = "Certificate unavailable";
	public static final String CERTIFICATE_ID = "certificateId";
	public static final String CONTAINER_ID = "containerId";
	public static final String CONTAINER_NAME = "containerName";
	public static final String AWS_ROLES = "aws-roles";
	public static final String COMMON_NAME = "commonname";
	public static final String ONBOARD_SSL_CERTIFICATE = "onboardSSLcertificate";
    public static final String REQUEST_STATUS = "requestStatus";
    public static final String PROCESS_APPROVED_CERTIFICATES ="processApprovedExternalCertificates";
    public static final String CERTIFICATE_NAME="certificateName";
    public static final String GET_PENDING_APPROVAL_CERT_PROCESS="getPendApprovalCertsAndProcess";
    public static final String STATUS_WAITING = "waiting";
    public static final String VALIDATE_INPUT_DATA = "validateInputData";
    public static final String GET_VALID_APPLICATION_NAME = "getValidApplicationName";
    public static final String POPULATE_SSL_CERTIFICATE_REQUEST = "populateSSLCertificateRequest";
    public static final String GET_CERT_DETAILS_BY_METADATA_PATH = "getCertificateDetailsByMatadataPath";
    public static final String UPDATE_SSL_CERTIFICATE = "updateSSLCertificate";
    public static final String CLIENT_SERVER_TEMPLATE_NAME ="T-Mobile USA Mutual Web Authentication2 NCLM";
    public static final String CLIENT_TEMPLATE_NAME ="T-MobileUSASimpleClientAuthNCLM";
    public static final String KEYUSAGE_VALUE_BOTH="both";
    public static final String KEYUSAGE_VALUE_CLIENT="client";
    public static final String KEYUSAGE_VALUE_SERVER="server";
    public static final String KEYUSAGE_VALUE_BOTH_LABEL= "Client auth , Server auth";
    public static final String KEYUSAGE_VALUE_CLIENT_LABEL= "Client auth";
    public static final String KEYUSAGE_VALUE_SERVER_LABEL= "Server auth";
    public static final String KEYUSAGE_VALUE_VALID_STRING="client|server|both";
    public static final String APP_NAME_OTHER="Other";
    public static final String API="api";
    public static final String UI="ui";
    public static final String WILDCARD_CERTIFICATE_PREFIX = "*.";
    public static final String WILDCARD_CERTIFICATE_VAULT_PREFIX = "$.";
    public static final String WILDCARD_CHAR = "*";
    public static final String WILDCARD_REPLACE_CHAR = "$";
}
