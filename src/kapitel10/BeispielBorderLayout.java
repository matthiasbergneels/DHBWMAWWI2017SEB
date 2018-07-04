package kapitel10;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BeispielBorderLayout {

	public static void main(String[] args) {
		JFrame fenster = new JFrame("BorderLayout Beispiel");
		
		fenster.setLayout(new BorderLayout());
		
		JButton nordButton = new JButton("Norden");
		JButton suedenButton = new JButton("Süden");
		JButton westenButton = new JButton("Westen");
		JButton ostenButton = new JButton("Osten");
		JButton mitteButton = new JButton("Mitte");
		
		JPanel nordPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		nordPanel.add(nordButton);
		
		fenster.add(nordPanel, BorderLayout.NORTH);
		fenster.add(suedenButton, BorderLayout.SOUTH);
		fenster.add(westenButton, BorderLayout.WEST);
		fenster.add(ostenButton, BorderLayout.EAST);
		fenster.add(mitteButton, BorderLayout.CENTER);
		
		
		fenster.pack();
		fenster.setVisible(true);
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
