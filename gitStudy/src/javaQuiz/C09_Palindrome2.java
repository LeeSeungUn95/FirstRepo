package javaQuiz;

public class C09_Palindrome2 {

	public static void main(String[] args) {
		
		String result = "PALINDROME";
		
		String word = "ASDDSA";
		
		for(int i = 0, j = word.length() - 1; i < word.length() / 2; i++, j--) {
			if(word.charAt(i) != word.charAt(j)) {
				result = "NOT PALINDROME";
				break;
			}
		}
		System.out.println("result = " + result);
	}

}
