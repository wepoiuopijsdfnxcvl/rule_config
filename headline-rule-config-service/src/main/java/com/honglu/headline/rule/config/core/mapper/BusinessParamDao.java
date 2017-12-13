package com.honglu.headline.rule.config.core.mapper;

import com.honglu.headline.rule.config.facade.domain.BusinessParam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * BusinessParamDao数据库操作接口类bean
 * 
 * @author xk
 * @date Wed Jun 07 20:37:07 CST 2017
 **/
@Mapper
public interface BusinessParamDao {

	/**
	 * 
	 * 查询（根据主键ID查询）
	 * 
	 **/
	BusinessParam selectByPrimaryKey(Integer BusinessParamId);

	/**
	 * 
	 * 删除（根据主键ID删除）
	 * 
	 **/
	int deleteByPrimaryKey(String BusinessParamId);

	/**
	 * 
	 * 添加
	 * 
	 **/
	int insert(BusinessParam BusinessParam);

	/**
	 * 
	 * 添加 （匹配有值的字段）
	 * 
	 **/
	boolean insertSelective(BusinessParam BusinessParam);

	/**
	 * 
	 * 修改 （匹配有值的字段）
	 * 
	 **/
	boolean updateByPrimaryKeySelective(BusinessParam BusinessParam);

	/**
	 * 
	 * 修改（根据主键ID修改）
	 * 
	 **/
	int updateByPrimaryKey(BusinessParam BusinessParam);

	public int listAllCount(BusinessParam BusinessParam);

	List<BusinessParam> getAll(BusinessParam BusinessParam);

	/**
	 * 
	 * 查询（根据参数编号查询）
	 * 
	 **/
	BusinessParam queryByParamValue(String paramValue);

	/**
	 * 
	 * 查询（根据参数编号查询状态为正常的参数）
	 * 
	 **/
	BusinessParam queryByParamValueAndStatue(String paramValue);
}