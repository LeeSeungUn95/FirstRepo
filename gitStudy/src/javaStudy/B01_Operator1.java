package javaStudy;

public class B01_Operator1 {

	public static void main(String[] args) {
		/*
		 	# ������ (Operator)
		 		- ����� �� ����ϴ� ��
		 		-  +, -, *, / ...
		 */
		
		// # ��� ������
		int a = 10, b = 7;
		double c = 7.357, d = 7.563;
		
		System.out.println(a + " + " + b + " : " + (a + b));
		System.out.println(a + " - " + b + " : " + (a - b));
		System.out.println(a + " * " + b + " : " + a * b);
		
		// �������� ������ �� ���´�
		System.out.println(a + " / " + b + " : " + a / b);
		// ������ �Ǽ��� ������ ��Ȯ�� ���� ����Ѵ�
		System.out.println(a + " / " + c + " : " + a / c);
		System.out.println(a + " / (float)" + b + ": " + a / (float)b);  // 4byte
		System.out.println(a + " / (double)" + b + " : " + a / (double)b); // 8byte
		
		System.out.println(a + " % " + b + " : " + a % b); //������
		
		System.out.println(a + " ���� " + b + " : " + Math.pow(a, b)); // ����
		System.out.println(a + " ����? " + b + " : " + (a^b)); // ����
		
		System.out.println(a + "�� ������ : " + Math.sqrt(a)); // ������
		System.out.println(a + "�� ���밪 : " + Math.abs(a)); //���밪
		
		System.out.println(c + "�� �Ҽ� ù° �ڸ����� �ݿø� : " + Math.round(c)); // �ݿø�
		System.out.println(d + "�� �Ҽ� ù° �ڸ����� �ݿø� : " + Math.round(d));
		/*
			Math.round()�� �Ҽ� ù° �ڸ������� �ݿø� �� �� �ִ�
			�ݿø��ϰ� ���� �ڸ��� �Ҽ� ù° �ڸ��� ���鸸ŭ ���� �� 
			�ٽ� ������ ����� ���� ���ϴ� �ڸ������� �ݿø� �� �� �ִ�
		 */
		System.out.println(c + "�� �Ҽ� ��° �ڸ����� �ݿø� : " + Math.round(c * 100) / 100.0);
		System.out.println(d + "�� �Ҽ� ��° �ڸ����� �ݿø� : " + Math.round(d * 10) / 10.0);
		
		System.out.println(c + "�� �ø� : " + Math.ceil(c));  // �ø�
		System.out.println(c + "�� ���� : " + Math.floor(c)); // ����
		
		System.out.println(a + " ��(��) " + b + " �߿� ū ���� : " + Math.max(a, b));  // ū����
		System.out.println(a + " ��(��) " + b + " �߿� ���� ���� : " + Math.min(a, b));// ��������
		
		
		
		// # ��Ʈ ������
		// 	&, |, ^, >>, <<
		
		// a = 10, b = 7
		// -> a = 1010, b -> 0111
		
		// a = 1010
		// b = 0111
		// ---------&  1�� ���� ������ 1 
		//     0010 -> 2
		System.out.println("a & b : " + (a & b));  // AND
		
		// a = 1010
		// b = 0111
		// ---------|  1�� �ϳ��� ������ 1
		//     1111 -> 15
		System.out.println("a | b : " + (a | b));  // OR
		
		// a = 1010
		// b = 0111
		// ---------^  1�� ���� ������ 0
		//     1101 -> 13
		System.out.println("a ^ b : " + (a ^ b));  // XOR
		
		// a = 1010 = 10
		// b = 0111 = 7
		// ---------<<
		//     10100000000 (b��ŭ �����ʿ��� �������� �߰� �Ѵ�) -> 1280
		System.out.println("a << b : " + (a << b)); // SHIFT
		
		// a = 1010 = 10
		// b = 0111 = 7
		// --------->>
		//     0 (b��ŭ ���ʿ��� ���������� ���� �Ѵ�) -> 0
		System.out.println("a >> b : " + (a >> b)); // SHIFT
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
