package javaQuiz;

public class C17_TempPassword {

	public static void main(String[] args) {
		//4�ڸ��� ���� �ӽú�й�ȣ�� �����ϴ� ���α׷��� ��������.
		//(��й�ȣ�� �����ϴ� ���ڴ� ���� �빮�ڿ� �����Դϴ�)
		//�¿�
//		System.out.print("����� �ӽú�й�ȣ�� : ");
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
//		System.out.print("�Դϴ�.");
		
//		StringBuilder tempPassword = new StringBuilder();
//		int size = 4;
//		//����
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
//		System.out.println("�ӽ� ��й�ȣ : " + tempPassword);
		
		String charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		
		int password_size = 4;
		for (int i = 0; i < password_size; i++) {
			int random_index = (int)(Math.random() * charset.length());
			System.out.print(charset.charAt(random_index));
		}
	}	
}














