package javacollections;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeNameSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> list= new ArrayList<Employee>();   
		list.add(new Employee(100,"Katrina"));  
		list.add(new Employee(600,"Kareena"));        
		list.add(new Employee(200,"Deepika"));  
		list.add(new Employee(400,"Sunny"));
		list.add(new Employee(500,"Alia")); 
		list.add(new Employee(300,"Mallika"));   
		System.out.println("Before Sorting:");     
		System.out.println(list);  
		Collections.sort(list, (e1,e2)-> (e1.getEno()>e2.getEno())?-1:(e1.getEno()<e2.getEno())?1:0);
		System.out.println(list);
	}

}

class Employee {
	int eno;
	String ename;
	
	Employee(){}
	

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	Employee(int eno, String ename) {
		this.eno = eno;
		this.ename = ename;
	}

	public String toString() {
		return eno + ":" + ename;
	}
}
