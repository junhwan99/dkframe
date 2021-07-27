package com.dksys.biz.user.ifsys.ifar01.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IFAR01Mapper {

	void insertIfMesStockMove(Map<String, String> detailMap); /* 일반 재고이동 */

	void insertIfMesStockIn(Map<String, String> detailMap); /* 제강사 턴키 일괄 재고 이동 */
	
}