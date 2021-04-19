package javaQuiz;

import java.util.Scanner;

public class B06_ConditionQuiz2 {

	public static void main(String[] args) {
		/*
        [ ¾Ë¸ÂÀº Á¶°Ç½ÄÀ» ¸¸µé¾îº¸¼¼¿ä ]

        1. charÇü º¯¼ö a°¡ 'q'¶Ç´Â 'Q'ÀÏ ¶§ true
        2. charÇü º¯¼ö b°¡ °ø¹éÀÌ³ª ÅÇÀÌ ¾Æ´Ò ¶§ true
        3. charÇü º¯¼ö c°¡ ¹®ÀÚ('0' ~ '9')ÀÏ ¶§ true
        4. charÇü º¯¼ö d°¡ ¿µ¹®ÀÚ(´ë¹®ÀÚ ¶Ç´Â ¼Ò¹®ÀÚ)ÀÏ ¶§ true
        5. charÇü º¯¼ö e°¡ ÇÑ±ÛÀÏ ¶§ true
        6. charÇü º¯¼ö f°¡ ÀÏº»¾îÀÏ ¶§ true
        7. »ç¿ëÀÚ°¡ ÀÔ·ÂÇÑ ¹®ÀÚ¿­ÀÌ exitÀÏ ¶§ true        
                    À¯´ÏÄÚµå Ç¥ ÂüÁ¶
		 */        
		
		//1.	
		char a = 'q';
		System.out.println("a°¡ 'q' ¶Ç´Â 'Q'ÀÏ ¶§ true : " + (a == 'q' || a == 'Q'));
			
		//2.
		char b = '	';
		System.out.println("b°¡ °ø¹éÀÌ³ª ÅÇÀÌ ¾Æ´Ò ¶§ true : " + (b != ' ' && b != '	'));
		
		//3.
		char c = 'a';
		System.out.println("c°¡ ¹®ÀÚ '0' ~ '9'ÀÏ ¶§ true : " + (c >= '0' && c <= '9'));
		
		//4.
		char d = 'a';
		System.out.println("d°¡ ¿µ¹®ÀÚ(´ë¹®ÀÚ ¶Ç´Â ¼Ò¹®ÀÚ)ÀÏ ¶§ true : " + ((d >= 'a' && d <= 'z') || (d >= 'A' && d <= 'Z')));
		
		//5.
		char e = 'ÆR';
		System.out.println("e°¡ ÇÑ±ÛÀÏ ¶§ true : " + ((e >= 0xAC00) && (e <= 0xD7A3)));
		
		//6.
		char f = 'ª¢';
		System.out.println("f°¡ ÀÏº»¾îÀÏ ¶§ true : " + ((f >= 0x3040) && (f <= 0x30FF)));
		
		Scanner sc = new Scanner(System.in);
		//7.
		
		System.out.print("¾Æ¹« ¿µ´Ü¾î³ª ÀÔ·ÂÇÏ¼¼¿ä(exit¸¦ ÀÔ·ÂÇÏ½Ã¸é true°¡ ³ª¿É´Ï´Ù) > ");
		String userSelect = sc.nextLine();
		System.out.println("»ç¿ëÀÚ°¡ ÀÔ·ÂÇÑ ¹®ÀÚ¿­ÀÌ exitÀÏ ¶§ true : " + (userSelect.equals("exit")));
		
	}
	
	
	
	
	
	
	
}









