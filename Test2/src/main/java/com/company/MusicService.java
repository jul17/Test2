package com.company;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MusicService {

	private static Map<Integer, MusicalInstrument> instruments = new HashMap<Integer, MusicalInstrument>();

	public MusicalInstrument create(MusicalInstrument instrument) {
		//instrument.setId(max++);
		instruments.put(instrument.getId(), instrument);
		return instrument;
	}

	public Collection<MusicalInstrument> getAll() {
		return instruments.values();
	}
	
	public MusicalInstrument get(Integer id) {
		return instruments.get(id);
	}

	public Map<Integer, MusicalInstrument>  getMap(){
		return instruments;
	}

	public void delate(Integer id) {
		instruments.remove(id);
	}

	public MusicalInstrument update(Integer id, MusicalInstrument instrument) {
		if (instruments.containsKey(id) && id.equals(instrument.getId()))
			instruments.put(id, instrument);
		return get(id);
	}

}
