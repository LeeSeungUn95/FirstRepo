package javaQuiz;

import java.util.Arrays;
import java.util.Random;

public class C21_Array2Quiz {

	public static void main(String[] args) {
		int[][] numArr = new int[][] {
			{1, 1, 1, 1},
			{1, 1, 1, 1, 1, 1, 1},
			{1, 1, 1, 1, 1, 1},
			{1, 1},
			{1, 1, 1, 1, 1}
		};
		Random ran = new Random();
		
		// 1. numArr�� ��� ���� 0 ~ 100 ������ ���� ������ �ٲ㺸����
		
		for (int i = 0; i < numArr.length; i++) {
			System.out.print("{");
			for (int j = 0; j < numArr[i].length; j++) {
				numArr[i][j] = ran.nextInt(101);
				System.out.printf("'%2d', ", numArr[i][j]);
			}
			System.out.println("}");
		}
		
		
		int sum = 0;
		int count = 0;
		// 2. numArr�� ���հ� ���(�Ҽ��� ��° �ڸ�)�� ���ؼ� ����غ�����
		for (int i = 0; i < numArr.length; i++) {
			
			for (int j = 0; j < numArr[i].length; j++) {
				sum += numArr[i][j];
				count++;
			}
		}
		double div = sum / (double)count;
		System.out.printf("���� : %d, ��� : %.2f\n", sum, sum / div);
		System.out.println();
		
		
		// 3. numArr�� �� ���� ���� ��� ���ؼ� ����غ�����
//		for (int i = 0; i < numArr.length; i++) {
//			sum = 0;
//			for (int j = 0; j < numArr[i].length; j++) {
//				sum += numArr[i][j];
//			}
//			System.out.printf("numArr[%d]��° ���� �� : %d\n", i, sum);
//		}
//		System.out.println();
		
		int[] rowSum = new int[numArr.length];
		
		for (int i = 0; i < rowSum.length; i++) {
			
			for (int j = 0; j < numArr[i].length; j++) {
				rowSum[i] += numArr[i][j];
			}
		}
		
		// Arrats.toString() : �迭 ���ϰ� ����ϱ�
		System.out.println("���� �� : " + Arrays.toString(rowSum));
		
		// 4. numArr�� �� ���� ���� ��� ���ؼ� ����غ�����
		
		// �� row : ��, column : ��
		
		int longest = 0;
		for (int i = 0; i < numArr.length; i++) {
			longest = Math.max(longest, numArr[i].length);
		}
		
		int [] colSum = new int[longest];
		
		for (int i = 0; i < colSum.length; i++) {
			
			for (int j = 0; j < numArr.length; j++) {
				
				if (numArr[j].length > i) {
					
					colSum[i] += numArr[j][i];
				}
				
			}
		}
		System.out.println("���� �� : " + Arrays.toString(colSum));
		
	}
	
	
	
	
	
	
	
	
	
	

}























