package javaStudy;

public class D11_AnonymousInnerClass {
	/*
	 	# �͸� ���� Ŭ����
	 	
	 	 - Ŭ������ �̸��� ���� �ʰ� ������ ���� �ٷ� ����ϴ� ���
	 	 - ��ȸ���̴�
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
		kick(new Ball("�޽�"));
		kick(new Ball("�⼺��"));
		
		
		// ���� ���� Ŭ����
		class Door extends Kickable {
			
			boolean open;
			
			@Override
			void kick() {
				if (open) {
					System.out.println("��¦�� �߷� �Ⱦ��� �ݾҽ��ϴ�.");
					open = false;
				}else {
					System.out.println("��¦�� �߷� �Ⱦ��� �������ϴ�.");
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
		
		// �͸� Ŭ����(�Ｎ���� Door�� ���׷��̵��� �ν��Ͻ��� ����)
		// - ����� ���� �������� �ʱ� ������ �ٽô� ����� �� ����(��ȸ��)
		kick(new Door() {
			@Override
			void kick() {
				System.out.println("ưư�� �ݰ� ���� ���ſ��� ��½�� ���� �ʾҽ��ϴ�.");
			}
		});
		
		kick(new Ball() {
			@Override
			void kick() {
				System.out.println("�󱸰��� �߷�á���� �ָ� �������� �ʰ� �����⸸ �մϴ�");
			}
		});
		
		// punch�޼����� ���ڰ����� ������ �� �ִ�
		// �͸� Ŭ������ 2��, ���� ���� Ŭ������ 2��
		
		//���� ����Ŭ����
		
		class Wall extends Punchable {
			
			boolean strong;
			
			@Override
			void punch() {
				if (strong) {
					System.out.println("���� ���ؼ� ���� �η������ϴ�");		
					strong = false;
				} else {
					System.out.println("���� ���ؼ� ���� �ν������ϴ�");
					strong = true;
				}
			}	
		}
		
		Wall wall = new Wall();
		
		punch(wall);
		punch(wall);
		
		punch(new Wall(){
			
			void punch() {
				System.out.println("�������ȴµ� ����� �ͼ� ������߽��ϴ�.");
			}
		});
		class Police extends Punchable {
			boolean police;
			
			void punch() {
				if (police) {
					System.out.println("����� ���ȴµ� �����̶� �������� �����ϴ�");
					police = false;
				} else {
					System.out.println("����� ���ȴµ� ������ �ƴ϶� ������ �¾ҽ��ϴ�");
					police = true;
				}
			}
		}
		
		Police police = new Police();
		
		punch(police);
		punch(police);
		
		punch(new Police() {
			void punch() {
				System.out.println("����� ���ȴµ� ������ �����Խ��ϴ�");
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
		if (kicker.equals("�޽�")) {
			System.out.println("���� ���ְ� á���ϴ�");
		} else if (kicker.equals("�⼺��")) {
			System.out.println("�н��� ��Ȯ�ϰ� á���ϴ�");
		}
	}
}

class Human extends Kickable {
	
	@Override
	void kick() {
		System.out.println("����� �߷� �Ⱦ�á���ϴ�");
	}
}

class VendingMachine extends Kickable {
	
	@Override
	void kick() {
		System.out.println("���Ǳ⸦ �Ⱦ�á���� ������� �ϳ� ���Խ��ϴ�");
	}
}


















