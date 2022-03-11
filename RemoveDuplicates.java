package week3testleaf;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String text1=text.toLowerCase();
		String[] split =text1.split(" ");

        
        Set<String> words=new LinkedHashSet<String>(Arrays.asList(split));
        
        System.out.println(words);
        
        for(String w:words){
            System.out.println(w);
				}
			
				
		
		}
		
		
}



