package ba.bitcamp.test;

public class Employee {
	
	private String name;
	private int id;
	private int salary;
	private int position;
	
	public final int  CEO = 1;
	public final int CURATOR = 2;
	public final int WATCHMAN = 3;

	
	public Employee(String name, int id, int salary, int position) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.position = position;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public int getPosition() {
		return position;
	}


	public int setPosition(int position) {
		if(this.position == 1){
			return CEO;
		}else if(this.position == 2){
			return CURATOR;
		}else if(this.position == 3){
			return WATCHMAN;
		}
		return 0;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (position != other.position)
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary
				+ ", position=" + position + "]";
	}
	
	
	
	
	
	
	
	
	

}
