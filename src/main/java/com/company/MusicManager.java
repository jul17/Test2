package com.company;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class MusicManager {

    private String address;
    private String shopName;
    private List<MusicalInstrument> instrumentList = new LinkedList<>();


    public MusicManager(final String address, final String shopName) {
        super();
        setAddress(address);
        setShopName(shopName);
    }

    @Override
    public String toString() {
        return "MusicManager{" +
                "address='" + getAddress() + '\'' +
                ", shopName='" + getShopName() + '\'' +
                '}';
    }

    public static void printList(final List<MusicalInstrument> List) {
        List.forEach((MusicalInstrument x) -> {
            System.out.println(x.toString());

        });

    }

    public final List<MusicalInstrument> findByType(final TypeInstrument instrumentType) {
        List<MusicalInstrument> allInstrument = new LinkedList<>();

        instrumentList.stream().filter((instrumentList) -> ((instrumentList.getTypeInstruments() == instrumentType)))
                .forEachOrdered((instrumentList) -> {
                    allInstrument.add(instrumentList);
                });

        return allInstrument;
    }

    public final List<MusicalInstrument> sortByWeight(List<MusicalInstrument> result) {
        result.sort(Comparator.comparingInt(MusicalInstrument::getWeight).reversed());
        return result;
    }

    public final String getAddress() {
        return address;
    }

    public final void setAddress(final String address) {
        this.address = address;
    }

    public final String getShopName() {
        return shopName;
    }

    public void setShopName(final String shopName) {
        this.shopName = shopName;
    }

    public final List<MusicalInstrument> getInstrumentList() {
        return instrumentList;
    }

    public final void addMusicalInstrument(final MusicalInstrument musicalInstrument) {
        this.instrumentList.add(musicalInstrument);
    }
}
