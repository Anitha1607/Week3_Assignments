package week3testleaf;

public class Palindrome {

	public static void main(String[] args) {
		String text1 = "madam";
		String textrev = "";

		int len = text1.length();
		System.out.println(len);

		for (int i = len - 1; i >= 0; i--) {
			textrev = textrev + text1.charAt(i);
		}
		System.out.println(textrev);
		if (text1.equals(textrev)) {
			System.out.println("The string is palindrome");
		} else {
			System.out.println("The String is not palindrome");
		}
	}

}
