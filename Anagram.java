package week3testleaf;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1= "stops";
				String text2="potss";
				
				int len=text1.length();
				int len2=text2.length();
				
if(len==len2) {
	System.out.println("The lenght is same");
	}
char[] c1 = text1.toCharArray();
System.out.println(c1);
char[] c2 = text2.toCharArray();
Arrays.sort(c1);
Arrays.sort(c2);
//Check both the arrays has same value
boolean result = Arrays.equals(c1, c2);
if(result){
	System.out.println("the string is anagram");
}
else
{
	System.out.println("the string is not anagram");
}

}
}