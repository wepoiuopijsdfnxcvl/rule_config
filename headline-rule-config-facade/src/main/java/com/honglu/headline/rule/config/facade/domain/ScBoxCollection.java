package com.honglu.headline.rule.config.facade.domain;


import java.io.Serializable;
import java.util.Date;

public class ScBoxCollection implements Serializable {
    private String boxCollectionId;

    private String amount;

    private Long efficientTime;

    private String beginTime;

    private String endTime;

    private Integer boxOrder;

    private Integer boxStatus;

    private Date createTime;

    private Date updateTime;

    public String getBoxCollectionId() {
        return boxCollectionId;
    }

    public void setBoxCollectionId(String boxCollectionId) {
        this.boxCollectionId = boxCollectionId == null ? null : boxCollectionId.trim();
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount == null ? null : amount.trim();
    }

    public Long getEfficientTime() {
        return efficientTime;
    }

    public void setEfficientTime(Long efficientTime) {
        this.efficientTime = efficientTime;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Integer getBoxOrder() {
        return boxOrder;
    }

    public void setBoxOrder(Integer boxOrder) {
        this.boxOrder = boxOrder;
    }

    public Integer getBoxStatus() {
        return boxStatus;
    }

    public void setBoxStatus(Integer boxStatus) {
        this.boxStatus = boxStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}