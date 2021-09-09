package corejava;

class Demo implements MyInterface1 {

	@Override
	public void method1() {
		System.out.println("Implementation of method1");
	}

	@Override
	public void method2() {
		System.out.println("Implementation of method2");

	}

	public static void main(String[] args) {
		MyInterface1 obj = new Demo();
		obj.method1();
		obj.method2();

	}

}
