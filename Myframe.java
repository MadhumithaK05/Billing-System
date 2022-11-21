import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Myframe extends JFrame{
	//public static String n;
	//public static String p;
	public static void main(String[] args) {
		JTextField tx=new JTextField();
		tx.setPreferredSize(new Dimension(200,40));
		JLabel cname=new JLabel();
		JLabel phnum=new JLabel();
		
		cname.setText("Name  :");
		cname.setForeground(Color.WHITE);
		cname.setFont(new Font("Chalkboard",Font.BOLD,25));
		
		phnum.setText("Phone No. : ");
		phnum.setForeground(Color.WHITE);
		phnum.setFont(new Font("Chalkboard",Font.BOLD,25));
		
		JTextField tx1=new JTextField();
		tx1.setPreferredSize(new Dimension(200,40));
		
		JButton b=new JButton("Enter");
		
		
		
		JFrame fr=new JFrame();
		fr.setVisible(true);
		fr.setSize(420,300);
		fr.setTitle("Login");	
		fr.setResizable(false);	
		fr.setLayout(new FlowLayout());
		
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.getContentPane().setBackground(new Color(0x123456));
		fr.add(cname);
		fr.add(tx);
		fr.add(phnum);
		fr.add(tx1);
		fr.add(b);
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==b) {
					String n=tx.getText();
					String p=tx1.getText();
					fr.dispose();
					new Order(n,p);
					
				}
			}
			});				
		}
}

