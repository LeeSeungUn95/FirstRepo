package myobj.phonebook;
import java.util.*;

public class PhoneBook {
	final int GROUPADD = 1;
	final int ADD = 2;
	final int SEARCH = 3;
	final int EXIT = 0;
	
	Scanner sc;
	HashMap<String, HashMap<String, Phone>> phoneBook;
	HashMap<String, String> uncategorized = new HashMap<>();

	String groupName, name, phoneNumber;
	
	public PhoneBook() {
		sc = new Scanner(System.in);
		phoneBook = new HashMap<>();
	}
	
	public void Start() {
		while(true) {
			System.out.println("===== �̽¿��� ��ȭ��ȣ�� =====");
			System.out.println("1.�׷��߰�  2.����߰�  3.�˻�  0.����");
			System.out.print("�Է� >> ");
			int select = sc.nextInt();
			
			switch(select) {
			case GROUPADD:
				groupAdd();
				break;
			case ADD:
				add();
				break;
			case SEARCH:
				search();
				break;
			case EXIT:
				System.out.println("- Program End -");
				return;
			}
		}
	}
	
	public void groupAdd() {
		System.out.print("�߰��� �׷��� �̸��� �Է� > ");
		groupName = sc.next();
		
		if (phoneBook.containsKey(groupName)) {
			System.out.println("�̹� �ִ� �׷��̸��Դϴ�");
			return;
		} else {
			phoneBook.put(groupName, new HashMap<>());			
		}
		
	}
	
	public void add() {
		System.out.print("�׷� �̸� �Է� > ");
		groupName = sc.next();
		System.out.print("�߰��Ͻ� �̸� �Է� > ");
		name = sc.next();
		System.out.print("�߰��Ͻ� ��ȭ��ȣ �Է� > ");
		phoneNumber = sc.next();			
		if (phoneBook.containsKey(groupName)) {
			phoneBook.get(groupName).put(name, new Phone(name, phoneNumber));
		} else {
			System.out.println("���� �׷��Դϴ� �̺з��� ����˴ϴ�.");
			uncategorized.put(name, phoneNumber);
		}
		System.out.println("-------------------");
		
	}
	

	public void search() {
		Phone phone = new Phone();
		System.out.println("1.�׷�����ã��  2.�̸�����ã��  3.��ȭ��ȣ��ã��");
		System.out.print("�Է� >> ");
		int select = sc.nextInt();
		switch(select) {
		case 1:
			System.out.println("�׷����� ã��!");
			System.out.print("�׷� �̸��� �Է����ּ��� > ");
			groupName = sc.next();
			
			if (phoneBook.containsKey(groupName)) {
				for (String key : phoneBook.keySet()) {
					Object value = phoneBook.get(key);	
			
					System.out.println(key + " / " + value);				
				}
			} else {
				System.out.println("���� �׷��Դϴ�");
				return;
			}
			break;
		case 2:
		case 3:
		default :
			System.out.println("�Է� ����");
			break;
		}		
	}
	
	public static void main(String[] args) {
		PhoneBook phb = new PhoneBook();
		
		phb.Start();
	}
}





















