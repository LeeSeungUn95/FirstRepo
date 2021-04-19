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
		System.out.println("캐릭터가 생성 되었습니다.");
		System.out.println("----- 기본 스텟 -----");
		level = 1;
		health = 100;
		mana = 50;
		power = ran.nextInt(6) + 4;
		intellect = ran.nextInt(6) + 4;
		agility = ran.nextInt(6) + 4;
		luck = ran.nextInt(6) + 4;
		System.out.println("체력 : " + health);
		System.out.println("마나 : " + mana);
		System.out.println("힘    : " + power);
		System.out.println("지능 : " + intellect);
		System.out.println("민첩 : " + agility);
		System.out.println("행운 : " + luck);
	}
	
	public Character(int power, int intellect, int agility, int luck) {
		this.power = power;
		this.intellect = intellect;
		this.agility = agility;
		this.luck = luck;
		System.out.println("입력하신대로 스텟이 변경 되었습니다.");
		System.out.println("힘    : " + power);
		System.out.println("지능 : " + intellect);
		System.out.println("민첩 : " + agility);
		System.out.println("행운 : " + luck);
		
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
