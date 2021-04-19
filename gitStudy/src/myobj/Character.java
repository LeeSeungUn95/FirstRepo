package myobj;

import java.util.Random;
import java.util.Scanner;

public class Character{
	Random ran = new Random();
	Scanner sc = new Scanner(System.in);
	
	public int level;
	public int health;
	public int mana;
	public int power;
	public int intellect;
	public int agility;
	public int luck;
	public int atkMinus;
	public int defMinus;
	
	public Character() {
		System.out.println("ĳ���Ͱ� ���� �Ǿ����ϴ�.");
		System.out.println("----- �⺻ ���� -----");
		level = 1;
		health = 100;
		mana = 50;
		power = ran.nextInt(6) + 4;
		intellect = ran.nextInt(6) + 4;
		agility = ran.nextInt(6) + 4;
		luck = ran.nextInt(6) + 4;
		System.out.println("ü�� : " + health);
		System.out.println("���� : " + mana);
		System.out.println("��    : " + power);
		System.out.println("���� : " + intellect);
		System.out.println("��ø : " + agility);
		System.out.println("��� : " + luck);
	}
	
	public Character(int power, int intellect, int agility, int luck) {
		this.power = power;
		this.intellect = intellect;
		this.agility = agility;
		this.luck = luck;
		System.out.println("�Է��ϽŴ�� ������ ���� �Ǿ����ϴ�.");
		System.out.println("��    : " + power);
		System.out.println("���� : " + intellect);
		System.out.println("��ø : " + agility);
		System.out.println("��� : " + luck);
		
	}
	
	
	public void attack() {
		health -= atkMinus;
	}
	public void defense() {
		health -= defMinus;
	}
	
	public void levelup() {
		level += 1;
		power += ran.nextInt(3) + 1;
		agility += ran.nextInt(2) + 1;
	}
}
