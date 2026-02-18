package midterm.pp.model;

public class MidtermApp {
	
	/**
	 * 
	 * @Pratik Patel
	 * @Tuesday, February 17, 2026
	 * 
	 * 
	 * Description - Here are the getter and setter for each of the variables
	 * 				that are passed on to the doa file to enter into the database to help
	 * 				stop SQL injection. This code supports parameterization of the input.
	 * 
	 * 
	 */ 
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDateAvailable() {
		return dateAvailable;
	}
	public void setDateAvailable(String dateAvailable) {
		this.dateAvailable = dateAvailable;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	private String fullName;
    private String contact;
    private String email;
    private String dateAvailable;
    private double salary;
	
	

}
