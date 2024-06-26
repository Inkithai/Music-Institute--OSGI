package com.musicacademy.osgi.musicresourcespublisher;

public class InstrumentModel {
	private String instrument,name,brand,typenum;
	private double price;
	
	public InstrumentModel() {
		
	}
	//overloaded constructor
	public InstrumentModel(String instrument,String name, String brand, String typenum, double price) {
		super();
		this.instrument= instrument;
		this.typenum = typenum;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

	public String getInstrument() {
		return instrument;
	}

	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return typenum;
	}

	public void setType(String typenum) {
		this.typenum = typenum;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
