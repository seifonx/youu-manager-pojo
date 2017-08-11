package com.youu.youu.manager.bean;

public class TAdpic {
    private Integer id;

    private String adpicPath;

    private Integer adpicStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdpicPath() {
        return adpicPath;
    }

    public void setAdpicPath(String adpicPath) {
        this.adpicPath = adpicPath == null ? null : adpicPath.trim();
    }

    public Integer getAdpicStatus() {
        return adpicStatus;
    }

    public void setAdpicStatus(Integer adpicStatus) {
        this.adpicStatus = adpicStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", adpicPath=").append(adpicPath);
        sb.append(", adpicStatus=").append(adpicStatus);
        sb.append("]");
        return sb.toString();
    }
}