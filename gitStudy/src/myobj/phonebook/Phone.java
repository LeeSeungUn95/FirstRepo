package myobj.phonebook;

import java.util.HashMap;
import java.util.Scanner;

public class Phone {
	/*
	  	HashMap�� �̿��� ��ȭ��ȣ�θ� �����غ�����
	  	
	  	1. �׷� / ��ȭ��ȣ / �̸��� �����ؾ� �Ѵ�
	  	
	  	2. �׷� �̸��� Ű������ ������ �ش� �׷��� ��ȭ��ȣ ����� ���´�
	  	
	  	3. ��ȭ��ȣ ��Ͽ� ��ȭ��ȣ�� Ű������ ������ �̸��� ���´�
	 
	 	# �����ؾ� �� �޼���
	 	
	 	1. ���ο� �׷��� �߰��ϴ� �޼���
	 	2. �����ϴ� �׷쿡 ���ο� ��ȭ��ȣ�� ����ϴ� �޼��� (�׷��� ���ٸ� �̺з� �׷쿡 ����)
	 	3. ��ϵ� ��� ��ȭ��ȣ�� ������ �̸����� ������������ �����ִ� �޼���
	 	4. �̸��� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ������ ��µǴ� �˻� �޼���
	 	5. ��ȭ��ȣ�� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ��ȭ��ȣ�� ��µǴ� �˻� �޼���
	 */
	String name;
	String phoneNumber;
	
	public Phone() {
	
	}
	
	public Phone(String phoneNumber, String name) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return phoneNumber + " / " + name;
	}
}















