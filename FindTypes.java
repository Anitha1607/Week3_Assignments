package week3testleaf;

public class FindTypes {

	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		for(char ch: test.toCharArray())
		{
			if(ch >= 'a' && ch <= 'z'|| ch >= 'A' && ch <= 'Z' ) {
				letter++;
			}
			else if(ch >= '0' && ch <= '9') {
					num++;
				}
				else if(ch==' '){
					space++;
											
				}
				else
				{
					specialChar++;
				}
			}
	
System.out.println("letter: " + letter);
System.out.println("number: " + num);
System.out.println("space: " + space);
System.out.println("specialCharcter: " + specialChar);

	}



}
