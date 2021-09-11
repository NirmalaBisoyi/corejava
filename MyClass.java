package corejava;

public class MyClass extends Myabstract1 {

	@Override
	void display() {
		System.out.println("override abstract methods");
	}

	@Override
	public void display2() {
		System.out.println("concrete child methods");

	}

	public static void main(String args[]) {

		Myabstract1 obj = new MyClass();
		obj.display();
		obj.display2();
	}
}
