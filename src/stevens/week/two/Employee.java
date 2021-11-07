package stevens.week.two;

/**
 * Employee - superclass containing employee name and SSN
 * @author Kyle Stevens
 *
 */
public class Employee {
	
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	
	public Employee(String fName, String lName, String ssn) {
		this.firstName = fName;
		this.lastName = lName;
		this.socialSecurityNumber = ssn;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getSocialSecurityNumber() {
		return this.socialSecurityNumber;
	}
	
	public String toString() {
		return String.format("%s: %s %s%n%s: %s%n", 
		         "commission employee", getFirstName(), getLastName(), 
		         "social security number", getSocialSecurityNumber() );
	}
}
