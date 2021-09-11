package corejava;

public class OverridingDemo extends ABC {
	@Override
	public void disp() {
		// TODO Auto-generated method stub
		//super.disp();
		System.out.println("disp() of child class");
	}

	public void newMethod() {

		System.out.println("New Method of child class");

	}

	public static void main(String args[]) {

		OverridingDemo obj = new OverridingDemo();
		obj.disp();

		ABC obj1 = new ABC();		//When Parent class reference refers to the parent class object
									//then in this case overridden method (the method of parent class) is called
		 obj1.disp();

		ABC obj2 = new OverridingDemo();	//When parent class reference refers to the child class object
		 									//then the overriding method (method of child class) is called.
		 									//This is called dynamic method dispatch and runtime polymorphism
		 obj2.disp();
	}

}
