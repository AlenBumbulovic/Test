package ba.bitcamp.test;

public class Artwork extends Exhibit {
	
	private String author;
	
	public enum Period {
		RENAISSANCE, NEOCLASSIC, MODERN, CONTEMPORARY
	}
	
	Period aPeriod;
	


	

	public Artwork(int id, String name, String description, String author, Period aPeriod) {
		super(id, name, description);
		this.author = author;
		this.aPeriod = aPeriod;
	}





	public String getAuthor() {
		return author;
	}
	
	



	public void setAuthor(String author) {
		this.author = author;
	}
	
	


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artwork other = (Artwork) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Artwork [author: " + author +  "]";
	}





	@Override
	public int compareTo(Exhibit o) {
		// TODO Auto-generated method stub
		return 0;
	}


	






	

}
