package com.dksys.biz.user.sm.sm09;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dksys.biz.cmn.vo.PaginationInfo;
import com.dksys.biz.user.sm.sm09.service.SM09Svc;
import com.dksys.biz.util.MessageUtils;

@Controller
@RequestMapping("/user/sm/sm09")
public class SM09Ctr {
 
	
	@Autowired
	MessageUtils messageUtils;
	
    @Autowired
    SM09Svc sm09svc;
    
    //selectStockList 재고 마스터 리스트 조회 
    @PostMapping("/selectStockList")
    public String selectUprList(@RequestBody Map<String, String> param, ModelMap model) {
    	int totalCnt = sm09svc.selectStockListCount(param);
    	PaginationInfo paginationInfo = new PaginationInfo(param, totalCnt);
    	model.addAttribute("paginationInfo", paginationInfo);
    
    	List<Map<String, String>> stockList = sm09svc.selectStockList(param);
    	model.addAttribute("stockList", stockList);
        return "jsonView";
    }
    
  //selectStockHistoryList 재고 변동 이력 리스트 조회 
    @PostMapping("/selectStockHistoryList")
    public String selectStockHistoryList(@RequestBody Map<String, String> param, ModelMap model) {
    	int totalCnt = sm09svc.selectStockHistoryListCount(param);
    	PaginationInfo paginationInfo = new PaginationInfo(param, totalCnt);
    	model.addAttribute("paginationInfo", paginationInfo);
    
    	List<Map<String, String>> stockList = sm09svc.selectStockHistoryList(param);
    	model.addAttribute("stockList", stockList);
        return "jsonView";
    }
   
}