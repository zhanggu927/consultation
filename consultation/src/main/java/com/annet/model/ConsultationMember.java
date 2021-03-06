package com.annet.model;

import java.util.Date;

public class ConsultationMember {
    private Long consultationMemberId;

    private String consultationId;

    private String consultationOpinion;

    private String departmentName;

    private String departmentNo;

    private String gender;

    private String name;

    private Date opinionTime;

    private String orgCode;

    private String orgName;

    private String phone;

    private String role;

    private String userId;

    public Long getConsultationMemberId() {
        return consultationMemberId;
    }

    public void setConsultationMemberId(Long consultationMemberId) {
        this.consultationMemberId = consultationMemberId;
    }

    public String getConsultationId() {
        return consultationId;
    }

    public void setConsultationId(String consultationId) {
        this.consultationId = consultationId == null ? null : consultationId.trim();
    }

    public String getConsultationOpinion() {
        return consultationOpinion;
    }

    public void setConsultationOpinion(String consultationOpinion) {
        this.consultationOpinion = consultationOpinion == null ? null : consultationOpinion.trim();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    public String getDepartmentNo() {
        return departmentNo;
    }

    public void setDepartmentNo(String departmentNo) {
        this.departmentNo = departmentNo == null ? null : departmentNo.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getOpinionTime() {
        return opinionTime;
    }

    public void setOpinionTime(Date opinionTime) {
        this.opinionTime = opinionTime;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }
}