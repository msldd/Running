package entity;
public class Club {			//���ֲ���
	private Integer cId;	//id
	private String cName;	//���ֲ���λ����
	private Integer phone;	//���ֲ���λ�绰
	public Integer getcId() {
		return cId;
	}
	public void setcId(Integer cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public Integer getPhone() {
		return phone;
	}
	public void setPhone(Integer phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Club [cId=" + cId + ", cName=" + cName + ", phone=" + phone + "]";
	}
	public Club(Integer cId, String cName, Integer phone) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.phone = phone;
	}
	public Club() {
		super();
	}
	
}
