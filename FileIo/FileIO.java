package FileIO_ExceptionHandler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
FileIO.java
������ ������� ���� �����̴�
����ó��: ����ó���� �ϱ� ���� ����� ũ�� 2������ �ִ�.
throws, try-catch�̴�.
throws�� �̹� ���ǵǾ��ִ� ����ó����� �����ϰڴٴ� �ǹ��̴�.
try-catch�� Error�߻��� Code�ۼ��� ���� �����Ѵٴ� �ǹ��̴�.
=> Try-Catch ��� ����
*/
public class FileIO {

	public static void main(String[] args) {
		/*
		File�� �����ϱ� ���� ���� ����
		fw - ������ ������ ���� ���� ����
		fw2 - ������ ������ �߰��ϱ� ���� ����
		br - ������ ������ �б� ���Ͽ� ���
		=> FileReader�� ������ File IO���� �ð��� ���� �ɸ���.
		���� Buffer�� �̿��Ͽ� File IO�� �ð��� �ٿ� Code ���� �ð��� ũ�� ���ҽ�Ų��.
		*/
		FileWriter fw,fw2;
		BufferedReader br;
		
		//Try Catch�� ����ó�� => File ��ΰ� ���ų�, ���ٱ��� �� ���� Error�� �ִ�.
		try {
			//File�� ������ ���� ����
			//�̸��� ����File ���� �� ���� File �������
			fw = new FileWriter("./out.txt");
			for(int i=1; i<11; i++) {
	            String data = i+": HelloWorld\n";
	            fw.write(data);
	        }
			//File�� ���� �� �ڿ��� File�� ���� ������ ���� �� Close�ϴ� ���� ����
			fw.close();
			
			//File�� ������ �״�� ������ä ������ �߰��ϱ� ���� ����
			fw2 = new FileWriter("./out.txt",true);
			for(int i=1; i<11; i++) {
	            String data = i+": HelloWorld\n";
	            fw2.write(data);
	        }
			fw2.close();
			
			//File �� ������ �б����� ����
			br = new BufferedReader(new FileReader("./out.txt"));
	        while(true) {
	            String line = br.readLine();
	            if (line==null) break;
	            System.out.println(line);
	        }
	        br.close();
	    
	        /*
	        1: HelloWorld
	        '''
	        10: HelloWorld
	        1: HelloWorld
	        '''
	        10: HelloWorld
	         */
		} catch (IOException e) {
			System.out.println("Error: "+e);
		}	
	}
}
