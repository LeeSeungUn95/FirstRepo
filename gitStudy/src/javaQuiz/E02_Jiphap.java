package javaQuiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;


public class E02_Jiphap {	/*
 	1. �� �÷����� �Ű������� ���� ������ �� �÷����� �������� SetŸ������ ��ȯ�ϴ� �޼���
 	
 	2. �� �÷����� �Ű������� ���� ������ �� �÷����� �������� SetŸ������ ��ȯ�ϴ� �޼���
 	 
 	2. �� �÷����� �Ű������� ���� ������ �� �÷����� �������� SetŸ������ ��ȯ�ϴ� �޼���
 */


	public static void main(String[] args) {
		
		HashSet<String> strHash1 = new HashSet<>();  // HashSet A
		HashSet<String> strHash2 = new HashSet<>();  // HashSet B
		HashSet<String> strHash3 = new HashSet<>();  
		ArrayList<String> strArr1 = new ArrayList<>(); //arr A
		ArrayList<String> strArr2 = new ArrayList<>(); //arr B
	
		HashSet<Integer> intHash1 = new HashSet<>();
		HashSet<Integer> intHash2 = new HashSet<>();
		
		E02_Jiphap quizTest = new E02_Jiphap();
		
		strHash1.add("�¿�");
		strHash1.add("�¼�");
		strHash1.add("�̽¿�");
		strHash1.add("�̽¼�");
	
		strHash2.add("�¿�");
		strHash2.add("�̽¼�");
		strHash2.add("�̽¿�");
		strHash2.add("D");
				
		strHash3.add("3");
		strHash3.add("5");
		strArr2.add("7");
		strArr2.add("9");
		
		intHash1.add(7);
		intHash1.add(9);
		intHash1.add(8);
		intHash1.add(3);
		
		
		System.out.println(quizTest.getStringSumSet(strArr2, strHash2));
		System.out.println(quizTest.getStringSumSet(strArr2, strHash3));
//		System.out.println(quizTest.getStringBridgeSet(strHash2, strHash1));
	}
	// ������
	public Set<String> getStringSumSet(Collection<String> fStr, Collection<String> sStr) {
		Set<String> stringSumSet = new HashSet<>();
		
		stringSumSet.addAll(fStr);
		stringSumSet.addAll(sStr);
		
		return stringSumSet;
	}
	public Set<Integer> getIntegerSumSet(Collection<Integer> fInt, Collection<Integer> sInt) {
		
		Set<Integer> integerSumSet = new HashSet<>();
		
		integerSumSet.addAll(fInt);
		integerSumSet.addAll(sInt);
		
		return integerSumSet;
	}
	
	
	// ������
	public Set<String> getStringBridgeSet(Collection<String> fStr, Collection<String> sStr) {
		Set<String> stringBridgeSet = new HashSet<>();
		
		stringBridgeSet.addAll(fStr);
		stringBridgeSet.retainAll(sStr);
		
		return stringBridgeSet;
		
	}
	public Set<Integer> getIntegerBridgeSet(Collection<Integer> fInt, Collection<Integer> sInt) {
		Set<Integer> stringBridgeSet = new HashSet<>();
		
		stringBridgeSet.addAll(fInt);
		stringBridgeSet.retainAll(sInt);
		
		return stringBridgeSet;
		
	}
	
	
	// ������
	public Set<String> getStringSubSet(Collection<String> fStr, Collection<String> sStr) {
		Set<String> stringSubSet = new HashSet<>();
		
		stringSubSet.addAll(fStr);
		stringSubSet.removeAll(sStr);
		
		return stringSubSet;
		
	}
	public Set<Integer> getIntegerSubSet(Collection<Integer> fInt, Collection<Integer> sInt) {
		Set<Integer> stringSubSet = new HashSet<>();
		
		stringSubSet.addAll(fInt);
		stringSubSet.removeAll(sInt);
		
		return stringSubSet;	
	}

}
