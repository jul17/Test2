package com.company;

public abstract class MusicalInstrument {

	private String name;
	private String countryFrom;
	private double price;
	private String guarantee;
	private int weight;

	public abstract TypeInstrument getTypeInstruments();

	public final void setName(final String name) {
		this.name = name;
	}

	public  final String getName() {
		return name;
	}

	public  final void setCountryFrom(final String countryFrom) {
		this.countryFrom = countryFrom;
	}

	public  final String getCountryFrom() {
		return countryFrom;
	}

	public final void setPrice(final double price) {
		this.price = price;
	}

	public  final double getPrice() {
		return price;
	}

	public void setGuarantee(final  String guarantee) {
		this.guarantee = guarantee;
	}

	public final String getGuarantee() {
		return guarantee;
	}

	public final void setWeight(final int weight) {
		this.weight = weight;
	}

	public final int getWeight() {
		return weight;
	}

}
