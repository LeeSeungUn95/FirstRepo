package myobj.item;

public class SkillBook extends Item {
	int damage;
	
	public SkillBook(String name, int price) {
		super(name, price);
		damage = 15;
	}


	public void use() {
		System.out.println(name + "스킬을 사용하여 " + damage + "만큼의 데미지를 입혔습니다");
	}
}
