package javaStudy;

import myobj.Coffee;
import myobj.DiffPackage;

public class D08_AccessModifier {
	/*
	 	# ���� ������ (Access Modifier)
	 	
	 	 - �ٸ� Ŭ������ �ش� Ŭ������ �ڿ��� ����Ϸ��� �� ��
	 	  ��  ������ ��������� �����Ѵ�
	 	  
	 	# ���� �����ڸ� ���� ������ �� �ִ� �Ÿ��� ����
	 	
	 	 - ���� Ŭ���� ������ �ٸ� �ڿ� (���� ����� �Ÿ�)
	 	 - ���� ��Ű�� ������ �ٸ� �ڿ�
	 	 - �ٸ� ��Ű���� ������ ��ӹ��� �ڿ�
	 	 - �ٸ� ��Ű���� �ڿ� (���� �� �Ÿ�)
	 	 
	 	# ���� �������� ����
	 	
	 	 - private
	 	 	�տ� private�� ���� �ڿ��� ���� Ŭ���� ���ο����� ������ �� �ְ� �ȴ�
	 	 
	 	 - default (�ƹ��͵� �� ��)
	 	 	���� ��Ű�� ���ο����� �����Ӱ� ������ �� �ְ� �ȴ�.
	 	 	�ٸ� ��Ű�������� ������ �� ����.
	 	 
	 	 - protected
	 	 	�տ� protected�� ���� �ڿ���
	 	 	���� ��Ű�� ���ο����� �����Ӱ� ������ �� �ְ�,
	 	 	�ٸ� ��Ű������ ��ӹ��� Ŭ������ ������ �� �ִ� �ڿ��� �ȴ�.
	 	 	
	 	 - public 
	 	 	�տ� public�� ���� �ڿ���
	 	 	�ٸ� ��Ű�������� �����Ӱ� ������ �� �ִ� �ڿ��� �ȴ�.
	 	 
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
		// protected : ��ӹ����� �ٸ� ��Ű�������� ��� ����
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














