package myobj.item;

import myobj.item.sword.DoranSword;

public class Candy extends Item {
	
	int healthy;
	
	public Candy(String name, int price) {
		super(name, price);
		healthy = 10;
	}
	@Override
	public void use() {
		System.out.println(name + "�� �Ծ " + healthy + "��ŭ �� �ǰ��� ���������ϴ�");
	}
	
	public static void main(String[] args) {
		new DoranSword().info();;
	}
}
