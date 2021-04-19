package javaQuiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// 제네릭을 설정해둔 클래스는 인스턴스 생성시 원하는 타입을 고를 수 있게 된다
// 고르지 않으면 Object로 설정된다
public class E02_TeacherJiphap<T> {

	//합집합
	public Set<T> union(Collection<? extends T> a, Collection<? extends T> b) {
		Set<T> union_set = new HashSet<>(a);
		
		union_set.addAll(b);
		
		return union_set;
	}
	//교집합
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
	
	
	// 소문자로 시작 하는 타입(기본형 타입)들은 매개변수로 전달할 때 값을 복사하여 전달한다
	// 대문자로 시작 하는 타입들(참조형 타입)은 매개변수로 전달할 때 주소를 복사하여 전달한다
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
		
		System.out.println("nuion을 싱행하기 전의 a : " + a);
		System.out.println(jiphap_tools.union(b, a));

		System.out.println("\nuinon을 싱행한 후의 a : " + a);
		System.out.println(jiphap_tools.union(b, c));
		
		System.out.println(jiphap_tools.intersection(a, b));
		System.out.println(jiphap_tools.intersection(jiphap_tools.intersection(a, c),b));
	}
}
























