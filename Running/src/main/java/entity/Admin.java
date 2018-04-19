package entity;

public class Admin {
	private Integer aId;//管理员id
	private String name;//用户名
	private String pwd;//密码
	private Integer phone;//电话
	private Integer role;//管理员身份 （0:普通管理员 1：老板）
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
