package com.company;

public final class DrumType extends MusicalInstrument {

    private final TypeInstrument instrumentType = TypeInstrument.DRUM;


    public DrumType(Integer id, final String name, final String countryFrom, final double price, final String guarantee, final int weight) {
        setId(id);
        setName(name);
        setCountryFrom(countryFrom);
        setPrice(price);
        setGuarantee(guarantee);
        setWeight(weight);

    }

    @Override
    public String toString() {
        return "\nID" + getId()+ "Name:.." + getName() + "\nCountry from:.." + getCountryFrom() + "\nPrice of instrument:.." + getPrice()
                + "\nGuarantee:.." + getGuarantee() + "\nWeight:.." + getWeight() ;
    }



    @Override
    public String getHeaders() {
        return super.getHeaders() + "," + "Size";
    }


}