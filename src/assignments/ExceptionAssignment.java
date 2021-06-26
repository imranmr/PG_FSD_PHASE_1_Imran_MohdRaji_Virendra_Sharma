package assignments;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionAssignment {
	static int areaFunct(int l, int b) {
		return l*b;
	}
	static int display(int l, int b) throws IOException {
		
		
		int areavalue = areaFunct(l,b);
		if(l>b) {
			throw new IOException("Length is greater than breadth - IOException Caught");
		}
		else {
			System.out.println("Both Parameters are correct");
		}
		return areavalue;
		
	}
	
	
	static int calculate(int l, int b) throws IOException {
		int area = display(l,b);
		return area;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int result = 0;
		try {
			result = calculate(num1,num2);
		}
		catch(IOException ae) {
			System.out.println(ae.getMessage());
		}
		
		System.out.println("Result is: "+result );
		
	}

}
