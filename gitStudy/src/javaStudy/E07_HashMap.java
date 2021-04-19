package javaStudy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class E07_HashMap {
	/*
	 	# Map
	 	
	 	 - Key�� Value�� �� ���� �̷�� �ڷᱸ��
	 	 - Key���� ���� Value�� ������ �� �ִ�
	 	 - Key�� �ߺ��� ������� �ʴ´�
	 */
	
	public static void main(String[] args) {
		HashMap<String, Integer> record = new HashMap<>();
		
		// put(Key, Value)
		//  - map�� ������ �߰�
		//  - ������ ����ִ� ���� ������ �� ���� ����, ������ null�� ����
		record.put("ȫ�浿", 50000);
		record.put("���浿", 35000);
		record.put("�ڱ浿", 90000);
		
		// �̹� �����ϴ� Ű���� put�ϸ� ���� ����
		Integer previous_value = record.put("ȫ�浿", 5000); // �̹� �����ϴ� Ű���� put�ϸ� ���� ����

		record.put("ȫ�浿", record.get("ȫ�浿") + 3000);
		
		System.out.println("������ ����ִ� �� : " + previous_value);
		System.out.println("���� ����ִ� �� : " + record.get("ȫ�浿"));
		
		System.out.println(record);
		
		// �������� ȫ�浿�� ����Ǿ� �ִ� ���� 3õ�� �������Ѻ�����
		
		System.out.println(record.get("ȫ�浿"));
		
		// get(key) : key�� �̿��� value�� ����
		System.out.println(record.get("�ڱ浿"));
		
		HashMap<String, Object> person = new HashMap<>();
		
		person.put("�̸�", "ȫ�浿");
		person.put("����", 35);
		person.put("�����ϴ� ��", new String[] {"���", "���ڱ�", "�Ա�"});
		person.put("�Ⱦ��ϴ� ��", new HashSet<>());
		
		HashSet<String> dislike = ((HashSet)person.get("�Ⱦ��ϴ� ��"));
		
		dislike.add("�߱�");
		dislike.add("Ư��");
		dislike.add("���");
		
		System.out.println(person.get("����"));
		System.out.println(((String[])person.get("�����ϴ� ��"))[0]);

		System.out.println(person.get("�Ⱦ��ϴ� ��"));
		
		/*
		 	# �ݺ������� Map�� Ȱ���ϱ�
		 	
		 	 - keySet() : key��θ� �̷���� Set�� ��ȯ�Ѵ�
		 	 - values() : value��θ� �̷���� Set�� ��ȯ�Ѵ�
		 	 - entrySet() : Entry<key, value>�� �̷���� Set�� ��ȯ�Ѵ�
		 */
		
		System.out.println("-------------------");
		for (String key : person.keySet()) {
			Object value = person.get(key);
			
			// A instanceof B : A�� B�� �ν��Ͻ������� �Ǻ��Ѵ�. ��ĳ���� ���¿����� �Ǻ��ȴ�
			if (value instanceof String[]) {
				String[] arr = (String[]) value;
				
				System.out.print("[");				
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i] + ", ");
				}
				System.out.println("]");			
			} else {
				System.out.println(key + " : " + value);				
			}			
		}
		
		System.out.println("---");
		// # values()
		System.out.println("values " + person.values());
	
		// #entrySet()
		for (Entry<String, Object> entry : person.entrySet()) {
			String key = entry.getKey();
			Object value = entry.getValue();
			
			System.out.println(key + "=" + value);
		}
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(3, "Hello");
		map.put(99, "Bye");
		map.put(35, "see you later!!");
		
		System.out.println("Ű�߿� 15�� �ֳ��� ?" + map.containsKey(15));
	}
}














