package myobj.item;

public class Sheild extends Item{
	
	int def;
	
	public Sheild(String name, int age) {
		super(name, age);
		def = 3;
	}
	
	public void use() {
		System.out.println(name + "�� �����Ͽ� ������ " + def + "��ŭ �����߽��ϴ�");
	}
}
