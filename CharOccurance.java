package week3testleaf;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		int count=0;
		for(char ch: str.toCharArray()) {
			
			if(ch=='e') {
				count++;
			}
			
		}
		System.out.println(count);

	}

}
