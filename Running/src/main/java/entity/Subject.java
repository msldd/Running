package entity;

public class Subject {			//�γ���

	private Integer sId;		//�γ�id
	private String sName;		//�γ�����
	private String sTeacher;	//��������
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
