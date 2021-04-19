package javaQuiz;

public class C16_Conut369Ver2 {

	public static void main(String[] args) {
		
		// 2. Á¤¼ö·Î Ç®±â
		int input = 333;
		int clap = 0;
		
		for (int i = 1; i <= input; ++i) {
			int testValue = i;
			int count = 1;
			
			int n = 1;
			
			System.out.print(i + " ");
			
			while ((n *= 10) <= testValue) {
//				System.out.println(n + " < "+ testValue);
				count++;
			}
//			System.out.println("count : " + count);
		
			for (int j = count; j > 0; --j) {
				int value = testValue % (int)Math.pow(10, j) / (int)Math.pow(10, j - 1);
				
				if (value == 3 || value == 6 || value == 9) {
					clap++;
					System.out.print("Â¦");
				}
//				testValue %= (int)Math.pow(10, j);
			}
			System.out.println();
		}
		System.out.println("ÃÑ ¹Ú¼ö È½¼ö : " + clap);
//		
//		int input = 333;
//		int clap = 0;
//		
//		for (int i = 1 ; i <= input; i++) {
//			
//			int testValue = i;
//			System.out.print(i + " : ");
//			
//			while (testValue > 0) {
//				int digit = testValue % 10;
//				
//				if (digit % 3 == 0 && digit != 0) {
//					clap++;
//					System.out.print("Â¦");
//				}
//				
//				testValue /= 10;
//			}
//			System.out.println();
//		}
	}

}






















