package myobj.remote;

import myinterface.Animal;

public class Animal_Dog implements Animal {

	@Override
	public void cry() {
		System.out.println("강아지는 멍멍!");
	}

	@Override
	public void run() {
		System.out.println("가장 빠른강아지는 시속 72km까지 달립니다!");
	}

	@Override
	public void sleep() {
		System.out.println("강아지는 하루 평균 12 ~ 14시간 잠을 잡니다!");
	}

	@Override
	public void play() {
		System.out.println("강아지는 산책을 놀이라고 생각합니다!");
	}





}
