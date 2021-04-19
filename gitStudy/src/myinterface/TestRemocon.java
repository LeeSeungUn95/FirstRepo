package myinterface;

import myobj.remote.AirconditionRemocon;

// �������̽��� ���� ���յ��� ���� �ڵ带 �ۼ��� �� �ִ�
public class TestRemocon {
	
	public static void main(String[] args) {
	
		test(new AirconditionRemocon());
	}
	
	public static void test(Remocon remocon) {
		remocon.up(1);
		remocon.power();
		remocon.down(1);
		remocon.change();
	}
}
