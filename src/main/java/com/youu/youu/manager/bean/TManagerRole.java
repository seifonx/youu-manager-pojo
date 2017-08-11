package com.youu.youu.manager.bean;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="t_manager_role")
public class TManagerRole {
	@Id
    private Integer id;

    private String managerid;

    private Integer roleid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getManagerid() {
        return managerid;
    }

    public void setManagerid(String managerid) {
        this.managerid = managerid;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", managerid=").append(managerid);
        sb.append(", roleid=").append(roleid);
        sb.append("]");
        return sb.toString();
    }
}