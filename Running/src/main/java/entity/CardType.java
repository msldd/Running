package entity;

public class CardType {

	//cId					int(6) NOT NULL		��id
	//cType					int(4) NULL			������
	//cName 				varchar(50) NULL	����������
	//serverDiscount 		double(16,2) NULL	�����ۿ�
	//productDiscount 		double(16,2) NULL	��Ʒ�ۿ�
	//realPay 				double(16,2) NULL	ʵ��֧��
	//dayLimit 				int(20) NULL		��������
	//birthdayDiscount 		double(16,2) NULL	�����ۿ�
	private Integer cId;
	private Integer cType;
	private String cname;
	private double serverDiscount;
	private double productDiscount;
	private double realPay;
	private Integer dayLimit;
	private double birthdayDiscount;
	public Integer getcId() {
		return cId;
	}
	public void setcId(Integer cId) {
		this.cId = cId;
	}
	public Integer getcType() {
		return cType;
	}
	public void setcType(Integer cType) {
		this.cType = cType;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public double getServerDiscount() {
		return serverDiscount;
	}
	public void setServerDiscount(double serverDiscount) {
		this.serverDiscount = serverDiscount;
	}
	public double getProductDiscount() {
		return productDiscount;
	}
	public void setProductDiscount(double productDiscount) {
		this.productDiscount = productDiscount;
	}
	public double getRealPay() {
		return realPay;
	}
	public void setRealPay(double realPay) {
		this.realPay = realPay;
	}
	public Integer getDayLimit() {
		return dayLimit;
	}
	public void setDayLimit(Integer dayLimit) {
		this.dayLimit = dayLimit;
	}
	public double getBirthdayDiscount() {
		return birthdayDiscount;
	}
	public void setBirthdayDiscount(double birthdayDiscount) {
		this.birthdayDiscount = birthdayDiscount;
	}
	@Override
	public String toString() {
		return "CardType [cId=" + cId + ", cType=" + cType + ", cname=" + cname + ", serverDiscount=" + serverDiscount
				+ ", productDiscount=" + productDiscount + ", realPay=" + realPay + ", dayLimit=" + dayLimit
				+ ", birthdayDiscount=" + birthdayDiscount + "]";
	}
	public CardType(Integer cId, Integer cType, String cname, double serverDiscount, double productDiscount,
			double realPay, Integer dayLimit, double birthdayDiscount) {
		super();
		this.cId = cId;
		this.cType = cType;
		this.cname = cname;
		this.serverDiscount = serverDiscount;
		this.productDiscount = productDiscount;
		this.realPay = realPay;
		this.dayLimit = dayLimit;
		this.birthdayDiscount = birthdayDiscount;
	}
	public CardType() {
		super();
	}
	
}
