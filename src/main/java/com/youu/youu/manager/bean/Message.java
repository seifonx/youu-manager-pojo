package com.youu.youu.manager.bean;

import java.util.Date;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="message")
public class Message {
	@Id
    private Integer id;

    private String userid;

    private Integer msgModelId;

    private String msgContent;

    private Date date;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Integer getMsgModelId() {
        return msgModelId;
    }

    public void setMsgModelId(Integer msgModelId) {
        this.msgModelId = msgModelId;
    }

    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent == null ? null : msgContent.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userid=").append(userid);
        sb.append(", msgModelId=").append(msgModelId);
        sb.append(", msgContent=").append(msgContent);
        sb.append(", date=").append(date);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}