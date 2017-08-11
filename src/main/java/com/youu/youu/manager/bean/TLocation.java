package com.youu.youu.manager.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="t_location")
public class TLocation {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
    private Integer id;

    private Integer userId;

    private String userPath;

    private Double locationLng;

    private Double locationLat;

    private String locationCity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserPath() {
        return userPath;
    }

    public void setUserPath(String userPath) {
        this.userPath = userPath == null ? null : userPath.trim();
    }

    public Double getLocationLng() {
        return locationLng;
    }

    public void setLocationLng(Double locationLng) {
        this.locationLng = locationLng;
    }

    public Double getLocationLat() {
        return locationLat;
    }

    public void setLocationLat(Double locationLat) {
        this.locationLat = locationLat;
    }

    public String getLocationCity() {
        return locationCity;
    }

    public void setLocationCity(String locationCity) {
        this.locationCity = locationCity == null ? null : locationCity.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", userPath=").append(userPath);
        sb.append(", locationLng=").append(locationLng);
        sb.append(", locationLat=").append(locationLat);
        sb.append(", locationCity=").append(locationCity);
        sb.append("]");
        return sb.toString();
    }
}