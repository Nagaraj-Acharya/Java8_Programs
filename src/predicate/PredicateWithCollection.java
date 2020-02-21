package predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class PredicateWithCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Collection Interface
		Predicate<Collection> pred = c -> c.isEmpty();
		List<String> list =new ArrayList<String>();
		System.out.println("before adding element......"+pred.test(list));
		list.add("Nagaraja");
		
		System.out.println("after adding element......"+pred.test(list));
	}

}
