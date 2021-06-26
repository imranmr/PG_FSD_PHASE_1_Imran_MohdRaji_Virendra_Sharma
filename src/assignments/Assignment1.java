package assignments;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 11;
		int b = 6;
		float rad = 4.50f;
		int d = addFunction(a,b);
		
		Assignment1 obj = new Assignment1();
		
		float e = obj.findCircle(rad);
		int f = obj.areaofRectangle(a,b);
		System.out.println("Add function = " + d);
		System.out.println("Area of Circle = "+ e);
		System.out.println("Area of rectangle = " + f);

	}
	public static int addFunction(int l1, int l2) {
		
		return l1 + l2;
	}
	
	float findCircle(float radius) {
		return 3.14f*radius*radius;
	}
	
	int areaofRectangle(int base, int height) {
		return base * height;
	}

}
