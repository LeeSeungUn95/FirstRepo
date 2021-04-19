package myobj.item;
/*
 	이 클래스를 상속받아 아이템을 3개 만들어보세요 (※ Item 클래스는 수정하지 말것)
 */


abstract public class Item {
	
	protected String name;
	protected int price;
	
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	// final을 붙인 메서드는 자식 클래스에서 오버라이드를 금지시킨다
	final public void info() {
		System.out.println("이름 : " + name);
		System.out.println("가격 : " + price + "원");

	}
	
	abstract public void use();
	
	public void buy() {
		System.out.printf("세부 사항은 자식 클래스에서 오버라이드로 구현");		
	}
}




















