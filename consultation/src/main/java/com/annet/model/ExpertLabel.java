package com.annet.model;

import java.util.Date;

public class ExpertLabel {
    private Long expertLabelId;

    private String count;

    private Date createTime;

    private String description;

    private String name;

    private String orgCode;

    public Long getExpertLabelId() {
        return expertLabelId;
    }

    public void setExpertLabelId(Long expertLabelId) {
        this.expertLabelId = expertLabelId;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count == null ? null : count.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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
}