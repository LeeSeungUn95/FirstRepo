package myobj.remote;

import myinterface.Animal;

public class Animal_Cat implements Animal{

	@Override
	public void cry() {
		System.out.println("����̴� �߿˾߿�!");
	}

	@Override
	public void run() {
		System.out.println("����̴� �ִ� �ü� 48km���� �޸��ϴ�!");
	}

	@Override
	public void sleep() {
		System.out.println("����̴� �Ϸ� ��� 12 ~ 16�ð� ���� ��ϴ�!");
	}

	@Override
	public void play() {
		System.out.println("����̴� ����⸦ ���̶�� �����մϴ�!");
	}



}
