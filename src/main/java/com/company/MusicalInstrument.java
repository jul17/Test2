package com.company;

public class MusicalInstrument {

    private String name;
    private String countryFrom;
    private double price;
    private String guarantee;
    private int weight;
    private TypeInstrument typeInstruments;


    public MusicalInstrument() {
    }

    public MusicalInstrument(String name, String countryFrom, double price, String guarantee, int weight) {
        this.name = name;
        this.countryFrom = countryFrom;
        this.price = price;
        this.guarantee = guarantee;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "MusicalInstrument{" +
                "name='" + name + '\'' +
                ", countryFrom='" + countryFrom + '\'' +
                ", price=" + price +
                ", guarantee='" + guarantee + '\'' +
                ", weight=" + weight +
                '}';
    }

    public TypeInstrument getTypeInstruments() {
        return typeInstruments;
    }

    public final void setName(final String name) {
        this.name = name;
    }

    public final String getName() {
        return name;
    }

    public final void setCountryFrom(final String countryFrom) {
        this.countryFrom = countryFrom;
    }

    public final String getCountryFrom() {
        return countryFrom;
    }

    public final void setPrice(final double price) {
        this.price = price;
    }

    public final double getPrice() {
        return price;
    }

    public void setGuarantee(final String guarantee) {
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

    public String getHeaders() {
        return "Name, CountryFrom, Guarantee, Weight, Type of instrument";
    }

    public String toCSV() {
        return name + "," + countryFrom + "," + weight + "," + typeInstruments;
    }
}
