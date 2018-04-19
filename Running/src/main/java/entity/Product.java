package entity;

public class Product {		//服务产品项目类

	private Integer pId;			//健身项目编号
	private String pName;			//服务项目名称
	private double pay;				//金额
	private Integer changeMoney;	//能否修改单价0:不能;1可以; 属于权限设置
	private double cost;			//服务或者产品的成本
	private Integer jifen;			//积分
	private Integer count;			//库存
	private String barcode;			//条形码
	public Integer getpId() {
		return pId;
	}
	public void setpId(Integer pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public double getPay() {
		return pay;
	}
	public void setPay(double pay) {
		this.pay = pay;
	}
	public Integer getChangeMoney() {
		return changeMoney;
	}
	public void setChangeMoney(Integer changeMoney) {
		this.changeMoney = changeMoney;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public Integer getJifen() {
		return jifen;
	}
	public void setJifen(Integer jifen) {
		this.jifen = jifen;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", pay=" + pay + ", changeMoney=" + changeMoney + ", cost="
				+ cost + ", jifen=" + jifen + ", count=" + count + ", barcode=" + barcode + "]";
	}
	public Product(Integer pId, String pName, double pay, Integer changeMoney, double cost, Integer jifen,
			Integer count, String barcode) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pay = pay;
		this.changeMoney = changeMoney;
		this.cost = cost;
		this.jifen = jifen;
		this.count = count;
		this.barcode = barcode;
	}
	public Product() {
		super();
	}
	
}
