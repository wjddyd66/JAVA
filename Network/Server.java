package NetWork;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
/*
Server.java
Server: ������ ���� ���񽺸� �����ϴ� ��ǻ��
Client: �������� �����ִ� ������ ���񽺸� �����ϴ� ��ǻ��
Socket: ���� ���α׷����� TCP/IP�� �̿��ϴ� â�� ������ �ϸ� 
���� ���α׷��� ���� ������ �������̽� ����. 
*/
public class Server {
	//����� ���� Socket ����
	ServerSocket ss;
	Socket socket;
	//����� ���� ����
	PrintWriter out;
	BufferedReader br;

	//Constructor �� ����
	public Server() {
		try {
			//Socket�� Port ��ȣ ����: 3000
			ss = new ServerSocket(3000);
		} catch (Exception e) {
			System.out.println("Error: " + e);
			System.exit(0);
		}
		System.out.println("���� ���� ��...");

		try {
			//socket�� ���Ͽ� Client�� ������ ���� �޾Ƶ���
			socket = ss.accept();
			//Socket���� �޾Ƶ��� ������ Console�� ����ϱ� ���� ����
			//euc-kr: �ѱ�ó���� ����
			out = new PrintWriter(socket.getOutputStream(), true);
			br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "euc-kr"));
		} catch (Exception e) {
			System.out.println("err: " + e);
		}
	}

	//Socket�� Consle�� ����ϱ� ���� Method
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
