package javaQuiz;

public class C11_Gugudan {

	public static void main(String[] args) {
		/*
		 	1. 구구단을 다음과 같이 가로로 출력해보세요
		 	
		 	2단 : 2x1=2 2x2=4 2x3=6 ...
		 	3단 : 3x1=2 3x2=4 3x3=6 ...
		 	4단 : 4x1=2 4x2=4 4x3=6 ...
		 	
		 	2. 구구단을 다음과 같이 가로로 출력해보세요
		 	
		 	2단		3단		4단		...
		 	2x1=2	3x1=3	4x1=4
		 	2x2=4	3x2=6	4x2=8
		 	2x3=6	3x3=9	4x3=12
		 */
		
		//승운
//		int target = 9;
//		
//		for (int dan = 2; dan <= target; dan++) {
//			System.out.printf("\n%d단 : ", dan);
//			for (int gop = 1; gop <= target; gop++) {
//				System.out.printf("%dx%d=%-2d ", dan, gop, dan * gop);
//			}
//		}
//		System.out.println();
//
//		for (int gop = 0; gop <= target; gop++) {
//			System.out.println();
//			for (int dan = 2; dan <= target; dan++) {
//				if (gop == 0) {
//					System.out.printf("%d단	", dan);
//				} else {
//					System.out.printf("%dx%d=%-2d  ", dan, gop, dan * gop);				
//				}
//			}
//		}
//		System.out.println();
		
		//강사
		
		for (int dan = 2; dan < 9; dan++) {
			
			System.out.printf("%d단 : ", dan);
			
			for (int gop = 1; gop <= 9; gop++) {
				System.out.printf("%dx%d=%-2d ", dan, gop, dan * gop);
			}
			
			System.out.println();
		}
		System.out.println("===================================================================");
		
		for (int gop = 0; gop <= 9; gop++) {
			
			for (int dan = 2; dan <= 9; dan++) {
				
				if(gop == 0) {
					System.out.print(dan + "단\t");
				}else {
					System.out.printf("%dx%d=%-2d\t", dan, gop, dan * gop);
				}
			}
			System.out.println();
		}
	}
}













