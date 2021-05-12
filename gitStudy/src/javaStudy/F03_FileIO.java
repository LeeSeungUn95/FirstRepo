import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class F03_FileIO {
	/*
	 	# Stream
	 	  - �����͵��� ������ ���
	 	  - ���α׷����� ���� �� ����ϴ� ��θ� InputStream�̶�� �Ѵ�
	 	  - ���α׷����� ó���� �� ���� �� ����ϴ� ��θ� OutputStream�̶�� �Ѵ�
	 	  
	 	# InputStream
	 	  - read() : ��Ʈ������ ���� ������ �� ����Ʈ�� �о�´�. EOF�� �����ϸ� -1�� ��ȯ
	 	  - read(byte[]) : byte[]�� ���� �����ϸ� �ű⿡ ����ش�
	 	  - read(byte[], off, len) : byte[]�� ���� �����ϵ� ���ϴ� ��ŭ ���ϴ� ��ġ�� �д´�
	 	  
	 	# outputStream
	 */
	public static void main(String[] args) {
		
		File git = new File("./note/Git ��� ����.txt");
		System.out.println(git.exists());
		System.out.println(git.isDirectory());
		System.out.println(git.isFile());
		
		try {
			FileInputStream fin = new FileInputStream(git);
			
			while (fin.read() != -1) {
				System.out.println((char)fin.read());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}