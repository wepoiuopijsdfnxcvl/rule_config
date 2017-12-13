package com.honglu.headline.rule.config.core.business;

import com.alibaba.dubbo.config.annotation.Service;
import com.honglu.headline.rule.config.core.mapper.AvlidReadRuleDao;
import com.honglu.headline.rule.config.core.mapper.RedPacketDao;
import com.honglu.headline.rule.config.facade.business.AvlidReadRuleDubboBusiness;
import com.honglu.headline.rule.config.facade.business.RedPacketDubboBusiness;
import com.honglu.headline.rule.config.facade.domain.AvlidRead;
import com.honglu.headline.rule.config.facade.domain.RedPackage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;

@Service(version = "1.0.0")
public class RedPacketDubboBusinessImpl implements RedPacketDubboBusiness {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private RedPacketDao redPacketDao;

    @Override
    public List<RedPackage> queryAllRedPacket(HashMap<String, Object> paramValue) {
        List<RedPackage> redPackageList = null;
        try {
            redPackageList =  redPacketDao.queryAllRedPackage(paramValue);
        } catch (Exception e) {
            logger.error("queryAllRedPacket()查询异常：" + e.getMessage());
            e.printStackTrace();
            throw new RuntimeException("queryAllRedPacket()查询异常：" + e.getMessage());
        }
        return redPackageList;
    }

}
