package assignments;

import java.util.ArrayList;
import java.util.List;

class Employee{
	public String name;
	public int age;
	public String department;

	Employee(String name, int age,String department){
		this.name = name;
		this.age = age;
		this.department = department;
	}
}

class Office{
	private final List<Employee> employee;
	Office(List<Employee> employee){
		this.employee = employee;
	}
	
	public List<Employee> getTotalEmployeeInOffice(){
		return employee;
	}
}
public class CompositionAssignment {
	public static void main(String args[]){  
		Employee e1 = new Employee("Jack",25,"HR");
		Employee e2 = new Employee("Jill", 30, "Engineering");
		Employee e3 = new Employee("James",45, "Sales");
		
		List<Employee> employee = new ArrayList<Employee>();
		
		employee.add(e1);
		employee.add(e2);
		employee.add(e3);
		
		Office office = new Office(employee);
		List<Employee> employees = office.getTotalEmployeeInOffice(); 
		for (Employee emp: employees) {
			System.out.println("Name: "+emp.name+" Age: "+emp.age+" Department: "+emp.department);
		}
	}
}
