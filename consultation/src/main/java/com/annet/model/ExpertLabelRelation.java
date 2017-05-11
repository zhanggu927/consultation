package com.annet.model;

public class ExpertLabelRelation {
    private Long expertRelationLabelId;

    private String expertId;

    private String expertLabelId;

    public Long getExpertRelationLabelId() {
        return expertRelationLabelId;
    }

    public void setExpertRelationLabelId(Long expertRelationLabelId) {
        this.expertRelationLabelId = expertRelationLabelId;
    }

    public String getExpertId() {
        return expertId;
    }

    public void setExpertId(String expertId) {
        this.expertId = expertId == null ? null : expertId.trim();
    }

    public String getExpertLabelId() {
        return expertLabelId;
    }

    public void setExpertLabelId(String expertLabelId) {
        this.expertLabelId = expertLabelId == null ? null : expertLabelId.trim();
    }
}