package com.youu.youu.manager.bean;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="t_role_permiss")
public class TRolePermiss {
	@Id
    private Integer id;

    private Integer roleid;

    private Integer permissid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getPermissid() {
        return permissid;
    }

    public void setPermissid(Integer permissid) {
        this.permissid = permissid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", roleid=").append(roleid);
        sb.append(", permissid=").append(permissid);
        sb.append("]");
        return sb.toString();
    }
}