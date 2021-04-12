package com.dksys.biz.user.ar.ar04.service;

import java.util.List;
import java.util.Map;

public interface AR04Svc {

	int insertBilg(Map<String, Object> paramMap);
	
	public List<Map<String, String>> selectTaxBilgList(Map<String, String> param);
	
	public List<Map<String, String>> selectTaxBilgDetailList(Map<String, String> param);
	
	public int selectTaxBilgCount(Map<String, String> param);	
	
	public int selectTaxBilgDetailCount(Map<String, String> param);	
	
	public Map<String, String> selectTaxBilg(Map<String, String> param);

	public int updateTaxBilg(Map<String, String> param);

	public List<Map<String, String>> selectTaxRcvList(Map<String, String> param);
	
	public int selectTaxRcvCount(Map<String, String> param);	

	int insertTaxHd(Map<String, Object> paramMap);

	int insertTaxHdCancel(Map<String, Object> paramMap);

	int updateBilgCancel(Map<String, Object> paramMap);

	int updateBilgRvrs(Map<String, Object> paramMap);

}