package com.annet.model;

public class ConsultationCenterManager {
    private Long consultationCenterManagerId;

    private String orgCode;

    private String password;

    private String userId;

    public Long getConsultationCenterManagerId() {
        return consultationCenterManagerId;
    }

    public void setConsultationCenterManagerId(Long consultationCenterManagerId) {
        this.consultationCenterManagerId = consultationCenterManagerId;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }
}