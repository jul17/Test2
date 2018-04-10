package com.company;

public final class Wind extends MusicalInstrument {

    private final TypeInstrument instrumentType = TypeInstrument.WIND;


    public Wind(Integer id, final String name, final String countryFrom, final double price, final String guarantee, final int weight, final String lengthOfTube) {
        setId(id);
        setName(name);
        setCountryFrom(countryFrom);
        setPrice(price);
        setGuarantee(guarantee);
        setWeight(weight);
    }

    @Override
    public String toString() {
        return "\nID" + getId()+"\nName:.." + getName() + "\nCountry from:.." + getCountryFrom() + "\nPrice of instrument:.." + getPrice()
                + "\nGuarantee:.." + getGuarantee() + "\nWeight:.." + getWeight() ;
    }




    @Override
    public TypeInstrument getTypeInstruments() {
        return instrumentType;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders();
    }

    @Override
    public String toCSV() {
        return super.toCSV() ;
    }
}