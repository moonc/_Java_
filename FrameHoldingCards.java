import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class FrameHoldingCards extends JFrame {
	public static void main(String[] allen){
		FrameHoldingCards f = new FrameHoldingCards();
	}
	public FrameHoldingCards(){
		super("Frame_2");
		setSize(300,400);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocation(10,50);
		setResizable(false);
		Flanel z = new Flanel();
		setContentPane(z);
		setVisible(true);
		}
	}
	class Flanel extends JPanel implements ActionListener{
		private int slide =0;
		One a;
		public Flanel(){
			setLayout(new GridLayout(2,1));
			a = new One();
			JButton b = new JButton("Show Next Card ");
			b.addActionListener(this);
			add(b);
			add(a);
			slide=0;
		}
		public void paintComponent(Graphics g){
			if(slide==2){
				setBackground(Color.white);
			}
			if(slide==4){
				setBackground(Color.yellow);
			}
			if(slide==6){
				setBackground(Color.red);
			}
			super.paintComponent(g);
		}
		public void actionPerformed(ActionEvent e){
			slide+=2;
			a.c.next(a);
			repaint();
		}
	}
	class One extends JPanel{
		CardLayout c;
		Uno uno;
		Tres tres;
		Dos dos;
		
		One(){
			setLayout(c);
			uno = new Uno();
			dos = new Dos();
			tres = new Tres();
			add(uno,"Numero Uno");
			add(dos,"Numero Dos");
			add(tres,"Numero Tres");
		}
	}
	class Uno  extends JPanel{
		Uno(){
			slide=2;
			repaint();
		}
	}
	class Dos extends JPanel{
		Dos(){
			slide=4;
			repaint();
		}
		
	}
	class Tres extends JPanel{
		Tres(){
			slide=6;
			repaint();
		}
		
	}
	
	
	

