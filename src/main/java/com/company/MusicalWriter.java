package com.company;

import java.io.*;
import java.util.List;

public class MusicalWriter {

    private Writer writer;

    public void writeToFile(final List<MusicalInstrument> musicalInstrumentsList) {

        try {

            File file = new File("C:\\Java_Payton\\musicalInstruments.csv");
            if (!file.exists()) {
                file.createNewFile();
            }
            OutputStream stream = new FileOutputStream(file);
            writer = new PrintWriter(stream);
            for (MusicalInstrument musicalInstrument : musicalInstrumentsList) {
                writer.write(musicalInstrument.getHeaders() + "\n");
                writer.write(musicalInstrument.toCSV() + "\n");
                writer.write("\n");
            }
            writer.close();
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}

