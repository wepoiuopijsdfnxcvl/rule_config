package com.honglu.headline.rule.config.core.utils;


/**
 * redis的key常量类
 * 
 * @author xiajiyun
 *
 */
public class RedisCons {

	/** 参数配置表于redis中hash的key值 SYS_PARAM_INFO **/
	public static final String HEADLINE_SYS_PARAM_INFO = "HEADLINE_SYS_PARAM_INFO";


	/** 数据字典大类表于redis中hash的key值 RISK_DICT__BIG_CODE **/
	public static final String RISK_DICT_BIG_CODE = "RISK_DICT_BIG_CODE";

	/** 数据字典小类表于redis中hash的key值 RISK_DICT__SMALL_CODE **/
	public static final String RISK_DICT_SMALL_CODE = "RISK_DICT_SMALL_CODE";


	/**
	 * 用户登录失败于Redis中的hash的key值
	 */
	public static final String LOGIN_FLAG_USER_CODE = "login_flag_user:";

	/** add: kenzhao, 数据字典小类表于redis中hash的key值 GET_RISK_DICT_SMALL_CODE_MAP **/
	public static final String GET_RISK_DICT_SMALL_CODE_MAP = "SJZD:GET_RISK_DICT_SMALL_CODE_MAP:";

	/** add: xiajiyun, 数据字典小类表于redis中hash的key值 GET_RISK_DICT_SMALL_CODE **/
	public static final String GET_RISK_DICT_SMALL_CODE = "SJZD:GET_RISK_DICT_SMALL_CODE:";

	/** add: ken, 数据字典小类表于redis中hash的key值，包含失败 GET_RISK_DICT_SMALL_CODE **/
	public static final String GET_RISK_DICT_SMALL_CODE_STATUS = "SJZD:GET_ALL_DICT_SMALL_CODE:";

	/** 业务参数配置表于redis中hash的key值  **/
	public static final String HEADLINE_BUSINESS_PARAM_INFO = "HEADLINE_BUSINESS_PARAM_INFO";

	/** 提升额度比例于redis中hash的key值 DEFAULT_PROMOTION_QUOTA **/
	public static final String  DEFAULT_PROMOTION_QUOTA = "DEFAULT_PROMOTION_QUOTA";

	/** 业务参数配置表于redis中hash的key值 RISK_BUSINESS_PARAM_INFO **/
	public static final String RISK_BUSINESS_PARAM_INFO = "RISK_BUSINESS_PARAM_INFO";


}
