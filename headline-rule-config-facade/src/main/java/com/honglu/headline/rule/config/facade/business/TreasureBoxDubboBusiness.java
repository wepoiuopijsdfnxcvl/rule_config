package com.honglu.headline.rule.config.facade.business;

import com.honglu.headline.rule.config.facade.domain.ScBoxCollection;

import java.util.HashMap;
import java.util.List;

/**
 * 宝箱活动业务dubbo
 * @author allan
 * @Date 2017/12/28 17:16
 */
public interface TreasureBoxDubboBusiness {

    public List<ScBoxCollection> queryListBy(HashMap<String, Object> param);
}
