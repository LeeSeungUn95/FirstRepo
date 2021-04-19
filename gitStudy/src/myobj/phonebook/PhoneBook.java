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
			System.out.println("===== 이승운의 전화번호부 =====");
			System.out.println("1.그룹추가  2.사람추가  3.검색  0.종료");
			System.out.print("입력 >> ");
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
		System.out.print("추가할 그룹의 이름을 입력 > ");
		groupName = sc.next();
		
		if (phoneBook.containsKey(groupName)) {
			System.out.println("이미 있는 그룹이름입니다");
			return;
		} else {
			phoneBook.put(groupName, new HashMap<>());			
		}
		
	}
	
	public void add() {
		System.out.print("그룹 이름 입력 > ");
		groupName = sc.next();
		System.out.print("추가하실 이름 입력 > ");
		name = sc.next();
		System.out.print("추가하실 전화번호 입력 > ");
		phoneNumber = sc.next();			
		if (phoneBook.containsKey(groupName)) {
			phoneBook.get(groupName).put(name, new Phone(name, phoneNumber));
		} else {
			System.out.println("없는 그룹입니다 미분류에 저장됩니다.");
			uncategorized.put(name, phoneNumber);
		}
		System.out.println("-------------------");
		
	}
	

	public void search() {
		Phone phone = new Phone();
		System.out.println("1.그룹으로찾기  2.이름으로찾기  3.전화번호로찾기");
		System.out.print("입력 >> ");
		int select = sc.nextInt();
		switch(select) {
		case 1:
			System.out.println("그룹으로 찾기!");
			System.out.print("그룹 이름을 입력해주세요 > ");
			groupName = sc.next();
			
			if (phoneBook.containsKey(groupName)) {
				for (String key : phoneBook.keySet()) {
					Object value = phoneBook.get(key);	
			
					System.out.println(key + " / " + value);				
				}
			} else {
				System.out.println("없는 그룹입니다");
				return;
			}
			break;
		case 2:
		case 3:
		default :
			System.out.println("입력 오류");
			break;
		}		
	}
	
	public static void main(String[] args) {
		PhoneBook phb = new PhoneBook();
		
		phb.Start();
	}
}





















