package entity;

public class Admin {
	private Integer aId;//����Աid
	private String name;//�û���
	private String pwd;//����
	private Integer phone;//�绰
	private Integer role;//����Ա��� ��0:��ͨ����Ա 1���ϰ壩
	public Integer getaId() {
		return aId;
	}
	public void setaId(Integer aId) {
		this.aId = aId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Integer getPhone() {
		return phone;
	}
	public void setPhone(Integer phone) {
		this.phone = phone;
	}
	public Integer getRole() {
		return role;
	}
	public void setRole(Integer role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Admin [aId=" + aId + ", name=" + name + ", pwd=" + pwd + ", phone=" + phone + ", role=" + role + "]";
	}
	
	
}
