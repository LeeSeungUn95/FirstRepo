package myobj.game;

import java.util.Random;

public class Barrel {
	Random ran;
	boolean[] forked;
	int size;
	int fireBtn;
	
	boolean game_over;
	
	public Barrel(int size) {
		this.ran = new Random();
		this.size = size;
		this.forked = new boolean[size];
		this.fireBtn = (int)(Math.random() * size);
		this.game_over = false;
	}
	
	public int randomNumber() {
		return ran.nextInt(forked.length);
	}
	
	public boolean checkGameOver() {
		return game_over;
	}
	
	public boolean fork(int slot) {
		if (forked[slot]) {
			System.out.println("이미 찔렀던 곳입니다. 다른곳을 골라주세요");
			return false;
		}
		
		if (slot == fireBtn) {
			game_over = true;
		}
		
		forked[slot] = true;
		return true;
	}
}



















