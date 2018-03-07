package com.company;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;

import static com.company.MusicManager.printList;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

//@RunWith(JUnitPlatform.class)
//@IncludeEngines("junit-jupiter")

public class MusicManagerTest {
    private  MusicManager musicalManager = new MusicManager("Lviv", "Stradivarius");
    private  DrumType drumType = new DrumType("Kek", "Ukraine",3.4, "Long", 55, 5);
    private  KeyboardType keyboardType = new KeyboardType("Lol", "England", 3.3, "Norm", 3,4);
    private MusicalInstrument musicalInstrument = new MusicalInstrument("Hhh", "Deutsch", 5.5,"Good",5) {
        @Override
        public TypeInstrument getTypeInstruments() {
            return null;
        }
    };

    private  StringType stringType = new StringType("Io","France", 3.3, "Level", 4,4);
    private  Wind wind = new Wind("Lk", "Austria", 5.5, "Normal", 4,"Long");
    private List<MusicalInstrument> testList;



    @Before
     public void addInstrumentsForTest() {
        musicalManager.addMusicalInstrument(drumType);
        musicalManager.addMusicalInstrument(keyboardType);
        musicalManager.addMusicalInstrument(stringType);
        musicalManager.addMusicalInstrument(wind);
    }


    @Test
    public void myTestFindByTypeKey() {
      List<MusicalInstrument> result = musicalManager.findByType(TypeInstrument.KEYBOARD);
      assertEquals(TypeInstrument.KEYBOARD, result.get(0).getTypeInstruments());
    }

    @Test
    public void testToString(){
        assertFalse(musicalManager.toString().contains("@"));
        assertFalse(drumType.toString().contains("@"));
        assertFalse(keyboardType.toString().contains("@"));
        assertFalse(musicalInstrument.toString().contains("@"));
        assertFalse(stringType.toString().contains("@"));
        assertFalse(wind.toString().contains("@"));
    }

    @Test
    public void sortByWeight() {
        testList = musicalManager.sortByWeight(musicalManager.getInstrumentList());
        assertEquals(4, testList.size());
        assertEquals(drumType.getWeight(), testList.get(0).getWeight());
        assertEquals(stringType.getWeight(), testList.get(1).getWeight());
        assertEquals(wind.getWeight(), testList.get(2).getWeight());
        assertEquals(keyboardType.getWeight(), testList.get(3).getWeight());


    }
}