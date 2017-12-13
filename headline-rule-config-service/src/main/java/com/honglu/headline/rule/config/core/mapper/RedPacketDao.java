package com.honglu.headline.rule.config.core.mapper;

import com.honglu.headline.rule.config.facade.domain.AvlidRead;
import com.honglu.headline.rule.config.facade.domain.RedPackage;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;


/**
 * BusinessParamDao数据库操作接口类bean
 * 
 * @author xk
 * @date Wed Jun 07 20:37:07 CST 2017
 **/
@Mapper
public interface RedPacketDao {

	/**
	 *
	 * 查询（根据参数编号查询状态为正常的参数）
	 *
	 **/
	List<RedPackage> queryAllRedPackage(HashMap<String, Object> paramMap);
}