package FileIO_ExceptionHandler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
FileIO.java
파일의 입출력을 위한 예제이다
예외처리: 예외처리를 하기 위한 방법은 크게 2가지가 있다.
throws, try-catch이다.
throws는 이미 정의되어있는 예외처리대로 실행하겠다는 의미이다.
try-catch는 Error발생시 Code작성에 따라 실행한다는 의미이다.
=> Try-Catch 사용 권장
*/
public class FileIO {

	public static void main(String[] args) {
		/*
		File에 접근하기 위한 변수 선언
		fw - 파일을 내용을 쓰기 위한 변수
		fw2 - 파일의 내용을 추가하기 위한 변수
		br - 파일의 내용을 읽기 위하여 사용
		=> FileReader도 있지만 File IO에는 시간이 오래 걸린다.
		따라서 Buffer를 이용하여 File IO의 시간을 줄여 Code 실행 시간을 크게 감소시킨다.
		*/
		FileWriter fw,fw2;
		BufferedReader br;
		
		//Try Catch로 예외처리 => File 경로가 없거나, 접근권한 등 많은 Error가 있다.
		try {
			//File에 내용을 쓰는 과정
			//이름이 같은File 존재 시 기존 File 내용삭제
			fw = new FileWriter("./out.txt");
			for(int i=1; i<11; i++) {
	            String data = i+": HelloWorld\n";
	            fw.write(data);
	        }
			//File에 접근 한 뒤에는 File의 내용 보존을 위행 꼭 Close하는 습관 권장
			fw.close();
			
			//File이 내용을 그대로 보존한채 내용을 추가하기 위한 과정
			fw2 = new FileWriter("./out.txt",true);
			for(int i=1; i<11; i++) {
	            String data = i+": HelloWorld\n";
	            fw2.write(data);
	        }
			fw2.close();
			
			//File 의 내용을 읽기위한 과정
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
