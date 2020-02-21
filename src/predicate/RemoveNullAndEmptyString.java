package predicate;

import java.util.function.Predicate;

public class RemoveNullAndEmptyString {

	public static void main(String[] args) {
		 String[] names={"Durga","",null,"Ravi","n","Shiva",null};   
		 
		 Predicate<String> removeNullAndEmptyValues = name -> name!="" && name!=null;
		 
		 System.out.println("Remove null and empty values....");
		 
		 for(String n:names)
		 {
			 boolean b= removeNullAndEmptyValues.test(n);
			 if(b)
			 {
				 System.out.println(n);
			 }
			 
		 }

	}

}
