package entity;

public class Subject {			//课程类

	private Integer sId;		//课程id
	private String sName;		//课程名称
	private String sTeacher;	//教练名字
	public Integer getsId() {
		return sId;
	}
	public void setsId(Integer sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsTeacher() {
		return sTeacher;
	}
	public void setsTeacher(String sTeacher) {
		this.sTeacher = sTeacher;
	}
	@Override
	public String toString() {
		return "Subject [sId=" + sId + ", sName=" + sName + ", sTeacher=" + sTeacher + "]";
	}
	public Subject(Integer sId, String sName, String sTeacher) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sTeacher = sTeacher;
	}
	public Subject() {
		super();
	}
	
}
