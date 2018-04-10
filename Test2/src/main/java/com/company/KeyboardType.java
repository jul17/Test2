package com.company;

public final class KeyboardType extends MusicalInstrument {

    private final TypeInstrument instrumentType = TypeInstrument.KEYBOARD;


    public KeyboardType(Integer id, final String name, final String countryFrom, final double price, final String guarantee, final int weight) {
        super(id, name,   countryFrom,   price,   guarantee,   weight, TypeInstrument.KEYBOARD);
    }

    @Override
    public String toString() {
        return "\nID" + getId()+ "\nnName:.." + getName() + "\nCountry from:.." + getCountryFrom() + "\nPrice of instrument:.." + getPrice()
                + "\nGuarantee:.." + getGuarantee() + "\nWeight:.." + getWeight();
    }




    @Override
    public TypeInstrument getTypeInstruments() {
        return instrumentType;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + "," + "Count of keys";
    }


}