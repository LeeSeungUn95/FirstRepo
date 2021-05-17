package javaStudy;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E09_Regex {
	/*
	 	# ����ǥ���� (Regular Expression)
	 	
	 	 - ���ڿ��� ������ �����ϴ� ǥ����
	 	 - Ư�� ���α׷��� �� ���ӵ��� �ʴ´�
	 	 - ���α׷��Ӱ� ���ϴ� ���ڿ� ���ϰ� ��ġ�ϴ��� �˻��Ҷ� ����Ѵ�
	 	 
	 	 # Pattern Ŭ����
	 	  
	 	  - ����ǥ������ �ٷ�� Ŭ����
	 	  
	 	 # Matcher Ŭ����
	 	 
	 	  - ���� �ν��Ͻ��� �̿��Ͽ� ���ڿ��� �˻��� �� ����ϴ� Ŭ����
	 */
	public static void main(String[] args) {
		
		// Pattern.matches(regex, input) : input�� regex�� ��ġ�Ǵ� ���ڿ������� �˻����ִ� �޼���
		System.out.println(Pattern.matches("sleep", "sleep"));
		
		// [] : �ش� ��ġ�� �� ���ڿ� � ���ڵ��� �� �� �ִ��� �����ϴ� ǥ����
		System.out.println(Pattern.matches("s[lh@]eep", "sleep"));
		System.out.println(Pattern.matches("s[lh@]eep", "sheep"));
		System.out.println(Pattern.matches("s[lh@]eep", "s@eep"));
		
		/* 
		  	[]���ο� ������ �� �ִ� �͵�
			
			 1. abc  : �ش��ڸ��� a �Ǵ� b �Ǵ� c �� ����Ѵ�
			 2. ^abc : �ش��ڸ��� a,b,c�� ������ ������ ���  
			 3. a-z  : a ���� z���� ��� ���
			 4. &&   : ������ 
		*/
		System.out.println(Pattern.matches("s[^lh@]eep", "sqeep"));
		System.out.println(Pattern.matches("s[0-9]eep", "s0eep"));
		System.out.println(Pattern.matches("s[0-9a-z]eep", "saeep"));
		System.out.println(Pattern.matches("s[a-d&&c-f]eep", "sdeep"));
		
		/*
		 	 ���� ���ڸ� ��Ÿ���� �͵�
		 	
		 	 1. .  : ��� ���� 	�� [] �ۿ� ��� ��� ����
		 	 2. \d : ��� ����
		 	 3. \D : ���ڸ� ������ ��� ��
		 	 4. \s : ��� ���� (\t\n ..���� ��� �����)
		 	 5. \S : ������ ������ ��� ��
		 	 6. \w : �Ϲ����� ���ڵ��� ��� [a-zA-Z0-9_]
		 	 7. \W : �Ϲ����� ���ڵ��� ������ ������ ���
		 */
		System.out.println(Pattern.matches("s.eep", "sheep"));  // ��� ����
		System.out.println(Pattern.matches("s[.]eep", "sheep"));// .�� ���
		System.out.println(Pattern.matches("s\\.eep", "sheep"));// .�� ���
		
		System.out.println(Pattern.matches("s\\deep", "s9eep"));
		System.out.println(Pattern.matches("\\D\\D\\D", "123"));
		System.out.println(Pattern.matches("\\D\\D\\D", "cat"));
				
		System.out.println(Pattern.matches("s\\seep", "s eep"));
		System.out.println(Pattern.matches("s\\seep", "saeep"));
		System.out.println(Pattern.matches("s\\seep", "s\teep"));
		System.out.println(Pattern.matches("s\\seep", "s\neep"));
		System.out.println(Pattern.matches("s\\seep", "s\reep"));
		
		System.out.println(Pattern.matches("s\\Seep", "s eep"));
		System.out.println();
		/*
		 	�ش� ������ ����� ������ ������ �����ϴ� ���
		 	
		 	 1. [ex]{n} : {}���� ������ n�� ��ġ�ؾ� �Ѵ�
		 	 2. [ex]{n,m} : {}���� ������ �ּ� n�� �̻�, �ִ� m��(����) ���� ��ġ�ؾ� �Ѵ�
		 	 	�� ����ǥ���Ŀ� {n, m}ó�� ������ ������ �ȵȴ�
		 	 3. [ex]{n,} : {}���� ������ �ּ� n�� �̻� ��ġ�ؾ��Ѵ� 
		 	 4. [ex]? : 0�� �Ǵ� �ѹ�
		 	 5. [ex]+ : �ּ� �ѹ� �̻�
		 	 6. [ex]* : 0�� �Ǵ� ������
		 */
		System.out.println(Pattern.matches("[\\D3-5]{5}\\.txt", "c34at.txt"));
		System.out.println(Pattern.matches("[\\D3-5]{2,5}\\.txt", "c34at"));
		System.out.println(Pattern.matches("[��-�R]{2,}\\.txt", "�ȳ��ϼ���.txt"));
		System.out.println(Pattern.matches(".{2,}\\.txt", "�ȳ��ϼ���.txt"));
		System.out.println();
 
		String regex1 = String.format(".{%d}\\.txt", 5);
		System.out.println(Pattern.matches(regex1, "�ȳ��ϼ���.txt"));
		
		System.out.println();
		System.out.println(Pattern.matches("[��-�R]?\\.txt", ".txt"));
		System.out.println(Pattern.matches("[��-�R]?\\.txt", "��.txt"));
		System.out.println(Pattern.matches("[��-�R]?\\.txt", "�ѱ�.txt"));
		System.out.println();
		
		// ��ȭ��ȣ ����ǥ����
		System.out.println(Pattern.matches("\\d{3}-?\\d{3,4}-?\\d{4}", "01012341234"));
		
		// �������� : �ڹٿ��� ����ϴ� �������� �˻��� �� �ִ� ����ǥ������ ��������
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� �������� �Է��ϼ��� > ");
		String variableName = sc.nextLine();
		System.out.println(Pattern.matches(variableName + " : ^[\\D&&\\S&&\\w$��-�R][\\w��-�R]*g$", variableName));
		
		/* 
		 	# Pattern.compile(regex)
		 	
		 	 - ������ ����ǥ������ �ؼ��Ͽ� Pattern �ν��Ͻ��� �����ϰ� ��ȯ�Ѵ� 
		 	 
		 	# split() : �����ϵ� ���� �ν��Ͻ��� split()�� �����Ѵ�
		 	
		 	# matcher() : Matcher �ν��Ͻ��� �����Ͽ� ��ȯ�Ѵ�
		*/
		
		String fruit_text = "apple/banana/orange/pineapple/grape/peach/mango/redapple";
		
		Pattern regex = Pattern.compile("/");
		
		String[] fruits = regex.split(fruit_text);
		
		System.out.println(Arrays.toString(fruits));
		
		Pattern regex2 = Pattern.compile("apple");
		
		Matcher matcher = regex2.matcher(fruit_text);
		
		while (matcher.find()) {
			System.out.println("ã�� �� : " + matcher.group());
			System.out.println("��ġ     : " + matcher.start() + "����" + matcher.end() + "����");
		}
	}
}



























