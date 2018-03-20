package com.company;

public final class KeyboardType extends MusicalInstrument {

    private final TypeInstrument instrumentType = TypeInstrument.KEYBOARD;
    private int countOfKeys;

    public KeyboardType(final String name, final String countryFrom, final double price, final String guarantee, final int weight, final int countOfKeys) {
        setName(name);
        setCountryFrom(countryFrom);
        setPrice(price);
        setGuarantee(guarantee);
        setWeight(weight);
        setCountOfKeys(countOfKeys);
    }

    @Override
    public String toString() {
        return "\nName:.." + getName() + "\nCountry from:.." + getCountryFrom() + "\nPrice of instrument:.." + getPrice()
                + "\nGuarantee:.." + getGuarantee() + "\nWeight:.." + getWeight() + "\nCountOfKeys:.." + countOfKeys;
    }

    public void setCountOfKeys(final int countOfKeys) {
        this.countOfKeys = countOfKeys;
    }


    @Override
    public TypeInstrument getTypeInstruments() {
        return instrumentType;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + "," + "Count of keys";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + countOfKeys;
    }
}

