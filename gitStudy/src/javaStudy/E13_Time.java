package javaStudy;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class E13_Time {
	/*
	 	# java.time ��Ű��
	 	
	 	  - Calendar�� �ν��Ͻ��� set()�� ���� ��ȭ ��Ų�ٴ� ������ ������ Ŭ����
	 	  - java.time ��ĳ���� Ŭ�������� �ð��� ����� �� ���ο� �ν��Ͻ��� ��ȯ�ϰ�
	 	 	���� �ν��Ͻ��� �״�� �����Ѵ� 
	 	 	
	 	# LocalDate, LocalTime, LocalDateTime�� �ִ�
	 */
	public static void main(String[] args) {
		// 1.now() : ���� �ð��� �ν��Ͻ��� �����ϴ� �޼���
		
		// LocalDate : ��¥�� �����ϱ� ���� Ŭ����
		LocalDate today = LocalDate.now();
		System.out.println("LocalDate : " + today);
		
		// LocalTime : �ð��� �����ϱ� ���� Ŭ����
		LocalTime now = LocalTime.now();
		System.out.println("LocalTime : " + now);
		
		// LocalDateTime : ��¥�� �ð��� ��� �����ϱ� ���� Ŭ����
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println("LocalDateTime : " + datetime);
		
		
		// 2.of() : ���ϴ� �ð��� �ν��Ͻ��� �����ϴ� �޼���
		LocalDate childrensDay = LocalDate.of(2021, 5, 5);
		System.out.println(childrensDay);
		
		LocalTime promise = LocalTime.of(17, 8);
		System.out.println(promise);
		
		LocalDateTime my_promise = LocalDateTime.of(childrensDay, promise);
		System.out.println(my_promise);
		
		// 3.�ð� �����ϱ�
		//  - Calendar�� ������ �Ѽ��ϴ� ������ ���迴�� ������ ���⼭ ���̰� ����
		//  - jave.time ��Ű���� Ŭ�������� �ð��� ����� ���ο� �ν��Ͻ��� ��ȯ�Ѵ�
		
		System.out.println(promise.plusHours(3)); // ��ӽð����� 3�ð� ���� �ν��Ͻ��� ��ȯ
		System.out.println(promise);
		
		System.out.println(childrensDay.getMonth());
		System.out.println(childrensDay.getMonthValue());
		System.out.println(childrensDay.minusWeeks(1));
		System.out.println(childrensDay.plusWeeks(3));
		
		// 4.�ð��� ���ڿ��� ��ȯ�ϱ�
		//  - DateTimeFormatter Ŭ������ ����Ѵ�
		//  - �پ��� static �޼���� ǥ�ص��� �̿��� ���ڿ� ������ ������ �� �ִ�
		
		// .ofPattern(str) : ���� ���� �����
		System.out.println(childrensDay.format(DateTimeFormatter.ofPattern("y��  M�� d��")));
	
		// .�پ��� ǥ�� �̸��� : ǥ�� ����ϱ�
		System.out.println(my_promise.format(DateTimeFormatter.ISO_DATE_TIME));
		System.out.println(my_promise.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println(my_promise.format(DateTimeFormatter.ISO_WEEK_DATE));
		
		// 5.�ð� ��ü���� ���ϱ�
		LocalDate christmas = LocalDate.of(2020, 12, 25);
		
		System.out.println("2021�� ��̳��� 2020�� ũ������������ ���ΰ��� ? " + childrensDay.isAfter(christmas));

		System.out.println("2021�� ��̳��� 2021�� ũ������������ ���ΰ��� ? " + childrensDay.isBefore(christmas.plusYears(1)));
	}
}





















