package javaStudy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.TreeSet;

public class E06_TreeSet {
	/*
	 	# TreeSet
	 	
	 	 - �ߺ����� ������ �� ����
	 	 - �����͸� ������ �� Comparator�� �̿��� �̸� �����Ѵ�
	 	 - ��ҷ� null�� ������� �ʴ´�
	 	 - ó���� �����ؼ� �ֱ� ������ HashSet�� ���� ���� �ӵ��� ������
	 	 - ������ TreeSet���� ����(�ε���)�� �ֱ� ������ ���ϴ� �����͸� ���� �� �ִ�
	 	 - ������ TreeSet�� ������ �̸� �Ǿ� �ֱ� ������ ���ĵ� ������ �����͸� �����°��� ���� ������
	 */
	public static void main(String[] args) {
		Random ran = new Random();
		TreeSet<Grape> grape_tree = new TreeSet<>(new �����з���_GNO����_��������());
		TreeSet<Grape> grape_tree2 = new TreeSet<>(new �����з���_�����˸���_��������());
	
		// �ش� ��ü ��ü�� �� ������ ��ü��� Comparator�� ������� ���� �� �ִ�
		TreeSet<String> word_tree = new TreeSet<>();
		TreeSet<Mango> mango_tree = new TreeSet<>();
		
		mango_tree.add(new Mango("54321", 10, 10));
		mango_tree.add(new Mango("00123", 10, 10));
		mango_tree.add(new Mango("09999", 10, 10));
		mango_tree.add(new Mango("00013", 10, 10));
		
		System.out.println(mango_tree);
		
		word_tree.add("cat");
		word_tree.add("pat");
		word_tree.add("pet");
		word_tree.add("fat");
		word_tree.add("bat");
		
		System.out.println(word_tree);
		
		grape_tree.add(new Grape().setGno("1").setFruit(37));
		grape_tree.add(new Grape().setGno("2").setFruit(33));
		grape_tree.add(new Grape().setGno("3").setFruit(40));
		grape_tree.add(new Grape().setGno("4").setFruit(37));
		
		grape_tree2.addAll(grape_tree);
		
		
		for (int i = 0; i < 5; i++) {
			mango_tree.add(new Mango()
					.setMno(String.format("Mango%04d", ran.nextInt(1000)))
					.setSweet(ran.nextInt(1000))
					.setSize(ran.nextInt(100)));
		}
		System.out.println(mango_tree.toString());
		
		// # TreeSet Ȱ��
		// decendingSet(): �̸� �����س��� ����� �ݴ� ������ Set �ν��Ͻ��� ��ȯ
		System.out.println(grape_tree.descendingSet());
		
		// headSet(toElement) : �� �պ��� ���ϴ� ��ұ��� �ڸ� Set�� ��ȯ
		System.out.println(grape_tree.headSet(new Grape().setGno("3")));
		
		// tailSet(toElemet) : ���ϴ� ��Һ��� ���ϴ� ��ұ��� �ڸ� Set�� ��ȯ
		System.out.println(grape_tree.tailSet(new Grape().setGno("3")));
		
		// subSet(fromElement, toElement) : ���ϴ� ��Һ��� �����ؼ� ���ϴ� ��ұ��� �ڸ� Set�� ��ȯ
		System.out.println(grape_tree.subSet(new Grape().setGno("3"), new Grape().setGno("1")));
		
		TreeSet<Integer> int_tree = new TreeSet<>();

		int_tree.add(99);
		int_tree.add(3);
		int_tree.add(97);
		int_tree.add(50);
		int_tree.add(20);
		int_tree.add(11);
		int_tree.add(76);
//		System.out.println(grape_tree);
//		System.out.println();
//		System.out.println(grape_tree2);
		
		System.out.println(int_tree);
		
		// ceiling(element) : ���ϴ� ���� ����� ��Ҹ� �÷��� ���� (������ ���� ����)
		System.out.println(int_tree.ceiling(76));
		
		// floor(element) : ���ϴ� ���� ����� ��Ҹ� ������ ���� (������ ���� ����)
		System.out.println(int_tree.floor(76));
		
		// higher(element) : ���ϴ� ���� ����� ��Ҹ� �÷��� ���� (������ ���� ������)
		System.out.println(int_tree.higher(76));
		
		// lower(element) : ���ϴ� ���� ����� ��Ҹ� ������ ���� (������ ���� ������)
		System.out.println(int_tree.lower(76));
	}

}
class MangoCompareByMnoAsc implements Comparator<Mango>{
	@Override
	public int compare(Mango o1, Mango o2) {
		return o1.mno.compareTo(o2.mno);
	}
}


class MangoCompareBySweetAsc implements Comparator<Mango>{
	@Override
	public int compare(Mango o1, Mango o2) {
		if (o1.sweet > o2.sweet) {
			return 1;
		} else if (o1.sweet < o2.sweet) {
			return -1;
		} else {			
			return 0;
		}
	}
}

// Comparator : ���Ҷ� ����ϴ� �� ���� Ŭ������ ����� �������̽�
// Comparable : �� ��ü�� �� ������ Ŭ�������� ǥ���ϴ� �������̽�
class Mango implements Comparable<Mango>{
	String mno;
	int sweet;
	int size;
	public Mango() {
	
	}	
	
	public Mango(String mno, int sweet, int size) {
		this.mno = mno;
		this.sweet = sweet;
		this.size = size;
	}
	Mango setMno(String mno) {
		this.mno = mno;
		return this;
	}
	
	Mango setSweet(int sweet) {
		this.sweet = sweet;
		return this;
	}
	
	Mango setSize(int sweet) {
		this.sweet = sweet;
		return this;
	}
	
	public String toString() {
		return mno + "/" + sweet + "/" + size;
	}

	
	// this vs �Ű������� compare �޼��带 �����ϸ� �ȴ�
	@Override
	public int compareTo(Mango o) {
		
		return this.mno.compareTo(o.mno);
	}
}

















