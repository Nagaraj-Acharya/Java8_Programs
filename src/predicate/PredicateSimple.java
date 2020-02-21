package predicate;

import java.util.function.Predicate;

public class PredicateSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> pred = i -> i>10;
		boolean b=pred.test(11);
		
System.out.println("bb value..."+b);
Predicate<String> predicate = s -> s.length()>5;
boolean c= predicate.test("nag");
System.out.println("ccc value..."+c);
System.out.println(predicate.test("nagarajaaa"));


	
	}

}
