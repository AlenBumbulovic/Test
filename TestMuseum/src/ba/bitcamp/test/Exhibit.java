package ba.bitcamp.test;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author alen.bumbulovic This class describes the exhibits of a museum.
 */
public abstract class Exhibit implements Comparable<Exhibit>{

	private int id;
	private String name;
	private String description;

	public Exhibit(int id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	
	/**
	 * This method compares exhibits by name
	 * 
	 * @param name
	 * @return names sorted in alphabetical order
	 */
	public int compareTo(String name) {

		return this.name.compareTo(name);
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Exhibit other = (Exhibit) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Exhibit [id=" + id + ", name=" + name + ", description="
				+ description + "]";
	}

	

}
