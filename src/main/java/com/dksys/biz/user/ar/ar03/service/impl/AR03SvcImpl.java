package com.dksys.biz.user.ar.ar03.service.impl;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dksys.biz.user.ar.ar03.mapper.AR03Mapper;
import com.dksys.biz.user.ar.ar03.service.AR03Svc;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

@Service
public class AR03SvcImpl implements AR03Svc {

	@Autowired
    AR03Mapper ar03Mapper;
	
	@Override
	public int selectCaryngCount(Map<String, String> paramMap) {
		return ar03Mapper.selectCaryngCount(paramMap);
	}

	@Override
	public List<Map<String, String>> selectCaryngList(Map<String, String> paramMap) {
		return ar03Mapper.selectCaryngList(paramMap);
	}
	
	@Override
	public Map<String, String> selectCaryngInfo(Map<String, String> paramMap) {
		return ar03Mapper.selectCaryngInfo(paramMap);
	}
	
	@Override
	public int selectShipCount(Map<String, String> paramMap) {
		return ar03Mapper.selectShipCount(paramMap);
	}

	@Override
	public List<Map<String, String>> selectShipList(Map<String, String> paramMap) {
		return ar03Mapper.selectShipList(paramMap);
	}
	
	@Override
	public int insertCaryng(Map<String, String> param) {
		return ar03Mapper.insertCaryng(param);
	}

	@Override
	public int updateCaryng(Map<String, String> param) {
		return ar03Mapper.updateCaryng(param);
	}

	@Override
	public int deleteTrans(Map<String, String> paramMap) {
    	return ar03Mapper.deleteTrans(paramMap);
	}

	@Override
	@SuppressWarnings("all")
	public int updateProcYn(Map<String, Object> param) {
		int result = 0;
		List<Map<String, String>> detailList = (List<Map<String, String>>) param.get("detailArr");
		for(Map<String, String> detailMap : detailList) {
			result += ar03Mapper.updateProcYn(detailMap);
		}
		return result;
	}

}