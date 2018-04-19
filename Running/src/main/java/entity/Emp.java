package entity;

import java.util.Date;

public class Emp {		//员工类
	private Integer eId;		//员工id
	private String eName;		//员工名字
	private Integer	eType;		//员工类型,1顾问,2教练
	private String sex;			//员工性别
	private double basePay;		//基本工资;
	private String identity;	//身份证号
	private String address;		//优惠后新价格
	private double phone;		//员工电话
	private Integer state;		//状态 	1:在职;2离职
	private Integer works;		//工作性质  	1:全职;2兼职
	public Integer geteId() {
		return eId;
	}
	public void seteId(Integer eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public Integer geteType() {
		return eType;
	}
	public void seteType(Integer eType) {
		this.eType = eType;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public double getBasePay() {
		return basePay;
	}
	public void setBasePay(double basePay) {
		this.basePay = basePay;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getPhone() {
		return phone;
	}
	public void setPhone(double phone) {
		this.phone = phone;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public Integer getWorks() {
		return works;
	}
	public void setWorks(Integer works) {
		this.works = works;
	}
	@Override
	public String toString() {
		return "Emp [eId=" + eId + ", eName=" + eName + ", eType=" + eType + ", sex=" + sex + ", basePay=" + basePay
				+ ", identity=" + identity + ", address=" + address + ", phone=" + phone + ", state=" + state
				+ ", works=" + works + "]";
	}
	public Emp(Integer eId, String eName, Integer eType, String sex, double basePay, String identity, String address,
			double phone, Integer state, Integer works) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eType = eType;
		this.sex = sex;
		this.basePay = basePay;
		this.identity = identity;
		this.address = address;
		this.phone = phone;
		this.state = state;
		this.works = works;
	}
	public Emp() {
		super();
	}
	
}
