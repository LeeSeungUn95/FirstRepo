package javaStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class E02_HashSet {
	/*
	 	# Set
	 	
	 	 - ������ �����س��� Ŭ����
	 	 - ��ҷ� ���� ���� ������ ���� ������� �ʴ´�
	 	 
	 	# Hash
	 	
	 	 - � ���� �־��� �� ���� ������ �� ���� ���� �����Ǿ�� �ϴ� �˰���
	 	 - ���� ���� �־��� ���� �׻� ������ ���� ���;� �Ѵ�
	 	 - ������ ���� �־��� �� �����ϱ� ���� ���� �ٸ� ���� ���´�
	 	 - ������ �ؽ������� ���� ���� ã�� ���� �Ұ����ؾ� �Ѵ�
	 	 - �ٽ� ���������� ���ư� ���� ���� �ܹ��⼺ �˰���
	 	 - �ߺ� üũ�ÿ� �پ ������ ���δ�
	 	 
	 	�� �ؽ��� ����ϴ� �˰����� ����(�ε���)�� ����
	 
	 	* MD5 (����)
	 	 hello    -> 5D41402ABC4B2A76B9719D911017C592
	 	 hello1   -> 203AD5FFA1D7C650AD681FDFF3965CD2
	 	 hello+���� -> F814893777BCC2295FFF05F00E508DA6
	 
	 	* SHA256 (��)
	 	 hello    -> 2cf24dba5fb0a30e26e83b2ac5b9e29e1b161e5c1fa7425e73043362938b9824
	 	 hello1   -> 91e9240f415223982edc345532630710e94a7f52cd5f48f5ee1afc555078f0ab
	 	 hello+���� -> 5e3235a8346e5a4585f8c58562f5052b8fe26a3bb122e1e96c76784964dfc461
	 */
	public static void main(String[] args) {
		HashSet<Integer> numbers = new HashSet<>();
		
		numbers.add(1000);
		numbers.add(50);
		numbers.add(100);
		numbers.add(70);
		numbers.add(90);
		System.out.println(numbers);
		
		//���� �÷��� �������̽��̱� ������ ArrayList�� �ִ� �޼������ ���⿡�� �ִ�
		if (numbers.remove(50)) {
			System.out.println("����� ����");
		}else {
			System.out.println("����� ����");
		}
		System.out.println(numbers);
		
		// �� �̸��� �ؽ��� �� �˰������ ������ ����
		HashSet<String> english = new HashSet<>();
		
		english.add("apple");
		english.add("airplane");
		english.add("bio");
		english.add("drama");
		english.add("zebra");
		english.add("cat");
		
		System.out.println(english);
		
		// set�� �ε����� ���� ������ for-each�� ����� �� �ִ�
		for (String word : english) {
			System.out.println(word);
		}
		
		// �÷��ǳ����� ��ȯ�� �����Ӵ�
		//  - set�� ������ �����ؾ� �Ѵٸ� List�� ��ȯ�Ͽ� ����� �� �ִ�.
		//  - List�� ����� �� �ߺ��� ������ ����� �ʿ��ϴٸ� Set���� ��ȯ�Ͽ� ����� �� �ִ�
		ArrayList<String> english_list = new ArrayList<>(english);
		Collections.sort(english_list);
		System.out.println(english_list);
		
		ArrayList<Integer> numbers2 = new ArrayList<>();
		
		numbers2.add(1);
		numbers2.add(1);
		numbers2.add(1);
		numbers2.add(1);
		numbers2.add(3);
		numbers2.add(6);
		numbers2.add(6);
		numbers2.add(6);
		numbers2.add(13);
		System.out.println(numbers2);
		System.out.println(new HashSet<>(numbers2));
		
		// �� �÷��ǵ��� �迭�� ��ȯ�ϱ�
		Object[] arr1 = english.toArray(); // 1�� ���, Object[]�� ����
		
		String[] arr2 = new String[english.size()]; // 2�� ���, �̸� ������ �迭�� ����
		english.toArray(arr2);
		
		System.out.println("Object[]�� ��ȯ�� english : " + Arrays.toString(arr1));
		System.out.println("�迭�� ��ȯ�� english : " + Arrays.toString(arr2));
		
		// ���׸��� �䱸�ϴ� Ŭ������ ���׸��� ������� �ʴ� ��� ��� Ÿ���� ���� �� �ִ�
		// - ��� Ÿ���� Object Ÿ������ ��ĳ���õǾ� ����ȴ�
		// - �ش� ���� �ٽ� ����λ���ϱ� ���ؼ��� �ٿ�ĳ������ �ʿ��ؼ� ���ŷӴ�
		ArrayList numbers3 = new ArrayList();
		
		numbers3.add("ȫ�浿");
		numbers3.add('A');
		numbers3.add(123.123);
		numbers3.add(333);
		
//		String str = (String) numbers3.get(3); // �ڹ� ���������δ� �ƹ� �������� - Error
		
		// contains(): �÷��ǿ� �ش� ��Ұ� ���ԵǾ� �ִ��� ���θ� ��ȯ
		System.out.println(english.contains("apple"));
		System.out.println(english.contains("banana"));
		
		System.out.println(english_list.contains("apple"));
		System.out.println(english_list.contains("banana"));
		
		// containsAll(Collection): ������ �÷����� ��� ���ԵǾ� �ִ����� �˻�
		Set<String> subset = new HashSet<>();
		List<String> sublist = new ArrayList<>();
		
		subset.add("zebra");
		subset.add("drama");
		subset.add("tiger");
		
		sublist.add("apple");
		sublist.add("apple");
		sublist.add("apple");
		
		System.out.println("english���� subset�� ��� ������ ����ֳ���? " 
				+ english.containsAll(subset));
		System.out.println("english���� sublist�� ��� ������ ����ֳ���? " 
				+ english.containsAll(sublist));
		
		// addAll(Collection): ������ �÷����� ������ ��� �߰�
		// - ���� �߰��� ���� ������ true
		// - �̹� ��� ���Ե� ��쿡�� false�� ��ȯ�Ѵ�
		System.out.println(english.addAll(subset));
		System.out.println(english.addAll(subset));
		
		System.out.println("english.addAll(subset) : " + english);
		
		// removeAll(Collection): ������ �÷��ǰ� ���� ������ ��� ����
		// - �������� ������ true ������ false
		System.out.println(english_list.removeAll(subset));
		System.out.println(english_list.removeAll(subset));
		
		System.out.println("english_list.removeAll(subset) : " + english_list);
		
		// retainAll(Collection): ������ �÷��ǰ� ��ġ�ϴ� ���븸 �����
		// - ���Ѱ��� �ִٸ� true ������ false
		System.out.println(english.retainAll(subset));
		System.out.println("english.retainAll(subset) : " + english);
		
		// isEmpty(): �ش� �÷����� ��������� true
		System.out.println(english.isEmpty());
		
		
	}
}






















