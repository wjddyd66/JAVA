package Thread;

import java.util.ArrayList;
/*
Thread.java
������: �ϳ��� ���μ��� ���ο��� ���������� ����Ǵ� �ϳ��� �۾� �����̴�.
���ݱ��� �����Ͽ��� Main ���� �ϳ��� Thread ��� ���� �� �� �ִ�.
Thread�� ������ �����Ͽ� �����ϰ� �ϸ� ����ó�� ȿ���� ���� �� �ִ�.
=> �켱����(1~10���� ����)�� ���� CPU�����ð��� �ٸ��� �ȴ�.
�������� ����: Ready, Runnable, Running, Dead
Thread�� ��ӹ޾� ���� �� �� ������ Thread�� ���� �Ǿ��ִ� run Method��
Override�Ͽ� ��� ������ ������ ������ �� �ִ�.
*/
public class thread extends Thread{
	int number;
	
	//Constructor ����
    public thread(int number){
    	this.number = number;
    }
    
    //Thread �� Method�� Override�Ͽ���.
    @Override
    public void run() {
    	//Thread������ �˸��� ���� Code
        System.out.println(this.number+" Thread start.");
        //try-catch�� ���� Exception Handling
        try {
        	//Thread�� 3�ʵ��� ����Ų�ٴ� �ǹ��̴�.
            Thread.sleep(3000);
        }catch(Exception e) {
        	System.out.println("Error"+e);
        }
        //Thread������ �˸��� ���� Code
        System.out.println(this.number+" Thread end.");
    }

    public static void main(String[] args) {
        //ArrayList�� Generics�� Object�� ���� �� �ִ�. => Thread�� ����
    	ArrayList<Thread> threads = new ArrayList<Thread>();
        
    	//10���� Thread����
        for(int i=0; i<10; i++) {
            Thread t = new Thread(new thread(i));
            //Thread ���� -> Run Method�� �����ϰ� �ȴ�.
            t.start();
            threads.add(t);
        }

        
        for(int i=0; i<threads.size(); i++) {
            //ArrayList�̹Ƿ� get���μ� ArrayList���� thread ����
        	Thread t = threads.get(i);
            try {
            	/*
            	Thread�� ����Ͽ� ���ÿ� ó���ϰ� �� �� �ִ�.
            	Join�� ����Ͽ� Thread�� ���� �� �� ���� �۾��� �����ϰ� �� �� �ִ�.
            	*/
                t.join();
            }catch(Exception e) {
            	System.out.println("Error2"+e);
            }
        }
        
        //Main Thread���Ḧ �˾ƺ��� ���� Code
        System.out.println("Main Thread End.");
    }

}
