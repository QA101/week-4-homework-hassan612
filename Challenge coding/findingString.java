import java.util.Scanner;

public class findingString {

	public static void main(String[] args) {
		countCode1("aaacodebbb");
		countCode1("codexxcode");
		countCode1("cozexxcope");
		
		countCode2("Hiabc", "abc");
		countCode2("AbC", "HiaBc");
		countCode2("abc","abXabc");
		
		countCode3("WooHoo");  
		countCode3("HelloThere");
		countCode3("abcdef");
		
		countCode4("Hello there");
		countCode4("Seattle is cool");
		countCode4("I love Java");
	}

	// Return the number of times that the string "code" appears anywhere in the
	// given string, except we'll accept any letter for the 'd'
  	public static void countCode1(String str) {

				
		int count = 0;

		for (int i = 0; i < str.length() - 1; i++) {
			if (str.substring(i, i + 2).equals("co") && str.charAt(i + 3) == 'e') {
				count++;
			}

			}
		System.out.println(count);
	}
	// Given two strings, return true if either of the strings appears at the very
	// end of the other string, ignoring upper/lower case differences

	public static boolean countCode2(String a, String b) {
        
		a = a.toLowerCase();
		b = b.toLowerCase();
		boolean result = a.endsWith(b) || b.endsWith(a);
        System.out.println(result);
		return result;
	}

	// Given a string of even length, return the first half

	public static void countCode3(String str) {
				
		int x = str.length();
		
		System.out.println(str.substring(0, x / 2));
	} 
	// Reverse a string

	public static void countCode4(String str) {

		
		StringBuffer buffer = new StringBuffer(str);
		System.out.println(buffer.reverse());

	}

}
