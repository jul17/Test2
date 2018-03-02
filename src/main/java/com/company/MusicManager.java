package com.company;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class MusicManager {

	private String address;
	private String shopName;
	private  List<MusicalInstrument> instrumentList = new LinkedList<>();

	public MusicManager() {
	}

	public  MusicManager(final String address, final String shopName, final List<MusicalInstrument> instrumentList) {
		super();
		setAddress(address);
		setShopName(shopName);
		setInstrumentList(instrumentList);
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
		result.sort(Comparator.comparingInt(MusicalInstrument::getWeight));
		return result;
	}

	public final String getAddress() {
		return address;
	}

	public  final void setAddress(final String address) {
		this.address = address;
	}

	public final String getShopName() {
		return shopName;
	}

	public  void setShopName(final String shopName) {
		this.shopName = shopName;
	}

	public final List<MusicalInstrument> getInstrumentList() {
		return instrumentList;
	}

	public  final void setInstrumentList(final List<MusicalInstrument> instrumentList) {
		this.instrumentList = instrumentList;
	}

	public  final void addMusicalInstrument(final MusicalInstrument musicalInstrument) {
		this.instrumentList.add(musicalInstrument);
	}
}
