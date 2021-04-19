package myobj.item;

public class ManaPotion extends Item {

	int mana;
	
	public ManaPotion(String name, int price) {
		super(name, price);
		mana = 10;
	}

	@Override
	public void use() {
		System.out.println(name + "�� �Ծ ������ " + mana + "��ŭ �ö����ϴ�");
	}
	
	public static void main(String[] args) {
		new ManaPotion("��������", 1500).use();
	}
}
