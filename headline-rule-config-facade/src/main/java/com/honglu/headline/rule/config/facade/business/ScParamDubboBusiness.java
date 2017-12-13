package com.honglu.headline.rule.config.facade.business;

import com.honglu.headline.rule.config.facade.domain.ScParam;

public interface ScParamDubboBusiness {

    public ScParam querySysParamByParamValueRedis(String paramValue);

}
