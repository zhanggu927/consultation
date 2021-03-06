package com.annet.model;

public class ConsultationAttachment {
    private Long consultationAttachmentId;

    private String attachmentAttribute;

    private String attachmentOwner;

    private String attachmentType;

    private String attachmentUrl;

    private String consultationId;

    public Long getConsultationAttachmentId() {
        return consultationAttachmentId;
    }

    public void setConsultationAttachmentId(Long consultationAttachmentId) {
        this.consultationAttachmentId = consultationAttachmentId;
    }

    public String getAttachmentAttribute() {
        return attachmentAttribute;
    }

    public void setAttachmentAttribute(String attachmentAttribute) {
        this.attachmentAttribute = attachmentAttribute == null ? null : attachmentAttribute.trim();
    }

    public String getAttachmentOwner() {
        return attachmentOwner;
    }

    public void setAttachmentOwner(String attachmentOwner) {
        this.attachmentOwner = attachmentOwner == null ? null : attachmentOwner.trim();
    }

    public String getAttachmentType() {
        return attachmentType;
    }

    public void setAttachmentType(String attachmentType) {
        this.attachmentType = attachmentType == null ? null : attachmentType.trim();
    }

    public String getAttachmentUrl() {
        return attachmentUrl;
    }

    public void setAttachmentUrl(String attachmentUrl) {
        this.attachmentUrl = attachmentUrl == null ? null : attachmentUrl.trim();
    }

    public String getConsultationId() {
        return consultationId;
    }

    public void setConsultationId(String consultationId) {
        this.consultationId = consultationId == null ? null : consultationId.trim();
    }
}