package myobj.remote;

import myinterface.Animal;

public class Animal_Tiger implements Animal{

	@Override
	public void cry() {
		System.out.println("ȣ���̴� ����!");
	}

	@Override
	public void run() {
		System.out.println("ȣ���̴� �ü� 49 ~ 65Ű�α��� �޸��ϴ�!");
	}

	@Override
	public void sleep() {
		System.out.println("ȣ���̴� �Ϸ� ��� 16�ð� ���� ��ϴ�!");
	}

	@Override
	public void play() {
		System.out.println("ȣ���̴� ����� ���̶�� �����մϴ�!");
	}



}
