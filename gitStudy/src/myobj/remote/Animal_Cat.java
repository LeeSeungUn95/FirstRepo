package myobj.remote;

import myinterface.Animal;

public class Animal_Cat implements Animal{

	@Override
	public void cry() {
		System.out.println("고양이는 야옹야옹!");
	}

	@Override
	public void run() {
		System.out.println("고양이는 최대 시속 48km까지 달립니다!");
	}

	@Override
	public void sleep() {
		System.out.println("고양이는 하루 평균 12 ~ 16시간 잠을 잡니다!");
	}

	@Override
	public void play() {
		System.out.println("고양이는 쥐잡기를 놀이라고 생각합니다!");
	}



}
