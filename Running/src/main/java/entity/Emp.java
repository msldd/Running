package entity;

import java.util.Date;

public class Emp {		//Ա����
	private Integer eId;		//Ա��id
	private String eName;		//Ա������
	private Integer	eType;		//Ա������,1����,2����
	private String sex;			//Ա���Ա�
	private double basePay;		//��������;
	private String identity;	//���֤��
	private String address;		//�Żݺ��¼۸�
	private double phone;		//Ա���绰
	private Integer state;		//״̬ 	1:��ְ;2��ְ
	private Integer works;		//��������  	1:ȫְ;2��ְ
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
