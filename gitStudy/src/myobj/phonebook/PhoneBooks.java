package myobj.phonebook;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeSet;

public class PhoneBooks {
	
	public static class PhoneInfo {
		String name;
		String phone_number;
		String addrss;
		String profile_image_path;
	}
	
	HashMap<String, HashMap<String, String>> phonebook;
	
	public PhoneBooks() {
		phonebook = new HashMap<>();
		
		phonebook.put("����", new HashMap<>());
		phonebook.put("�̺з�", new HashMap<>());
		
		phonebook.get("����").put("010-1234-1234", "����");
	}
	
	public boolean addGroup(String groupName) {
		if (phonebook.containsKey(groupName)) {
			System.out.println("�̹� �����ϴ� �׷��Դϴ�. : " + groupName);
			return false;
		} else {
			System.out.println("���������� �߰��Ǿ����ϴ�. : " + groupName);
			phonebook.put(groupName, new HashMap<>());
			return true;
		}
	}
	
	public void printGroupList() {
		for (String groupName : phonebook.keySet()) {
			System.out.printf("#### %s ####\n", groupName);
		}
	}
	
	public boolean addNumber(String groupName, String phoneNumber, String name) {
		
		// phonebook : ���� �׷��� ������ �� �ִ� ��ü ��ȭ��ȣ�� �ν��Ͻ�
		// phonebook.keySet() : �׷���
		// phonebook.values() : �׷� �̸��� Ű������ ��� ������ �� �ִ� �׷� �ؽ��� �ν��Ͻ�
		
		for(HashMap<String, String> group : phonebook.values()){
			if (group.containsKey(phoneNumber)) {
				System.out.println("�̹� ��ϵ� ��ȣ�Դϴ�");
				return false;
			}
		}
		
		if (phonebook.containsKey(groupName)) {
			phonebook.get(groupName).put(phoneNumber, name);
		} else {
			phonebook.get("�̺з�").put(phoneNumber, name);
		}
	
		
		return true;
	}
	
	public void printPhoneBook() {
		
		for (String groupName : new TreeSet<>(phonebook.keySet())) {
			System.out.printf("-------%s-------\n", groupName);
			
			HashMap<String, String> group = phonebook.get(groupName);
			
			/*
			 	# TreeSet�� �� ���� ������
			 	
			 	1. ���� ������ ���ϸ鼭 �ν��Ͻ��� ����
			 	2. �÷����� ���� (���� ������ �ش� �÷��� ���׸��� Comparable�� ���)
			 */
			
			TreeSet<Entry<String, String>> sortedEntrySet = new TreeSet<>(new Comparator<Entry<String, String>>() {
				@Override
				public int compare(Entry<String, String> o1, Entry<String, String> o2) {
					int value_diff = o1.getValue().compareTo(o2.getValue());
					
					if (value_diff == 0) {
						return o1.getKey().compareTo(o2.getKey());
					} else {
						return value_diff;
					}
				}
			});	
			sortedEntrySet.addAll(group.entrySet());
			
			for (Entry<String, String> entry : sortedEntrySet) {
				System.out.printf("%s : %s\n", entry.getValue(), entry.getKey());
				
			}
		}
	}
	
	public void searchByName(String keyword) {
		int count = 0;
		
		System.out.println("- - �̸� �˻� ��� - -");
		for (HashMap<String, String> group : phonebook.values()) {
			
			for (Entry<String, String> entry : group.entrySet()) {
				
				for (String phoneNumber : group.keySet()){
					String name = group.get(phoneNumber);
					if (name.contains(keyword)) {
						System.out.printf("%s : %s\n", name, phoneNumber);
						count++;
					}
				}
//				if (entry.getValue().contains(ketword)) {
//					System.out.printf("%s : %s\n", entry.getValue(), entry.getKey());
//					count++;
//				}
			}
		}
		System.out.printf("�˻� ��� %d��\n", count);
	}
	
	public void serchByPhoneNumber(String number_fragment) {
		System.out.println("- - ��ȣ �˻� ��� - -");
		int count = 0;
		for (HashMap<String, String> group : phonebook.values()) {
			for (String phoneNumber : group.keySet()){
				if (phoneNumber.contains(number_fragment)) {
					System.out.printf("%s : %s\n", group.get(phoneNumber), phoneNumber);
					count++;
				}
			}
		}
		System.out.printf("�˻� ��� %d��\n", count);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhoneBooks book = new PhoneBooks();
		
//		while (true) {
//			System.out.print("�׷� �̸��� �Է� >>");
//			book.addGroup(sc.nextLine());
//
//			book.printGroupList();
//		}
		
		book.addGroup("����");
		book.addGroup("��ȣȸ");
		
		book.addNumber(null, "123-1234-1234", "�赿��");
		book.addNumber("����", "010-1234-1234", "�߼���");
		
		book.printGroupList();
		book.printPhoneBook();
		
		book.searchByName("��");
		book.serchByPhoneNumber("4");
	}
}



















