package teacher;

public class TeacherCheckValidPhoneNumber {
	
	private static boolean checkNumeric(char ch) {
		return ch >= '0' && ch <= '9';
	}
	
	public static boolean checkValidPhoneNumber (String phoneNumber) {
		int len = phoneNumber.length();
		
		if (len != 12 && len != 13) {
			System.out.println("길이가 올바르지 않음");
			return false;
		}

		for (int i = 0; i < len; i++) {

			char ch = phoneNumber.charAt(i);

			if (i < 3 && !checkNumeric(ch)) {
				System.out.println("[invalid] 맨앞 3자리에 숫자 아닌것이 있음");
				return false;
			} else if ((i == 3 || (i == 7 && len == 12) || (i == 8 && len == 13)) && ch != '-') {
				System.out.println("[invalid] 하이픈 자리가 올바르지 않음");
				return false;
			} else if (i > 3 && ((len == 12 && i < 7) || (len == 13 && i < 8)) && !checkNumeric(ch)) {
				System.out.println("[invalid] 가운데 자리에 숫자 아닌것이 있음");
				return false;
			} else if ((i > 7 && len == 12) || (i > 8 && len == 13) && !checkNumeric(ch)) {
				System.out.println("[invalid]마지막 자리에 숫자 아닌것이 있음");
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		if (checkValidPhoneNumber("123-1211-1112")) {
			System.out.println("올바른 번호 입니다");
		}
	}
}



















