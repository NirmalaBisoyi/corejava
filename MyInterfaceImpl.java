package corejava;

public class MyInterfaceImpl implements MyInterface {
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void show() {
		System.out.println("show()  in child class has executed !!!");
	}
	
	public static void main(String arg[])
	   {
		MyInterface obj = new MyInterfaceImpl();
		obj.show();
	   }

}
