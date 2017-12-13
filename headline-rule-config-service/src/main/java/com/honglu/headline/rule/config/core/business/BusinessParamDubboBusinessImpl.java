package com.honglu.headline.rule.config.core.business;

import com.alibaba.dubbo.config.annotation.Service;
import com.honglu.headline.common.core.redis.RedisRepository;
import com.honglu.headline.rule.config.core.mapper.BusinessParamDao;
import com.honglu.headline.rule.config.core.utils.Constants;
import com.honglu.headline.rule.config.core.utils.RedisCons;
import com.honglu.headline.rule.config.core.utils.SysParamUtils;
import com.honglu.headline.rule.config.facade.business.BusinessParamDubboBusiness;
import com.honglu.headline.rule.config.facade.domain.BusinessParam;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

@Service(version = "1.0.0")
public class BusinessParamDubboBusinessImpl implements BusinessParamDubboBusiness {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private BusinessParamDao businessParamDao;

    @Autowired
    private RedisRepository redisRepository;

    @Override
    public BusinessParam getBusinessParamByParamCode(String paramCode) {
        BusinessParam businessParam = new BusinessParam();
        // 判断系统参数信息是否已存在 123
        String value = redisRepository.hmget(RedisCons.RISK_SYS_PARAM_INFO, paramCode);
        if (StringUtils.isNotBlank(value)) {
            try {
                // 转换redis中的json为参数实体
                businessParam = (BusinessParam) SysParamUtils.JsonToBean(value, BusinessParam.class);
                if (Constants.STATE_FORBIDDEN.equals(businessParam.getStatus())) {
                    logger.error("根据参数编号查询该参数状态为无效");
                    throw new RuntimeException("根据参数编号【" + paramCode + "】查询该参数状态为无效");
                }
            } catch (Throwable e) {
                logger.error("querySysParamByParamValueRedis()String转Json服务异常：" + e.getMessage());
                e.printStackTrace();
                throw new RuntimeException("转Json服务异常,异常信息：" + e.getMessage());
            }
        } else {
            businessParam = refreshSysParamByParamValueRedis(paramCode);
        }
        return businessParam;
    }

    private BusinessParam refreshSysParamByParamValueRedis(String paramValue) {
        BusinessParam sysParam = businessParamDao.queryByParamValueAndStatue(paramValue);//根据参数编号查询状态为正常的参数
        if (sysParam == null) {
            logger.error("根据参数编号查询无数据返回, 请确认参数编号是否已配置");
            throw new RuntimeException("根据参数编号【" + paramValue + "】查询无数据返回, 请确认参数编号是否已配置");
        }
        if (Constants.STATE_FORBIDDEN.equals(sysParam.getStatus())) {
            logger.error("根据参数编号查询该参数状态为无效");
            throw new RuntimeException("根据参数编号【" + paramValue + "】查询该参数状态为无效");
        }
        redisRepository.hmset(RedisCons.RISK_SYS_PARAM_INFO, paramValue, SysParamUtils.ObjectToJson(sysParam));
        return sysParam;
    }
}
