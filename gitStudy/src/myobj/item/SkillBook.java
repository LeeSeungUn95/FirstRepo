package myobj.item;

public class SkillBook extends Item {
	int damage;
	
	public SkillBook(String name, int price) {
		super(name, price);
		damage = 15;
	}


	public void use() {
		System.out.println(name + "��ų�� ����Ͽ� " + damage + "��ŭ�� �������� �������ϴ�");
	}
}
