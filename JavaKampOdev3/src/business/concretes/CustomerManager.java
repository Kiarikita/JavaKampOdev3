package business.concretes;

import business.abstracts.CustomerService;
import entities.concretes.Customer;

public class CustomerManager implements CustomerService{
	
	@Override
	public void add(Customer customer) {
		System.out.println(customer.getFirstName() + " "+ customer.getLastName() +" kullan�c� ba�ar�yla eklendi.");
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getFirstName() + customer.getLastName() + " kullan�c� ba�ar�yla silindi.");
		
	}

	@Override
	public void update(Customer customer) {
		
		System.out.println(customer.getFirstName() + customer.getLastName() + " kullan�c� ba�ar�yla g�ncellendi.");
	}

}
