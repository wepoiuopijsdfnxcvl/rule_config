package com.honglu.headline.rule.config.core.business;

import com.alibaba.dubbo.config.annotation.Service;
import com.honglu.headline.rule.config.core.mapper.TreasureBoxDao;
import com.honglu.headline.rule.config.facade.business.TreasureBoxDubboBusiness;
import com.honglu.headline.rule.config.facade.domain.AvlidRead;
import com.honglu.headline.rule.config.facade.domain.ScBoxCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;

/**
 * 宝箱活动Dubbo impl
 * @author allan
 * @Date 2017/12/28 17:18
 */
@Service(version = "1.0.0")
public class TreasureBoxDubboBusinessImpl implements TreasureBoxDubboBusiness {

    private Logger logger = LoggerFactory.getLogger(TreasureBoxDubboBusinessImpl.class);

    @Autowired
    private TreasureBoxDao treasureBoxDao;

    @Override
    public List<ScBoxCollection> queryListBy(HashMap<String, Object> param) {

        List<ScBoxCollection> boxList = null;
        try {
            boxList =  treasureBoxDao.queryListBy(param);
        } catch (Exception e) {
            logger.error("queryListBy()查询异常：" + e.getMessage());
            e.printStackTrace();
            throw new RuntimeException("queryListBy()查询异常：" + e.getMessage());
        }
        return boxList;

    }
}
