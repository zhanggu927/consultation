package com.annet.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.annet.model.ConsultationCenterManager;

public interface ConsultationCenterManagerMapper {
    int deleteByPrimaryKey(Long consultationCenterManagerId);

    int insert(ConsultationCenterManager record);

    int insertSelective(ConsultationCenterManager record);

    ConsultationCenterManager selectByPrimaryKey(Long consultationCenterManagerId);

    int updateByPrimaryKeySelective(ConsultationCenterManager record);

    int updateByPrimaryKey(ConsultationCenterManager record);
    
    List<String> selectByUserIdAndPassword(@Param("userId") String userId,@Param("password") String password);

}