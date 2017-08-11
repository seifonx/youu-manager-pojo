package com.youu.youu.manager.bean;

import javax.persistence.Table;

@Table
public class TJourneySceni {
    private Integer scenicId;

    private Integer journeyId;

    public Integer getScenicId() {
        return scenicId;
    }

    public void setScenicId(Integer scenicId) {
        this.scenicId = scenicId;
    }

    public Integer getJourneyId() {
        return journeyId;
    }

    public void setJourneyId(Integer journeyId) {
        this.journeyId = journeyId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", scenicId=").append(scenicId);
        sb.append(", journeyId=").append(journeyId);
        sb.append("]");
        return sb.toString();
    }
}