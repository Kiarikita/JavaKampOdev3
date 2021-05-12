package entities.concretes;

import entities.abstracts.Entities;

public class Sale implements Entities{
	
	private int id;
	private Game game;
	private Customer customer;
	
	
	public Sale() {
		
	}
	public Sale(int id, Game game, Customer customer) {
		super();
		this.id = id;
		this.game = game;
		this.customer = customer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	

}
