import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class LoginPage implements ActionListener{
	JFrame f=new JFrame();
	JButton login=new JButton("Login");
	JButton reset=new JButton("Reset");
	JTextField field=new JTextField();
	JPasswordField userp=new JPasswordField();
	JLabel userID=new JLabel("user ID");
	JLabel userP=new JLabel("Password");
	JLabel message=new JLabel();
	
	
	HashMap<String,String>loginInfo=new HashMap<String,String>();
	LoginPage(HashMap<String,String>logorg){
		loginInfo=logorg;
		
		userID.setBounds(50,100,75,25);
		userID.setFont(new Font("Times New Roman",Font.BOLD,15));
		userP.setBounds(50,150,75,25);
		userP.setFont(new Font("Times New Roman",Font.BOLD,15));
		message.setBounds(150,250,250,35);
		message.setFont(new Font("Times New Roman",Font.BOLD,20));
		field.setBounds(125,100,200,25);
		userp.setBounds(125,150,200,25);
		
		login.setBounds(125,200,100,25);
		login.setFocusable(false);
		login.addActionListener(this);
		
		reset.setBounds(225,200,100,25);
		reset.setFocusable(false);
		reset.addActionListener(this);
		
		f.add(login);
		f.add(reset);
		f.add(message);
		f.add(field);
		f.add(userp);
		f.add(userID);
		f.add(userP);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(420,420);
		f.setLayout(null);
		f.getContentPane().setBackground(Color.pink);
		f.setVisible(true);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==reset) {
			field.setText("");
			userp.setText("");
		}
		if(e.getSource()==login) {
			String userid=field.getText();
			String userPP=String.valueOf(userp.getPassword());
			if(loginInfo.containsKey(userid)) {
				if(loginInfo.get(userid).equals(userPP)) {
					message.setForeground(Color.red);
					message.setText("Login successful");
					f.dispose();
					WlcPage wp=new WlcPage();
				}
				else {
					message.setForeground(Color.BLACK);
					message.setText("Wrong password");
				}
			}
			else {
				message.setForeground(Color.BLACK);
				message.setText("user ID not found !!");
			}
		}
	

		
	}

}
