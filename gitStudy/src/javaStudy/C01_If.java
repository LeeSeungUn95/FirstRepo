package javaStudy;

public class C01_If {

	public static void main(String[] args) {
		/*
			# if��
				- ()���� ���� true�� �� {}���� ������ �����Ѵ�
				- ()���� ���� false�� �� {}���� ������ �����Ѵ� 
				- {}�ȿ� �� ������ �� �� ���̶�� {}�� ������ �� �ִ�
		 	
		 	# else if��
		 		- ���� �ִ� if���� ������� �ʾҴٸ� if��ó�� �����Ѵ�
		 		- else if�� �ܵ����� ����� �� ����
		 		- else if�� ������ ����� �� �ִ�
		 		
		 	# else��
		 		- ���� �ִ� if, else if�� ��� ������� �ʾҴٸ� {}���� ������ ������ �����Ѵ�
		 		- if �ٷ� ������ �� ���� �ִ�
		 		- else�� �پ��ִ� �������� �ּ� �ѹ��� ����ȴ�
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
		
		char ch = '��';
		
		if (ch >= '��' && ch <= '�R') {
			System.out.println("ch�� ����ִ� ���� �ѱ��Դϴ� : " + ch);
		}else if(ch >= 0x3040 && ch <= 0x30FF){
			System.out.println("ch�� ����ִ� ���� �Ϻ��� �Դϴ� : " + ch);
		}else {
			System.out.println("ch�� ����ִ� ���� �ѱ��� �ƴմϴ� : " + ch);
		}
		
	}
}











