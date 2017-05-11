package com.annet.mapper;

import java.util.List;

import com.annet.model.Referral;

public interface ReferralMapper {
    int deleteByPrimaryKey(Long referralId);

    int insert(Referral record);

    int insertSelective(Referral record);

    Referral selectByPrimaryKey(Long referralId);

    int updateByPrimaryKeySelective(Referral record);

    int updateByPrimaryKey(Referral record);
    /**
     * 该机构发出的转诊列表
     * @param orgCode
     * @return
     */
	List<Referral> selectByApplyOrgCode(String orgCode);
}