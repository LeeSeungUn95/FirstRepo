package myobj.item.sword;

import myobj.item.Item;

public class DoranSword extends Item {
	
	int atk;
	
	public DoranSword() {
		super("도란의 검", 450);
		atk = 8;
	}
	
	@Override
	public void use() {
		System.out.println(name + "을 착용하여 공격력이 " + atk + "만큼 상승했습니다");
	}
	
	@Override
	public void buy() {
		System.out.println(name + "을 구매하셨습니다 가격 : " + price);
	}
	
	
}
