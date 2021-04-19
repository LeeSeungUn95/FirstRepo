package javaQuiz;

public class B05_ConditionQuiz {

	public static void main(String[] args) {
		/*
        [ �˸��� �񱳿����� �������� ]
            
        1. int�� ���� a�� 10���� ũ�� 20���� ���� �� true
        2. int�� ���� b�� ¦���� �� true                
        3. int�� ���� c�� 7�� ����� �� true
        4. int�� ���� hour�� 0�̸� 24�̻��� �ƴϰ�, 12�̻��� �� true
        5. int�� ���� d�� e�� ���̰� 30�� �� true                
        6. int�� ���� year�� 400���� ������ �������ų�  
                     �Ǵ� 4�� ������ �������� 100���� ����������� ���� �� true
        7. �μ��� ö������ 2�� ������ true
        8. �μ��� ö������ ������ 3�� ������ true  
        9. boolean�� ���� powerOn�� false�� �� true
        10. ���ڿ� �������� str�� "yes"�� �� true
		 */        
		
		//1.
		int a = 15;
		System.out.println("1. a�� 10���� ũ�� 20���� ���� �� true : " + (20 > a && a > 10));	
		//2.
		int b = 4;
		System.out.println("2. b�� ¦���� �� true : " + (b % 2 == 0));
		//3.
		int c = 21;
		System.out.println("3. c�� 7�� ����� �� true : " + (c % 7 == 0));
		//4.
		int hour = 26;
		System.out.println("4. hour�� 0�̸� 24�̻��� �ƴϰ�, 12�̻��� �� true : " + (hour >= 12 && hour < 24));
		//5.
		int d = 50, e = 80;
		System.out.println("5. d�� e�� ���̰� 30�� �� true : " + (d - e == 30 || e - d == 30));
		//6.
		int year = 36;
		System.out.println("6. year�� 400���� ������ �������ų� �Ǵ� 4�� ������ �������� 100���� ����������� ���� �� true : "
				+ (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)));
		//7.
		int minsu = 7, chulsu = 5;
		System.out.println("7. �μ��� ö������ 2�� ������ true : " + (minsu == chulsu + 2));
		//8.
		int minsuBir = 12, chulsuBir = 3;
		System.out.println("8. �μ��� ö������ ������ 3�� ������ true : " + (minsuBir == chulsuBir - 3));
		//9.
		boolean powerOn = false;
		System.out.println("9. boolean�� ���� powerOn�� false�� �� true : " + (powerOn == false));
		//10. ���ڿ��� == ���� ���ϸ� �ȵȴ�.
		//    ������ Ÿ���� ���� ���� ���� �ش� Ŭ������ ���ǵǾ� �ִ� equals()���
		//    �޼��带 �̿��ؾ� �Ѵ�
		String str = "yes";
		System.out.println("10. ���ڿ� �������� str�� \"yes\"�� �� true : " + (str.equals("yes")));
		
		// # �⺻�� Ÿ�԰� ������ Ÿ���� ������
		//   - �⺻�� Ÿ���� ���� �������� ũ�⸦ �����ϱ� ����
		//    (�������� ���̴� �޸𸮸� ����Ѵ�, Stack)
		//   - ������ Ÿ���� ���� �������� ũ�⸦ �����ϱ� ��ƴ�
		//    (�������� �� ���� �޸𸮸� ����Ѵ�, Heap)
		
		String str1 = "yes";
		String str2 = new String("yes");
		String str3 = "yes";
		
		System.out.println("str1 == str2 : " + (str1 == str2));
		System.out.println("str1.equals(str2) : " + (str1.equals(str2)));
		System.out.println("str1 == str3 : " + (str1 == str3));
	}

}











