package javaQuiz;

import java.util.ArrayList;
import java.util.Random;

import myobj.shool.Student2;

public class E01_StudentList {
	/*
	 	�л� Ŭ������ ��ҷ� ���� ArrayList�� �����ϰ� �л��� 30�� �߰��غ�����
	 	
	 	 1. �� �л��� ������ �������� �����˴ϴ�
	 	 
	 	 2. ������ ��/��/�� �ۿ� �����ϴ�
	 	 
	 	 3. 30���� ����� ������ּ���
	 	 
	 	 4. 30���� ���� ������ ���� �л��� �̸��� ������ ������ּ���
	 	 
	 	 5. �̸��� ������ ���� �����˴ϴ�
	 	 
	 	 	�л�000000
	 	 	�л�000001
	 	 	�л�000002
	 	 	�л�000003
	 	 	...
	 */

	public static void main(String[] args) {
		ArrayList<Student2> students = new ArrayList<>();
		
		for (int i = 0; i < 30; i++) {
			Student2 stu = new Student2();
			students.add(stu);
			System.out.println(stu.getTranscript());
		}
		System.out.println("- - - - �ְ� ���� �л� - - - -");
		for (Student2 student : students) {
			if (student.getTotal() == Student2.BEST_TOTAL) {
				System.out.println(student.getTranscript());
			}
		}
	}
}

















