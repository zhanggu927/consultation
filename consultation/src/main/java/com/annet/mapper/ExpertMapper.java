package com.annet.mapper;

import com.annet.model.Expert;

public interface ExpertMapper {
    int deleteByPrimaryKey(Long expertId);

    int insert(Expert record);

    int insertSelective(Expert record);

    Expert selectByPrimaryKey(Long expertId);

    int updateByPrimaryKeySelective(Expert record);

    int updateByPrimaryKey(Expert record);
}