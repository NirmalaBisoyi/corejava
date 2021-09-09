package corejava;

public class ExceptionFinallyBlock1 {

	public static void main(String[] args) {
		try {
			System.out.println("Inside the try block");
			int data=25/0;
			System.out.println(data);
		}
		catch(ArithmeticException e) {
			
			System.out.println("Exception handled");
			System.out.println(e);
		}
		finally {
			System.out.println("Finally block is executed");
			
		}
		System.out.println("Finally block is alwavs executed");
	}

}
