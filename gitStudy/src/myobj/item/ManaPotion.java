package myobj.item;

public class ManaPotion extends Item {

	int mana;
	
	public ManaPotion(String name, int price) {
		super(name, price);
		mana = 10;
	}

	@Override
	public void use() {
		System.out.println(name + "을 먹어서 마나가 " + mana + "만큼 올랐습니다");
	}
	
	public static void main(String[] args) {
		new ManaPotion("마나물약", 1500).use();
	}
}
