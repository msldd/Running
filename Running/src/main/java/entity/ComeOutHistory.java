package entity;

import java.util.Date;

public class ComeOutHistory {			//���볡��¼��
	//cId 			int(20) NOT NULL	���볡id
	//cardNo 		int(11) NULL		��Ա����
	//name			varchar(30) NULL	��Ա��
	//lockerNo		int(11) NULL		���ƺż��������
	//inTime		datetime NULL		�볡ʱ��
	//outTime		datetime NULL		����ʱ��
	//teacherName	varchar(30) NULL	�������������
	private Integer cId;
	private Integer cardNo;
	private String name;
	private Integer lockerNo;
	private Date inTime;
	private Date outTime;
	private String teacherName;
	public Integer getcId() {
		return cId;
	}
	public void setcId(Integer cId) {
		this.cId = cId;
	}
	public Integer getCardNo() {
		return cardNo;
	}
	public void setCardNo(Integer cardNo) {
		this.cardNo = cardNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getLockerNo() {
		return lockerNo;
	}
	public void setLockerNo(Integer lockerNo) {
		this.lockerNo = lockerNo;
	}
	public Date getInTime() {
		return inTime;
	}
	public void setInTime(Date inTime) {
		this.inTime = inTime;
	}
	public Date getOutTime() {
		return outTime;
	}
	public void setOutTime(Date outTime) {
		this.outTime = outTime;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	@Override
	public String toString() {
		return "comeOutHistory [cId=" + cId + ", cardNo=" + cardNo + ", name=" + name + ", lockerNo=" + lockerNo
				+ ", inTime=" + inTime + ", outTime=" + outTime + ", teacherName=" + teacherName + "]";
	}
	public ComeOutHistory(Integer cId, Integer cardNo, String name, Integer lockerNo, Date inTime, Date outTime,
			String teacherName) {
		super();
		this.cId = cId;
		this.cardNo = cardNo;
		this.name = name;
		this.lockerNo = lockerNo;
		this.inTime = inTime;
		this.outTime = outTime;
		this.teacherName = teacherName;
	}
	public ComeOutHistory() {
		super();
	}
	
}
