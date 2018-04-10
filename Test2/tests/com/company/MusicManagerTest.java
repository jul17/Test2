package com.company;

import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.util.List;
import static org.junit.Assert.*;



public class MusicManagerTest {
    private Integer max = 0;
    private  MusicManager musicalManager = new MusicManager("Lviv", "Stradivarius");
    private  DrumType drumType = new DrumType(max++ ,"Drum","England", 3.5, "5 mounth", 5);
    private  KeyboardType keyboardType = new KeyboardType(max++,"Keyboard", "England", 3.3, "3 mounth", 3);
    private MusicalInstrument musicalInstrument = new MusicalInstrument("Hhh", "Deutsch", 5.5,"Good",5) {
        @Override
        public TypeInstrument getTypeInstruments() {
            return null;
        }
    };

    private  StringType stringType = new StringType(max++,"Vilion","France", 3.3, "8 mounth", 44);
    private  Wind wind = new Wind(max++, "Tube", "Austria", 5.5, "3 mounth", 4,"Long");
    private List<MusicalInstrument> testList;
    private static final MusicalWriter writer = new MusicalWriter();
    private static final File file = new File("C:\\Java_Payton\\musicalInstruments.csv");

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

    @Test
    public void writeToFile(){
        writer.writeToFile(musicalManager.getInstrumentList());
        assertEquals(true, file.exists());
    }
}