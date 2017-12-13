package com.honglu.headline.rule.config.core.business;

import com.alibaba.dubbo.config.annotation.Service;
import com.honglu.headline.rule.config.core.mapper.AvlidReadRuleDao;
import com.honglu.headline.rule.config.core.mapper.RedLevelDao;
import com.honglu.headline.rule.config.facade.business.AvlidReadRuleDubboBusiness;
import com.honglu.headline.rule.config.facade.business.RedLevelDubboBusiness;
import com.honglu.headline.rule.config.facade.domain.AvlidRead;
import com.honglu.headline.rule.config.facade.domain.RedLevel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;

@Service(version = "1.0.0")
public class AvlidReadRuleDubboBusinessImpl implements AvlidReadRuleDubboBusiness {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private AvlidReadRuleDao avlidReadRuleDao;

    @Override
    public List<AvlidRead> queryAllAvlidReadRule(HashMap<String, Object> paramMap) {
        List<AvlidRead> avlidReadList = null;
        try {
            avlidReadList =  avlidReadRuleDao.queryAllAvlidRead(paramMap);
        } catch (Exception e) {
            logger.error("queryAllAvlidReadRule()查询异常：" + e.getMessage());
            e.printStackTrace();
            throw new RuntimeException("queryAllAvlidReadRule()查询异常：" + e.getMessage());
        }
        return avlidReadList;

}
   /* @Override
    public List<RedLevel> queryAllRedLevel(String paramValue) {

        List<RedLevel> redLevelList = null;

        try {
            redLevelList =  redLevelDao.queryAllRedLevel(new HashMap<String,Object>());
        } catch (Throwable e) {
            logger.error("queryAllRedLevel()查询异常：" + e.getMessage());
            e.printStackTrace();
            throw new RuntimeException("queryAllRedLevel()查询异常：" + e.getMessage());
        }

          return redLevelList;

    }*/

}
