package com.annet.mapper;

import com.annet.model.ExpertLabelRelation;

public interface ExpertLabelRelationMapper {
    int deleteByPrimaryKey(Long expertRelationLabelId);

    int insert(ExpertLabelRelation record);

    int insertSelective(ExpertLabelRelation record);

    ExpertLabelRelation selectByPrimaryKey(Long expertRelationLabelId);

    int updateByPrimaryKeySelective(ExpertLabelRelation record);

    int updateByPrimaryKey(ExpertLabelRelation record);
}