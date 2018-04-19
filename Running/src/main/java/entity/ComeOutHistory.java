package entity;

import java.util.Date;

public class ComeOutHistory {			//出入场记录类
	//cId 			int(20) NOT NULL	出入场id
	//cardNo 		int(11) NULL		会员卡号
	//name			varchar(30) NULL	会员名
	//lockerNo		int(11) NULL		手牌号即储物柜编号
	//inTime		datetime NULL		入场时间
	//outTime		datetime NULL		出厂时间
	//teacherName	varchar(30) NULL	教练或顾问名称
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
