package entity;

import java.util.Date;

public class Locker {		//储物柜类

	private Integer lId;		//储物柜id
	private Integer lNum;		//储物柜编号
	private String lName;		//储物柜名字
	private Date fromDay;		//开始时间
	private Date endDay;		//结束时间
	private Integer state;		//状态  0:空闲;1使用
	private Integer userNo;		//会员卡号
	private double paySum;		//租金总和
	private double returnPay;	//押金
	private double unitCost;	//单价
	private String units;		//单位
	private String remark;		//备注
	public Integer getlId() {
		return lId;
	}
	public void setlId(Integer lId) {
		this.lId = lId;
	}
	public Integer getlNum() {
		return lNum;
	}
	public void setlNum(Integer lNum) {
		this.lNum = lNum;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public Date getFromDay() {
		return fromDay;
	}
	public void setFromDay(Date fromDay) {
		this.fromDay = fromDay;
	}
	public Date getEndDay() {
		return endDay;
	}
	public void setEndDay(Date endDay) {
		this.endDay = endDay;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public Integer getUserNo() {
		return userNo;
	}
	public void setUserNo(Integer userNo) {
		this.userNo = userNo;
	}
	public double getPaySum() {
		return paySum;
	}
	public void setPaySum(double paySum) {
		this.paySum = paySum;
	}
	public double getReturnPay() {
		return returnPay;
	}
	public void setReturnPay(double returnPay) {
		this.returnPay = returnPay;
	}
	public double getUnitCost() {
		return unitCost;
	}
	public void setUnitCost(double unitCost) {
		this.unitCost = unitCost;
	}
	public String getUnits() {
		return units;
	}
	public void setUnits(String units) {
		this.units = units;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "locker [lId=" + lId + ", lNum=" + lNum + ", lName=" + lName + ", fromDay=" + fromDay + ", endDay="
				+ endDay + ", state=" + state + ", userNo=" + userNo + ", paySum=" + paySum + ", returnPay=" + returnPay
				+ ", unitCost=" + unitCost + ", units=" + units + ", remark=" + remark + "]";
	}
	public Locker(Integer lId, Integer lNum, String lName, Date fromDay, Date endDay, Integer state, Integer userNo,
			double paySum, double returnPay, double unitCost, String units, String remark) {
		super();
		this.lId = lId;
		this.lNum = lNum;
		this.lName = lName;
		this.fromDay = fromDay;
		this.endDay = endDay;
		this.state = state;
		this.userNo = userNo;
		this.paySum = paySum;
		this.returnPay = returnPay;
		this.unitCost = unitCost;
		this.units = units;
		this.remark = remark;
	}
	public Locker() {
		super();
	}
	
}
