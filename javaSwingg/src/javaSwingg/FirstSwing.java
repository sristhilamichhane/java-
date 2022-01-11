package javaSwingg;
import javax.swing.*;
import java.awt.*;

public class FirstSwing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f=new JFrame();
		JButton b= new JButton("Click");
		b.setBounds(130,100,100,40);
		f.add(b);
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon image= new ImageIcon("img1.jpg");
		f.setIconImage(image.getImage());
		f.getContentPane().setBackground(Color.blue);
		FirstSwing fs=new FirstSwing();

	}

}
