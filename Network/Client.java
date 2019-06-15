package NetWork;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	Socket socket;
	PrintWriter out;
	BufferedReader br;
	
	public Client() {
		try {
			//Socket�� ���� Ip�� Port ��ȣ ����
			socket=new Socket("172.30.1.2", 3000);
			//Socket ���� Message�� �����ϴ� ����
			out=new PrintWriter(socket.getOutputStream(), true);
			br=new BufferedReader(new InputStreamReader(socket.getInputStream(), "euc-kr"));
		
		} catch (Exception e) {
			System.out.println("NetTest4Client err: "+e);
			System.exit(0);
		}
	}
	
	//Message ������ ���� Method
	public void processMsg() {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("���� ���� �޽���");
			String data=sc.nextLine();
			out.println(data);
		} catch (Exception e) {
			System.out.println("processMsg err: "+e);
		} finally {
			try {
				br.close();
				out.close();
				socket.close();
			} catch (Exception e2) {}
		}
	}

	public static void main(String[] args) {
		Client client=new Client();
		client.processMsg();
	}
}
