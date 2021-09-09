package corejava;

public class ExceptionMultiCatchBlock {

	public static void main(String[] args) {
		try {
			
			int a[]=new int[5];
			a[5]=30/0;
			System.out.println(a[10]);
			
			String s=null;  
            System.out.println(s.length());  
		}
		catch(ArithmeticException e) {
			
			System.out.println("Arithmetic Exception Occurs");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("ArrayIndexOutOfBounds Exception Occurs");
		}
		catch(Exception e) {
			
			System.out.println("Parent Exception Occurs");
		}
		System.out.println("Rest of the code");
	}
	

}
