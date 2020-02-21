package javacollections;

import java.util.Map;
import java.util.TreeMap;

public class SortingMapKeyValueUsingLambdaAndComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map<Integer, String> map =new HashMap<>();
		Map<Integer, String> map =new TreeMap<>((I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);
		map.put(10, "nagaraj");
		map.put(50, "giri");
		map.put(130, "mahesh");
		map.put(20, "nagaraj123");
		map.put(1, "naga");
        System.out.println(map);
        
        
        
	}

}
