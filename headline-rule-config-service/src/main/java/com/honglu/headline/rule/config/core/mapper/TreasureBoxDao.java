package com.honglu.headline.rule.config.core.mapper;

import com.honglu.headline.rule.config.facade.domain.ScBoxCollection;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

/**
 * TreasureBox dao
 * @author allan
 * @Date 2017/12/28 17:29
 */
@Mapper
public interface TreasureBoxDao {

    public List<ScBoxCollection> queryListBy(HashMap<String, Object> param);
}
