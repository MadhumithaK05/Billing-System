import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.text.SimpleDateFormat;
import javax.swing.*;
public class Order extends JFrame{
	private int rand; 
	private JFrame f=new JFrame();
	private JPanel a=new JPanel();
	private JPanel a1=new JPanel();
	private JPanel a2=new JPanel();
	private JPanel b=new JPanel();
	private JPanel b1=new JPanel();
	private JPanel b2=new JPanel();
	private JPanel c=new JPanel();
	private JButton gbill=new JButton("Generate Bill");
	
	private JLabel chat=new JLabel();
	private JLabel bill=new JLabel();
	private JLabel sw=new JLabel();

	private JLabel chr1=new JLabel();
	private JLabel chr2=new JLabel();
	private JLabel chr3 =new JLabel();
	private JLabel chr4=new JLabel();
	private JLabel chr5=new JLabel();

	private JLabel snr1=new JLabel();
	private JLabel snr2=new JLabel();
	private JLabel snr3=new JLabel();
	private JLabel snr4=new JLabel();
	private JLabel snr5=new JLabel();

	private JLabel swr1=new JLabel();
	private JLabel swr2=new JLabel();
	private JLabel swr3=new JLabel();
	private JLabel swr4=new JLabel();
	private JLabel swr5=new JLabel();

	private JLabel car1=new JLabel();
	private JLabel car2=new JLabel();
	private JLabel car3=new JLabel();
	private JLabel car4=new JLabel();
	private JLabel car5=new JLabel();	
	
	private JLabel pani=new JLabel();
	private JLabel bhel=new JLabel();
	private JLabel pav =new JLabel();
	private JLabel sev=new JLabel();
	private JLabel masal=new JLabel();

	private JLabel puf=new JLabel();
	private JLabel samosa=new JLabel();
	private JLabel rol=new JLabel();
	private JLabel kachori=new JLabel();
	private JLabel cut=new JLabel();

	private JLabel paner=new JLabel();
	private JLabel corn=new JLabel();
	private JLabel veg=new JLabel();
	private JLabel mush=new JLabel();
	private JLabel chese=new JLabel();

	private JLabel choco=new JLabel();
	private JLabel stra=new JLabel();
	private JLabel buter=new JLabel();
	private JLabel lava=new JLabel();
	private JLabel vanila=new JLabel();	
	
	private JTextField ac1=new JTextField("0");
	private JTextField ac2=new JTextField("0");
	private JTextField ac3=new JTextField("0");
	private JTextField ac4=new JTextField("0");
	private JTextField ac5=new JTextField("0");
	
	private JTextField as1=new JTextField("0");
	private JTextField as2=new JTextField("0");
	private JTextField as3=new JTextField("0");
	private JTextField as4=new JTextField("0");
	private JTextField as5=new JTextField("0");
	
	private JTextField bs1=new JTextField("0");
	private JTextField bs2=new JTextField("0");
	private JTextField bs3=new JTextField("0");
	private JTextField bs4=new JTextField("0");
	private JTextField bs5=new JTextField("0");
	
	private JTextField bc1=new JTextField("0");
	private JTextField bc2=new JTextField("0");
	private JTextField bc3=new JTextField("0");
	private JTextField bc4=new JTextField("0");
	private JTextField bc5=new JTextField("0");

