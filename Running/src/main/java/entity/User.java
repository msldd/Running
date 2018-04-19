package entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

	private Integer	uId;		//用户id
	private Integer cardNo;		//会员卡号
	private String uName;		//会员名字
	private String type;		//会员卡类型 vip/年卡..
	private double balance;		//卡余额
	private Integer	jifen;		//积分
	private Integer	state;		//状态:0正常;1销户;2报损;3挂失;4禁用;5超时;
	private Date fromDate;		//开卡日期
	private Date endDate;		//到期日期
	private String sex;			//性别
	private String picture;		//照片头像
	private String identity;	//身份证号
	private Integer birthday;	//页面输入的生日号:例如:0912		
	private Integer phone;		//会员电话
	private String address;		//会员地址
	private Integer qqNum;		//QQ号>>字段类型有待修改 
	private String email;		//邮箱
	private Integer friendNo;	//介绍人
	private Integer empNo;		//顾问教练
	public Integer getuId() {
		return uId;
	}
	public void setuId(Integer uId) {
		this.uId = uId;
	}
	public Integer getCardNo() {
		return cardNo;
	}
	public void setCardNo(Integer cardNo) {
		this.cardNo = cardNo;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Integer getJifen() {
		return jifen;
	}
	public void setJifen(Integer jifen) {
		this.jifen = jifen;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public Integer getBirthday() {
		return birthday;
	}
	public void setBirthday(Integer birthday) {
		this.birthday = birthday;
	}
	public Integer getPhone() {
		return phone;
	}
	public void setPhone(Integer phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getQqNum() {
		return qqNum;
	}
	public void setQqNum(Integer qqNum) {
		this.qqNum = qqNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getFriendNo() {
		return friendNo;
	}
	public void setFriendNo(Integer friendNo) {
		this.friendNo = friendNo;
	}
	public Integer getEmpNo() {
		return empNo;
	}
	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}
	@Override
	public String toString() {
		return "User [uId=" + uId + ", cardNo=" + cardNo + ", uName=" + uName + ", type=" + type + ", balance="
				+ balance + ", jifen=" + jifen + ", state=" + state + ", fromDate=" + fromDate + ", endDate=" + endDate
				+ ", sex=" + sex + ", picture=" + picture + ", identity=" + identity + ", birthday=" + birthday
				+ ", phone=" + phone + ", address=" + address + ", qqNum=" + qqNum + ", email=" + email + ", friendNo="
				+ friendNo + ", empNo=" + empNo + "]";
	}
	public User() {
		super();
	}
	
}
