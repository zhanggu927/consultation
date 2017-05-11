package com.annet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.annet.model.ConsultationCenterConfig;
import com.annet.service.LoginService;
import com.annet.util.Message;

/**
 * 登录相关的Controller
 * @author Zhang
 *
 */
@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;
	
	@RequestMapping("/login")
    @ResponseBody
    public Message<List<ConsultationCenterConfig>> login(String userId,String password){
        return loginService.login(userId, password);
    }
	
	
	
	
}
