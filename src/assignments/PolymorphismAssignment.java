package assignments;

class Vehicle{
	int speed;
	long distance;
	
	public Vehicle (){
		speed = 10;
		distance = 1000000;
		
	}
	
	public Vehicle(int x,long y) {
		speed = x;
		distance = y;
	}
	void run() {
		System.out.println("Im in vehicle run");
	}
	void stop() {
		System.out.println("Im in vehicle stop");
		
	}
	public void fuel(int x) {
		
	}
	public void fuel(float x, String y) {
		
	}
	
	public void fuel(char x, int y) {
		
	}
	
}

class TwoWheeler extends Vehicle{
	int speed;
	long distance;
	int nos_of_wheels;
	
	public TwoWheeler() {
		speed = 20;
		distance = 200000;
		nos_of_wheels = 2;
	}
	void run() {
		System.out.println("Im in TwoWheeler run");
	}
	void stop() {
		System.out.println("Im in TwoWheeler stop");
	}
	
	void display() {
		System.out.println("Display in twowheeler speed = "+speed+" distance = "+distance +" nos_of_wheels = "+nos_of_wheels);
		System.out.println("Parent variables: speed = "+ super.speed+" distance = "+super.distance);
	}
	
}

class ThreeWheeler extends Vehicle{
	int speed;
	long distance;
	int nos_of_wheels;
	
	public ThreeWheeler() {
		speed = 30;
		distance = 300000;
		nos_of_wheels = 3;
	}
	void run() {
		System.out.println("Im in ThreeWheeler run");
	}
	void stop() {
		System.out.println("Im in ThreeWheeler stop");
	}
	
	public void display() {
		System.out.println("Display in threewheeler speed = "+speed+" distance = "+distance +" nos_of_wheels = "+nos_of_wheels);
		System.out.println("Parent variables: speed = "+ super.speed+" distance = "+super.distance);
	}
	
}

class FourWheeler extends Vehicle{
	int speed;
	long distance;
	int nos_of_wheels;
	
	public FourWheeler() {
		speed = 40;
		distance = 400000;
		nos_of_wheels = 4;
	}
	void run() {
		System.out.println("Im in FourWheeler run");
	}
	void stop() {
		System.out.println("Im in FourWheeler stop");
	}
	
	public void display() {
		System.out.println("Display in FourWheeler speed = "+speed+" distance = "+distance +" nos_of_wheels = "+nos_of_wheels);
		System.out.println("Parent variables: speed = "+ super.speed+" distance = "+super.distance);
	}
	
}

class EightWheeler extends Vehicle{
	int speed;
	long distance;
	int nos_of_wheels;
	
	public EightWheeler() {
		speed = 80;
		distance = 800000;
		nos_of_wheels = 8;
	}
	void run() {
		System.out.println("Im in EightWheeler run");
	}
	void stop() {
		System.out.println("Im in EightWheeler stop");
	}
	
	public void display() {
		System.out.println("Display in EightWheeler speed = "+speed+" distance = "+distance +" nos_of_wheels = "+nos_of_wheels);
		System.out.println("Parent variables: speed = "+ super.speed+" distance = "+super.distance);
	}
	
}



public class PolymorphismAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v;
		v = new TwoWheeler();
		v.run();
		v.stop();
		
		v = new ThreeWheeler();
		v.run();
		v.stop();
		
		v = new FourWheeler();
		v.run();
		v.stop();
		
		v = new EightWheeler();
		v.run();
		v.stop();
		
		new TwoWheeler().display();
		new ThreeWheeler().display();
		new FourWheeler().display();
		new EightWheeler().display();
		
	}

}
