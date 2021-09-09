package corejava;

public class ExceptionTryCatch{

	public static void main(String[] args) {
		try {
			
			int data=50/0;		//may throw exception   
		}
		catch(ArithmeticException e) {		  //handling the exception  
			
			System.out.println(e);
		}
		System.out.println("Rest of the code");
	}
}
