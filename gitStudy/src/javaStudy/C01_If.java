package javaStudy;

public class C01_If {

	public static void main(String[] args) {
		/*
			# if¹®
				- ()¾ÈÀÇ °ªÀÌ trueÀÏ ¶§ {}¾ÈÀÇ ³»¿ëÀ» ½ÇÇàÇÑ´Ù
				- ()¾ÈÀÇ °ªÀÌ falseÀÏ ¶§ {}¾ÈÀÇ ³»¿ëÀ» ¹«½ÃÇÑ´Ù 
				- {}¾È¿¡ µé¾î°¥ ³»¿ëÀÌ ´Ü ÇÑ ÁÙÀÌ¶ó¸é {}¸¦ »ý·«ÇÒ ¼ö ÀÖ´Ù
		 	
		 	# else if¹®
		 		- À§¿¡ ÀÖ´Â if¹®ÀÌ ½ÇÇàµÇÁö ¾Ê¾Ò´Ù¸é if¹®Ã³·³ µ¿ÀÛÇÑ´Ù
		 		- else if´Â ´Üµ¶À¸·Î »ç¿ëÇÒ ¼ö ¾ø´Ù
		 		- else if´Â ¿©·¯¹ø »ç¿ëÇÒ ¼ö ÀÖ´Ù
		 		
		 	# else¹®
		 		- À§¿¡ ÀÖ´Â if, else if°¡ ¸ðµÎ ½ÇÇàµÇÁö ¾Ê¾Ò´Ù¸é {}¾ÈÀÇ ³»¿ëÀ» ¹«Á¶°Ç ½ÇÇàÇÑ´Ù
		 		- if ¹Ù·Î ´ÙÀ½¿¡ ¾µ ¼öµµ ÀÖ´Ù
		 		- else°¡ ºÙ¾îÀÖ´Â Á¶°ÇÀýÀº ÃÖ¼Ò ÇÑ¹øÀº ½ÇÇàµÈ´Ù
		 */
		int a = 10;
		
		if (a == 5) {
			System.out.println("Hello!");
		}else if (a > 0){
			System.out.println("Nice to meet you!");
		}else if (a > -10) {
			System.out.println("Greeting!");
		}else if (a > -20) {
			System.out.println("Good to see You!");
		}
		System.out.println("- Program End -");
		
		char ch = 'ª¢';
		
		if (ch >= '°¡' && ch <= 'ÆR') {
			System.out.println("ch¿¡ µé¾îÀÖ´Â °ªÀº ÇÑ±ÛÀÔ´Ï´Ù : " + ch);
		}else if(ch >= 0x3040 && ch <= 0x30FF){
			System.out.println("ch¿¡ µé¾îÀÖ´Â °ªÀº ÀÏº»¾î ÀÔ´Ï´Ù : " + ch);
		}else {
			System.out.println("ch¿¡ µé¾îÀÖ´Â °ªÀº ÇÑ±ÛÀÌ ¾Æ´Õ´Ï´Ù : " + ch);
		}
		
	}
}












