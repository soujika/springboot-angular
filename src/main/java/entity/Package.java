package entity;

import java.util.Date;

public class Package {

	int id;
	String name;
	Person createdPerson;
	Date date;
	
	public Package(int id, String name, Person createdPerson, Date date) {
		this.id = id;
		this.name = name;
		this.createdPerson = createdPerson;
		this.date = date;
	
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the createdPerson
	 */
	public Person getCreatedPerson() {
		return createdPerson;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	
	
	
}
