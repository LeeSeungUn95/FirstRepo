package javaStudy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class E05_Comparator {
	/*
		# Comparator
		
		 - 구현하면 두 객체의 크기를 비교할 때 사용하는 클래스가 되는 인터페이스
		 - 객체간의 크기를 정할 때 사용된다
		 - 원래 기본 동작은 주소값 비교
	 
	 */
	public static void main(String[] args) {
		
		
		LinkedList<Grape> grapes = new LinkedList<>();
		
		for (int i = 0; i < 10; i++) {
			grapes.addLast(new Grape()
					.setGno(String.format("PODO%04d", (int)(Math.random() * 10000)))
					.setLocation((int)(Math.random() * Grape.LOCATIONS))
					.setFruit((int)(Math.random() * 11 + 30)));
			System.out.println(grapes.getLast());
		}
		
		Collections.sort(grapes, new 포도분류기_포도gno기준_내림차순());
		System.out.println("\n###gno기준 내림차순 정렬후");
		for (Grape grape : grapes) {
			System.out.println(grape);
		}
		
		//1. 포도 알맹이 기준 내림차순 정렬해보기
	
		//2. 포도 지역이름 기준 내림차순 정렬 해보기
	}
}

class 포도분류기_GNO기준_내림차순 implements Comparator<Grape> {
	@Override
	public int compare(Grape o1, Grape o2) {
		// 문자열의 크기 비교는 이미 String클래스의 compareTo메서드에 구현되어 있다.
		return o1.gno.compareTo(o2.gno) * -1;
		
	}
}


class 포도분류기_포도gno기준_내림차순 implements Comparator<Grape> {
	@Override
	public int compare(Grape o1, Grape o2) {
		String gno1 = o1.gno;
		String gno2 = o2.gno;
		int min_len = Math.min(gno1.length(), gno2.length());
		
		for (int i = 0; i < o1.gno.length(); i++) {
			if (gno1.charAt(i) < gno2.charAt(i)) {
				return 1;
			} else if (gno1.charAt(i) == gno2.charAt(i)) {
				continue;
			} else {
				return -1;
			}
		}
		return 0;
	}
}

class 포도분류기_포도지역이름_내림차순 implements Comparator<Grape> {
	@Override
	public int compare(Grape o1, Grape o2) {
		if (o1.location < o2.location) {
			return 1;
		} else if (o1.location == o2.location) {
			return 0;
		} else {
			return -1;
		}
	}
}

class 포도분류기_포도알맹이_내림차순 implements Comparator<Grape> {
	@Override
	public int compare(Grape o1, Grape o2) {
		if (o1.fruit < o2.fruit) {
			return 1;
		}else if (o1.fruit == o2.fruit) {
			return 0;
		}else {
			return -1;
		}
	}
}

class 포도분류기_포도알맹이_오름차순 implements Comparator<Grape> {
	/*
	   # Comparator의 규칙
	 	- compare 메서드의 리턴 값이 1이면 o1과 o2의 순서를 바꾼다
	 	- compare 메서드의 리턴 값이 0이면 같은 크기로 취급한다
	 	- compare 메서드의 리턴 값이 -1이면 o1과 o2의 순서를 그대로 유지한다
	 */
	@Override
	public int compare(Grape o1, Grape o2) {
		if(o1.fruit < o2.fruit) {
			return -1;
		} else if (o1.fruit == o2.fruit) {
			return 0;
		} else {
			return 1;
		}
	}
}
	
class Grape {
	private static String[] locationNames = {"말레이시아", "칠레", "싱가포르", "브라질", "호주"}; 
	public static int LOCATIONS = locationNames.length;
	String gno;
	int location;
	int fruit;
	
	Grape setGno(String gno) {
		this.gno = gno;
		return this;
	}
	
	Grape setLocation(int location_id) {
		location = location_id;
		return this;
	}
	
	Grape setFruit(int fruit) {
		this.fruit = fruit;
		return this;
	}
	
	/*
	 
	  	# equals()
	  	  - Object 메서드
	  	  - 같은 객체인지 비교할 때 어떤 동작으로 구분해야 하는지를 구현해놓는 메서드
	  	
	 */
	@Override
	public boolean equals(Object obj) {
		return this.gno == ((Grape)obj).gno;
	}
	
	
	
	/*
	 	# toString()
	 	
	 	 - 모든 객체에 포함되어 있는 메서드 (Object 메서드)
	 	 - 이 인스턴스를 문자열로 표현한다면? 을 구현해놓는 메서드
	 	 - System.out.println()은 사실 전달한 인스턴스의 toString()메서드의 결과를 콘솔에 출력하는 메서드이다
	 	 - Object 클래스에 구현되어 있는 toString() 메서드의 기본 동작은 "클래스명@주소값" 이다
	 */
	
	@Override
	public String toString() {
		return gno + "/" + fruit + "/" + locationNames[location] + "(" + location + ")";
	}
}































