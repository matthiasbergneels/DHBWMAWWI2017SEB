package kapitel10;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BeispielGridLayout {

	public static void main(String[] args) {
		JFrame fenster = new JFrame("GridLayout Beispiel");
		
		fenster.setLayout(new GridLayout(0, 3));
		
		JButton nordButton = new JButton("Feld 1");
		JButton suedenButton = new JButton("Feld 2");
		JButton westenButton = new JButton("Feld 3");
		JButton ostenButton = new JButton("Feld 4");
		JButton mitteButton = new JButton("Feld 5");
		JButton button6 = new JButton("Feld 6");
		JButton button7 = new JButton("Feld 7");
	
		JPanel nordPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		nordPanel.add(nordButton);
		
		fenster.add(nordPanel);
		fenster.add(suedenButton);
		fenster.add(westenButton);
		fenster.add(ostenButton);
		fenster.add(mitteButton);
		fenster.add(button6);
		fenster.add(button7);
		
		
		fenster.pack();
		fenster.setVisible(true);
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
