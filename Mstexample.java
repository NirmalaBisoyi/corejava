package corejava;

public class Mstexample {
	static int num;
	static String mystr;

	static {
		System.out.println("static block1");
		num = 97;
		mystr = "block1";
	}
	

	public static void main(String arg[]) {
		
		System.out.println("==============================");
		Mstexample  obj1=new Mstexample();
		
		System.out.println("Value of Number:" + obj1.num);
		System.out.println("Value of String:" + obj1.mystr);  // single copy will be shared by all objects
		
		System.out.println("==============================");
		Mstexample  obj2=new Mstexample();   // // single copy will be shared by all objects
		
		 
		System.out.println("Value of Number:" + obj2.num);
		System.out.println("Value of String:" + obj2.mystr);
	}
}
