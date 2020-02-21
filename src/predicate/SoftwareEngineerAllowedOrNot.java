package predicate;

import java.util.function.Predicate;

public class SoftwareEngineerAllowedOrNot {

	public static void main(String[] args) {

		SoftwareEngineer[] list = { new SoftwareEngineer("Durga", 60, false), 
				new SoftwareEngineer("Nagaraj", 25, true),
				new SoftwareEngineer("Sayan", 26, true), 
				new SoftwareEngineer("Subbu", 28, false),
				new SoftwareEngineer("Ravi", 77, true) };
		
		
		Predicate<SoftwareEngineer> allowed = enginer -> enginer.getAge() >=18 && enginer.isHavingGf==true;
		
		
		for(SoftwareEngineer se:list)
		{
			if(allowed.test(se))
			{
				System.out.println(se);
			}
		}
	}

}

class SoftwareEngineer {
	String name;
	int age;
	boolean isHavingGf;

	SoftwareEngineer(String name, int age, boolean isHavingGf) {
		this.name = name;
		this.age = age;
		this.isHavingGf = isHavingGf;
	}

	public String toString() {
		return name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isHavingGf() {
		return isHavingGf;
	}

	public void setHavingGf(boolean isHavingGf) {
		this.isHavingGf = isHavingGf;
	}

}