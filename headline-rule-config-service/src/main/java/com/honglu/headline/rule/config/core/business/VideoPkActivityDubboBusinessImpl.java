package com.honglu.headline.rule.config.core.business;

import com.alibaba.dubbo.config.annotation.Service;
import com.honglu.headline.rule.config.core.mapper.AvlidReadRuleDao;
import com.honglu.headline.rule.config.core.mapper.BuVideoPkActivityDao;
import com.honglu.headline.rule.config.facade.business.AvlidReadRuleDubboBusiness;
import com.honglu.headline.rule.config.facade.business.VideoPkActivityDubboBusiness;
import com.honglu.headline.rule.config.facade.domain.AvlidRead;
import com.honglu.headline.rule.config.facade.domain.BuVideoPkActivity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;

@Service(version = "1.0.0")
public class VideoPkActivityDubboBusinessImpl implements VideoPkActivityDubboBusiness {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private BuVideoPkActivityDao buVideoPkActivityDao;


    @Override
    public List<BuVideoPkActivity> queryAllVideoPkActivity(HashMap<String, Object> paramValue) {
        List<BuVideoPkActivity> buVideoPkActivityList = null;
        try {
            buVideoPkActivityList =  buVideoPkActivityDao.queryAllBuVideoPk(paramValue);
        } catch (Exception e) {
            logger.error("queryAllVideoPkActivity()查询异常：" + e.getMessage());
            e.printStackTrace();
            throw new RuntimeException("queryAllVideoPkActivity()查询异常：" + e.getMessage());
        }
        return buVideoPkActivityList;
    }


}
