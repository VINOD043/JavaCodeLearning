package scenario_01;

public class Runner {

	public static void main(String[] args) {
		A a = new A();
		a.method1();
		
		B b = new B();
		b.method1();
		
		A a1 = new B();
		a1.method1();
	}

}
