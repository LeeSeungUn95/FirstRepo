package javaQuiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class E02_LottoSet {

	public Random ran;
	public HashSet<Integer> lotto;
	
	public E02_LottoSet() {
		this.lotto = new HashSet<>();
		this.ran = new Random();
	}
	/*
	 	1부터 45사이의 중복없는 랜덤 숫자 7개로 이루어진 HashSet을 생성하여 
	 	반환하는 메서드를 작성 후 테스트해보기
	 */
	public static void main(String[] args) {

		E02_LottoSet lotto = new E02_LottoSet();
//		lotto.printLottoCreation();
		ArrayList<Integer> arrListLotto = new E02_LottoSet().getArrayLottoSet();
		int[] arrLotto = new E02_LottoSet().getIntegerLottoSet();
		System.out.println(Arrays.toString(arrLotto));
		
	}
	
	
	public HashSet<Integer> printLottoCreation() {
		while(true) {
			lotto.add(ran.nextInt(45) + 1);
			if (lotto.size() == 7) {
				break;
			}
		}

		return lotto;
	}
	
	
	
	public ArrayList<Integer> getArrayLottoSet() {
		HashSet<Integer> hashLotto = new HashSet<>();
		
		while (hashLotto.size() < 7) {
			hashLotto.add((int)(Math.random() * 45 + 1));
		}
		ArrayList<Integer> arrListLotto = new ArrayList<>(hashLotto);
		
		return arrListLotto;
	}
	
	public int[] getIntegerLottoSet() {
		HashSet<Integer> hashLotto = new HashSet<>();
		
		while (hashLotto.size() < 7) {
			hashLotto.add((int)(Math.random() * 45 + 1));
		}
		ArrayList<Integer> arrListLotto = new ArrayList<>(hashLotto);
		int[] arrLotto = new int[hashLotto.size()];
		for (int i = 0; i < arrListLotto.size(); i++) {
			arrLotto[i] = arrListLotto.get(i);
		}
		return arrLotto;
	}
}

/*
	1부터 45사이의 중복없는 랜덤 숫자 7개로 이루어진 ArrayList를 생성하여 반환하는 메서드를 작성 후 테스트
*/ 


/*
	1부터 45사이의 중복없는 랜덤 숫자 7개로 이루어진 int[]를 생성하여 반환하는 메서드를 작성 후 테스트
 */ 