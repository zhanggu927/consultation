package com.annet.model;

public class OrganizationExpertLabel {
    private Long orgExpertLabelId;

    private String expertLabelId;

    private String orgCode;

    public Long getOrgExpertLabelId() {
        return orgExpertLabelId;
    }

    public void setOrgExpertLabelId(Long orgExpertLabelId) {
        this.orgExpertLabelId = orgExpertLabelId;
    }

    public String getExpertLabelId() {
        return expertLabelId;
    }

    public void setExpertLabelId(String expertLabelId) {
        this.expertLabelId = expertLabelId == null ? null : expertLabelId.trim();
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }
}