package Thread;

import java.util.ArrayList;
/*
Thread.java
쓰레드: 하나의 프로세스 내부에서 독립적으로 실행되는 하나의 작업 단위이다.
지금까지 실행하였던 Main 문도 하나의 Thread 라고 생각 할 수 있다.
Thread를 여러개 선언하여 실행하게 하면 동시처리 효과를 보일 수 있다.
=> 우선순위(1~10까지 존재)에 따라 CPU점유시간이 다르게 된다.
쓰레드의 상태: Ready, Runnable, Running, Dead
Thread를 상속받아 실행 할 수 있으며 Thread에 정의 되어있는 run Method를
Override하여 어떻게 실행할 것인지 정의할 수 있다.
*/
public class thread extends Thread{
	int number;
	
	//Constructor 선언
    public thread(int number){
    	this.number = number;
    }
    
    //Thread 의 Method를 Override하였다.
    @Override
    public void run() {
    	//Thread생성을 알리기 위한 Code
        System.out.println(this.number+" Thread start.");
        //try-catch로 인한 Exception Handling
        try {
        	//Thread를 3초동안 대기시킨다는 의미이다.
            Thread.sleep(3000);
        }catch(Exception e) {
        	System.out.println("Error"+e);
        }
        //Thread종료을 알리기 위한 Code
        System.out.println(this.number+" Thread end.");
    }

    public static void main(String[] args) {
        //ArrayList는 Generics에 Object를 담을 수 있다. => Thread도 가능
    	ArrayList<Thread> threads = new ArrayList<Thread>();
        
    	//10개의 Thread생성
        for(int i=0; i<10; i++) {
            Thread t = new Thread(new thread(i));
            //Thread 실행 -> Run Method를 실행하게 된다.
            t.start();
            threads.add(t);
        }

        
        for(int i=0; i<threads.size(); i++) {
            //ArrayList이므로 get으로서 ArrayList안의 thread 접근
        	Thread t = threads.get(i);
            try {
            	/*
            	Thread를 사용하여 동시에 처리하게 할 수 있다.
            	Join을 사용하여 Thread가 종료 된 후 다음 작업을 실행하게 할 수 있다.
            	*/
                t.join();
            }catch(Exception e) {
            	System.out.println("Error2"+e);
            }
        }
        
        //Main Thread종료를 알아보기 위한 Code
        System.out.println("Main Thread End.");
    }

}
