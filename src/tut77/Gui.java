package tut77;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Gui extends JFrame{
	
	private JPanel mousepanel;
	private JLabel statusbar;
	
	public Gui(){
		
		super("title");
		
		mousepanel = new JPanel();
		mousepanel.setBackground(Color.WHITE);
		add(mousepanel, BorderLayout.CENTER);
		
		statusbar = new JLabel("default");
		add(statusbar, BorderLayout.SOUTH);
		
		Handlerclass handler = new Handlerclass();
		mousepanel.addMouseListener(handler);
		mousepanel.addMouseMotionListener(handler);
		
	}
	
	private class Handlerclass implements MouseListener, MouseMotionListener{
		
		//mouse motion events
		public void mouseDragged(MouseEvent event) {
			
			statusbar.setText(String.format("Position: %d,%d", event.getX(), event.getY()));
			
		}

		public void mouseMoved(MouseEvent event) {

			statusbar.setText(String.format("Position: %d,%d", event.getX(), event.getY()));
			
		}

		//mouse events
		public void mouseClicked(MouseEvent event) {
			
			
			
		}

		public void mouseEntered(MouseEvent event) {
			
			
			
		}

		public void mouseExited(MouseEvent event) {
			
			
			
		}

		public void mousePressed(MouseEvent event) {

			
			
		}

		public void mouseReleased(MouseEvent event) {
			
			
			
		}
		
		
		
	}

}
