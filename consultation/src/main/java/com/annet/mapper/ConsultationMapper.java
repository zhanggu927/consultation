package com.annet.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.annet.model.Consultation;

public interface ConsultationMapper {
    int deleteByPrimaryKey(Long consultationId);

    int insert(Consultation record);

    int insertSelective(Consultation record);

    Consultation selectByPrimaryKey(Long consultationId);

    int updateByPrimaryKeySelective(Consultation record);

    int updateByPrimaryKey(Consultation record);
    
    /**
     * 根据orgCode查询该机构发出的会诊列表
     * @param orgCode
     * @return
     */
	List<Consultation> selectByOrgCode(@Param("orgCode") String orgCode);
	
	/**
	 * 根据orgCode查询该机构收到的会诊列表
	 * @param orgCode
	 * @return
	 */
	List<Consultation> selectByReceive(@Param("orgCode")String orgCode);
	/**
	 * 根据orgCode和会诊状态搜索会诊列表
	 * @param orgCode
	 * @param state
	 * @return
	 */
	List<Consultation> selectByState(@Param("orgCode")String orgCode,@Param("state")String state);
}