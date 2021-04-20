package javaStudy;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class F01_JavaIO {
	/*
	 	# JAVA IO (Input/Output)
	 	
	 	��- �ڹٴ� ��Ʈ�� �̶�� ������ �̿��� ������� �ٷ��
	 	��- ���α׷����� ������ ��� �����͵��� �Է��̶�� �θ���(Input)
	 	��- ���α׷��� �����ؼ� �������� ��� �����͵��� ����̶�� �θ���(Output)
	 	
	 	# Stream
	 	
	 	��- �����͵��� ������ ���
	 	��- �Է� ���� �� �����͵��� ���α׷����� ������ ��θ� InputStream�̶�� �θ���
	 	��- ��� �� �� �����͵��� ������ ��θ� OutputStream�̶�� �θ���
	 	��- �����Ͱ� Stream���� �̵��ϱ� ���ؼ��� �ش� �����͸� byte Ÿ������ ��ȯ�Ǿ�� �Ѵ�
	 */
	public static void main(String[] args) {
		FileOutputStream fout = null;
		try {
			// �ؼҽ����� ���� ��ġ(./)�� ������Ʈ�� root�̴�
		//	fout = new FileOutputStream("./a.txt", true) ������
			fout = new FileOutputStream("D:\\files\\a.txt", true);
			for (int i = 0; i < 10; i++) {
				fout.write(String.format("������ ������ �� ���׿�..%d\n", i).getBytes());				
			}
			
			// ���߿�� I/O Stream�� �������� close()�� ȣ������� �Ѵ� (�޸� ȸ��)
			
			System.out.println("���� ���� �Ϸ�");
		} catch (FileNotFoundException e) {
			System.out.println("���� �� ã�� �ͼ���");
		} catch (IOException e) {
			System.out.println("�����͸� ���ٰ� ������ ������");
		} finally {
			try {
				if (fout != null) {
				fout.close();
				}
			} catch (IOException e) {}
		}
	}
}

















