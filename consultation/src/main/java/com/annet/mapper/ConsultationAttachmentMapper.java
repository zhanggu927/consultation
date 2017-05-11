package com.annet.mapper;

import com.annet.model.ConsultationAttachment;

public interface ConsultationAttachmentMapper {
    int deleteByPrimaryKey(Long consultationAttachmentId);

    int insert(ConsultationAttachment record);

    int insertSelective(ConsultationAttachment record);

    ConsultationAttachment selectByPrimaryKey(Long consultationAttachmentId);

    int updateByPrimaryKeySelective(ConsultationAttachment record);

    int updateByPrimaryKey(ConsultationAttachment record);
}