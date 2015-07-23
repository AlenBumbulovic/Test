package ba.bitcamp.test;

import java.util.ArrayList;

interface Searchable {
	
	public boolean fitsSearching(String s);

}

public class Museum implements Searchable {
	
	ArrayList<Exhibit> exhibit = new ArrayList<Exhibit>();
	ArrayList<Artwork> artwork = new ArrayList<Artwork>();
	ArrayList<HistoricalArtefacts> hArtefacts = new ArrayList<HistoricalArtefacts>();
	ArrayList<Employee> employee = new ArrayList<Employee>();
	
	
	
	

	public Museum(ArrayList<Exhibit> exhibit, ArrayList<Artwork> artwork,
			ArrayList<HistoricalArtefacts> hArtefacts,
			ArrayList<Employee> employee) {
		super();
		this.exhibit = exhibit;
		this.artwork = artwork;
		this.hArtefacts = hArtefacts;
		this.employee = employee;
	}


	@Override
	public boolean fitsSearching(String s) {
		
		for(int i = 0; i < exhibit.size(); i++){
			if(exhibit.get(i).equals(s)){
				return true;
			}		
		}
		
		for(int i = 0; i < artwork.size(); i++){
			if(artwork.get(i).equals(s)){
				return true;
			}
		}
		
		for(int i = 0; i < hArtefacts.size(); i++){
			if(hArtefacts.get(i).equals(s)){
				return true;
			}
		}
		
		for(int i = 0; i < employee.size(); i++){
			if(employee.get(i).equals(s)){
				return true;
			}
		}
		return false;
		
		
		
		
		
	}


	public ArrayList<Exhibit> getExhibit() {
		return exhibit;
	}


	public void setExhibit(ArrayList<Exhibit> exhibit) {
		this.exhibit = exhibit;
	}


	public ArrayList<Artwork> getArtwork() {
		return artwork;
	}


	public void setArtwork(ArrayList<Artwork> artwork) {
		this.artwork = artwork;
	}


	public ArrayList<HistoricalArtefacts> gethArtefacts() {
		return hArtefacts;
	}


	public void sethArtefacts(ArrayList<HistoricalArtefacts> hArtefacts) {
		this.hArtefacts = hArtefacts;
	}


	public ArrayList<Employee> getEmployee() {
		return employee;
	}


	public void setEmployee(ArrayList<Employee> employee) {
		this.employee = employee;
	}
	
	
	
	

}
