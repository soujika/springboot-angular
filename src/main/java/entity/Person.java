package entity;

public class Person {
	String firstName;
	String lastName;
	
	public Person(String fName, String lName) {
		this.firstName = fName;
		this.lastName = lName;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	

}
