package corejava;

public class Inheritanceexample extends Teacher1 {
	String mainsubject = "physics";
	
	@Override
	double sum(int a, int b) {
		double tmp = super.sum(a, b);
		return tmp/2;
	}
	
	public static void main(String args[]) {
		Inheritanceexample obj = new Inheritanceexample();  // we are not accessing the data members directly, we are
															// using public getter method top access the 
															//private members of parent class.
															
		System.out.println(obj.getCollegeName());
		System.out.println(obj.getDesignation());
		System.out.println(obj.sum(3,4));
		obj.does();
	}

}
