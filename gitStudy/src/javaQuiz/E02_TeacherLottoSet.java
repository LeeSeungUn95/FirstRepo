package javaQuiz;

import java.util.ArrayList;
import java.util.HashSet;

public class E02_TeacherLottoSet {
	
	public HashSet<Integer> getLottoSet(){
		HashSet<Integer> lotto = new HashSet<>();
		
		while (lotto.size() < 7) {
			lotto.add((int)(Math.random() * 45 + 1));
		}
		
		return lotto;
	}
	
	public ArrayList<Integer> getLottoList() {
		return new ArrayList<>(getLottoSet());
	}
	
	public Integer[] getLottoArray() {
		return getLottoList().toArray(new Integer[7]);
	}
	
	public int[] getLottoArray2() {
		Integer[] lotto = getLottoArray();
		int[] result = new int[7];
		
		for (int i = 0; i < 7; i++) {
			result[i] = lotto[i];
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		HashSet<Integer> lotto = new E02_TeacherLottoSet().getLottoSet();
		
		System.out.println(lotto);
	}
}

/*
  	1부터 45사이의 중복없는 랜덤 숫자 7개로 이루어진 ArrayList를 생성하여 반환하는 메서드를 작성 후 테스트
 */ 
