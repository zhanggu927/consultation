package com.annet.model;

import java.util.Date;

public class Consultation {
    private Long consultationId;

    private Date applyTime;

    private String appointmentTime;

    private String consultationType;

    private String departmentName;

    private String departmentNo;

    private String diagnosis;

    private Date endTime;

    private String memberCount;

    private String name;

    private String orgCode;

    private String orgName;

    private String patientAge;

    private String patientBedNo;

    private String patientDepartment;

    private String patientDepartmentCode;

    private String patientGender;

    private String patientHospital;

    private String patientHospitalCode;

    private String patientName;

    private String patientSno;

    private String patientSnoType;

    private String phone;

    private String purpose;

    private String remark;

    private String role;

    private String sessionId;

    private String state;

    private String title;

    private String token;

    private String userId;

    public Long getConsultationId() {
        return consultationId;
    }

    public void setConsultationId(Long consultationId) {
        this.consultationId = consultationId;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime == null ? null : appointmentTime.trim();
    }

    public String getConsultationType() {
        return consultationType;
    }

    public void setConsultationType(String consultationType) {
        this.consultationType = consultationType == null ? null : consultationType.trim();
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

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis == null ? null : diagnosis.trim();
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getMemberCount() {
        return memberCount;
    }

    public void setMemberCount(String memberCount) {
        this.memberCount = memberCount == null ? null : memberCount.trim();
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

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    public String getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(String patientAge) {
        this.patientAge = patientAge == null ? null : patientAge.trim();
    }

    public String getPatientBedNo() {
        return patientBedNo;
    }

    public void setPatientBedNo(String patientBedNo) {
        this.patientBedNo = patientBedNo == null ? null : patientBedNo.trim();
    }

    public String getPatientDepartment() {
        return patientDepartment;
    }

    public void setPatientDepartment(String patientDepartment) {
        this.patientDepartment = patientDepartment == null ? null : patientDepartment.trim();
    }

    public String getPatientDepartmentCode() {
        return patientDepartmentCode;
    }

    public void setPatientDepartmentCode(String patientDepartmentCode) {
        this.patientDepartmentCode = patientDepartmentCode == null ? null : patientDepartmentCode.trim();
    }

    public String getPatientGender() {
        return patientGender;
    }

    public void setPatientGender(String patientGender) {
        this.patientGender = patientGender == null ? null : patientGender.trim();
    }

    public String getPatientHospital() {
        return patientHospital;
    }

    public void setPatientHospital(String patientHospital) {
        this.patientHospital = patientHospital == null ? null : patientHospital.trim();
    }

    public String getPatientHospitalCode() {
        return patientHospitalCode;
    }

    public void setPatientHospitalCode(String patientHospitalCode) {
        this.patientHospitalCode = patientHospitalCode == null ? null : patientHospitalCode.trim();
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName == null ? null : patientName.trim();
    }

    public String getPatientSno() {
        return patientSno;
    }

    public void setPatientSno(String patientSno) {
        this.patientSno = patientSno == null ? null : patientSno.trim();
    }

    public String getPatientSnoType() {
        return patientSnoType;
    }

    public void setPatientSnoType(String patientSnoType) {
        this.patientSnoType = patientSnoType == null ? null : patientSnoType.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose == null ? null : purpose.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId == null ? null : sessionId.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }
}