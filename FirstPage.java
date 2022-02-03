import java.awt.*;
import java.awt.event.*;
import javax.imageio.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import java.io.*;
public class FirstPage extends Frame implements ActionListener{
	public FirstPage(){
		
		this.setSize(new Dimension(700,700));
		this.setTitle("Snake Game");
		this.setVisible(true);
		this.setBackground(Color.ORANGE);
		this.setFocusable(true);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
		setLayout (new FlowLayout());
		Button b1 = new Button("Let's Start");
		
		add(b1);
		b1.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	    
	}
	
	public void actionPerformed(ActionEvent ae) {
		String str = ae.getActionCommand();
		if(str.contentEquals("Let's Start")) {
			new GameFrame();
		}
		//super.paintComponent(g);
		//paint(g);
	}
	
	public void paint(Graphics g) {
		g.drawString("Lets begin",800,1000);
	}
	
}
