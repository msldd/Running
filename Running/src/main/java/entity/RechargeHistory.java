package entity;

import java.util.Date;

public class RechargeHistory {	//充值记录类

	private Integer rId;		//充值id
	private Integer cardNo;		//充值卡号
	private String rName;		//充值人名字
	private Date rDate;			//充值时间
	private double addPay;		//充值金额
	private double realPay;		//实际充值金额
	private Integer state;		//1:发卡;2充值	充值的类型
	private String 	person;		//操作员(操作时的登录账号)	
	public Integer getrId() {
		return rId;
	}
	public void setrId(Integer rId) {
		this.rId = rId;
	}
	public Integer getCardNo() {
		return cardNo;
	}
	public void setCardNo(Integer cardNo) {
		this.cardNo = cardNo;
	}
	public String getrName() {
		return rName;
	}
	public void setrName(String rName) {
		this.rName = rName;
	}
	public Date getrDate() {
		return rDate;
	}
	public void setrDate(Date rDate) {
		this.rDate = rDate;
	}
	public double getAddPay() {
		return addPay;
	}
	public void setAddPay(double addPay) {
		this.addPay = addPay;
	}
	public double getRealPay() {
		return realPay;
	}
	public void setRealPay(double realPay) {
		this.realPay = realPay;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "RechargeHistory [rId=" + rId + ", cardNo=" + cardNo + ", rName=" + rName + ", rDate=" + rDate
				+ ", addPay=" + addPay + ", realPay=" + realPay + ", state=" + state + ", person=" + person + "]";
	}
	public RechargeHistory(Integer rId, Integer cardNo, String rName, Date rDate, double addPay, double realPay,
			Integer state, String person) {
		super();
		this.rId = rId;
		this.cardNo = cardNo;
		this.rName = rName;
		this.rDate = rDate;
		this.addPay = addPay;
		this.realPay = realPay;
		this.state = state;
		this.person = person;
	}
	public RechargeHistory() {
		super();
	}
	
}
