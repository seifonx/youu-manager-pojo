package com.youu.youu.manager.bean;

public class TScenicdetails {
    private Integer scenicId;

    private String scenicName;

    private String scenicLocation;

    private String scenicDetails;

    private String province;

    private String city;

    private String pictureUrl;

    private Double ticketPrice;

    public Integer getScenicId() {
        return scenicId;
    }

    public void setScenicId(Integer scenicId) {
        this.scenicId = scenicId;
    }

    public String getScenicName() {
        return scenicName;
    }

    public void setScenicName(String scenicName) {
        this.scenicName = scenicName == null ? null : scenicName.trim();
    }

    public String getScenicLocation() {
        return scenicLocation;
    }

    public void setScenicLocation(String scenicLocation) {
        this.scenicLocation = scenicLocation == null ? null : scenicLocation.trim();
    }

    public String getScenicDetails() {
        return scenicDetails;
    }

    public void setScenicDetails(String scenicDetails) {
        this.scenicDetails = scenicDetails == null ? null : scenicDetails.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl == null ? null : pictureUrl.trim();
    }

    public Double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(Double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", scenicId=").append(scenicId);
        sb.append(", scenicName=").append(scenicName);
        sb.append(", scenicLocation=").append(scenicLocation);
        sb.append(", scenicDetails=").append(scenicDetails);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", pictureUrl=").append(pictureUrl);
        sb.append(", ticketPrice=").append(ticketPrice);
        sb.append("]");
        return sb.toString();
    }
}