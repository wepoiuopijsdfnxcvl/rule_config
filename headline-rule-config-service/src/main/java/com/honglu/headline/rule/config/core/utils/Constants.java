package com.honglu.headline.rule.config.core.utils;


/**
 * 系统全局常量类
 * @author 
 *
 */
public class Constants {
	
	public static final String CODE = "code";
	public static final String MESSAGE = "message";
	public static final String SUCCESSED = "successed";
	public static final String DATAS = "data";// 返回接口数据格式需要
	
	public static final String MSG = "msg";// 查询结果list页面需要用到
	public static final String REL = "rel"; // 查询结果list页面需要用到
	public static final String DATA = "list";// 查询结果list页面需要用到
	
	
	
	/**
	 * UTF-8编码
	 */
	public static final String UTF8 = "UTF-8";
	
	public static final String DES_PUBLIC_ENCRYPT_KEY = "CEFEH8AA"; //DES加密key 
	public static final String DES_PRIVATE_ENCRYPT_KEY ="o0al4OaEWBzA1";
	
	public static final String FILEPATH = "files";
	public static final String PICTURE = "picture"; //生产和测试库存放图片路劲(暂时，待与运维确定)
	public static final String SYSTEMCENTER= "systemCenter"; //生产和测试库取图片路劲(暂时，待与运维确定)
	
	public static final String DICTIONARY_CACHE_PRE = "backend:dict:"; //后台数据字典缓存key前缀
	public static final String DICTIONARY_CACHE_FLAG_KEY = DICTIONARY_CACHE_PRE + "flag"; //后台数据字典缓存key前缀



	/**
	 * 数据有效性状态 02-失效
	 */
	public static final String STATE_FORBIDDEN = "02";

	/**
	 * 数据有效性状态 01-生效
	 */
//	public static final String STATE_NORMAL = "01";

	
}
