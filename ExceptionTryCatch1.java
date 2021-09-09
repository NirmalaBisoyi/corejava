package corejava;

public class ExceptionTryCatch1 {

	public static void main(String[] args) {
try {
			
			int data=50/0;		//may throw exception   
		}
		catch(Exception e) {		  /// handling the exception by using Exception class   
			System.out.println(e);
		}
		System.out.println("Rest of the code");
	}

}
