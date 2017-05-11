package com.annet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.annet.mapper.ConsultationCenterManagerMapper;

@Service
@Transactional
public class ConsultationCenterManagerService {
	@Autowired
	private ConsultationCenterManagerMapper managerMapper;
	
	/**
	 * 根据userId和password查询该用户具有的orgCode权限
	 * @param userId
	 * @param password
	 * @return
	 */
	List<String> selectByUserIdAndPassWord(String userId,String password){
		List<String> orgCodes = managerMapper.selectByUserIdAndPassword(userId,password);
		return orgCodes;
	}
	
	
}
