import java.io.*;
import java.net.*;
public class MyServer {

	public static void main(String[] args)throws Exception {
		
		System.out.println("Server Started");
		ServerSocket ss= new ServerSocket(9999);
		
		
		System.out.println("Server is waiting for a client request ");
		Socket s= ss.accept();
		
		System.out.println("Client Connected");
		
		BufferedReader br= new BufferedReader(new InputStreamReader(s.getInputStream()));
		String str=br.readLine();
		
		System.out.println("Client Data: "+str);
	
	}

}
