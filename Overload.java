package corejava;

public class Overload {

	   void demo (int a)
	    {
	       System.out.println ("a: " + a);
	    }
	    int demo (int a, int b)
	    {
	       System.out.println ("a and b: " + a + "," + b);
	       return a+b;
	    }
	    
	    double demo(double a) {
	       System.out.println("double a: " + a);
	       return a*a;
	    }
	    
	    public static void main( String args[]) {
	    	Overload  obj = new Overload();
	    	obj.demo(5);
	    	//obj.demo(8,6);
	    	obj.demo(20.0);
	    	double result = obj.demo(10.3);
	    	
	    	System.out.println ("result is " + result);
	    }
	
}
