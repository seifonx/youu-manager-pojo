package com.youu.youu.manager.bean;

import javax.persistence.Table;

@Table(name="t_scenicreview")
public class TScenicreview {
    private Integer id;

    private String scenicName;

    private String userName;

    private String scenicReview;

    private String reviewDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getScenicName() {
        return scenicName;
    }

    public void setScenicName(String scenicName) {
        this.scenicName = scenicName == null ? null : scenicName.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getScenicReview() {
        return scenicReview;
    }

    public void setScenicReview(String scenicReview) {
        this.scenicReview = scenicReview == null ? null : scenicReview.trim();
    }

    public String getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(String reviewDate) {
        this.reviewDate = reviewDate == null ? null : reviewDate.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", scenicName=").append(scenicName);
        sb.append(", userName=").append(userName);
        sb.append(", scenicReview=").append(scenicReview);
        sb.append(", reviewDate=").append(reviewDate);
        sb.append("]");
        return sb.toString();
    }
}