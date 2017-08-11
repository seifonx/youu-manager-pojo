package com.youu.youu.manager.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="t_blog")
public class TBlog {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
    private Integer blogId;

    private Integer userId;

    private String blogTitle;

    private String userName;

    private String blogDate;

    private String blogType;

    private Integer blogView;

    private String blogImg;

    private String blogContent;

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle == null ? null : blogTitle.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getBlogDate() {
        return blogDate;
    }

    public void setBlogDate(String blogDate) {
        this.blogDate = blogDate == null ? null : blogDate.trim();
    }

    public String getBlogType() {
        return blogType;
    }

    public void setBlogType(String blogType) {
        this.blogType = blogType == null ? null : blogType.trim();
    }

    public Integer getBlogView() {
        return blogView;
    }

    public void setBlogView(Integer blogView) {
        this.blogView = blogView;
    }

    public String getBlogImg() {
        return blogImg;
    }

    public void setBlogImg(String blogImg) {
        this.blogImg = blogImg == null ? null : blogImg.trim();
    }

    public String getBlogContent() {
        return blogContent;
    }

    public void setBlogContent(String blogContent) {
        this.blogContent = blogContent == null ? null : blogContent.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", blogId=").append(blogId);
        sb.append(", userId=").append(userId);
        sb.append(", blogTitle=").append(blogTitle);
        sb.append(", userName=").append(userName);
        sb.append(", blogDate=").append(blogDate);
        sb.append(", blogType=").append(blogType);
        sb.append(", blogView=").append(blogView);
        sb.append(", blogImg=").append(blogImg);
        sb.append(", blogContent=").append(blogContent);
        sb.append("]");
        return sb.toString();
    }
}