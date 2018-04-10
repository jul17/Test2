package com.company;

import java.io.*;
import java.util.List;

public class MusicalWriter {



    public void writeToFile(final List<MusicalInstrument> musicalInstrumentsList) {

        File file = new File("C:\\Java_Payton\\Test2\\musicalInstruments.csv");

        try (OutputStream stream = new FileOutputStream(file);
             Writer writer = new PrintWriter(stream)) {
            if (!file.exists()) {
                file.createNewFile();
            }

            for (MusicalInstrument musicalInstrument : musicalInstrumentsList) {
                writer.write(musicalInstrument.getHeaders() + "\n");
                writer.write(musicalInstrument.toCSV() + "\n");

            }
        } catch (IOException e) {
            e.getStackTrace();
        }

    }
}

