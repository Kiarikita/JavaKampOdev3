import java.time.LocalDate;

import business.concretes.CustomerManager;
import business.concretes.DiscountManager;
import business.concretes.GameManager;
import business.concretes.SaleManager;
import entities.concretes.Customer;
import entities.concretes.Discount;
import entities.concretes.Game;
import entities.concretes.Sale;

public class Main {

	public static void main(String[] args) {
		
	Customer customer1 = new Customer();
	customer1.setId(1);
	customer1.setFirstName("Zülal");
	customer1.setLastName("Güner");
	customer1.setNationalityId("1234567899");
	customer1.setBirthDate(LocalDate.of(1999, 5, 15));
	
	Game game1 = new Game();
	game1.setId(1);
	game1.setgName("Hades");
	game1.setPrice(153);
	game1.setInformation("Hades ön satýþa sunuldu.");
	
	Discount discount1 = new Discount();
	discount1.setCampaignName("Hafta sonu kampanyasý");
	discount1.setDiscountPercent(15);
	
	Sale sale1 = new Sale();
	sale1.setId(1);
	sale1.setGame(game1);
	sale1.setCustomer(customer1);
	
	CustomerManager customerManager = new CustomerManager();
	customerManager.add(customer1);		
	
	GameManager gameManager = new GameManager();
	gameManager.add(game1);
	
	DiscountManager discountManager = new DiscountManager();
	discountManager.add(discount1);
	
	SaleManager saleManager1 = new SaleManager();
	saleManager1.add(sale1);
	
	SaleManager saleManager2 = new SaleManager();
	saleManager2.add(sale1, discount1);

	}

}
