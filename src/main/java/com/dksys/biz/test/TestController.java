package com.dksys.biz.test;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.dksys.biz.admin.cm.cm02.service.CM02Svc;

@Controller
public class TestController {
    
	@Autowired
	CM02Svc roleService;
	
    // 엑셀 다운로드
	@GetMapping(path="/download/sample")
    public String selectAllUser(ModelMap model) {
		List<Map<String, String>> roleList = roleService.selectRoleList();
		model.addAttribute("excelData", roleList);
        return "excelView";
    }
    
}
