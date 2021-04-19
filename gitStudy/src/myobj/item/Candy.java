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
		System.out.println(name + "를 먹어서 " + healthy + "만큼 목 건강이 좋아졌습니다");
	}
	
	public static void main(String[] args) {
		new DoranSword().info();;
	}
}
