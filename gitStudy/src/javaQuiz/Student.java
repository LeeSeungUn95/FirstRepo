package javaQuiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Student {

	String name;
	
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	
	int maxStudent;
	
	Random ran;
	ArrayList<Student> student;
	
	
	public Student() {
		maxStudent = 0;
		student = new ArrayList<>();
		ran = new Random();
	}

	public static void main(String[] args) {
		Student stu = new Student();
		
		stu.printGradeCard();
		stu.printGetHighestSum();
	}
	
	public void printGradeCard() {
		for (int i = 0; i < 30; i++) {
			System.out.println("┌───────────────────────────────────────────────────────┐");
			System.out.printf("│이름\t\t국어\t영어\t수학\t총점\t평균\t│\n");
			Student st = new Student();
			if (i >= 10) {
				st.name = "학생0000" + i;				
			} else {
				st.name = "학생00000" + i;								
			}
			st.eng = ran.nextInt(101);
			st.kor = ran.nextInt(101);
			st.math = ran.nextInt(101);
			st.sum = st.eng + st.kor + st.math;
			st.avg = st.sum / (double)3;
			student.add(st);
			System.out.printf("│%s\t%d\t%d\t%d\t%d\t%.2f\t│\n",
					student.get(i).name, student.get(i).kor, student.get(i).eng, student.get(i).math, student.get(i).sum, student.get(i).avg);
			System.out.println("└───────────────────────────────────────────────────────┘");
			
		}
	}
	public void printGetHighestSum() {
		int maxIndex = student.get(0).sum;
		
		for (int i = 0; i < student.size(); i++) {
			if (student.get(i).sum > maxIndex) {
				maxIndex = student.get(i).sum;
				maxStudent = i;
			}
		}
		System.out.println("-------------------------- 1등 -------------------------- ");
		System.out.println("┌───────────────────────────────────────────────────────┐");
		System.out.printf("│이름\t\t국어\t영어\t수학\t총점\t평균\t│\n");
		System.out.printf("│%s\t%d\t%d\t%d\t%d\t%.2f\t│\n", 
				student.get(maxStudent).name, student.get(maxStudent).kor, student.get(maxStudent).eng, student.get(maxStudent).math,
				student.get(maxStudent).sum, student.get(maxStudent).avg);
		System.out.println("└───────────────────────────────────────────────────────┘");
		
	}
}















