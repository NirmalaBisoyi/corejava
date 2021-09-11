package corejava;

public class Teacher1 {
	private String designation = "teacher";
	private String collegeName = "beginnng books";

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	void does() {

		System.out.println("teaching");
	}

	double sum(int a, int b) {

		double c = a + b;

		return c;

	}
	

}
