package myinterface;

import myobj.remote.AirconditionRemocon;

// 인터페이스를 통해 결합도가 낮은 코드를 작성할 수 있다
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
