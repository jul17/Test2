package com.company;

public final class StringType extends MusicalInstrument {

    private final TypeInstrument instrumentType = TypeInstrument.STRING;
    private int countOfString;

    public StringType(final String name, final String countryFrom, final double price, final String guarantee, final int weight, final int countOfString) {
        setName(name);
        setCountryFrom(countryFrom);
        setPrice(price);
        setGuarantee(guarantee);
        setWeight(weight);
    }

    @Override
    public String toString() {
        return "\nName:.." + getName() + "\nCountry from:.." + getCountryFrom() + "\nPrice of instrument:.." + getPrice()
                + "\nGuarantee:.." + getGuarantee() + "\nWeight:.." + getWeight() + "\nCountOfString" + (countOfString);
    }

    @Override
    public TypeInstrument getTypeInstruments() {
        return instrumentType;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + "," + "Count of string";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + countOfString;
    }
}
