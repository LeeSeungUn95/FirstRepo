package javaStudy;

import myobj.Coffee;
import myobj.DiffPackage;

public class D08_AccessModifier {
	/*
	 	# 접근 제어자 (Access Modifier)
	 	
	 	 - 다른 클래스가 해당 클래스의 자원을 사용하려고 할 때
	 	  　  어디까지 허용할지를 설정한다
	 	  
	 	# 점근 제어자를 통해 구분할 수 있는 거리의 종류
	 	
	 	 - 같은 클래스 내부의 다른 자원 (제일 가까운 거리)
	 	 - 같은 패키지 내부의 다른 자원
	 	 - 다른 패키지에 있지만 상속받은 자원
	 	 - 다른 패키지의 자원 (가장 먼 거리)
	 	 
	 	# 접근 제어자의 종류
	 	
	 	 - private
	 	 	앞에 private가 붙은 자원은 같은 클래스 내부에서만 접근할 수 있게 된다
	 	 
	 	 - default (아무것도 안 씀)
	 	 	같은 패키지 내부에서는 자유롭게 접근할 수 있게 된다.
	 	 	다른 패키지에서는 접근할 수 없다.
	 	 
	 	 - protected
	 	 	앞에 protected가 붙은 자원은
	 	 	같은 패키지 내부에서는 자유롭게 접근할 수 있고,
	 	 	다른 패키지엣는 상속받은 클래스만 접근할 수 있는 자원이 된다.
	 	 	
	 	 - public 
	 	 	앞에 public이 붙은 자원은
	 	 	다른 패키지에서도 자유롭게 접근할 수 있는 자원이 된다.
	 	 
	 */
	
	public static void main(String[] args) {
		D08_SamePackage instance = new D08_SamePackage();
	
		instance.protected_method();
		instance.public_method();
		instance.default_method();
		
		
		DiffPackage instance2 = new DiffPackage();
		
		instance2.public_method();
	}
}



class Snack {
	int size = 10;
	
	void eat() {
		System.out.println(size - 1);
	}
}

class HoneyButterChip extends Snack {
	
	private void abc() {
		System.out.println(size);
	}
}

class Choco extends DiffPackage{
	
	public Choco() {
		// protected : 상속받으면 다른 패키지에서도 사용 가능
		this.protected_method();
	}
	
	void abc() {
		Snack s = new Snack();
		System.out.println(s.size);
	}
	
	
	
	public static void main(String[] args) {
		Coffee coffee = new Coffee(Coffee.AMERICANO, 1500, 10, Coffee.COLUMBIA);
		Coffee coffee1 = new Coffee(Coffee.CAFFE_LATTE, 1800, 20, Coffee.BRAZIL);
		Coffee coffee2 = new Coffee(Coffee.CPFFE_MOCHA, 2100, 18, Coffee.ETHIOPIA);
		Coffee coffee3 = new Coffee(Coffee.AMERICANO, 1500, 10, Coffee.KENYA);
		
		
	}
}














