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
  	1���� 45������ �ߺ����� ���� ���� 7���� �̷���� ArrayList�� �����Ͽ� ��ȯ�ϴ� �޼��带 �ۼ� �� �׽�Ʈ
 */ 
