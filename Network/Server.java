package NetWork;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
/*
Server.java
Server: 데이터 전송 서비스를 제공하는 컴퓨터
Client: 서버에서 보내주는 데이터 서비스를 수신하는 컴퓨터
Socket: 응용 프로그램에서 TCP/IP를 이용하는 창구 역할을 하며 
응용 프로그램과 소켓 사이의 인터페이스 역할. 
*/
public class Server {
	//통신을 위한 Socket 정의
	ServerSocket ss;
	Socket socket;
	//출력을 위한 변수
	PrintWriter out;
	BufferedReader br;

	//Constructor 로 정의
	public Server() {
		try {
			//Socket의 Port 번호 설정: 3000
			ss = new ServerSocket(3000);
		} catch (Exception e) {
			System.out.println("Error: " + e);
			System.exit(0);
		}
		System.out.println("서버 서비스 중...");

		try {
			//socket을 통하여 Client가 보내는 정보 받아들임
			socket = ss.accept();
			//Socket에서 받아들인 내용을 Console에 출력하기 위한 과정
			//euc-kr: 한글처리를 위해
			out = new PrintWriter(socket.getOutputStream(), true);
			br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "euc-kr"));
		} catch (Exception e) {
			System.out.println("err: " + e);
		}
	}

	//Socket을 Consle에 출력하기 위한 Method
	public void receiveMsg() {
		try {
			String msg = br.readLine();
			System.out.println("receiveMsg: " + msg);

			out.println("from server: " + msg);
			br.close();
			out.close();
			socket.close();
			ss.close();
		} catch (Exception e) {
			System.out.println("receiveMsg: " + e);
		}
	}

	public static void main(String[] args) {
		while (true) {
			Server server = new Server();
			server.receiveMsg();
		}
	}
}
