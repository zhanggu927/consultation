package com.annet.mapper;

import com.annet.model.OrganizationExpertLabel;

public interface OrganizationExpertLabelMapper {
    int deleteByPrimaryKey(Long orgExpertLabelId);

    int insert(OrganizationExpertLabel record);

    int insertSelective(OrganizationExpertLabel record);

    OrganizationExpertLabel selectByPrimaryKey(Long orgExpertLabelId);

    int updateByPrimaryKeySelective(OrganizationExpertLabel record);

    int updateByPrimaryKey(OrganizationExpertLabel record);
}