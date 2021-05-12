package business.concretes;

import business.abstracts.DiscountService;
import entities.concretes.Discount;

public class DiscountManager implements DiscountService{
	
	@Override
	public void add(Discount discount) {
		System.out.println(discount.getCampaignName() + "  %" + discount.getDiscountPercent() +" eklendi.");
		
	}

	@Override
	public void delete(Discount discount) {
		System.out.println(discount.getCampaignName() + " silindi.");
		
	}

	@Override
	public void update(Discount discount) {
		System.out.println(discount.getCampaignName() + " güncellendi.");
		
	}

}
