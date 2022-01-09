import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;

public class AWT  extends WindowAdapter implements ActionListener {
	TextField tf1, tf2, tf3;    
    Button b1, b2,b3,b4;   
	AWT()
	{
	 Frame f= new Frame();
	 //Button b= new Button("click");
	 //TextField t=new TextField("Write message here");
	// t.setBounds(350,450,170,180);  
	 f.setVisible(true);
	 f.setSize(500,600);
	 f.setLayout(null);
	 //b.setBounds(180,180,90,40);
	// b.setForeground(Color.blue);
	 //f.add(b);
	 //f.add(t);
	 f.setBackground(Color.LIGHT_GRAY);
	 /*Choice c=new Choice();
	 c.setBounds(100, 100,100,100);  
	 Label l1, l2;    
	  
	       
	    l1 = new Label ("First Label.");   
	    l2 = new Label ("Second Label.");   
	  
	    
	    l1.setBounds(10, 20, 90, 60);    
	    l2.setBounds(10, 40, 90, 90);  
	  
	        
	    f.add(l1);  
	    f.add(l2);   
	   
	    
	    

     c.add("Item 1");    
     c.add("Item 2");    
     c.add("Item 3");    
     c.add("Item 4");    
     c.add("Item 5");    

     f.add(c);   */
     
     // instantiating using constructor   
     
         tf1 = new TextField();    
         tf1.setBounds(50, 50, 150, 20);    
         tf2 = new TextField();    
         tf2.setBounds(50, 100, 150, 20);    
         tf3 = new TextField();    
         tf3.setBounds(50, 150, 150, 20);  
         tf3.setEditable(false);   
         b1 = new Button("+");    
         b1.setBounds(50, 200, 50, 50);  
         b2 = new Button("-");    
         b2.setBounds(120,200,50,50);  
         b3=new Button("*");
         b3.setBounds(190,200,50,50);
         b4=new Button("/");
         b4.setBounds(260,200,50,50);
         
         // adding action listener  
         b1.addActionListener(this);    
         b2.addActionListener(this); 
         b3.addActionListener(this); 
         b4.addActionListener(this); 
         // adding components to frame  
        f.add(tf1);  
         f.add(tf2);  
         f.add(tf3);  
         f.add(b1);  
         f.add(b2);  
         f.add(b3);
         f.add(b4);
         // setting size, layout and visibility of frame   
         
     // defining the actionPerformed method to generate an event on buttons 

         
    

	 f.addWindowListener (new WindowAdapter() {    
         public void windowClosing (WindowEvent e) {    
             f.dispose();    
         }    
     });    

	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AWT a =new AWT();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
			 String s1 = tf1.getText();    
	         String s2 = tf2.getText();    
	         int a = Integer.parseInt(s1);    
	         int b = Integer.parseInt(s2);    
	         int c=0;  
	         if (e.getSource() == b1){    
	             c = a + b;    
	         }  
	         else if (e.getSource() == b2){    
	             c = a - b;    
	         }  
	         else if(e.getSource()==b3)
	         {
	        	 c=a*b;
	         }
	         else if(e.getSource()==b4)
	         {
	        	 c=a/b;
	         }
	         String result = String.valueOf(c);    
	         tf3.setText(result);  
			// TODO Auto-generated method stub
			
		}
		
	}

	


