package myobj;

public class JaceTower {
	
	public static int floorHeight = 240; 
	
	public int toilet;
	public int room;
	public int floor;
	
	public static void changeHeight(int height) {
		JaceTower.floorHeight = height;
	}
	
	public JaceTower() {
		System.out.println("���ο� ���̽�Ÿ���� �Ǽ��߽��ϴ�");
		toilet = 1;
		room = 1;
		floor = 1;
	}
	
	public JaceTower(int toilet, int room, int floor) {
		this.toilet = toilet;
		this.room = room;
		this.floor = floor;
	}
	
	public void addRoom() {
		room += 1;
	}
	
	public void addToilet() {
		toilet += 1;
	}
	
	public void addFloor() {
		floor += 1;
	}
}










