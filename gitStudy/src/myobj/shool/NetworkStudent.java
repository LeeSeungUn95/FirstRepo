package myobj.shool;

public class NetworkStudent extends Student {
	final static String[] subject_name = {"����", "����", "������", "ccna"};
	
	int ccna;
	int linux;

	public NetworkStudent(int sno) {
		super(sno);
		ccna = getRandomScore();
		linux = getRandomScore();
		
	}
	
	@Override
	public void printGradeCard() {
		System.out.println("����������������������������������������������������������������������������������������������������������������������������������");
		System.out.printf("���й�\t�̸�\t%s\t%s\t%s\t%s\t����\t���\t��\n",
				subject_name[0], subject_name[1], subject_name[2], subject_name[3]);
		
		System.out.printf("��%x\t%s,\t%d\t%d\t%d\t%d\t%d\t%.2f\t��\n",
				sno, name, kor, eng, linux, ccna, kor+ eng + linux + ccna,
				 (kor+ eng + linux + ccna) / 4.0);
		
		System.out.println("����������������������������������������������������������������������������������������������������������������������������������");
	}
}