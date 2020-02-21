package predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeeManagementApplication {

	public static void main(String[] args) {
		ArrayList<Employee> list= new ArrayList<Employee>(); 
		populate(list);  
		//System.out.println(list);
		Predicate<Employee> p1 = emp -> emp.getDesignation().equals("Manager");
		display(p1, list);
		Predicate<Employee> p2 =city -> city.getCity().equals("Bangalore");
		display(p2, list); 
		
		Predicate<Employee> p3 =employee -> employee.getSalary() <20000;
		display(p3,list);
		
		display(p1.and(p2), list);
		display(p1.or(p3).negate(), list);
		display(p1.negate(), list);
		
		
		Predicate<Employee> checkPosition =  Predicate.isEqual(new Employee("Durga","CEO",30000,"Hyderabad"));
		
		System.out.println(checkPosition.equals(checkPosition));
		
	}
	
	
	public static void populate(ArrayList<Employee> list)   
	{
		 list.add(new Employee("Durga","CEO",30000,"Hyderabad")); 
		 list.add(new Employee("Sunny","Manager",20000,"Hyderabad"));   
		  list.add(new Employee("Mallika","Manager",20000,"Bangalore"));   
		  list.add(new Employee("Kareena","Lead",15000,"Hyderabad"));  
		  list.add(new Employee("Katrina","Lead",15000,"Bangalore"));
		  list.add(new Employee("Anushka","Developer",10000,"Hyderabad")); 
		  list.add(new Employee("Kanushka","Developer",10000,"Hyderabad"));   
		  list.add(new Employee("Sowmya","Developer",10000,"Bangalore"));   
		  list.add(new Employee("Ramya","Developer",10000,"Bangalore"));
	}
	
	 public static void display(Predicate<Employee> p,ArrayList<Employee> list)   
	 { 
		 for (Employee e: list )   
		 {
			 if(p.test(e)) 
			 {
				 System.out.println(e);
			 }
		 }
		 System.out.println("********************************************************************************");
	 }

}

class Employee {
	String name;
	String designation;
	double salary;
	String city;

	Employee(String name, String designation, double salary, String city) {
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.city = city;
	}

	public String toString() {
		String s = String.format("[%s,%s,%.2f,%s]", name, designation, salary, city);
		return s;
	}

	public boolean equals(Object obj) {
		Employee e = (Employee) obj;

		if (name.equals(e.name) && designation.equals(e.designation) && salary == e.salary && city == e.city) {
			return true;
		} else {
			return false;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
}