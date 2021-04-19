package myinterface;

import myobj.remote.*;

public class TestAnimal {
	
	public static void main(String[] args) {
		test(new Animal_Cat());
		test(new Animal_Dog());
		test(new Animal_Tiger());
	}
	
	public static void test(Animal animal) {
		animal.cry();
		animal.run();
		animal.sleep();
		animal.play();
	}
}
