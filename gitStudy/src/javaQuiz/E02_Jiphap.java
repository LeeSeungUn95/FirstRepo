package javaQuiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;


public class E02_Jiphap {	/*
 	1. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 합집합을 Set타입으로 반환하는 메서드
 	
 	2. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 교집합을 Set타입으로 반환하는 메서드
 	 
 	2. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 차집합을 Set타입으로 반환하는 메서드
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
		
		strHash1.add("승운");
		strHash1.add("승수");
		strHash1.add("이승운");
		strHash1.add("이승수");
	
		strHash2.add("승운");
		strHash2.add("이승수");
		strHash2.add("이승운");
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
	// 합집합
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
	
	
	// 교집합
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
	
	
	// 차집합
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
