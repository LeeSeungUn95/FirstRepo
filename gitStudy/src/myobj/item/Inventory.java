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
		System.out.println("가방이 꽉 찼습니다");
		return false;
	}
	
	public void useAllItems() {
		for (Item item : inventory) {
			item.use();
		}
	}
	public static void main(String[] args) {
		Inventory inven1 = new Inventory(3);
		
		// Item을 넣어야 하는 자리에 Item을 상속받은 모든 것들이 들어갈 수 있다
		inven1.put(new SkillBook("벽력일섬", 3000));
		inven1.put(new DoranSword());
		inven1.put(new ManaPotion("마나 포션", 1500));
		
		inven1.useAllItems();
		
	}
}





















