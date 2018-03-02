package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public  static void main(final String[] args) {

		MusicManager instrument = new MusicManager();

		instrument.addMusicalInstrument(new Wind("Trombone", "America", 23.4, "6 mounth", 45, "52 cm"));
		instrument.addMusicalInstrument(new Wind("Saxophone", "Brazil", 94.4, "5 mounth", 25, "34 cm"));
		instrument.addMusicalInstrument(new DrumType("DrumKit", "Spain", 66.3, "7 moumth", 33, 90));
		instrument.addMusicalInstrument(new DrumType("Gong", "Africa", 77.0, "6.5 moumth", 28, 220));
		instrument.addMusicalInstrument(new KeyboardType("Keyboard", "America", 45.2, "4 moumth", 56, 780));
		instrument.addMusicalInstrument(new StringType("Violin", "German", 25.3, "8 moumth", 96, 4));
		instrument.addMusicalInstrument(new StringType("Guitar", "England", 30.3, "5 moumth", 45, 6));

		boolean menu = true;
		while (menu) {
			System.out.println("Menu");
			System.out.println("1 - Print list of music instrument");
			System.out.println("2 - Sort by type ");
			System.out.println("3 - Sort instrument for band ");
			Scanner scanner = new Scanner(System.in);
			int choise = scanner.nextInt();

			switch (choise) {
			case 1:
				System.out.println("\n - Avalible instrument:  \n" + instrument.getInstrumentList());
				break;
			case 2:
				System.out.println("1-Wind");
				System.out.println("2-Drum");
				System.out.println("3-Keyboard");
				System.out.println("4-String");
				int choiseType = scanner.nextInt();
				switch (choiseType) {
				case 1:
					printList(instrument.findByType(TypeInstrument.WIND));
					break;
				case 2:
					printList(instrument.findByType(TypeInstrument.DRUM));
					break;
				case 3:
					printList(instrument.findByType(TypeInstrument.KEYBOARD));
					break;
				case 4:
					printList(instrument.findByType(TypeInstrument.STRING));
					break;
				}
				break;
			case 3:
				List<TypeInstrument> listTypeForBand = new LinkedList();
				listTypeForBand.add(TypeInstrument.KEYBOARD);
				listTypeForBand.add(TypeInstrument.STRING);
				List<MusicalInstrument> musicalList = new LinkedList();
				for (TypeInstrument type : listTypeForBand) {
					musicalList.addAll(instrument.findByType(type));
				}
				printList(instrument.sortByWeight(musicalList));
			}
		}
	}

	public  static void printList(final List<MusicalInstrument> List) {
		List.forEach((MusicalInstrument x) -> {
			System.out.println(x.toString());

		});

	}

}
