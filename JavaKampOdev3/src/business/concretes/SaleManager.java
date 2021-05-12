package business.concretes;


import business.abstracts.SaleService;
import entities.concretes.Discount;
import entities.concretes.Sale;


public class SaleManager implements SaleService{
	
	@Override
	public void add(Sale sale) {
		System.out.println("Sevgili "  + sale.getCustomer().getFirstName() + " "+
				sale.getCustomer().getLastName() + " " + sale.getGame().getgName() + " oyununu " + 
						sale.getGame().getPrice() + "TL karþýlýðýnda satýn aldýnýz.");
		
	}
	
	public void add(Sale sale, Discount discount) {
		System.out.println(sale.getGame().getgName() + " oyununu indirimli fiyat olan " +
				(sale.getGame().getPrice()-(sale.getGame().getPrice()*discount.getDiscountPercent()/100)) +
				"TL olarak satýn alýndý.");
		
	}

	@Override
	public void delete(Sale sale) {
		System.out.println(sale.getGame() +" baþarýyla silindi.");
		
	}

	

}
