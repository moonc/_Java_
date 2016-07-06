import javax.swing.*;
import javax.swing.event.*;//import libraries
import java.awt.*;
public class LSD extends JPanel implements ChangeListener{
	private int slide=0;
	private JSlider s;
	public LSD(){
		s = new JSlider(JSlider.HORIZONTAL,slide,10,0 );//construct slider
		s.addChangeListener(this);//add a listener to slider
		add(s);//add slider to panel
		slide=0;
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		
		
		
		
	}
	public void stateChanged(ChangeEvent e){//event handler for button(actionPerformed)
	repaint();
	}
}
