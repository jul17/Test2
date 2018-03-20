package com.company;

public final class Wind extends MusicalInstrument {

    private final TypeInstrument instrumentType = TypeInstrument.WIND;
    private String lengthOfTube;

    public Wind(final String name, final String countryFrom, final double price, final String guarantee, final int weight, final String lengthOfTube) {
        setName(name);
        setCountryFrom(countryFrom);
        setPrice(price);
        setGuarantee(guarantee);
        setWeight(weight);
        setLengthOfTube(lengthOfTube);
    }

    @Override
    public String toString() {
        return "\nName:.." + getName() + "\nCountry from:.." + getCountryFrom() + "\nPrice of instrument:.." + getPrice()
                + "\nGuarantee:.." + getGuarantee() + "\nWeight:.." + getWeight() + "\n Length of tube:.." + lengthOfTube;
    }


    public final void setLengthOfTube(final String lengthOfTube) {
        this.lengthOfTube = lengthOfTube;
    }

    @Override
    public TypeInstrument getTypeInstruments() {
        return instrumentType;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + "," + "Length of tube";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + lengthOfTube;
    }
}
