package entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

	private Integer	uId;		//�û�id
	private Integer cardNo;		//��Ա����
	private String uName;		//��Ա����
	private String type;		//��Ա������ vip/�꿨..
	private double balance;		//�����
	private Integer	jifen;		//����
	private Integer	state;		//״̬:0����;1����;2����;3��ʧ;4����;5��ʱ;
	private Date fromDate;		//��������
	private Date endDate;		//��������
	private String sex;			//�Ա�
	private String picture;		//��Ƭͷ��
	private String identity;	//���֤��
	private Integer birthday;	//ҳ����������պ�:����:0912		
	private Integer phone;		//��Ա�绰
	private String address;		//��Ա��ַ
	private Integer qqNum;		//QQ��>>�ֶ������д��޸� 
	private String email;		//���䮱
	private Integer friendNo;	//������
	private Integer empNo;		//���ʽ���
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
