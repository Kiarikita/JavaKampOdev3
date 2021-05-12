package business.concretes;

import business.abstracts.CustomerService;
import entities.concretes.Customer;

public class CustomerManager implements CustomerService{
	
	@Override
	public void add(Customer customer) {
		System.out.println(customer.getFirstName() + " "+ customer.getLastName() +" kullanýcý baþarýyla eklendi.");
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getFirstName() + customer.getLastName() + " kullanýcý baþarýyla silindi.");
		
	}

	@Override
	public void update(Customer customer) {
		
		System.out.println(customer.getFirstName() + customer.getLastName() + " kullanýcý baþarýyla güncellendi.");
	}

}
