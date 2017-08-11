package com.youu.youu.manager.bean;

import java.util.Date;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="message_model")
public class MessageModel {
	@Id
    private Integer id;

    private Integer managerid;

    private String modelConten;

    private Date date;

    private String describe;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getManagerid() {
        return managerid;
    }

    public void setManagerid(Integer managerid) {
        this.managerid = managerid;
    }

    public String getModelConten() {
        return modelConten;
    }

    public void setModelConten(String modelConten) {
        this.modelConten = modelConten == null ? null : modelConten.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", managerid=").append(managerid);
        sb.append(", modelConten=").append(modelConten);
        sb.append(", date=").append(date);
        sb.append(", describe=").append(describe);
        sb.append("]");
        return sb.toString();
    }
}