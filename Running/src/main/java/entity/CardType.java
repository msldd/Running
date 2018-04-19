package entity;

public class CardType {

	//cId					int(6) NOT NULL		卡id
	//cType					int(4) NULL			卡类型
	//cName 				varchar(50) NULL	卡类型名称
	//serverDiscount 		double(16,2) NULL	服务折扣
	//productDiscount 		double(16,2) NULL	产品折扣
	//realPay 				double(16,2) NULL	实际支付
	//dayLimit 				int(20) NULL		期限天数
	//birthdayDiscount 		double(16,2) NULL	生日折扣
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