	private JTextArea txt=new JTextArea(20,21);
	public String name;
	public String ph;
	Order(String n,String pn){
		name=n;
		ph=pn;
		Random r = new Random();
		Date day=new Date();
		SimpleDateFormat fr = new SimpleDateFormat("dd/MM/yyyy");
		rand=r.nextInt(1000);
		chat.setText("CHAT & SNACKS  ");
		chat.setForeground(new Color(0x123456));
		chat.setFont(new Font("Chalkboard",Font.BOLD,30));
		
		sw.setText("SANDWICH & CAKE  ");
		sw.setForeground(new Color(0x123456));
		sw.setFont(new Font("Chalkboard",Font.BOLD,30));
		
		bill.setText("  BILL              ");
		bill.setHorizontalAlignment(JLabel.CENTER);
		bill.setForeground(Color.WHITE);
		bill.setFont(new Font("Chalkboard",Font.BOLD,30));
		
		pani.setText("PANI PURI  ");
		pani.setForeground(Color.WHITE);
		pani.setFont(new Font("Chalkboard",Font.ITALIC,20));
		chr1.setText("Rs.25  ");
		chr1.setForeground(Color.WHITE);
		chr1.setFont(new Font("Chalkboard",Font.ITALIC,20));
		ac1.setPreferredSize(new Dimension(50,40));
		ac1.setForeground(Color.black);
		ac1.setHorizontalAlignment(JTextField.CENTER);
		ac1.setFont(new Font("Chalkboard",Font.ITALIC,20));

		bhel.setText("BHEL PURI  ");
		bhel.setForeground(Color.WHITE);
		bhel.setFont(new Font("Chalkboard",Font.ITALIC,20));	
		chr2.setText("Rs.40  ");
		chr2.setForeground(Color.WHITE);
		chr2.setFont(new Font("Chalkboard",Font.ITALIC,20));
		ac2.setPreferredSize(new Dimension(50,40));
		ac2.setForeground(Color.black);
		ac2.setHorizontalAlignment(JTextField.CENTER);
		ac2.setFont(new Font("Chalkboard",Font.ITALIC,20));

		sev.setText("SEV PURI  ");
		sev.setForeground(Color.WHITE);
		sev.setFont(new Font("Chalkboard",Font.ITALIC,20));
		chr3.setText("Rs.40  ");
		chr3.setForeground(Color.WHITE);
		chr3.setFont(new Font("Chalkboard",Font.ITALIC,20));
		ac3.setPreferredSize(new Dimension(50,40));
		ac3.setForeground(Color.black);
		ac3.setHorizontalAlignment(JTextField.CENTER);
		ac3.setFont(new Font("Chalkboard",Font.ITALIC,20));

		masal.setText("MASALA PURI  ");
		masal.setForeground(Color.WHITE);
		masal.setFont(new Font("Chalkboard",Font.ITALIC,20));
		chr4.setText("Rs.40  ");
		chr4.setForeground(Color.WHITE);
		chr4.setFont(new Font("Chalkboard",Font.ITALIC,20));
		ac4.setPreferredSize(new Dimension(50,40));
		ac4.setForeground(Color.black);
		ac4.setHorizontalAlignment(JTextField.CENTER);
		ac4.setFont(new Font("Chalkboard",Font.ITALIC,20));

		pav.setText("PAV BAJI  ");
		pav.setForeground(Color.WHITE);
		pav.setFont(new Font("Chalkboard",Font.ITALIC,20));
		chr5.setText("Rs.60  ");
		chr5.setForeground(Color.WHITE);
		chr5.setFont(new Font("Chalkboard",Font.ITALIC,20));
		ac5.setPreferredSize(new Dimension(50,40));
		ac5.setForeground(Color.black);
		ac5.setHorizontalAlignment(JTextField.CENTER);
		ac5.setFont(new Font("Chalkboard",Font.ITALIC,20));
		
		puf.setText("VEG PUFF  ");
		puf.setForeground(Color.WHITE);
		puf.setFont(new Font("Chalkboard",Font.ITALIC,20));
		snr1.setText("Rs.15  ");
		snr1.setForeground(Color.WHITE);
		snr1.setFont(new Font("Chalkboard",Font.ITALIC,20));
		as1.setPreferredSize(new Dimension(50,40));
		as1.setForeground(Color.black);
		as1.setHorizontalAlignment(JTextField.CENTER);
		as1.setFont(new Font("Chalkboard",Font.ITALIC,20));
		
		samosa.setText("SAMOSA  ");
		samosa.setForeground(Color.WHITE);
		samosa.setFont(new Font("Chalkboard",Font.ITALIC,20));
		snr2.setText("Rs.10  ");
		snr2.setForeground(Color.WHITE);
		snr2.setFont(new Font("Chalkboard",Font.ITALIC,20));
		as2.setPreferredSize(new Dimension(50,40));
		as2.setForeground(Color.black);
		as2.setHorizontalAlignment(JTextField.CENTER);
		as2.setFont(new Font("Chalkboard",Font.ITALIC,20));
		
		rol.setText("VEG ROLL  ");
		rol.setForeground(Color.WHITE);
		rol.setFont(new Font("Chalkboard",Font.ITALIC,20));
		snr3.setText("Rs.20  ");
		snr3.setForeground(Color.WHITE);
		snr3.setFont(new Font("Chalkboard",Font.ITALIC,20));
		as3.setPreferredSize(new Dimension(50,40));
		as3.setForeground(Color.black);
		as3.setHorizontalAlignment(JTextField.CENTER);
		as3.setFont(new Font("Chalkboard",Font.ITALIC,20));
		
		kachori.setText("KACHORI  ");
		kachori.setForeground(Color.WHITE);
		kachori.setFont(new Font("Chalkboard",Font.ITALIC,20));
		snr4.setText("Rs.15  ");
		snr4.setForeground(Color.WHITE);
		snr4.setFont(new Font("Chalkboard",Font.ITALIC,20));
		as4.setPreferredSize(new Dimension(50,40));
		as4.setForeground(Color.black);
		as4.setHorizontalAlignment(JTextField.CENTER);
		as4.setFont(new Font("Chalkboard",Font.ITALIC,20));
		
		cut.setText("CUTLET  ");
		cut.setForeground(Color.WHITE);
		cut.setFont(new Font("Chalkboard",Font.ITALIC,20));
		snr5.setText("Rs.15  ");
		snr5.setForeground(Color.WHITE);
		snr5.setFont(new Font("Chalkboard",Font.ITALIC,20));
		as5.setPreferredSize(new Dimension(50,40));
		as5.setForeground(Color.black);
		as5.setHorizontalAlignment(JTextField.CENTER);
		as5.setFont(new Font("Chalkboard",Font.ITALIC,20));
		
		paner.setText("PANEER SANDWICH  ");
		paner.setForeground(Color.WHITE);
		paner.setFont(new Font("Chalkboard",Font.ITALIC,20));
		swr1.setText("Rs.50  ");
		swr1.setForeground(Color.WHITE);
		swr1.setFont(new Font("Chalkboard",Font.ITALIC,20));
		bs1.setPreferredSize(new Dimension(50,40));
		bs1.setForeground(Color.black);
		bs1.setHorizontalAlignment(JTextField.CENTER);
		bs1.setFont(new Font("Chalkboard",Font.ITALIC,20));
		
		veg.setText("VEG SANDWICH  ");
		veg.setForeground(Color.WHITE);
		veg.setFont(new Font("Chalkboard",Font.ITALIC,20));
		swr2.setText("Rs.40  ");
		swr2.setForeground(Color.WHITE);
		swr2.setFont(new Font("Chalkboard",Font.ITALIC,20));
		bs2.setPreferredSize(new Dimension(50,40));
		bs2.setForeground(Color.black);
		bs2.setHorizontalAlignment(JTextField.CENTER);
		bs2.setFont(new Font("Chalkboard",Font.ITALIC,20));
		
		corn.setText("CORN SANDWICH  ");
		corn.setForeground(Color.WHITE);
		corn.setFont(new Font("Chalkboard",Font.ITALIC,20));
		swr3.setText("Rs.45  ");
		swr3.setForeground(Color.WHITE);
		swr3.setFont(new Font("Chalkboard",Font.ITALIC,20));
		bs3.setPreferredSize(new Dimension(50,40));
		bs3.setForeground(Color.black);
		bs3.setHorizontalAlignment(JTextField.CENTER);
		bs3.setFont(new Font("Chalkboard",Font.ITALIC,20));
		
		mush.setText("MUSHROOM SANDWICH  ");
		mush.setForeground(Color.WHITE);
		mush.setFont(new Font("Chalkboard",Font.ITALIC,20));
		swr4.setText("Rs.50  ");
		swr4.setForeground(Color.WHITE);
		swr4.setFont(new Font("Chalkboard",Font.ITALIC,20));
		bs4.setPreferredSize(new Dimension(50,40));
		bs4.setForeground(Color.black);
		bs4.setHorizontalAlignment(JTextField.CENTER);
		bs4.setFont(new Font("Chalkboard",Font.ITALIC,20));
		
		chese.setText("CHILLI CHEESE SANDWICH  ");
		chese.setForeground(Color.WHITE);
		chese.setFont(new Font("Chalkboard",Font.ITALIC,20));
		swr5.setText("Rs.50  ");
		swr5.setForeground(Color.WHITE);
		swr5.setFont(new Font("Chalkboard",Font.ITALIC,20));
		bs5.setPreferredSize(new Dimension(50,40));
		bs5.setForeground(Color.black);
		bs5.setHorizontalAlignment(JTextField.CENTER);
		bs5.setFont(new Font("Chalkboard",Font.ITALIC,20));
		
		choco.setText("CHOCOLATE  ");
		choco.setForeground(Color.WHITE);
		choco.setFont(new Font("Chalkboard",Font.ITALIC,20));
		car1.setText("Rs.30  ");
		car1.setForeground(Color.WHITE);
		car1.setFont(new Font("Chalkboard",Font.ITALIC,20));
		bc1.setPreferredSize(new Dimension(50,40));
		bc1.setForeground(Color.black);
		bc1.setHorizontalAlignment(JTextField.CENTER);
		bc1.setFont(new Font("Chalkboard",Font.ITALIC,20));
		
		stra.setText("STRAWBERRY  ");
		stra.setForeground(Color.WHITE);
		stra.setFont(new Font("Chalkboard",Font.ITALIC,20));
		car2.setText("Rs.30  ");
		car2.setForeground(Color.WHITE);
		car2.setFont(new Font("Chalkboard",Font.ITALIC,20));
		bc2.setPreferredSize(new Dimension(50,40));
		bc2.setForeground(Color.black);
		bc2.setHorizontalAlignment(JTextField.CENTER);
		bc2.setFont(new Font("Chalkboard",Font.ITALIC,20));
		
		buter.setText("BUTTERSCOTCH  ");
		buter.setForeground(Color.WHITE);
		buter.setFont(new Font("Chalkboard",Font.ITALIC,20));
		car3.setText("Rs.30  ");
		car3.setForeground(Color.WHITE);
		car3.setFont(new Font("Chalkboard",Font.ITALIC,20));
		bc3.setPreferredSize(new Dimension(50,40));
		bc3.setForeground(Color.black);
		bc3.setHorizontalAlignment(JTextField.CENTER);
		bc3.setFont(new Font("Chalkboard",Font.ITALIC,20));
		
		lava.setText("CHOCO LAVA  ");
		lava.setForeground(Color.WHITE);
		lava.setFont(new Font("Chalkboard",Font.ITALIC,20));
		car4.setText("Rs.45  ");
		car4.setForeground(Color.WHITE);
		car4.setFont(new Font("Chalkboard",Font.ITALIC,20));
		bc4.setPreferredSize(new Dimension(50,40));
		bc4.setForeground(Color.black);
		bc4.setHorizontalAlignment(JTextField.CENTER);
		bc4.setFont(new Font("Chalkboard",Font.ITALIC,20));
		
		vanila.setText("VANILLA  ");
		vanila.setForeground(Color.WHITE);
		vanila.setFont(new Font("Chalkboard",Font.ITALIC,20));
		car5.setText("Rs.25  ");
		car5.setForeground(Color.WHITE);
		car5.setFont(new Font("Chalkboard",Font.ITALIC,20));
		bc5.setPreferredSize(new Dimension(50,40));
		bc5.setForeground(Color.black);
		bc5.setHorizontalAlignment(JTextField.CENTER);
		bc5.setFont(new Font("Chalkboard",Font.ITALIC,20));
		
		txt.setEditable(false);
		
		a.setPreferredSize(new Dimension(420,700));
		b.setPreferredSize(new Dimension(420,700));
		c.setPreferredSize(new Dimension(420,750));
		a.setLayout(new GridLayout(10,3));
		a1.setLayout(new BorderLayout());
		b.setLayout(new GridLayout(10,3));
		b1.setLayout(new BorderLayout());
		a.setBackground(new Color(0x123456));
		b.setBackground(new Color(0x123456));
		c.setBackground(new Color(0x123456));

		
		
		a2.add(chat);
		a.add(pani);
		a.add(chr1);
		a.add(ac1);
		a.add(bhel);
		a.add(chr2);
		a.add(ac2);
		a.add(sev);
		a.add(chr3);
		a.add(ac3);
		a.add(masal);
		a.add(chr4);
		a.add(ac4);
		a.add(pav);
		a.add(chr5);
		a.add(ac5);
		
		a1.add(a2,BorderLayout.NORTH);
		a1.add(a,BorderLayout.CENTER);
		
		a.add(puf);
		a.add(snr1);
		a.add(as1);
		a.add(samosa);
		a.add(snr2);
		a.add(as2);
		a.add(kachori);
		a.add(snr4);
		a.add(as4);
		a.add(rol);
		a.add(snr3);
		a.add(as3);
		a.add(cut);
		a.add(snr5);
		a.add(as5);
		
		b2.add(sw);
		b.add(chese);
		b.add(swr5);
		b.add(bs5);
		b.add(veg);
		b.add(swr2);
		b.add(bs2);
		b.add(corn);
		b.add(swr3);
		b.add(bs3);
		b.add(paner);
		b.add(swr1);
		b.add(bs1);
		b.add(mush);
		b.add(swr4);
		b.add(bs4);
		
		b1.add(b2,BorderLayout.NORTH);
		b1.add(b,BorderLayout.CENTER);
		
		//b2.add(cake);
		b.add(choco);
		b.add(car1);
		b.add(bc1);
		b.add(buter);
		b.add(car3);
		b.add(bc3);
		b.add(stra);
		b.add(car2);
		b.add(bc2);
		b.add(vanila);
		b.add(car5);
		b.add(bc5);
		b.add(lava);
		b.add(car4);
		b.add(bc4);
		
		c.add(bill);
		c.add(txt);
		c.add(gbill);
		
		gbill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==gbill) {
					
					int s1=Integer.parseInt(ac1.getText());
					int s2=Integer.parseInt(ac2.getText());
					int s3=Integer.parseInt(ac3.getText());
					int s4=Integer.parseInt(ac4.getText());
					int s5=Integer.parseInt(ac5.getText());
					int s6=Integer.parseInt(as1.getText());
					int s7=Integer.parseInt(as2.getText());
					int s8=Integer.parseInt(as3.getText());
					int s9=Integer.parseInt(as4.getText());
					int s10=Integer.parseInt(as5.getText());
					int s11=Integer.parseInt(bs5.getText());
					int s12=Integer.parseInt(bs2.getText());
					int s13=Integer.parseInt(bs3.getText());
					int s14=Integer.parseInt(bs1.getText());
					int s15=Integer.parseInt(bs4.getText());
					int s16=Integer.parseInt(bc1.getText());
					int s17=Integer.parseInt(bc3.getText());
					int s18=Integer.parseInt(bc2.getText());
					int s19=Integer.parseInt(bc5.getText());
					int s20=Integer.parseInt(bc4.getText());
					
					int p1=Integer.parseInt(chr1.getText().substring(3, 5));
					int p2=Integer.parseInt(chr2.getText().substring(3, 5));
					int p3=Integer.parseInt(chr3.getText().substring(3, 5));
					int p4=Integer.parseInt(chr4.getText().substring(3, 5));
					int p5=Integer.parseInt(chr5.getText().substring(3, 5));
					int p6=Integer.parseInt(snr1.getText().substring(3, 5));
					int p7=Integer.parseInt(snr2.getText().substring(3, 5));
					int p8=Integer.parseInt(snr3.getText().substring(3, 5));
					int p9=Integer.parseInt(snr4.getText().substring(3, 5));
					int p10=Integer.parseInt(snr5.getText().substring(3, 5));
					int p11=Integer.parseInt(swr5.getText().substring(3, 5));
					int p12=Integer.parseInt(swr2.getText().substring(3, 5));
					int p13=Integer.parseInt(swr3.getText().substring(3, 5));
					int p14=Integer.parseInt(swr1.getText().substring(3, 5));
					int p15=Integer.parseInt(swr4.getText().substring(3, 5));
					int p16=Integer.parseInt(car1.getText().substring(3, 5));
					int p17=Integer.parseInt(car3.getText().substring(3, 5));
					int p18=Integer.parseInt(car2.getText().substring(3, 5));
					int p19=Integer.parseInt(car5.getText().substring(3, 5));
					int p20=Integer.parseInt(car4.getText().substring(3, 5));
					
					int k=(s1*p1)+(s2*p2)+(s3*p3)+(s4*p4)+(s5*p5)+(s6*p6)+(s6*p6)+(s7*p7)+(s8*p8)+(s9*p9)+(s10*p10)+(s11*p11)+(s12*p12)+(s13*p13)+(s14*p14)+(s15*p15)+(s16*p16)+(s17*p17)+(s18*p18)+(s19*p19)+(s20*p20);
					txt.setText("Bill No: "+rand+"\nDate : "+fr.format(day)+"\nName : "+name+"\nPhone No. : "+ph+"\n=========Your Order=========\n"+"Items\t                    Amount\n\n");
					
					if(s1!=0) {
					txt.append("Pani Puri\t\t "+s1*p1+"\n");}
					if(s2!=0) {
					txt.append("Bhel Puri\t\t "+s2*p2+"\n");}
					if(s3!=0) {
					txt.append("Sev Puri\t\t "+s3*p3+"\n");}
					if(s4!=0) {
					txt.append("Masala Puri\t\t "+s4*p4+"\n");}
					if(s5!=0) {
					txt.append("Pav Baji\t\t "+s5*p5+"\n");}
					if(s6!=0) {
					txt.append("Veg Puff\t\t "+s6*p6+"\n");}
					if(s7!=0) {
					txt.append("Samosa\t\t "+s7*p7+"\n");}
					if(s8!=0) {
					txt.append("Kachori\t\t "+s8*p8+"\n");}
					if(s9!=0) {
					txt.append("Veg Roll\t\t "+s9*p9+"\n");}
					if(s10!=0) {
					txt.append("Cutlet\t\t "+s10*p10+"\n");}
					if(s11!=0) {
					txt.append("Chilli Cheese Sandwich\t "+s11*p11+"\n");}
					if(s12!=0) {
					txt.append("Veg Sandwich\t\t "+s12*p12+"\n");}
					if(s13!=0) {
					txt.append("Corn Sandwich\t\t "+s13*p13+"\n");}
					if(s14!=0) {
					txt.append("Paneer Sandwich\t "+s14*p14+"\n");}
					if(s15!=0) {
					txt.append("Mushroom Sandwich\t "+s15*p15+"\n");}
					if(s16!=0) {
					txt.append("Chocolate Cake\t "+s16*p16+"\n");}
					if(s17!=0) {
					txt.append("Butterscotch Cake\t "+s17*p17+"\n");}
					if(s18!=0) {
					txt.append("Strawberry Cake\t "+s18*p18+"\n");}
					if(s19!=0) {
					txt.append("Vanilla Cake\t\t "+s19*p19+"\n");}
					if(s20!=0) {
					txt.append("Choco lava\t\t "+s20*p20+"\n");}
					txt.append("\n\t             Total : "+k);
					}
					
			}
			});
		
		f.setVisible(true);
		f.setSize(1300,800);
		f.setTitle("Order");	
		f.setResizable(false);	
		f.setLayout(new FlowLayout());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setBackground(Color.black);
		f.getContentPane().add(a1);
		f.add(b1);
		f.add(c);
		
		
	}
}


