package javaQuiz;

import java.util.Arrays;

public class D01_FunctionQuiz3 {
	//1.
	public static int[] maxRange(int num) {

		int[] maxValue = new int[num];
		
		for (int i = 0; i < maxValue.length; i++) {
			maxValue[i] = i ;
		}
		return maxValue;
	}
	//2.
	public static int[] minMaxRange(int fNum, int sNum) {
		
		int difference = sNum - fNum;
		
		int[] maxMinValue = new int[difference];
		for (int i = 0; i < maxMinValue.length; i++) {
			maxMinValue[i] = fNum + i;
		}
		return maxMinValue;
	}
	//3.
	public static int[] increaseRange(int fNum, int sNum, int increaseNum) {
		int index = 0;
		for (int i = fNum; i < sNum;) {
			index++;				
			i += increaseNum;
		}
		
		int[] increaseValue = new int[index];
		for (int i = 0; i < increaseValue.length; i++) {
			int sum = fNum + (increaseNum * i);
			increaseValue[i] = sum;
		}
		return increaseValue;
	}
	public static void main(String[] args) {
		/*
		 	# ������ �Լ��� �����ϰ� �ùٸ��� �����ϴ��� �׽�Ʈ �غ�����2
			 1. �ִ밪�� �Ű������� ���޹����� 
			 	0���� �ִ밪 �̸��� ��� ���� �����ϴ� int�迭�� �����Ͽ� ��ȯ�ϴ�
			 	range �Լ��� ��������
			 	
			 	ex : range(10) �� ��� -> [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		 	
			 2. �ּҰ��� �ִ밪�� �Ű������� ������, 
			 	�� ���̿� �����ϴ� ��� ���� �����ϴ� int�迭�� �����Ͽ� ��ȯ�ϴ� 
			 	range �Լ��� �������� (�ּҰ� �̻�, �ִ밪 �̸�)
			 	
			 	ex : range(5, 10)�� ��� -> [5, 6, 7, 8, 9]
			 	
			 3. �ּҰ��� �ִ밪�� �������� �Ű������� ������
			 	�ּҰ����� �����Ͽ� �ִ밪���� ��������ŭ �����ϴ� int�迭�� �����Ͽ� ��ȯ�ϴ�
			 	range �Լ��� �������� (�ּҰ� �̻�, �ִ밪 �̸�)
			 	
			 	ex : range(50, 56, 5)�� ��� -> [50, 55]
			 	ex : range(50, 55, 5)�� ��� -> [50]
		 */

		System.out.println(Arrays.toString(maxRange(10)));
		System.out.println(Arrays.toString(minMaxRange(20, 10)));
		System.out.println(Arrays.toString(increaseRange(50, 56, 5)));
	}

}
