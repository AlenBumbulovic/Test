package ba.bitcamp.test;

import java.util.ArrayList;

import ba.bitcamp.test.Artwork.Period;

public class Main {

	public static void main(String[] args) {
		
		
		
		// Artworks
		ArrayList<Artwork> artwork = new ArrayList<Artwork>();
		
		Artwork a1 = new Artwork(0001, "Artwork1", "Opis", "Autor1", Period.MODERN);
		Artwork a2 = new Artwork(0002, "Artwork2", "Opis2", "Autor2", Period.NEOCLASSIC);
		Artwork a3 = new Artwork(0003, "Artwork3", "Opis3", "Autor3", Period.RENAISSANCE);
		
		artwork.add(a1);
		artwork.add(a2);
		artwork.add(a3);
		System.out.println(artwork.toString());
		
		
		// Historical Artefacts
		ArrayList<HistoricalArtefacts> hArtefact = new ArrayList<HistoricalArtefacts>();
		
		HistoricalArtefacts ha1 = new HistoricalArtefacts(0004, "Artefact1", "Description1", "Africa");
		HistoricalArtefacts ha2 = new HistoricalArtefacts(0005, "Artefact2", "Description2", "America");
		HistoricalArtefacts ha3 = new HistoricalArtefacts(0004, "Artefact3", "Description3", "Europe");
		
		hArtefact.add(ha1);
		hArtefact.add(ha2);
		hArtefact.add(ha2);

		
		System.out.println(hArtefact.toString());
		
		
		

	}

}
