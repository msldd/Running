package entity;

public class Goods {		//商品类

	private Integer gId;			//商品id
	private String gName;			//商品名字
	private double gMoney;			//商品金额
	private Integer changeMoney;	//能否修改单价0:不能;1可以
	private double cost;			//商品成本
	private Integer jifen;			//积分
	private Integer count;			//库存
	private String barcode;			//条形码
	public Integer getgId() {
		return gId;
	}
	public void setgId(Integer gId) {
		this.gId = gId;
	}
	public String getgName() {
		return gName;
	}
	public void setgName(String gName) {
		this.gName = gName;
	}
	public double getgMoney() {
		return gMoney;
	}
	public void setgMoney(double gMoney) {
		this.gMoney = gMoney;
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
	public Goods(Integer gId, String gName, double gMoney, Integer changeMoney, double cost, Integer jifen,
			Integer count, String barcode) {
		super();
		this.gId = gId;
		this.gName = gName;
		this.gMoney = gMoney;
		this.changeMoney = changeMoney;
		this.cost = cost;
		this.jifen = jifen;
		this.count = count;
		this.barcode = barcode;
	}
	public Goods() {
		super();
	}
	
}
