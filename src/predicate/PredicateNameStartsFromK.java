package predicate;

import java.util.function.Predicate;

public class PredicateNameStartsFromK {

	public static void main(String[] args) {
	
		String[] names={"Sunny","Kajal","Mallika","Katrina","Kareena"};
		
		Predicate<String> pred= name -> name.charAt(0)=='m' || name.charAt(0)=='M';
		System.out.println("Name Starts with K are.....");
		
		for(String n:names)
		{
			if(pred.test(n))
			{
				System.out.println(n);
			}
		}
		

	}

}
