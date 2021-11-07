package com.example.demo.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 系统日志表
 * @TableName sys_log
 */
public class SysLog implements Serializable {
    /**
     * 
     */
    private String id;

    /**
     * 日志类型（1登录日志，2操作日志）
     */
    private Integer logType;

    /**
     * 日志内容
     */
    private String logContent;

    /**
     * 操作类型
     */
    private Integer operateType;

    /**
     * 操作用户账号
     */
    private String userid;

    /**
     * 操作用户名称
     */
    private String username;

    /**
     * IP
     */
    private String ip;

    /**
     * 请求java方法
     */
    private String method;

    /**
     * 请求路径
     */
    private String requestUrl;

    /**
     * 请求参数
     */
    private String requestParam;

    /**
     * 请求类型
     */
    private String requestType;

    /**
     * 耗时
     */
    private Long costTime;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新人
     */
    private String updateBy;

    /**
     * 更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public String getId() {
        return id;
    }

    /**
     * 
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 日志类型（1登录日志，2操作日志）
     */
    public Integer getLogType() {
        return logType;
    }

    /**
     * 日志类型（1登录日志，2操作日志）
     */
    public void setLogType(Integer logType) {
        this.logType = logType;
    }

    /**
     * 日志内容
     */
    public String getLogContent() {
        return logContent;
    }

    /**
     * 日志内容
     */
    public void setLogContent(String logContent) {
        this.logContent = logContent;
    }

    /**
     * 操作类型
     */
    public Integer getOperateType() {
        return operateType;
    }

    /**
     * 操作类型
     */
    public void setOperateType(Integer operateType) {
        this.operateType = operateType;
    }

    /**
     * 操作用户账号
     */
    public String getUserid() {
        return userid;
    }

    /**
     * 操作用户账号
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * 操作用户名称
     */
    public String getUsername() {
        return username;
    }

    /**
     * 操作用户名称
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * IP
     */
    public String getIp() {
        return ip;
    }

    /**
     * IP
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * 请求java方法
     */
    public String getMethod() {
        return method;
    }

    /**
     * 请求java方法
     */
    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * 请求路径
     */
    public String getRequestUrl() {
        return requestUrl;
    }

    /**
     * 请求路径
     */
    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    /**
     * 请求参数
     */
    public String getRequestParam() {
        return requestParam;
    }

    /**
     * 请求参数
     */
    public void setRequestParam(String requestParam) {
        this.requestParam = requestParam;
    }

    /**
     * 请求类型
     */
    public String getRequestType() {
        return requestType;
    }

    /**
     * 请求类型
     */
    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    /**
     * 耗时
     */
    public Long getCostTime() {
        return costTime;
    }

    /**
     * 耗时
     */
    public void setCostTime(Long costTime) {
        this.costTime = costTime;
    }

    /**
     * 创建人
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 创建人
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新人
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * 更新人
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SysLog other = (SysLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLogType() == null ? other.getLogType() == null : this.getLogType().equals(other.getLogType()))
            && (this.getLogContent() == null ? other.getLogContent() == null : this.getLogContent().equals(other.getLogContent()))
            && (this.getOperateType() == null ? other.getOperateType() == null : this.getOperateType().equals(other.getOperateType()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getIp() == null ? other.getIp() == null : this.getIp().equals(other.getIp()))
            && (this.getMethod() == null ? other.getMethod() == null : this.getMethod().equals(other.getMethod()))
            && (this.getRequestUrl() == null ? other.getRequestUrl() == null : this.getRequestUrl().equals(other.getRequestUrl()))
            && (this.getRequestParam() == null ? other.getRequestParam() == null : this.getRequestParam().equals(other.getRequestParam()))
            && (this.getRequestType() == null ? other.getRequestType() == null : this.getRequestType().equals(other.getRequestType()))
            && (this.getCostTime() == null ? other.getCostTime() == null : this.getCostTime().equals(other.getCostTime()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLogType() == null) ? 0 : getLogType().hashCode());
        result = prime * result + ((getLogContent() == null) ? 0 : getLogContent().hashCode());
        result = prime * result + ((getOperateType() == null) ? 0 : getOperateType().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getIp() == null) ? 0 : getIp().hashCode());
        result = prime * result + ((getMethod() == null) ? 0 : getMethod().hashCode());
        result = prime * result + ((getRequestUrl() == null) ? 0 : getRequestUrl().hashCode());
        result = prime * result + ((getRequestParam() == null) ? 0 : getRequestParam().hashCode());
        result = prime * result + ((getRequestType() == null) ? 0 : getRequestType().hashCode());
        result = prime * result + ((getCostTime() == null) ? 0 : getCostTime().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", logType=").append(logType);
        sb.append(", logContent=").append(logContent);
        sb.append(", operateType=").append(operateType);
        sb.append(", userid=").append(userid);
        sb.append(", username=").append(username);
        sb.append(", ip=").append(ip);
        sb.append(", method=").append(method);
        sb.append(", requestUrl=").append(requestUrl);
        sb.append(", requestParam=").append(requestParam);
        sb.append(", requestType=").append(requestType);
        sb.append(", costTime=").append(costTime);
        sb.append(", createBy=").append(createBy);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}