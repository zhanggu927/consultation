package com.annet.model;

public class ConsultationCenterConfig {
    private Long consultationCenterId;

    private String afterControl;

    private String name;

    private String orgCode;

    private String preControl;

    public Long getConsultationCenterId() {
        return consultationCenterId;
    }

    public void setConsultationCenterId(Long consultationCenterId) {
        this.consultationCenterId = consultationCenterId;
    }

    public String getAfterControl() {
        return afterControl;
    }

    public void setAfterControl(String afterControl) {
        this.afterControl = afterControl == null ? null : afterControl.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

    public String getPreControl() {
        return preControl;
    }

    public void setPreControl(String preControl) {
        this.preControl = preControl == null ? null : preControl.trim();
    }
}