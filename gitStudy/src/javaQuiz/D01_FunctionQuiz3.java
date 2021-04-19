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
		 	# 다음의 함수를 정의하고 올바르게 동작하는지 테스트 해보세요2
			 1. 최대값을 매개변수로 전달받으면 
			 	0부터 최대값 미만의 모든 값을 포함하는 int배열을 생성하여 반환하는
			 	range 함수를 만들어보세요
			 	
			 	ex : range(10) 의 결과 -> [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		 	
			 2. 최소값과 최대값을 매개변수로 받으면, 
			 	그 사이에 존재하는 모든 값을 포함하는 int배열을 생성하여 반환하는 
			 	range 함수를 만들어보세요 (최소값 이상, 최대값 미만)
			 	
			 	ex : range(5, 10)의 결과 -> [5, 6, 7, 8, 9]
			 	
			 3. 최소값과 최대값과 증가값을 매개변수로 받으면
			 	최소값에서 시작하여 최대값까지 증가값만큼 증가하는 int배열을 생성하여 반환하는
			 	range 함수를 만들어보세요 (최소값 이상, 최대값 미만)
			 	
			 	ex : range(50, 56, 5)의 결과 -> [50, 55]
			 	ex : range(50, 55, 5)의 결과 -> [50]
		 */

		System.out.println(Arrays.toString(maxRange(10)));
		System.out.println(Arrays.toString(minMaxRange(20, 10)));
		System.out.println(Arrays.toString(increaseRange(50, 56, 5)));
	}

}
