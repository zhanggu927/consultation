package com.annet.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.annet.model.ReferralMember;

public interface ReferralMemberMapper {
    int deleteByPrimaryKey(Long referralMemberId);

    int insert(ReferralMember record);

    int insertSelective(ReferralMember record);

    ReferralMember selectByPrimaryKey(Long referralMemberId);

    int updateByPrimaryKeySelective(ReferralMember record);

    int updateByPrimaryKey(ReferralMember record);
    
    /**
     * 查看转诊
     * @param referralId
     * @return
     */
	List<ReferralMember> selectByReferralId(@Param("referralId") String referralId);
}