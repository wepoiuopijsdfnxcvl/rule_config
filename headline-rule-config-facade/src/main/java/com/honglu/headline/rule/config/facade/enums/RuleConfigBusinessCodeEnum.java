package com.honglu.headline.rule.config.facade.enums;

import com.honglu.headline.common.api.IEnum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 运营业务规则业务层错误代码枚举类
 *
 * @author SteveGuo
 * @date 2017-12-10 3:48 PM
 */
public enum RuleConfigBusinessCodeEnum implements IEnum<String> {

    // 示例，后期需要删除
    SUCCESS("RC0000", "成功");
    private String value;
    private String desc;

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getDesc() {
        return desc;
    }

    @Override
    public String getValue() {
        return value;
    }

    RuleConfigBusinessCodeEnum(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    @Override
    public boolean matches(String value) {
        if(null == value) {
            return false;
        }
        return Objects.equals(value, getValue());
    }

    @Override
    public boolean matches(IEnum<String> valueBean) {
        if(null == valueBean) {
            return false;
        }
        return matches(valueBean.getValue());
    }

    private static Map<String, RuleConfigBusinessCodeEnum> mappings = new HashMap<>();
    static {
        Arrays.stream(RuleConfigBusinessCodeEnum.values())
                .forEach(ruleConfigBusinessCode -> mappings.put(ruleConfigBusinessCode.getValue(), ruleConfigBusinessCode));

    }

    public static RuleConfigBusinessCodeEnum resolve(int ruleConfigBusinessCode) {
        return mappings.get(ruleConfigBusinessCode);
    }

}
