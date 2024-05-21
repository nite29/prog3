public class Person {
	int idNumber;
	String firstName;
	String lastName;
	boolean isTeacher;

	public Person(int idNumber, String firstName, String lastName, boolean isTeacher){
		this.idNumber = idNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.isTeacher = isTeacher;
	}

	public int getIDnumber() {
		return this.idNumber;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public boolean getIsTeacher() {
		return this.isTeacher;
	}
}