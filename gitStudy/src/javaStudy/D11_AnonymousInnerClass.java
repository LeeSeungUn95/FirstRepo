package javaStudy;

public class D11_AnonymousInnerClass {
	/*
	 	# 익명 내부 클래스
	 	
	 	 - 클래스에 이름을 짓지 않고 구현한 다음 바로 사용하는 방식
	 	 - 일회용이다
	 */
	public static void kick(Kickable something) {
		something.kick();
	}
	public static void punch(Punchable something) {
		something.punch();
	}
	
	
	public static void main(String[] args) {
		kick(new Human());
		kick(new VendingMachine());
		kick(new Ball("메시"));
		kick(new Ball("기성용"));
		
		
		// 지역 내부 클래스
		class Door extends Kickable {
			
			boolean open;
			
			@Override
			void kick() {
				if (open) {
					System.out.println("문짝을 발로 걷어차 닫았습니다.");
					open = false;
				}else {
					System.out.println("문짝을 발로 걷어차 열었습니다.");
					open = true;
				}
			}
		}
		
		Door door1 = new Door(), door2 = new Door(), door3 = new Door();
		
		kick(door1);
		kick(door1);
		kick(door2);
		kick(door2);
		kick(door3);
		kick(door3);
		
		// 익명 클래스(즉석에서 Door를 업그레이드한 인스턴스를 생성)
		// - 만들고 따로 저장하지 않기 때문에 다시는 사용할 수 없다(일회용)
		kick(new Door() {
			@Override
			void kick() {
				System.out.println("튼튼한 금고 문이 무거워서 꿈쩍도 하지 않았습니다.");
			}
		});
		
		kick(new Ball() {
			@Override
			void kick() {
				System.out.println("농구공을 발로찼더니 멀리 나가지는 않고 아프기만 합니다");
			}
		});
		
		// punch메서드의 인자값으로 전달할 수 있는
		// 익명 클래스로 2개, 지역 내부 클래스로 2개
		
		//지역 내부클래스
		
		class Wall extends Punchable {
			
			boolean strong;
			
			@Override
			void punch() {
				if (strong) {
					System.out.println("벽이 강해서 뼈가 부러졌습니다");		
					strong = false;
				} else {
					System.out.println("벽이 약해서 벽이 부숴졌습니다");
					strong = true;
				}
			}	
		}
		
		Wall wall = new Wall();
		
		punch(wall);
		punch(wall);
		
		punch(new Wall(){
			
			void punch() {
				System.out.println("벽을때렸는데 사람이 와서 뭐라고했습니다.");
			}
		});
		class Police extends Punchable {
			boolean police;
			
			void punch() {
				if (police) {
					System.out.println("사람을 때렸는데 경찰이라 경찰서를 갔습니다");
					police = false;
				} else {
					System.out.println("사람을 때렸는데 경찰이 아니라서 뒤지게 맞았습니다");
					police = true;
				}
			}
		}
		
		Police police = new Police();
		
		punch(police);
		punch(police);
		
		punch(new Police() {
			void punch() {
				System.out.println("사람을 때렸는데 경찰이 몰려왔습니다");
			}
		});
	}
	

}

abstract class Punchable {
	
	abstract void punch();
}


abstract class Kickable {
	
	abstract void kick();
}

class Ball extends Kickable{
	
	String kicker;
	
	public Ball() {}
	
	public Ball(String kicker) {
		this.kicker = kicker;
	}
	@Override
	void kick() {
		if (kicker.equals("메시")) {
			System.out.println("슛을 멋있게 찼습니다");
		} else if (kicker.equals("기성용")) {
			System.out.println("패스를 정확하게 찼습니다");
		}
	}
}

class Human extends Kickable {
	
	@Override
	void kick() {
		System.out.println("사람을 발로 걷어찼습니다");
	}
}

class VendingMachine extends Kickable {
	
	@Override
	void kick() {
		System.out.println("자판기를 걷어찼더니 음료수가 하나 나왔습니다");
	}
}


















