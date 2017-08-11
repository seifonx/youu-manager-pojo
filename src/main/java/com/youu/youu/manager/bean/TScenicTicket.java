package com.youu.youu.manager.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="t_scenic_ticket")
public class TScenicTicket {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
    private Integer id;

    private String ticketCart;

    private Integer scenicId;

    private String idCard;

    private Integer phoneNum;

    private Integer payStatus;

    private String payTime;

    private String orderTime;

    private String loginacct;

    private String orderId;

    private String validTime;

    private Double orderMoney;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTicketCart() {
        return ticketCart;
    }

    public void setTicketCart(String ticketCart) {
        this.ticketCart = ticketCart == null ? null : ticketCart.trim();
    }

    public Integer getScenicId() {
        return scenicId;
    }

    public void setScenicId(Integer scenicId) {
        this.scenicId = scenicId;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public Integer getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(Integer phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime == null ? null : payTime.trim();
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime == null ? null : orderTime.trim();
    }

    public String getLoginacct() {
        return loginacct;
    }

    public void setLoginacct(String loginacct) {
        this.loginacct = loginacct == null ? null : loginacct.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getValidTime() {
        return validTime;
    }

    public void setValidTime(String validTime) {
        this.validTime = validTime == null ? null : validTime.trim();
    }

    public Double getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(Double orderMoney) {
        this.orderMoney = orderMoney;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", ticketCart=").append(ticketCart);
        sb.append(", scenicId=").append(scenicId);
        sb.append(", idCard=").append(idCard);
        sb.append(", phoneNum=").append(phoneNum);
        sb.append(", payStatus=").append(payStatus);
        sb.append(", payTime=").append(payTime);
        sb.append(", orderTime=").append(orderTime);
        sb.append(", loginacct=").append(loginacct);
        sb.append(", orderId=").append(orderId);
        sb.append(", validTime=").append(validTime);
        sb.append(", orderMoney=").append(orderMoney);
        sb.append("]");
        return sb.toString();
    }
}