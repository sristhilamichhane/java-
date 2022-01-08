//write byte
import java.io.FileOutputStream;
public class IOinputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileOutputStream fout= new FileOutputStream("D:\\testout.txt");
			fout.write(65);
			fout.close();
			System.out.println("Success....00");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
