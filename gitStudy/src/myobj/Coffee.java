package myobj;

import java.io.ObjectInputStream.GetField;

public class Coffee {
	
	private static class CoffeeCode {
		int coffeeCode;
		String coffeeName;
		
		
		private CoffeeCode(int code, String name) {
			this.coffeeCode = code;
			this.coffeeName = name;
		}
		
		public int getCode() {
			return coffeeCode;
		}
		
		public String getName() {
			return coffeeName;
		}
		
	}
	
	private static class OriginCode {
		int originCode;
		String originName;
		
		private OriginCode(int code, String name) {
			this.originCode = code;
			this.originName = name;
		}
	}
	
	public final static OriginCode COLUMBIA = new OriginCode(0, "�ݷҺ��");
	public final static OriginCode BRAZIL = new OriginCode(1, "�����");
	public final static OriginCode ETHIOPIA = new OriginCode(2, "��Ƽ���Ǿ�");
	public final static OriginCode KENYA = new OriginCode(3, "�ɳ�");
	public final static OriginCode INDO = new OriginCode(4, "�ε�");
	
	public final static CoffeeCode AMERICANO = new CoffeeCode(0, "�Ƹ޸�ī��");
	public final static CoffeeCode CAFFE_LATTE = new CoffeeCode(1, "ī���");
	public final static CoffeeCode CPFFE_MOCHA = new CoffeeCode(2, "ī���ī");
	
	public Coffee() {
		// TODO Auto-generated constructor stub
	}
	
	
	CoffeeCode coffee;
	OriginCode origin;
	int price;
	int caffeine;
	
	boolean hot;
	
	public Coffee(CoffeeCode coffee, int price, int Caffeine, OriginCode origin) {
		this.coffee = coffee;
		this.price = price;
		this.caffeine = caffeine;
		this.origin = origin;
		this.hot = true;
	}
	
	public String getCoffee() {
		return coffee.coffeeName;
	}
	
	public int getCoffeeCode() {
		return coffee.coffeeCode;
	}
	
	public String getOriginName() {
		return origin.originName;
	}

	
//	public static void main(String[] args) {
//		Coffee coffee = new Coffee(Coffee.AMERICANO, 1500, 10, Coffee.COLUMBIA);
//		Coffee coffee1 = new Coffee(Coffee.CAFFE_LATTE, 1800, 20, Coffee.BRAZIL);
//		Coffee coffee2 = new Coffee(Coffee.CPFFE_MOCHA, 2100, 18, Coffee.ETHIOPIA);
//		Coffee coffee3 = new Coffee(Coffee.AMERICANO, 1500, 10, Coffee.KENYA);
//		
//		
//		System.out.println(coffee.getCoffeeName());
//		System.out.println(coffee.getOriginName());
//	}
}

























