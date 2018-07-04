package kapitel10;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MeinErstesUI {

	public static void main(String[] args) {
		
		JFrame fenster = new JFrame("Mein erstes UI");
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//fenster.setSize(100, 50);
		fenster.setLocation(100, 100);
		
		JButton einButton = new JButton("Feierabend!");
		JLabel einText = new JLabel("Was wollen wir?");
		
		fenster.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		//fenster.add(einText);
		fenster.add(einButton);
		
		fenster.pack();
		fenster.setVisible(true);

	}

}
