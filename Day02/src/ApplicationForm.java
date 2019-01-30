public class ApplicationForm {
	private int id;
	private String applicantName;
	private String address;
	private double expectedSalary;
	
	public void print() {
		System.out.println("Received application for " + applicantName);
	}
	
	public ApplicationForm setId(int id) {
		this.id = id;
		return this;
	}
	public ApplicationForm setApplicantName(String applicantName) {
		this.applicantName = applicantName;
		return this;
	}
	public ApplicationForm setAddress(String address) {
		this.address = address;
		return this;
	}
	public ApplicationForm setExpectedSalary(double expectedSalary) {
		this.expectedSalary = expectedSalary;
		return this;
	}
}
