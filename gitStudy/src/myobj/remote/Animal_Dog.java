package myobj.remote;

import myinterface.Animal;

public class Animal_Dog implements Animal {

	@Override
	public void cry() {
		System.out.println("�������� �۸�!");
	}

	@Override
	public void run() {
		System.out.println("���� ������������ �ü� 72km���� �޸��ϴ�!");
	}

	@Override
	public void sleep() {
		System.out.println("�������� �Ϸ� ��� 12 ~ 14�ð� ���� ��ϴ�!");
	}

	@Override
	public void play() {
		System.out.println("�������� ��å�� ���̶�� �����մϴ�!");
	}





}
