package entity;

public class Goods {		//��Ʒ��

	private Integer gId;			//��Ʒid
	private String gName;			//��Ʒ����
	private double gMoney;			//��Ʒ���
	private Integer changeMoney;	//�ܷ��޸ĵ���0:����;1����
	private double cost;			//��Ʒ�ɱ�
	private Integer jifen;			//����
	private Integer count;			//���
	private String barcode;			//������
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
