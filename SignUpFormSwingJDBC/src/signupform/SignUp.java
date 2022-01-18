package signupform;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class SignUp {
	

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp window = new SignUp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	Connection con=null;
	public SignUp() {
		con=DB.dbconnect();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 526, 379);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SignUp Form");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(96, 10, 161, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("FirstName :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(37, 66, 99, 21);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(161, 69, 96, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("LastName :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(37, 111, 99, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(161, 108, 96, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("User Id :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(42, 154, 77, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(161, 151, 96, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel(" Password :");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(37, 191, 99, 13);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(161, 217, 96, 19);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Email :");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(37, 218, 99, 13);
		frame.getContentPane().add(lblNewLabel_5);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(161, 185, 96, 19);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("SignUp");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String first=textField.getText();
				String last=textField_1.getText();
				String user=textField_2.getText();
				String password=passwordField.getText();
				String email=textField_4.getText();
				
				try {
					PreparedStatement pst=(PreparedStatement)con.prepareStatement("INSERT INTO `signup`(`firstname`, `lastname`, `userid`, `password`, `email`) VALUES (?,?,?,?,?)");
					pst.setString(1, first);
					pst.setString(2, last);
					pst.setString(3, user);
					pst.setString(4, password);
					pst.setString(5, email);
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "dataAdded");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		btnNewButton.setBounds(132, 274, 85, 21);
		frame.getContentPane().add(btnNewButton);
	}
}
