package javaStudy;

public class B08_Operator4 {

	public static void main(String[] args) {
		/*
			# ���� ������
				- = : ������ ������ �������� ���� �����Ѵ�
			
			# ���� ���� ������
				- ������ ����� ������Ű�� ������
		 */
		int num = 10;
		System.out.println(num += 5); // num = num + 5
		System.out.println(num -= 3); // num = num - 3
		System.out.println(num *= 2); // num = num * 2
		System.out.println(num /= 4); // num = num / 4
		System.out.println(num %= 3); // num = num % 3
		
		/*
			# ���� ������
				- ������ ����� 1�� ������Ű�� ������
				- ++, --�� ��ġ�� ���� ����� �޶�����	
					- ++, --�� �ڿ� ���̸� �ش� ���� ��� ����� ������ �Ŀ� ���� ���Ѵ�
					- ++, --�� �տ� ���̸� �ش� ���� ����� �����ϱ� ���� ���̺��Ѵ�
		 */
		num = 10;
		
		num++; // 1�� ����
		System.out.println(num);
		num--; // 1�� ����
		System.out.println(num);
		
		num = 3;
		
		System.out.println(num++);
		System.out.println(++num);
		
		System.out.println(num--);
		System.out.println(--num);
	}
}














