package entities.concretes;

import entities.abstracts.Entities;

public class Game implements Entities{

	private int id;
	private String gName;
	private double price;
	private String information;
	
	public Game() {
		
	}
	
	public Game(int id, String gName, double price, String information) {
		super();
		this.id = id;
		this.gName = gName;
		this.price = price;
		this.information = information;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getgName() {
		return gName;
	}

	public void setgName(String gName) {
		this.gName = gName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}
}
