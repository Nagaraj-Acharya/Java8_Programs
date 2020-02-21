package javacollections;

import java.util.Set;
import java.util.TreeSet;

public class SortingNumberUsingLambdaComparatotAndSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> set=new TreeSet<>((I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(150);
		set.add(60);
		set.add(370);
		set.add(8);
		set.add(90);
		//Collections.sort(set);
		System.out.println(set);
		//set.forEach(System.out::println);
//		  for (Integer it : set) {
//			System.out.println("number is: "+it);
//		 }	
		
	}

}
