package javaQuiz;

public class C14_WhileBasicQuiz {

	public static void main(String[] args) {

		/*
		 	while���̿�
		 	
		 	1. 1���� 100������ 3�� ����� ����
		 	
		 	2. 200���� 1���� ���
		 	
		 	3. continue�� �̿��Ͽ� 300���� 500������ 7�� ����� ���
		 	
		 	4. 1���� 200������ ������ 2�� ����� �ƴϰ� 3�� ����� �ƴ� ���ڵ��� ����
		 */
		
		int num = 1;
		int sum = 0;
		//1.
		while (num <= 100) {
			if (num % 3 == 0) {
				sum += num;
				System.out.println("3�� ��� : " + num);
			}
			num++;
		}
		System.out.println("3�� ����� �� �� : " + sum);
		
		//2.
		num = 200;
		while (num > 0) {
			System.out.print(num + " ");
			num--;
		}
		System.out.println();
		//3.
		num = 299;
		while (num <= 500) {
			num++;
			if (num % 7 != 0) {
				continue;
			}
			System.out.print(num + " ");
		}
		System.out.println();
		
		//4.
		num = 0;
		sum = 0;
		while (num <= 200) {
			num++;
			if (num % 2 != 0) {
				if (num % 3 !=0) {
					sum += num;
				}
			}
		}
		System.out.println("���� : " + sum);
	}
}





















