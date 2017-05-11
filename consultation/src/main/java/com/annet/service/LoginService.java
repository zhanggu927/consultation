package com.annet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.annet.mapper.ConsultationCenterConfigMapper;
import com.annet.mapper.ConsultationCenterManagerMapper;
import com.annet.model.ConsultationCenterConfig;
import com.annet.util.Message;

@Service
@Transactional
public class LoginService {
	
	@Autowired
	private ConsultationCenterManagerMapper managerMapper;
	
	@Autowired
	private ConsultationCenterConfigMapper configMapper;
	
	/**
	 * 根据userId 和password查询该用户拥有的orgCode权限
	 * @param userId
	 * @param password
	 * @return
	 */
	public Message<List<ConsultationCenterConfig>> login(String userId, String password){
		List<ConsultationCenterConfig> centerConfigs = configMapper.selectByUserIdAndPassword(userId, password);
		return new Message<List<ConsultationCenterConfig>>(HttpStatus.OK, "success", centerConfigs);
	}
	
	
}
