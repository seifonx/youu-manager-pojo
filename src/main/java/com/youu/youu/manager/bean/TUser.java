package com.youu.youu.manager.bean;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="t_user")
public class TUser {
	@Id
    private Integer id;

    private String loginacct;

    private String username;

    private String password;

    private String email;

    private Integer phoneNum;

    private Integer gender;

    private Integer loginStatus;

    private String token;

    private String createDate;

    private String nowDate;

    private String lastDate;

    private Integer blogNum;

    private Integer level;

    private String relativeFilePath;

    private String idCard;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginacct() {
        return loginacct;
    }

    public void setLoginacct(String loginacct) {
        this.loginacct = loginacct == null ? null : loginacct.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(Integer phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(Integer loginStatus) {
        this.loginStatus = loginStatus;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate == null ? null : createDate.trim();
    }

    public String getNowDate() {
        return nowDate;
    }

    public void setNowDate(String nowDate) {
        this.nowDate = nowDate == null ? null : nowDate.trim();
    }

    public String getLastDate() {
        return lastDate;
    }

    public void setLastDate(String lastDate) {
        this.lastDate = lastDate == null ? null : lastDate.trim();
    }

    public Integer getBlogNum() {
        return blogNum;
    }

    public void setBlogNum(Integer blogNum) {
        this.blogNum = blogNum;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getRelativeFilePath() {
        return relativeFilePath;
    }

    public void setRelativeFilePath(String relativeFilePath) {
        this.relativeFilePath = relativeFilePath == null ? null : relativeFilePath.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", loginacct=").append(loginacct);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", email=").append(email);
        sb.append(", phoneNum=").append(phoneNum);
        sb.append(", gender=").append(gender);
        sb.append(", loginStatus=").append(loginStatus);
        sb.append(", token=").append(token);
        sb.append(", createDate=").append(createDate);
        sb.append(", nowDate=").append(nowDate);
        sb.append(", lastDate=").append(lastDate);
        sb.append(", blogNum=").append(blogNum);
        sb.append(", level=").append(level);
        sb.append(", relativeFilePath=").append(relativeFilePath);
        sb.append(", idCard=").append(idCard);
        sb.append("]");
        return sb.toString();
    }
}