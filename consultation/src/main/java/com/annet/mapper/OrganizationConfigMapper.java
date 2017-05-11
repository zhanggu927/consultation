package com.annet.mapper;

import com.annet.model.OrganizationConfig;

public interface OrganizationConfigMapper {
    int deleteByPrimaryKey(Long orgConfigId);

    int insert(OrganizationConfig record);

    int insertSelective(OrganizationConfig record);

    OrganizationConfig selectByPrimaryKey(Long orgConfigId);

    int updateByPrimaryKeySelective(OrganizationConfig record);

    int updateByPrimaryKey(OrganizationConfig record);
}