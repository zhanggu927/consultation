package com.annet.mapper;

import com.annet.model.ReferralAttachment;

public interface ReferralAttachmentMapper {
    int deleteByPrimaryKey(Long referralAttachmentId);

    int insert(ReferralAttachment record);

    int insertSelective(ReferralAttachment record);

    ReferralAttachment selectByPrimaryKey(Long referralAttachmentId);

    int updateByPrimaryKeySelective(ReferralAttachment record);

    int updateByPrimaryKey(ReferralAttachment record);
}