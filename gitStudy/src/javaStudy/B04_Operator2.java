package javaStudy;

public class B04_Operator2 {

	public static void main(String[] args) {
		/*
			# �� ������
				- �� ������ ����� �� �Ǵ� �����̴� (boolean Ÿ���̴�)
				- ��� ����� �� ������ �Բ� ������ ��� ������ ���� ����Ѵ�
		*/
		
		int a = 5,b = 5;
		
		System.out.printf("a = %d, b = %d �� �� \n", a, b);
		System.out.println("a > b  : " + (a > b));
		System.out.println("a < b  : " + (a < b));
		System.out.println("a >= b : " + (a >= b));
		System.out.println("a <= b : " + (a <= b));
		
		System.out.println("a == b : " + (a == b)); // �� ���� ������ true
		System.out.println("a != b : " + (a != b)); // �� ���� �ٸ��� true
		
		/*
			# �� ������
				- boolean Ÿ�� ������ �ϴ� ����
				- && : �� ���� ���� ��� true�� ���� true  (AND)
				- || : �� ���� �� �� �ϳ��� true ���� true (OR)
				- !  : ture�� false, false�� true (NOT)
		 */
		
		System.out.println("\n##### AND #####");
		System.out.println("true  && true  : " + (true && true));   // T
		System.out.println("true  && false : " + (true && false));	// F
		System.out.println("false && true  : " + (false && true));	// F
		System.out.println("false && false : " + (false && false)); // F

		System.out.println("\n##### OR #####");
		System.out.println("true  || true  : " + (true || true));   // T
		System.out.println("true  || false : " + (true || false));	// T
		System.out.println("false || true  : " + (false || true));	// T
		System.out.println("false || false : " + (false || false)); // F
		
		System.out.println("\n##### NOT #####");
		System.out.println("!true  : " + !true);  // F
		System.out.println("!false : " + !false); // T
		
		int x = 8, y = 10, z = 5;
		
		System.out.println("x�� 10���� �۰� 3�� ����� ��� : " + (x > 5 && x % 3 == 0));
		System.out.println("3���� ��� 3�� ����� ��� : " + (x % 3 == 0 && y % 3 == 0 && z % 3 == 0));
		
		// �������� : x, y, z�� ��� 3�� ����� �ƴ� �� ����ϴ� ���� ��������
		System.out.println("3���� ��� 3�� ����� �ƴҶ� ��� : " + (x % 3 != 0 && y % 3 != 0 && z % 3 != 0));
		
		
	}
}
































