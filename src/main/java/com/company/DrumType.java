package com.company;

public final class DrumType extends MusicalInstrument {

    private final TypeInstrument instrumentType = TypeInstrument.DRUM;
    private int size;

    public DrumType(final String name, final String countryFrom, final double price, final String guarantee, final int weight, final int size) {
        setName(name);
        setCountryFrom(countryFrom);
        setPrice(price);
        setGuarantee(guarantee);
        setWeight(weight);
        setSize(size);
    }

    @Override
    public String toString() {
        return "Name:.." + getName() + "\nCountry from:.." + getCountryFrom() + "\nPrice of instrument:.." + getPrice()
                + "\nGuarantee:.." + getGuarantee() + "\nWeight:.." + getWeight() + "\nSize:.." + size;
    }

    public void setSize(final int size) {
        this.size = size;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + "," + "Size";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + size;
    }
}
