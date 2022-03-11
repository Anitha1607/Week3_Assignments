package week3testleaf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		List<Integer> s1 =new ArrayList<Integer>(Arrays.asList(1,2,3,4,6,7,8));
		Collections.sort(s1);
		System.out.println(s1);
		for(int i=s1.get(0);i<=s1.size();i++){
			if(i!=s1.get(i-1)) {
				System.out.println("The missing number is:"+i);
				break;
			}
			
		}
		

	}

}
