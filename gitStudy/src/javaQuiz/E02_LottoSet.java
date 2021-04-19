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
	 	1���� 45������ �ߺ����� ���� ���� 7���� �̷���� HashSet�� �����Ͽ� 
	 	��ȯ�ϴ� �޼��带 �ۼ� �� �׽�Ʈ�غ���
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
	1���� 45������ �ߺ����� ���� ���� 7���� �̷���� ArrayList�� �����Ͽ� ��ȯ�ϴ� �޼��带 �ۼ� �� �׽�Ʈ
*/ 


/*
	1���� 45������ �ߺ����� ���� ���� 7���� �̷���� int[]�� �����Ͽ� ��ȯ�ϴ� �޼��带 �ۼ� �� �׽�Ʈ
 */ 