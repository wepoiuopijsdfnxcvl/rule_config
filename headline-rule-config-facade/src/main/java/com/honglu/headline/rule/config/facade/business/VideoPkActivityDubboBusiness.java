package com.honglu.headline.rule.config.facade.business;

import com.honglu.headline.rule.config.facade.domain.AvlidRead;
import com.honglu.headline.rule.config.facade.domain.BuVideoPkActivity;

import java.util.HashMap;
import java.util.List;

public interface VideoPkActivityDubboBusiness {

    public List<BuVideoPkActivity> queryAllVideoPkActivity(HashMap<String, Object> paramValue);



}
