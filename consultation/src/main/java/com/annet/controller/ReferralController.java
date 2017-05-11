package com.annet.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.annet.service.ReferralService;
import com.annet.util.JsonUtils;

/**
 * 转诊的Controller
 * @author Zhang
 *
 */
@Controller
@RequestMapping("/referral")
public class ReferralController {
	
	@Autowired
	private ReferralService referralService;
	
	
    @RequestMapping("/sendList")
    public String list(String orgCode,Model model,
                       @RequestParam(value = "page",required = false,defaultValue = "1")int page,
                       @RequestParam(value = "size",required = false,defaultValue = "10")int size){
        Map<String, Object> map = referralService.sendList(orgCode, page, size);
        model.addAttribute("result",map);
        return "referral";
    }
	
    /**
     * 查看转诊详细
     * @param orgCode   会诊中心对应的orgCode
     * @param conId     转诊id
     * @param model
     * @return
     */
    @RequestMapping("/show")
    public String show(String orgCode,String referralId,Model model){
        Map<String, Object> map = referralService.show(orgCode, referralId);
        model.addAttribute("result",map);
        return "referral_details";
    }
	
	/**
	 * 初始化转诊数据，测试用
	 * @return
	 */
	@RequestMapping("/initData")
	@ResponseBody
	public String initData(){
		String msg = referralService.initData();
		Map<String,String> map = new HashMap<>();
		map.put("msg", msg);
		return JsonUtils.objectToJson(map);
	}
	
}
