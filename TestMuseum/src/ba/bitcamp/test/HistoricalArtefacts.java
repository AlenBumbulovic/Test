package ba.bitcamp.test;

public class HistoricalArtefacts extends Exhibit {

	private String origin;
	
	public enum FromPeriod{
		CLASSIC, MIDDLE_AGES, MODERN_AGES
	}
	
	FromPeriod hPeriod;

	public HistoricalArtefacts(int id, String name, String description,
			String origin) {
		super(id, name, description);
		this.origin = origin;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		HistoricalArtefacts other = (HistoricalArtefacts) obj;
		if (origin == null) {
			if (other.origin != null)
				return false;
		} else if (!origin.equals(other.origin))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "HistoricalArtefacts [origin=" + origin + "]";
	}

	@Override
	public int compareTo(Exhibit name) {
		
		return 0;
	}
	
	
	
	
	
	

}
