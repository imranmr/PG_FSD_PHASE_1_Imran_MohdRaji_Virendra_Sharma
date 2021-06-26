package assignments;


abstract class MNC{
	abstract void method1();
	abstract void method2();
	
	public MNC() {
	}
	
	public void display() {
		System.out.println("Display in parent MNC");
	}
}

abstract class Infosys extends MNC{
	abstract void method2();
//	abstract void display2();
	void method1(){
		System.out.println("Inside method1 in first child");
	}
	
}

class Hello extends Infosys{
	void method2() {
		System.out.println("Inside method2 in second child");
	}
	void display2() {
		System.out.println("Inside method2 methods display2");
	}
}

public class AbstractionAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Infosys obj;
		obj = new Hello();
		
		obj.display();
		obj.method1();
		obj.method2();
		
		Hello hello = new Hello();
		hello.display2();
	}

}
