package myobj.item;

public class Sheild extends Item{
	
	int def;
	
	public Sheild(String name, int age) {
		super(name, age);
		def = 3;
	}
	
	public void use() {
		System.out.println(name + "을 착용하여 방어력이 " + def + "만큼 증가했습니다");
	}
}
