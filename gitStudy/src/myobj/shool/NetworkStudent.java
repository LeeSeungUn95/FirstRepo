package myobj.shool;

public class NetworkStudent extends Student {
	final static String[] subject_name = {"措橫", "氅橫", "葬揪蝶", "ccna"};
	
	int ccna;
	int linux;

	public NetworkStudent(int sno) {
		super(sno);
		ccna = getRandomScore();
		linux = getRandomScore();
		
	}
	
	@Override
	public void printGradeCard() {
		System.out.println("忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖");
		System.out.printf("弛з廓\t檜葷\t%s\t%s\t%s\t%s\t識薄\tゎ敕\t弛\n",
				subject_name[0], subject_name[1], subject_name[2], subject_name[3]);
		
		System.out.printf("弛%x\t%s,\t%d\t%d\t%d\t%d\t%d\t%.2f\t弛\n",
				sno, name, kor, eng, linux, ccna, kor+ eng + linux + ccna,
				 (kor+ eng + linux + ccna) / 4.0);
		
		System.out.println("戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎");
	}
}
