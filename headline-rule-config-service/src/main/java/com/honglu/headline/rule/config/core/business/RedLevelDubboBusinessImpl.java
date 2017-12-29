package com.honglu.headline.rule.config.core.business;

import com.alibaba.dubbo.config.annotation.Service;
import com.honglu.headline.rule.config.core.mapper.RedLevelDao;
import com.honglu.headline.rule.config.facade.business.RedLevelDubboBusiness;
import com.honglu.headline.rule.config.facade.domain.RedLevel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;

@Service(version = "1.0.0")
public class RedLevelDubboBusinessImpl implements RedLevelDubboBusiness {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private RedLevelDao redLevelDao;

    @Override
    public List<RedLevel> queryAllRedLevel() {

        List<RedLevel> redLevelList = null;

        try {
            redLevelList =  redLevelDao.queryAllRedLevel(new HashMap<String,Object>());
        } catch (Throwable e) {
            logger.error("queryAllRedLevel()查询异常：" + e.getMessage());
            e.printStackTrace();
            throw new RuntimeException("queryAllRedLevel()查询异常：" + e.getMessage());
        }

          return redLevelList;

    }

}
