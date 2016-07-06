import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
public class TrippyColors extends JFrame {
	public static void main(String[] allen){
		TrippyColors f = new TrippyColors();
	}
	public TrippyColors(){
		super("Woah man...Trippy...");
		setSize(300,400);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocation(10,50);
		setResizable(true);
		Tlanel z = new Tlanel();
		setContentPane(z);
		setVisible(true);
		}
	}
	class Tlanel extends JPanel implements  ChangeListener{
		private int slide=0;
		private int x=0;
		private int y=0;
		private JSlider s;
		public Tlanel(){
			s = new JSlider(JSlider.HORIZONTAL,slide,10,0 );
			s.addChangeListener(this);
			add(s);
			slide=0;
		}
		public void paintComponent(Graphics g){
			slide=s.getValue();
			for(int z =0;z<=256;z++){
				Color rainbow = new Color(x,y,z);
				setBackground(rainbow);
				super.paintComponent(g);
				x++;
				y++;
			}
		}
		public  void stateChanged(ChangeEvent e){
			repaint();
		}
	}