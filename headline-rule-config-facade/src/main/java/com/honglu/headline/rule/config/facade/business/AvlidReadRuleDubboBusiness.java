package com.honglu.headline.rule.config.facade.business;

import com.honglu.headline.rule.config.facade.domain.AvlidRead;
import com.honglu.headline.rule.config.facade.domain.RedLevel;

import java.util.HashMap;
import java.util.List;
/**
 *  查询有效阅读规则
 * @author  yangyang
 *
 * **/
public interface AvlidReadRuleDubboBusiness {

    public List<AvlidRead> queryAllAvlidReadRule(HashMap<String,Object> paramValue);



}
