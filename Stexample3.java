package corejava;

public class Stexample3 {
	static int i = 100;
	static String s = "Beginners Book";

	//static methods
	static void display() {
		System.out.println("i:" + i);
		System.out.println("s:" + s);
	}

	//Non static methods
	void func() {
		display();		//static methods called  non static methods
	}

	public static void main(String args[]) {
		Stexample3 obj = new Stexample3();
		obj.func();		//you need to have object to call non static methods
		display();		//static method called another static method
	}

}
