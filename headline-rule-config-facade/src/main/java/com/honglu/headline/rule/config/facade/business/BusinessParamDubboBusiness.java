package com.honglu.headline.rule.config.facade.business;

import com.honglu.headline.rule.config.facade.domain.BusinessParam;

/**
 * @author panxiaokui
 * 查询业务参数表
 * paramCode 业务参数表的code
 */
public interface BusinessParamDubboBusiness {

    public BusinessParam getBusinessParamByParamCode(String paramCode);

}
