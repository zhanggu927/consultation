package com.annet.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.annet.service.ConsultationService;

/**
 * 会诊相关的Controller
 * @author Zhang
 *
 */
@Controller
@RequestMapping("/consultation")
public class ConsultationController {
	
	@Autowired
	private ConsultationService consultationService;
	
	/**
     * 发出的会诊列表
     * @param orgCode   会诊中心对应的orgCode
     * @param page      当前页
     * @param size      每页显示数量
     * @param model
     * @return
     */
    @RequestMapping("/sendList")
    public String list(String orgCode,Model model,
                       @RequestParam(value = "page",required = false,defaultValue = "1")int page,
                       @RequestParam(value = "size",required = false,defaultValue = "10")int size){
        Map<String, Object> map = consultationService.sendList(orgCode, page, size);
        model.addAttribute("result",map);
        return "Consultation_Center";
    }
    
    /**
     * 收到的会诊列表
     * @param orgCode   会诊中心对应的orgCode
     * @param page      当前页
     * @param size      每页显示数量
     * @param model
     * @return
     */
    @RequestMapping("/receiveList")
    public String receiveList(String orgCode,Model model,
                              @RequestParam(value = "page",required = false,defaultValue = "1")int page,
                              @RequestParam(value = "size",required = false,defaultValue = "10")int size){
        Map<String, Object> map = consultationService.receiveList(orgCode, page, size);
        model.addAttribute("result",map);
        return "Consultation_Center";
    }
    
    /**
     * 跳转，分页
     * @param orgCode
     * @param type
     * @param page
     * @param size
     * @param model
     * @return
     */
    @RequestMapping("/search")
    public String search(String orgCode,String type,Model model,
                         @RequestParam(value = "page",required = false,defaultValue = "1")int page,
                         @RequestParam(value = "size",required = false,defaultValue = "10")int size){
        if("send".equals(type)){
            return list(orgCode,model, page, size );
        }else if("receive".equals(type)){
            return receiveList(orgCode,model, page, size);
        }else{
            String state = null;
            if("preControl".equals(type)){
                state = "10";
            }else if("preDeal".equals(type)){
                state = "20";
            }else if("preHandle".equals(type)){
                state = "30";
            }else if("processing".equals(type)){
                state = "40";
            }else if("afterControl".equals(type)){
                state = "50";
            }else if("finish".equals(type)){
                state = "60";
            }else if("refuse".equals(type)){
                state = "100";
            }
            Map<String,Object> map = consultationService.search(orgCode,state, page, size);
            model.addAttribute("result",map);
        }
        return "Consultation_Center";
    }
    
    /**
     * 查看会诊详细
     * @param orgCode   会诊中心对应的orgCode
     * @param conId     会诊id
     * @param model
     * @return
     */
    @RequestMapping("/show")
    public String show(String orgCode,String conId,Model model){
        Map<String, Object> map = consultationService.show(orgCode, conId);
        model.addAttribute("result",map);
        return "Consultation_Show";
    }
    
    /**
     * 修改会诊状态
     * @param consultationId   会诊id
     * @param state            要修改的会诊状态
     * @return
     */
    @RequestMapping("/changeStatus")
    @ResponseBody
    public String changeStatus(String consultationId,int state){
        consultationService.changeStatus(consultationId,state);
        return "{\"msg\":\"success\"}";
    }
    
    /**
     * 驳回会诊
     * @param consultationId   会诊id
     * @return
     */
    @RequestMapping("/refuse")
    @ResponseBody
    public String refuse(String consultationId){
        String msg = consultationService.refuse(consultationId);
        return msg;
    }
    
    /**
     * 初始化数据  测试用
     * @return
     */
    @RequestMapping("/initData")
    @ResponseBody
    public String initData(){
        return consultationService.initData();
    }
}
