package myobj.item.sword;

import myobj.item.Item;

public class DoranSword extends Item {
	
	int atk;
	
	public DoranSword() {
		super("������ ��", 450);
		atk = 8;
	}
	
	@Override
	public void use() {
		System.out.println(name + "�� �����Ͽ� ���ݷ��� " + atk + "��ŭ ����߽��ϴ�");
	}
	
	@Override
	public void buy() {
		System.out.println(name + "�� �����ϼ̽��ϴ� ���� : " + price);
	}
	
	
}
