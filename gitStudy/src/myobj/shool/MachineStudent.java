package myobj.shool;

public class MachineStudent extends Student{
	final static String[] subject_name = {"����", "����", "����", "�����", "PL"};
	
	int math;
	int statistics;
	int pl;
	
	public MachineStudent(int sno) {
		super(sno);
		statistics = getRandomScore();
		pl = getRandomScore();
		math = getRandomScore();
	}
	
	@Override
	public void printGradeCard() {
		System.out.println("��������������������������������������������������������������������������������������������������������������������������������������������������");
		System.out.printf("���й�\t�̸�\t%s\t%s\t%s\t%s\t%s\t����\t���\t��\n",
				subject_name[0], subject_name[1], subject_name[2], subject_name[3], subject_name[4]);
		
		System.out.printf("��%x\t%s,\t%d\t%d\t%d\t%d\t%d\t%d\t%.2f\t��\n",
				sno, name, kor, eng, math, statistics, pl, kor+ eng + math + statistics + pl,
				 (kor+ eng + statistics + pl + math) / 5.0);
		
		System.out.println("��������������������������������������������������������������������������������������������������������������������������������������������������");
	}		
}
