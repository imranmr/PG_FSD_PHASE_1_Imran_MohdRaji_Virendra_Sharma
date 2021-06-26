package assignments;

import java.util.Scanner;

public class ExceptionAssignment1 {
	static void checkSalary(int salary) throws InvalidSalary{
		if (salary < 2000){
			throw new InvalidSalary ("You need to work hard");
		}
		else if (salary >= 2000 && salary <= 5000) {
			throw new InvalidSalary("Your salary is somehow good");
		}
		else if (salary>= 5100 && salary <=9000) {
			throw new InvalidSalary("Salary is very good");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Type salary: ");
		Scanner scanner = new Scanner(System.in);
		
		int salary = scanner.nextInt();
		try {
			checkSalary(salary);
		}
		catch(Exception ae) {
			System.out.println("Exception message: " + ae.getMessage());
			
		}
		finally {
			System.out.println("Code continues in finally");
		}
		
	}

}

class InvalidSalary extends Exception{
	InvalidSalary(String s){
		super(s);
	}
}