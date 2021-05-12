package entities.concretes;

public class Discount {
	
	private String campaignName;
	private double price;
	private double discountPercent;
	private double discountPrice;
	
	public Discount() {
		
	}
	
	public Discount(String campaignName, double discountPrice, double price, double discountPercent) {
		super();
		this.campaignName = campaignName;
		this.discountPrice = discountPrice;
		this.price = price;
		this.discountPercent = discountPercent;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscountPercent() {
		return discountPercent;
	}

	public void setDiscountPercent(double discountPercent) {
		this.discountPercent = discountPercent;
	}

	public double getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(double discountPrice) {
		this.discountPrice = discountPrice;
	}

}
