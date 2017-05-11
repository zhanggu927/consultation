package com.annet.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.annet.model.ConsultationMember;

public interface ConsultationMemberMapper {
    int deleteByPrimaryKey(Long consultationMemberId);

    int insert(ConsultationMember record);

    int insertSelective(ConsultationMember record);

    ConsultationMember selectByPrimaryKey(Long consultationMemberId);

    int updateByPrimaryKeySelective(ConsultationMember record);

    int updateByPrimaryKey(ConsultationMember record);

	List<ConsultationMember> selectByConsultationId(@Param("consultationId") String consultationId);
}