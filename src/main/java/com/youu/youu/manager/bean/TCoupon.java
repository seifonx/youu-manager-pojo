package com.youu.youu.manager.bean;

public class TCoupon {
    private Integer id;

    private String couponCart;

    private Integer scenicId;

    private Double reduceMoney;

    private Double totalPrice;

    private String validTime;

    private Integer couponStatus;

    private String loginacct;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCouponCart() {
        return couponCart;
    }

    public void setCouponCart(String couponCart) {
        this.couponCart = couponCart == null ? null : couponCart.trim();
    }

    public Integer getScenicId() {
        return scenicId;
    }

    public void setScenicId(Integer scenicId) {
        this.scenicId = scenicId;
    }

    public Double getReduceMoney() {
        return reduceMoney;
    }

    public void setReduceMoney(Double reduceMoney) {
        this.reduceMoney = reduceMoney;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getValidTime() {
        return validTime;
    }

    public void setValidTime(String validTime) {
        this.validTime = validTime == null ? null : validTime.trim();
    }

    public Integer getCouponStatus() {
        return couponStatus;
    }

    public void setCouponStatus(Integer couponStatus) {
        this.couponStatus = couponStatus;
    }

    public String getLoginacct() {
        return loginacct;
    }

    public void setLoginacct(String loginacct) {
        this.loginacct = loginacct == null ? null : loginacct.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", couponCart=").append(couponCart);
        sb.append(", scenicId=").append(scenicId);
        sb.append(", reduceMoney=").append(reduceMoney);
        sb.append(", totalPrice=").append(totalPrice);
        sb.append(", validTime=").append(validTime);
        sb.append(", couponStatus=").append(couponStatus);
        sb.append(", loginacct=").append(loginacct);
        sb.append("]");
        return sb.toString();
    }
}