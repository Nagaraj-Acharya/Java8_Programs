package javacollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingNumberUsingLambdaComparatorAndList {
	
	
	public static void main(String[] args) {
		List<Integer> list =new ArrayList<Integer>();
		
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(150);
		list.add(60);
		list.add(370);
		list.add(8);
		list.add(90);
		System.out.println("before sorting "+list);
		Collections.sort(list);
		System.out.println("after sorting "+list);
		
		//customized sorting
		Collections.sort(list, (I1, I2) ->  (I1>I2)?-1:(I1<I2)?1:0);
		System.out.println("after sorting "+list);
		list.forEach(System.out::println);
		list.forEach(i->System.out.println(i));

	}
	
	

}
