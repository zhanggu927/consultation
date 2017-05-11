package com.annet.mapper;



import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.annet.model.ConsultationCenterConfig;

public interface ConsultationCenterConfigMapper {
    int deleteByPrimaryKey(Long consultationCenterId);

    int insert(ConsultationCenterConfig record);

    int insertSelective(ConsultationCenterConfig record);

    ConsultationCenterConfig selectByPrimaryKey(Long consultationCenterId);

    int updateByPrimaryKeySelective(ConsultationCenterConfig record);

    int updateByPrimaryKey(ConsultationCenterConfig record);
    
    List<ConsultationCenterConfig> selectByUserIdAndPassword(@Param("userId") String userId, @Param("password") String password);
}