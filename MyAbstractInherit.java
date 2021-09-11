package corejava;

public class MyAbstractInherit extends MyAbstract
{

	@Override
	void show() {
		System.out.println("show()  in child class has executed !!!");
	}
	
	@Override
	void display() {
		System.out.println("display()  in child class has executed !!!");
	}
	
	
	public static void main(String[] args) {

		MyAbstractInherit  obj1 = new MyAbstractInherit();
		
		obj1.show();
		
		obj1.display();
      

	}

}
