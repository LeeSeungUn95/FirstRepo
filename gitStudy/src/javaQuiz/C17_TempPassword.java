package javaQuiz;

public class C17_TempPassword {

	public static void main(String[] args) {
		//4자리의 랜덤 임시비밀번호를 생성하는 프로그램을 만들어보세요.
		//(비밀번호를 구성하는 문자는 영어 대문자와 숫자입니다)
		//승운
//		System.out.print("당신의 임시비밀번호는 : ");
//		int j = 0;
//		while (j < 4) {
//			int password = (int)(Math.random() * 91 + 0);
//			if (password >= 65 && password <= 90) {
//				System.out.print((char)password);
//			}else if (password >= 0 && password <= 9) {
//				System.out.print(password);
//			}else {
//				continue;
//			}
//			j++;
//		}
//		System.out.print("입니다.");
		
//		StringBuilder tempPassword = new StringBuilder();
//		int size = 4;
//		//강사
//		for (int i = 0; i < size; i++) {			
//			
//			switch ((int)(Math.random() * 2)) {
//			case 0 :
//				tempPassword.append((char)(Math.random() * 26 + 'A'));
//				break;
//			case 1 :
//				tempPassword.append((char)(Math.random() * 10 + '0'));
//				break;
//			}
//		}
//		System.out.println("임시 비밀번호 : " + tempPassword);
		
		String charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		
		int password_size = 4;
		for (int i = 0; i < password_size; i++) {
			int random_index = (int)(Math.random() * charset.length());
			System.out.print(charset.charAt(random_index));
		}
	}	
}














