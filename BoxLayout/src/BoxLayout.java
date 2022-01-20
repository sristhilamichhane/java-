import java.awt.*;
import javax.swing.*;
public class BoxLayout extends Frame {
	JFrame f;
	BoxLayout()
	{
		f=new JFrame();
		JButton b1= new JButton("NORTH");
		JButton b2= new JButton("SOUTH");
		JButton b3= new JButton("EAST");
		JButton b4= new JButton("WEST");
		JButton b5= new JButton("CENTER");
//		Container ContentPane= f.getContentPane();
		f.add(b1,BorderLayout.NORTH);
		f.add(b2,BorderLayout.SOUTH);
		f.add(b3,BorderLayout.EAST);
		f.add(b4,BorderLayout.WEST);
		f.add(b5,BorderLayout.CENTER);
//		f.setLayout(new BoxLayout (ContentPane, BoxLayout.Y_AXIS));
		f.setSize(400,400);
		f.setVisible(true);
		
	}

	public static void main(String[] args) {
		new BoxLayout();

	}

}
