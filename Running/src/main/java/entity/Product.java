package entity;

public class Product {		//�����Ʒ��Ŀ��

	private Integer pId;			//������Ŀ���
	private String pName;			//������Ŀ����
	private double pay;				//���
	private Integer changeMoney;	//�ܷ��޸ĵ���0:����;1����; ����Ȩ������
	private double cost;			//������߲�Ʒ�ĳɱ�
	private Integer jifen;			//����
	private Integer count;			//���
	private String barcode;			//������
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
