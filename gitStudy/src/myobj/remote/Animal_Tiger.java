package myobj.remote;

import myinterface.Animal;

public class Animal_Tiger implements Animal{

	@Override
	public void cry() {
		System.out.println("호랑이는 어흥!");
	}

	@Override
	public void run() {
		System.out.println("호랑이는 시속 49 ~ 65키로까지 달립니다!");
	}

	@Override
	public void sleep() {
		System.out.println("호랑이는 하루 평균 16시간 잠을 잡니다!");
	}

	@Override
	public void play() {
		System.out.println("호랑이는 사냥을 놀이라고 생각합니다!");
	}



}
