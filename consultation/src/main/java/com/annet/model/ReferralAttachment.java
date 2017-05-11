package com.annet.model;

public class ReferralAttachment {
    private Long referralAttachmentId;

    private String attachmentAttribute;

    private String attachmentOwner;

    private String attachmentType;

    private String attachmentUrl;

    private String referralId;

    public Long getReferralAttachmentId() {
        return referralAttachmentId;
    }

    public void setReferralAttachmentId(Long referralAttachmentId) {
        this.referralAttachmentId = referralAttachmentId;
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

    public String getReferralId() {
        return referralId;
    }

    public void setReferralId(String referralId) {
        this.referralId = referralId == null ? null : referralId.trim();
    }
}