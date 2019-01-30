
public class ApplicationFormMain {

	public static void main(String[] args) {
		ApplicationForm appForm = new ApplicationForm();
		appForm.setId(101)
				.setApplicantName("Sam")
				.setAddress("Chennai")
				.setExpectedSalary(100000)
				.print();
		
	}

}
