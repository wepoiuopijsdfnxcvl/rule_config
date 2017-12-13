package com.honglu.headline.rule.config.facade.business;

import com.honglu.headline.rule.config.facade.domain.AvlidRead;
import com.honglu.headline.rule.config.facade.domain.RedLevel;

import java.util.HashMap;
import java.util.List;

public interface AvlidReadRuleDubboBusiness {

    public List<AvlidRead> queryAllAvlidReadRule(HashMap<String,Object> paramValue);



}
