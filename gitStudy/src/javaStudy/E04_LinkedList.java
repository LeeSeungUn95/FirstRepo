package javaStudy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class E04_LinkedList {
	/*
		# ���� ����Ʈ
		
		 - ArrayList���� ����/������ ������ ����Ʈ
		 - ������ �߰��� ������ �߻����� �� ArrayList�� ��� �����͸� �ڷ� �о�� ������
		  	���� ����Ʈ�� ����� ��常 �����ϱ� ������ �ξ� ������
		 - ArrayList�� ������ ���� �� �б⿡ �����ϰ�
		 	LinkedList�� ������ �߰� ���� �� ������ �����ϴ�
	*/
	
	public static void main(String[] args) {
		LinkedList<String> animals = new LinkedList<>();
		
		// LinkedList�� add��
		animals.add("tiger");
		animals.add("lion");
		animals.add("horse");
		
		System.out.println(animals);
		
		animals.add("rabit");
		animals.addFirst("turtle");
		animals.addLast("monkey");
		
		System.out.println(animals);
	
		// LinkedList�� get��
		System.out.println(animals.get(3));
		System.out.println(animals.getLast());
		System.out.println(animals.getFirst());
		
		// pop(), poll() : ����Ʈ�� �� �տ������� �����͸� �а������
		
		while (animals.size() != 0) {
			System.out.println("pop! " + animals.pop());			
		}
		
		System.out.println("after pop: " + animals);
		
		// pollLast() : ����Ʈ�� �� �ں��� �����͸� �а� ������
		
		ArrayList<String> cage = new ArrayList<>();
		cage.add("rabit");
		cage.add("hamster");
		cage.add("bird");
		cage.add("fish");
		
		animals.addAll(cage);
		
		while (animals.size() != 0) {
			System.out.println("�ڿ������� ������ : " + animals.pollLast());
		}
		
		// ���� �׽�Ʈ
		
		int testSize = 1000000;
		
		ArrayList<Integer> arr = new ArrayList<>(testSize);
		
		for (int i = 0; i < testSize; i++) {
			arr.add(i);
		}
		
		LinkedList<Integer> linked = new LinkedList<>();
		
		for (int i = 0; i < testSize; i++) {
			linked.add(i);
		}
		
		// �߰��� ������ �߰� ���ɺ�
		int insertionSize = 5000;
		
		System.out.println("1. ArrayList Insertion Test");
		long startTime = System.currentTimeMillis();
		
		for (int i = 0; i < insertionSize; i++) {
			arr.add(50, 10);
		}
		long endTime = System.currentTimeMillis();
		System.out.println((endTime - startTime) + "ms");

		
		System.out.println("2. LinkedList Insertion Test");
		startTime = System.currentTimeMillis();
		for (int i = 0; i < insertionSize; i++) {
			linked.add(50, 10);
		}
		System.out.println((endTime - startTime) + "ms");
		endTime = System.currentTimeMillis();
	}
}





































