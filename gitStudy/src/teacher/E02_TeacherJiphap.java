package javaQuiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// ���׸��� �����ص� Ŭ������ �ν��Ͻ� ������ ���ϴ� Ÿ���� �� �� �ְ� �ȴ�
// ���� ������ Object�� �����ȴ�
public class E02_TeacherJiphap<T> {

	//������
	public Set<T> union(Collection<? extends T> a, Collection<? extends T> b) {
		Set<T> union_set = new HashSet<>(a);
		
		union_set.addAll(b);
		
		return union_set;
	}
	//������
	public Set<T> intersection(Collection<? extends T> a, Collection<? extends T> b) {
		Set<T> inter_set = new HashSet<>(a);

		inter_set.retainAll(b);
		
		return inter_set;
	}
	public Set<T> difference (Collection<? extends T> a, Collection<? extends T> b) {
		Set<T> diff_set = new HashSet<>(a);
		
		diff_set.removeAll(b);
		
		return null;
	}
	
	public static int plus(int a, int b) {
		a += b;
		
		return a;
	}
	
	
	// �ҹ��ڷ� ���� �ϴ� Ÿ��(�⺻�� Ÿ��)���� �Ű������� ������ �� ���� �����Ͽ� �����Ѵ�
	// �빮�ڷ� ���� �ϴ� Ÿ�Ե�(������ Ÿ��)�� �Ű������� ������ �� �ּҸ� �����Ͽ� �����Ѵ�
	public static void main(String[] args) {
		
		int int_a = 20;
		int int_b = 30;
		int int_c = 10;
		System.out.println(plus(int_a, int_b));
		System.out.println(plus(int_a, int_c));
		
		List<String> a = new ArrayList<>();
		Set<String> b = new HashSet<>();
		Set<String> c = new HashSet<>();
		
		a.add("abc");
		a.add("application");
		a.add("advertise");
		a.add("apple");
		
		b.add("banana");
		b.add("balloon");
		b.add("bike");
		b.add("apple");
		
		c.add("cow");
		c.add("cat");
		c.add("crack");
		c.add("apple");
		
		E02_TeacherJiphap<String> jiphap_tools = new E02_TeacherJiphap<String>();
		
		System.out.println("nuion�� �����ϱ� ���� a : " + a);
		System.out.println(jiphap_tools.union(b, a));

		System.out.println("\nuinon�� ������ ���� a : " + a);
		System.out.println(jiphap_tools.union(b, c));
		
		System.out.println(jiphap_tools.intersection(a, b));
		System.out.println(jiphap_tools.intersection(jiphap_tools.intersection(a, c),b));
	}
}
























