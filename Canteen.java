import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Canteen implements ActionListener
{
	JFrame f;
	JButton b1,b2,b3,b4,b5,b6,b7,b8;
	ImageIcon i,i1,i2,i3,i4,i5,i6,i7,i8;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
	int a;
	Canteen(int x)
	{
		a=x;
		f=new JFrame("Canteen");
		i=new ImageIcon("a.jpg");
		l9=new JLabel(i);
		l1=new JLabel("   BreakFast");
		l2=new JLabel("   Veg");
		l3=new JLabel("   Non-Veg");
		l4=new JLabel("   FastFood");
		l5=new JLabel("   JunkFood");
		l6=new JLabel("   Soups");
		l7=new JLabel("   Ice-Creams");
		l8=new JLabel("   SoftDrinks");
		i1=new ImageIcon("bf.jpg");
		b1=new JButton(i1);
		i2=new ImageIcon("veg.jpg");
		b2=new JButton(i2);
		i3=new ImageIcon("nonveg.jpg");
		b3=new JButton(i3);
		i4=new ImageIcon("ff.jpg");
		b4=new JButton(i4);
		i5=new ImageIcon("jf.jpg");
		b5=new JButton(i5);
		i6=new ImageIcon("soup.jpg");
		b6=new JButton(i6);
		i7=new ImageIcon("ic.jpg");
		b7=new JButton(i7);
		i8=new ImageIcon("sf.jpg");
		b8=new JButton(i8);
		f.setLayout(null);
		f.setSize(1980,1080);
		f.add(b1);
		b1.setBounds(50,50,100,100);
		f.add(b2);
		b2.setBounds(150,150,100,100);
		f.add(b3);
		b3.setBounds(250,250,100,100);
		f.add(b4);
		b4.setBounds(350,350,100,100);
		f.add(b5);
		b5.setBounds(450,450,100,100);
		f.add(b6);
		b6.setBounds(550,550,100,100);
		f.add(b7);
		b7.setBounds(650,650,100,100);
		f.add(b8);
		b8.setBounds(750,750,100,100);
		f.add(l9);
		f.add(l1);
		l1.setBounds(150,50,100,100);
		f.add(l2);
		l2.setBounds(250,150,100,100);
		f.add(l3);
		l3.setBounds(350,250,100,100);
		f.add(l4);
		l4.setBounds(450,350,100,100);
		f.add(l5);
		l5.setBounds(550,450,100,100);
		f.add(l6);
		l6.setBounds(650,550,100,100);
		f.add(l7);
		l7.setBounds(750,650,100,100);
		f.add(l8);
		l8.setBounds(850,750,100,100);
		f.add(l9);
		l9.setBounds(850,250,450,350);
		f.setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);		
	}
	public void actionPerformed(ActionEvent ae)
	{
		try
		{
			if(ae.getSource().equals(b1))
			{
				new Breakfast(a,f);
			}
			else if(ae.getSource().equals(b2))
			{
				new Veg(a,f);
			}
			else if(ae.getSource().equals(b3))
			{
				new Nonveg(a,f);
			}
			else if(ae.getSource().equals(b4))
			{
				new Fastfood(a,f);
			}
			else if(ae.getSource().equals(b5))
			{
				new Junkfood(a,f);
			}
			else if(ae.getSource().equals(b6))
			{
				new Soups(a,f);
			}
			else if(ae.getSource().equals(b7))
			{
				new Icecreams(a,f);
			}
			else
				new Softdrinks(a,f);
		}
		catch(Exception o)
		{
			JOptionPane.showMessageDialog(null,"Exception raised is"+o);
		}
	}
	public static void main(String args[])
	{
		int x=0;
		new Canteen(x);
	}
}
class Breakfast implements ActionListener
{
	JFrame f2,f1;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	ImageIcon i1,i2,i3,i4;
	JTextField t1,t2,t3,t4,t5;
	JButton b1,b2;
	int b;
	Breakfast(int a,JFrame f)
	{
		f1=f;
		b=a;
		f.setVisible(false);
		f2=new JFrame("Breakfast");
		i1=new ImageIcon("dosa.jpg");
		l1=new JLabel(i1);
		i2=new ImageIcon("idli.jpg");
		l2=new JLabel(i2);
		i3=new ImageIcon("puri.jpg");
		l3=new JLabel(i3);
		i4=new ImageIcon("pongal.jpg");
		l4=new JLabel(i4);
		l5=new JLabel("25Rs");
		l6=new JLabel("10Rs");
		l7=new JLabel("20Rs");
		l8=new JLabel("15Rs");
		t1=new JTextField("0",10);
		t2=new JTextField("0",10);
		t3=new JTextField("0",10);
		t4=new JTextField("0",10);
		t5=new JTextField("0",10);
		b1=new JButton("Bill");
		b2=new JButton("Choose next item");
		f2.setLayout(null);
		f2.setSize(1920,1080);
		f2.add(l1);
		f2.add(t1);
		f2.add(l5);
		f2.add(l2);
		f2.add(t2);
		f2.add(l6);
		f2.add(l3);
		f2.add(t3);
		f2.add(l7);
		f2.add(l4);
		f2.add(t4);
		f2.add(l8);
		f2.add(b1);
		f2.add(b2);
		l1.setBounds(200,100,100,100);
		l2.setBounds(200,250,100,100);
		l3.setBounds(200,400,100,100);
		l4.setBounds(200,550,100,100);
		l5.setBounds(350,100,100,100);
		l6.setBounds(350,250,100,100);
		l7.setBounds(350,400,100,100);
		l8.setBounds(350,550,100,100);
		t1.setBounds(400,140,100,25);
		t2.setBounds(400,290,100,25);
		t3.setBounds(400,440,100,25);
		t4.setBounds(400,590,100,25);
		b1.setBounds(200,750,100,25);
		b2.setBounds(400,750,150,25);
		f2.setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int a1=Integer.parseInt(t1.getText());
		int a2=Integer.parseInt(t2.getText());
		int a3=Integer.parseInt(t3.getText());
		int a4=Integer.parseInt(t4.getText());
		b=b+(a1*25)+(a2*10)+(a3*20)+(a4*15);
		if(ae.getSource().equals(b1))
		{
			f2.setVisible(false);
			new Bill(b);	
		}
		else
		{
			f2.setVisible(false);
			new Canteen(b);
		}
	}	
} 
class Veg implements ActionListener
{
	JFrame f2,f1;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	ImageIcon i1,i2,i3,i4;
	JTextField t1,t2,t3,t4,t5;
	JButton b1,b2;
	int c;
	Veg(int b,JFrame f)
	{
		f1=f;
		c=b;
		f.setVisible(false);
		f2=new JFrame("Vegeterian");
		i1=new ImageIcon("vb.jpg");
		l1=new JLabel(i1);
		i2=new ImageIcon("chapati.jpg");
		l2=new JLabel(i2);
		i3=new ImageIcon("parota.jpg");
		l3=new JLabel(i3);
		i4=new ImageIcon("mr.jpg");
		l4=new JLabel(i4);
		l5=new JLabel("50Rs");
		l6=new JLabel("30Rs");
		l7=new JLabel("35Rs");
		l8=new JLabel("60Rs");
		t1=new JTextField("0",10);
		t2=new JTextField("0",10);
		t3=new JTextField("0",10);
		t4=new JTextField("0",10);
		t5=new JTextField("0",10);
		b1=new JButton("Bill");
		b2=new JButton("Choose next item");
		f2.setLayout(null);
		f2.setSize(1920,1080);
		f2.add(l1);
		f2.add(t1);
		f2.add(l5);
		f2.add(l2);
		f2.add(t2);
		f2.add(l6);
		f2.add(l3);
		f2.add(t3);
		f2.add(l7);
		f2.add(l4);
		f2.add(t4);
		f2.add(l8);
		f2.add(b1);
		f2.add(b2);
		l1.setBounds(200,100,100,100);
		l2.setBounds(200,250,100,100);
		l3.setBounds(200,400,100,100);
		l4.setBounds(200,550,100,100);
		l5.setBounds(350,100,100,100);
		l6.setBounds(350,250,100,100);
		l7.setBounds(350,400,100,100);
		l8.setBounds(350,550,100,100);
		t1.setBounds(400,140,100,25);
		t2.setBounds(400,290,100,25);
		t3.setBounds(400,440,100,25);
		t4.setBounds(400,590,100,25);
		b1.setBounds(200,750,100,25);
		b2.setBounds(400,750,150,25);
		f2.setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		
		int a1=Integer.parseInt(t1.getText());
		int a2=Integer.parseInt(t2.getText());
		int a3=Integer.parseInt(t3.getText());
		int a4=Integer.parseInt(t4.getText());
		c=c+(a1*50)+(a2*30)+(a3*35)+(a4*60);
		if(ae.getSource().equals(b1))
		{
			f2.setVisible(false);
			new Bill(c);	
		}
		else
		{
			f2.setVisible(false);
			new Canteen(c);
		}
	}	
}
class Nonveg implements ActionListener
{
	JFrame f2,f1;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	ImageIcon i1,i2,i3,i4;
	JTextField t1,t2,t3,t4,t5;
	JButton b1,b2;
	int d;
	Nonveg(int c,JFrame f)
	{
		f1=f;
		f.setVisible(false);
		d=c;
		f2=new JFrame("NonVeg");
		i1=new ImageIcon("cb.jpg");
		l1=new JLabel(i1);
		i2=new ImageIcon("mb.jpg");
		l2=new JLabel(i2);
		i3=new ImageIcon("fb.jpg");
		l3=new JLabel(i3);
		i4=new ImageIcon("65.jpg");
		l4=new JLabel(i4);
		l5=new JLabel("180Rs");
		l6=new JLabel("250Rs");
		l7=new JLabel("200s");
		l8=new JLabel("240Rs");
		t1=new JTextField("0",10);
		t2=new JTextField("0",10);
		t3=new JTextField("0",10);
		t4=new JTextField("0",10);
		t5=new JTextField("0",10);
		b1=new JButton("Bill");
		b2=new JButton("Choose next item");
		f2.setLayout(null);
		f2.setSize(1920,1080);
		f2.add(l1);
		f2.add(t1);
		f2.add(l5);
		f2.add(l2);
		f2.add(t2);
		f2.add(l6);
		f2.add(l3);
		f2.add(t3);
		f2.add(l7);
		f2.add(l4);
		f2.add(t4);
		f2.add(l8);
		f2.add(b1);
		f2.add(b2);
		l1.setBounds(200,100,100,100);
		l2.setBounds(200,250,100,100);
		l3.setBounds(200,400,100,100);
		l4.setBounds(200,550,100,100);
		l5.setBounds(350,100,100,100);
		l6.setBounds(350,250,100,100);
		l7.setBounds(350,400,100,100);
		l8.setBounds(350,550,100,100);
		t1.setBounds(400,140,100,25);
		t2.setBounds(400,290,100,25);
		t3.setBounds(400,440,100,25);
		t4.setBounds(400,590,100,25);
		b1.setBounds(200,750,100,25);
		b2.setBounds(400,750,150,25);
		f2.setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int a1=Integer.parseInt(t1.getText());
		int a2=Integer.parseInt(t2.getText());
		int a3=Integer.parseInt(t3.getText());
		int a4=Integer.parseInt(t4.getText());
		d=d+(a1*180)+(a2*250)+(a3*200)+(a4*240);
		if(ae.getSource().equals(b1))
		{
			f2.setVisible(false);
			new Bill(d);	
		}
		else
		{
			f2.setVisible(false);
			new Canteen(d);
		}
	}	
}
class Fastfood implements ActionListener
{
	JFrame f2,f1;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	ImageIcon i1,i2,i3,i4;
	JTextField t1,t2,t3,t4,t5;
	JButton b1,b2;
	int e;
	Fastfood(int d,JFrame f)
	{
		f1=f;
		f.setVisible(false);
		e=d;
		f2=new JFrame("Fastfood");
		i1=new ImageIcon("gr.jpg");
		l1=new JLabel(i1);
		i2=new ImageIcon("g.jpg");
		l2=new JLabel(i2);
		i3=new ImageIcon("er.jpg");
		l3=new JLabel(i3);
		i4=new ImageIcon("gn.jpg");
		l4=new JLabel(i4);
		l5=new JLabel("50Rs");
		l6=new JLabel("60s");
		l7=new JLabel("70Rs");
		l8=new JLabel("80Rs");
		t1=new JTextField("0",10);
		t2=new JTextField("0",10);
		t3=new JTextField("0",10);
		t4=new JTextField("0",10);
		t5=new JTextField("0",10);
		b1=new JButton("Bill");
		b2=new JButton("Choose next item");
		f2.setLayout(null);
		f2.setSize(1920,1080);
		f2.add(l1);
		f2.add(t1);
		f2.add(l5);
		f2.add(l2);
		f2.add(t2);
		f2.add(l6);
		f2.add(l3);
		f2.add(t3);
		f2.add(l7);
		f2.add(l4);
		f2.add(t4);
		f2.add(l8);
		f2.add(b1);
		f2.add(b2);
		l1.setBounds(200,100,100,100);
		l2.setBounds(200,250,100,100);
		l3.setBounds(200,400,100,100);
		l4.setBounds(200,550,100,100);
		l5.setBounds(350,100,100,100);
		l6.setBounds(350,250,100,100);
		l7.setBounds(350,400,100,100);
		l8.setBounds(350,550,100,100);
		t1.setBounds(400,140,100,25);
		t2.setBounds(400,290,100,25);
		t3.setBounds(400,440,100,25);
		t4.setBounds(400,590,100,25);
		b1.setBounds(200,750,100,25);
		b2.setBounds(400,750,150,25);
		f2.setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int a1=Integer.parseInt(t1.getText());
		int a2=Integer.parseInt(t2.getText());
		int a3=Integer.parseInt(t3.getText());
		int a4=Integer.parseInt(t4.getText());
		e=e+(a1*50)+(a2*60)+(a3*70)+(a4*80);
		if(ae.getSource().equals(b1))
		{
			f2.setVisible(false);
			new Bill(e);	
		}
		else
		{
			f2.setVisible(false);
			new Canteen(e);
		}
	}	
}
class Junkfood implements ActionListener
{
	JFrame f2,f1;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	ImageIcon i1,i2,i3,i4;
	JTextField t1,t2,t3,t4,t5;
	JButton b1,b2;
	int g;
	Junkfood(int e,JFrame f)
	{
		f1=f;
		f.setVisible(false);
		g=e;
		f2=new JFrame("Junkfood");
		i1=new ImageIcon("pizza.jpg");
		l1=new JLabel(i1);
		i2=new ImageIcon("burger.jpg");
		l2=new JLabel(i2);
		i3=new ImageIcon("frnfri.jpg");
		l3=new JLabel(i3);
		i4=new ImageIcon("kfc.jpg");
		l4=new JLabel(i4);
		l5=new JLabel("150Rs");
		l6=new JLabel("200s");
		l7=new JLabel("120s");
		l8=new JLabel("480Rs");
		t1=new JTextField("0",10);
		t2=new JTextField("0",10);
		t3=new JTextField("0",10);
		t4=new JTextField("0",10);
		t5=new JTextField("0",10);
		b1=new JButton("Bill");
		b2=new JButton("Choose next item");
		f2.setLayout(null);
		f2.setSize(1920,1080);
		f2.add(l1);
		f2.add(t1);
		f2.add(l5);
		f2.add(l2);
		f2.add(t2);
		f2.add(l6);
		f2.add(l3);
		f2.add(t3);
		f2.add(l7);
		f2.add(l4);
		f2.add(t4);
		f2.add(l8);
		f2.add(b1);
		f2.add(b2);
		l1.setBounds(200,100,100,100);
		l2.setBounds(200,250,100,100);
		l3.setBounds(200,400,100,100);
		l4.setBounds(200,550,100,100);
		l5.setBounds(350,100,100,100);
		l6.setBounds(350,250,100,100);
		l7.setBounds(350,400,100,100);
		l8.setBounds(350,550,100,100);
		t1.setBounds(400,140,100,25);
		t2.setBounds(400,290,100,25);
		t3.setBounds(400,440,100,25);
		t4.setBounds(400,590,100,25);
		b1.setBounds(200,750,100,25);
		b2.setBounds(400,750,150,25);
		f2.setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int a1=Integer.parseInt(t1.getText());
		int a2=Integer.parseInt(t2.getText());
		int a3=Integer.parseInt(t3.getText());
		int a4=Integer.parseInt(t4.getText());
		g=g+(a1*150)+(a2*200)+(a3*120)+(a4*480);
		if(ae.getSource().equals(b1))
		{
			f2.setVisible(false);
			new Bill(g);	
		}
		else
		{
			f2.setVisible(false);
			new Canteen(g);
		}
	}	
}
class Soups implements ActionListener
{
	JFrame f2,f1;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	ImageIcon i1,i2,i3,i4;
	JTextField t1,t2,t3,t4,t5;
	JButton b1,b2;
	int h;
	Soups(int g,JFrame f)
	{
		f1=f;
		f.setVisible(false);
		h=g;
		f2=new JFrame("Soups");
		i1=new ImageIcon("cs.jpg");
		l1=new JLabel(i1);
		i2=new ImageIcon("cdb.jpg");
		l2=new JLabel(i2);
		i3=new ImageIcon("crc.jpg");
		l3=new JLabel(i3);
		i4=new ImageIcon("crt.jpg");
		l4=new JLabel(i4);
		l5=new JLabel("150Rs");
		l6=new JLabel("250Rs");
		l7=new JLabel("250Rs");
		l8=new JLabel("170Rs");
		t1=new JTextField("0",10);
		t2=new JTextField("0",10);
		t3=new JTextField("0",10);
		t4=new JTextField("0",10);
		t5=new JTextField("0",10);
		b1=new JButton("Bill");
		b2=new JButton("Choose next item");
		f2.setLayout(null);
		f2.setSize(1920,1080);
		f2.add(l1);
		f2.add(t1);
		f2.add(l5);
		f2.add(l2);
		f2.add(t2);
		f2.add(l6);
		f2.add(l3);
		f2.add(t3);
		f2.add(l7);
		f2.add(l4);
		f2.add(t4);
		f2.add(l8);
		f2.add(b1);
		f2.add(b2);
		l1.setBounds(200,100,100,100);
		l2.setBounds(200,250,100,100);
		l3.setBounds(200,400,100,100);
		l4.setBounds(200,550,100,100);
		l5.setBounds(350,100,100,100);
		l6.setBounds(350,250,100,100);
		l7.setBounds(350,400,100,100);
		l8.setBounds(350,550,100,100);
		t1.setBounds(400,140,100,25);
		t2.setBounds(400,290,100,25);
		t3.setBounds(400,440,100,25);
		t4.setBounds(400,590,100,25);
		b1.setBounds(200,750,100,25);
		b2.setBounds(400,750,150,25);
		f2.setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int a1=Integer.parseInt(t1.getText());
		int a2=Integer.parseInt(t2.getText());
		int a3=Integer.parseInt(t3.getText());
		int a4=Integer.parseInt(t4.getText());
		h=h+(a1*150)+(a2*250)+(a3*250)+(a4*170);
		if(ae.getSource().equals(b1))
		{
			f2.setVisible(false);
			new Bill(h);	
		}
		else
		{
			f2.setVisible(false);
			new Canteen(h);
		}
	}	
}
class Icecreams implements ActionListener
{
	JFrame f2,f1;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	ImageIcon i1,i2,i3,i4;
	JTextField t1,t2,t3,t4,t5;
	JButton b1,b2;
	int i;
	Icecreams(int h,JFrame f)
	{
		f1=f;
		f.setVisible(false);
		i=h;
		f2=new JFrame("Icecreams");
		i1=new ImageIcon("sb.jpg");
		l1=new JLabel(i1);
		i2=new ImageIcon("vennela.jpg");
		l2=new JLabel(i2);
		i3=new ImageIcon("bs.jpg");
		l3=new JLabel(i3);
		i4=new ImageIcon("choco.jpg");
		l4=new JLabel(i4);
		l5=new JLabel("120Rs");
		l6=new JLabel("180s");
		l7=new JLabel("150Rs");
		l8=new JLabel("170Rs");
		t1=new JTextField("0",10);
		t2=new JTextField("0",10);
		t3=new JTextField("0",10);
		t4=new JTextField("0",10);
		t5=new JTextField("0",10);
		b1=new JButton("Bill");
		b2=new JButton("Choose next item");
		f2.setLayout(null);
		f2.setSize(1920,1080);
		f2.add(l1);
		f2.add(t1);
		f2.add(l5);
		f2.add(l2);
		f2.add(t2);
		f2.add(l6);
		f2.add(l3);
		f2.add(t3);
		f2.add(l7);
		f2.add(l4);
		f2.add(t4);
		f2.add(l8);
		f2.add(b1);
		f2.add(b2);
		l1.setBounds(200,100,100,100);
		l2.setBounds(200,250,100,100);
		l3.setBounds(200,400,100,100);
		l4.setBounds(200,550,100,100);
		l5.setBounds(350,100,100,100);
		l6.setBounds(350,250,100,100);
		l7.setBounds(350,400,100,100);
		l8.setBounds(350,550,100,100);
		t1.setBounds(400,140,100,25);
		t2.setBounds(400,290,100,25);
		t3.setBounds(400,440,100,25);
		t4.setBounds(400,590,100,25);
		b1.setBounds(200,750,100,25);
		b2.setBounds(400,750,150,25);
		f2.setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int a1=Integer.parseInt(t1.getText());
		int a2=Integer.parseInt(t2.getText());
		int a3=Integer.parseInt(t3.getText());
		int a4=Integer.parseInt(t4.getText());
		i=i+(a1*120)+(a2*180)+(a3*150)+(a4*170);
		if(ae.getSource().equals(b1))
		{
			f2.setVisible(false);
			new Bill(i);	
		}
		else
		{
			f2.setVisible(false);
			new Canteen(i);
		}
	}	
}
class Softdrinks implements ActionListener
{
	JFrame f2,f1;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	ImageIcon i1,i2,i3,i4;
	JTextField t1,t2,t3,t4,t5;
	JButton b1,b2;
	int j;
	Softdrinks(int i,JFrame f)
	{
		f1=f;
		f.setVisible(false);
		j=i;
		f2=new JFrame("Softdrinks");
		i1=new ImageIcon("tu.jpg");
		l1=new JLabel(i1);
		i2=new ImageIcon("sprite.jpg");
		l2=new JLabel(i2);
		i3=new ImageIcon("fanta.jpg");
		l3=new JLabel(i3);
		i4=new ImageIcon("pepsi.jpg");
		l4=new JLabel(i4);
		l5=new JLabel("40Rs");
		l6=new JLabel("40s");
		l7=new JLabel("40Rs");
		l8=new JLabel("40Rs");
		t1=new JTextField("0",10);
		t2=new JTextField("0",10);
		t3=new JTextField("0",10);
		t4=new JTextField("0",10);
		t5=new JTextField("0",10);
		b1=new JButton("Bill");
		b2=new JButton("Choose next item");
		f2.setLayout(null);
		f2.setSize(1920,1080);
		f2.add(l1);
		f2.add(t1);
		f2.add(l5);
		f2.add(l2);
		f2.add(t2);
		f2.add(l6);
		f2.add(l3);
		f2.add(t3);
		f2.add(l7);
		f2.add(l4);
		f2.add(t4);
		f2.add(l8);
		f2.add(b1);
		f2.add(b2);
		l1.setBounds(200,100,100,100);
		l2.setBounds(200,250,100,100);
		l3.setBounds(200,400,100,100);
		l4.setBounds(200,550,100,100);
		l5.setBounds(350,100,100,100);
		l6.setBounds(350,250,100,100);
		l7.setBounds(350,400,100,100);
		l8.setBounds(350,550,100,100);
		t1.setBounds(400,140,100,25);
		t2.setBounds(400,290,100,25);
		t3.setBounds(400,440,100,25);
		t4.setBounds(400,590,100,25);
		b1.setBounds(200,750,100,25);
		b2.setBounds(400,750,150,25);
		f2.setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int a1=Integer.parseInt(t1.getText());
		int a2=Integer.parseInt(t2.getText());
		int a3=Integer.parseInt(t3.getText());
		int a4=Integer.parseInt(t4.getText());
		j=j+(a1*40)+(a2*40)+(a3*40)+(a4*40);
		if(ae.getSource().equals(b1))
		{
			f2.setVisible(false);
			new Bill(j);	
		}
		else
		{
			f2.setVisible(false);
			new Canteen(j);
		}
	}	
}		 		 		 		 		 		
class Bill implements ActionListener
{
	JFrame f;
	JLabel l;
	JButton b1,b2;
	int bill;
	String s="";
	Bill(int j)
	{
		bill=j;
		s=s+String.valueOf(bill); 
		f=new JFrame("Total Bill"); 
		l=new JLabel("Bill is "+s);
		b1=new JButton("Payment");
		b2=new JButton("Exit");
		f.setLayout(null);
		f.setSize(400,400);
		f.add(l);
		l.setBounds(200,50,100,25);
		f.add(b1);
		b1.setBounds(150,100,100,25);
		f.add(b2);
		b2.setBounds(150,150,100,25);
		f.setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource().equals(b1))
		{
			new Payment(s);		
		}
		else
		f.setVisible(false);
	}	
}
class Payment implements ActionListener
{
	JFrame f;
	JRadioButton b1,b2,b3,b4;
	ImageIcon i1,i2,i3,i4;
	String s1;
	Payment(String s)
	{
		s1=s;
		f=new JFrame("Payment");
		i1=new ImageIcon("pp.jpg");
		b1=new JRadioButton(i1);
		i2=new ImageIcon("gp.jpg");
		b2=new JRadioButton(i2);
		i3=new ImageIcon("ptm.jpg");
		b3=new JRadioButton(i3);
		i4=new ImageIcon("cr.jpg");
		b4=new JRadioButton(i4);
		f.setLayout(null);
		f.setSize(400,800);
		ButtonGroup d=new ButtonGroup();
		d.add(b1);
		d.add(b2);
		d.add(b3);
		d.add(b4);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		b1.setBounds(150,50,100,100);
		b2.setBounds(150,200,100,100);
		b3.setBounds(150,350,100,100);
		b4.setBounds(150,500,100,100);
		f.setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(b1.isSelected())
		{
			JOptionPane.showMessageDialog(null,"Payment "+s1+" is successfull using your PhonePe , THANKS FOR VISITING");
		}
		else if(b2.isSelected())
		{
			JOptionPane.showMessageDialog(null,"Payment "+s1+" is successfull using your GooglePe , THANKS FOR VISITING");
		}
		else if(b3.isSelected())
		{
			JOptionPane.showMessageDialog(null,"Payment "+s1+" is successfull using your Paytm , THANKS FOR VISITING");
		}
		else
			JOptionPane.showMessageDialog(null,"Payment "+s1+" is successfull using your Credit Card , THANKS FOR VISITING");
	}
}