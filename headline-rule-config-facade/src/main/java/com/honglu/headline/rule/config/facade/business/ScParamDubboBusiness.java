package com.honglu.headline.rule.config.facade.business;

import com.honglu.headline.rule.config.facade.domain.ScParam;

/**
 * @author panxiaokui
 * 查询系统参数表
 * paramCode 系统参数表的code
 */
public interface ScParamDubboBusiness {

    public ScParam querySysParamByParamValueRedis(String paramValue);

}
