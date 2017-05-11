package com.annet.model;

public class OrganizationConfig {
    private Long orgConfigId;

    private String accountDataTimeout;

    private String cdsIp;

    private String cdsPort;

    private String cdsVersion;

    private String cdsWebSocketPort;

    private String cloudImageConfig;

    private String disableDataAccountPermissions;

    private String disclaimer;

    private String disclaimerContent;

    private String isThirdPartyValidation;

    private String isVpn;

    private String orgCode;

    private String vpnIp;

    private String vpnPassword;

    private String vpnPort;

    private String vpnUsername;

    public Long getOrgConfigId() {
        return orgConfigId;
    }

    public void setOrgConfigId(Long orgConfigId) {
        this.orgConfigId = orgConfigId;
    }

    public String getAccountDataTimeout() {
        return accountDataTimeout;
    }

    public void setAccountDataTimeout(String accountDataTimeout) {
        this.accountDataTimeout = accountDataTimeout == null ? null : accountDataTimeout.trim();
    }

    public String getCdsIp() {
        return cdsIp;
    }

    public void setCdsIp(String cdsIp) {
        this.cdsIp = cdsIp == null ? null : cdsIp.trim();
    }

    public String getCdsPort() {
        return cdsPort;
    }

    public void setCdsPort(String cdsPort) {
        this.cdsPort = cdsPort == null ? null : cdsPort.trim();
    }

    public String getCdsVersion() {
        return cdsVersion;
    }

    public void setCdsVersion(String cdsVersion) {
        this.cdsVersion = cdsVersion == null ? null : cdsVersion.trim();
    }

    public String getCdsWebSocketPort() {
        return cdsWebSocketPort;
    }

    public void setCdsWebSocketPort(String cdsWebSocketPort) {
        this.cdsWebSocketPort = cdsWebSocketPort == null ? null : cdsWebSocketPort.trim();
    }

    public String getCloudImageConfig() {
        return cloudImageConfig;
    }

    public void setCloudImageConfig(String cloudImageConfig) {
        this.cloudImageConfig = cloudImageConfig == null ? null : cloudImageConfig.trim();
    }

    public String getDisableDataAccountPermissions() {
        return disableDataAccountPermissions;
    }

    public void setDisableDataAccountPermissions(String disableDataAccountPermissions) {
        this.disableDataAccountPermissions = disableDataAccountPermissions == null ? null : disableDataAccountPermissions.trim();
    }

    public String getDisclaimer() {
        return disclaimer;
    }

    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer == null ? null : disclaimer.trim();
    }

    public String getDisclaimerContent() {
        return disclaimerContent;
    }

    public void setDisclaimerContent(String disclaimerContent) {
        this.disclaimerContent = disclaimerContent == null ? null : disclaimerContent.trim();
    }

    public String getIsThirdPartyValidation() {
        return isThirdPartyValidation;
    }

    public void setIsThirdPartyValidation(String isThirdPartyValidation) {
        this.isThirdPartyValidation = isThirdPartyValidation == null ? null : isThirdPartyValidation.trim();
    }

    public String getIsVpn() {
        return isVpn;
    }

    public void setIsVpn(String isVpn) {
        this.isVpn = isVpn == null ? null : isVpn.trim();
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

    public String getVpnIp() {
        return vpnIp;
    }

    public void setVpnIp(String vpnIp) {
        this.vpnIp = vpnIp == null ? null : vpnIp.trim();
    }

    public String getVpnPassword() {
        return vpnPassword;
    }

    public void setVpnPassword(String vpnPassword) {
        this.vpnPassword = vpnPassword == null ? null : vpnPassword.trim();
    }

    public String getVpnPort() {
        return vpnPort;
    }

    public void setVpnPort(String vpnPort) {
        this.vpnPort = vpnPort == null ? null : vpnPort.trim();
    }

    public String getVpnUsername() {
        return vpnUsername;
    }

    public void setVpnUsername(String vpnUsername) {
        this.vpnUsername = vpnUsername == null ? null : vpnUsername.trim();
    }
}