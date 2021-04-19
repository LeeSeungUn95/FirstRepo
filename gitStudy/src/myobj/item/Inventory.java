package myobj.item;

import java.util.Arrays;

import myobj.item.sword.DoranSword;

public class Inventory {
	
	Item[] inventory;
	int size;
	
	public Inventory(int size) {
		inventory = new Item[size];
	}
	
	public boolean put(Item item) {
		for (int i = 0; i < inventory.length; i++) {
			if (inventory[i] == null) {
				inventory[i] = item;
				return true;
			}
		}
		System.out.println("������ �� á���ϴ�");
		return false;
	}
	
	public void useAllItems() {
		for (Item item : inventory) {
			item.use();
		}
	}
	public static void main(String[] args) {
		Inventory inven1 = new Inventory(3);
		
		// Item�� �־�� �ϴ� �ڸ��� Item�� ��ӹ��� ��� �͵��� �� �� �ִ�
		inven1.put(new SkillBook("�����ϼ�", 3000));
		inven1.put(new DoranSword());
		inven1.put(new ManaPotion("���� ����", 1500));
		
		inven1.useAllItems();
		
	}
}





















