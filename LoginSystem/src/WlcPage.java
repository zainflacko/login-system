import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class WlcPage {
JFrame jj=new JFrame();
JLabel ll=new JLabel("HI BROSKI");


WlcPage(){
	
	ll.setBounds(150,150,350,75);
	ll.setFont(new Font("Times New Roman",Font.ITALIC,30));
	jj.add(ll);
	jj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jj.setSize(420,420);
	jj.setLayout(null);
	jj.setVisible(true);
	
}

}
