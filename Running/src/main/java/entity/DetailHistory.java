package entity;

import java.util.Date;

public class DetailHistory {			//交易记录表
	private Integer dId;		//消费id
	private Integer orderNo;	//订单号
	private String dName;		//订单名字
	private Date buyTime;		//订单时间
	private Integer dCount;		//订单数量
	private double oldPrice;	//原单价
	private double oldSum;		//原需支付总价格
	private double newPrice;	//优惠后新价格
	private double newSum;		//优惠后实际支付总价
	private String remark;		//订单的备注
	public Integer getdId() {
		return dId;
	}
	public void setdId(Integer dId) {
		this.dId = dId;
	}
	public Integer getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public Date getBuyTime() {
		return buyTime;
	}
	public void setBuyTime(Date buyTime) {
		this.buyTime = buyTime;
	}
	public Integer getdCount() {
		return dCount;
	}
	public void setdCount(Integer dCount) {
		this.dCount = dCount;
	}
	public double getOldPrice() {
		return oldPrice;
	}
	public void setOldPrice(double oldPrice) {
		this.oldPrice = oldPrice;
	}
	public double getOldSum() {
		return oldSum;
	}
	public void setOldSum(double oldSum) {
		this.oldSum = oldSum;
	}
	public double getNewPrice() {
		return newPrice;
	}
	public void setNewPrice(double newPrice) {
		this.newPrice = newPrice;
	}
	public double getNewSum() {
		return newSum;
	}
	public void setNewSum(double newSum) {
		this.newSum = newSum;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public DetailHistory(Integer dId, Integer orderNo, String dName, Date buyTime, Integer dCount, double oldPrice,
			double oldSum, double newPrice, double newSum, String remark) {
		super();
		this.dId = dId;
		this.orderNo = orderNo;
		this.dName = dName;
		this.buyTime = buyTime;
		this.dCount = dCount;
		this.oldPrice = oldPrice;
		this.oldSum = oldSum;
		this.newPrice = newPrice;
		this.newSum = newSum;
		this.remark = remark;
	}
	public DetailHistory() {
		super();
	}
	@Override
	public String toString() {
		return "detailHistory [dId=" + dId + ", orderNo=" + orderNo + ", dName=" + dName + ", buyTime=" + buyTime
				+ ", dCount=" + dCount + ", oldPrice=" + oldPrice + ", oldSum=" + oldSum + ", newPrice=" + newPrice
				+ ", newSum=" + newSum + ", remark=" + remark + "]";
	}
	
}
