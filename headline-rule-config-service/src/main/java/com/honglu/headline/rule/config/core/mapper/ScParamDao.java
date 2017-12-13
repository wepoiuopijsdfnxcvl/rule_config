package com.honglu.headline.rule.config.core.mapper;


import com.honglu.headline.rule.config.facade.domain.ScParam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ScParamDao数据库操作接口类bean
 * 
 * @author xk
 * @date 
 **/
@Mapper
public interface ScParamDao {

	/**
	 * 
	 * 查询（根据主键ID查询）
	 * 
	 **/
	ScParam selectByPrimaryKey(Integer ScParamId);

	/**
	 * 
	 * 删除（根据主键ID删除）
	 * 
	 **/
	int deleteByPrimaryKey(String ScParamId);

	/**
	 * 
	 * 添加
	 * 
	 **/
	int insert(ScParam ScParam);

	/**
	 * 
	 * 添加 （匹配有值的字段）
	 * 
	 **/
	boolean insertSelective(ScParam ScParam);

	/**
	 * 
	 * 修改 （匹配有值的字段）
	 * 
	 **/
	boolean updateByPrimaryKeySelective(ScParam ScParam);

	/**
	 * 
	 * 修改（根据主键ID修改）
	 * 
	 **/
	int updateByPrimaryKey(ScParam ScParam);

	public int listAllCount(ScParam ScParam);

	List<ScParam> getAll(ScParam ScParam);

	/**
	 * 
	 * 查询（根据参数编号查询）
	 * 
	 **/
	ScParam queryByParamValue(String paramValue);

	/**
	 * 
	 * 查询（根据参数编号查询状态为正常的参数）
	 * 
	 **/
	ScParam queryByParamValueAndStatue(String paramValue);

}