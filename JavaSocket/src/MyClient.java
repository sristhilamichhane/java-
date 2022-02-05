import java.io.DataOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class MyClient {

	public static void main(String[] args) throws Exception {
		Socket s=new Socket("localhost",9999);
		
		String str="Sristhi lamichhane";
		OutputStreamWriter os= new OutputStreamWriter(s.getOutputStream());
		PrintWriter out=new PrintWriter(os);
		os.write(str);
		os.flush();
		os.close();

	}

}
