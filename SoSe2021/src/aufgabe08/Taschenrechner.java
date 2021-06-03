package aufgabe08;

import java.awt.*;
import javax.swing.*;

public class Taschenrechner extends JFrame{
	
	public Taschenrechner() {
		
		super();
		this.setTitle("Taschenrechner");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel content = this.myPanel();
		this.getContentPane().add(content);
		
		this.setSize(300, 400);
		this.setLocation(200, 300);
		this.setVisible(true);	
	}
	private JPanel myPanel() {
		
		JPanel hauptPanel = new JPanel();
		hauptPanel.setLayout(new BorderLayout());
		
		JPanel panelButton = new JPanel();
		panelButton.setLayout(new GridLayout(6,3));
		
		JTextField textPanel = new JTextField();
		textPanel.setLayout(new BorderLayout());
		
		//panelButton.add(textPanel, BorderLayout.NORTH);
		
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");
		JButton b10 = new JButton("(");
		JButton b0 = new JButton("0");
		JButton b11 = new JButton("(");
		JButton b12 = new JButton("*");
		JButton b13 = new JButton("/");
		JButton b14 = new JButton("+");
		JButton b15 = new JButton("-");
		JButton b16 = new JButton(".");
		JButton b17 = new JButton("=");
		
		panelButton.add(b1);
		panelButton.add(b2);
		panelButton.add(b3);
		panelButton.add(b4);
		panelButton.add(b5);
		panelButton.add(b6);
		panelButton.add(b7);
		panelButton.add(b8);
		panelButton.add(b9);
		panelButton.add(b10);
		panelButton.add(b0);
		panelButton.add(b11);
		panelButton.add(b12);
		panelButton.add(b13);
		panelButton.add(b14);
		panelButton.add(b15);
		panelButton.add(b16);
		panelButton.add(b17);
		
		hauptPanel.add(textPanel, BorderLayout.NORTH);
		hauptPanel.add(panelButton, BorderLayout.CENTER);
				
		return hauptPanel;
		
	}
	
	public static void main(String[] args) {
		
		new Taschenrechner();
	}

}
