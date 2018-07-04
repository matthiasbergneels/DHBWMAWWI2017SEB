package kapitel10;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MeinInteraktivesUI extends JFrame {
	
	private final String ACTION_FEIERABEND = "ACTION_FEIERABEND";
	private final String ACTION_SCHLIESSEN = "ACTION_SCHLIESSEN"; 
	
	private JComboBox<String> zeitAuswahl;

	public MeinInteraktivesUI(String titel){
		super(titel);
		
		String[] zeitWerte = {"Jetzt", "Sofort", "Auf der Stelle"};
		zeitAuswahl = new JComboBox<String>(zeitWerte);
		
		zeitAuswahl.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED){
					System.out.println("Zeit geändert! " + e.getStateChange());
					System.out.println("Wann machen wir Feierabend? " + ((JComboBox)e.getSource()).getSelectedItem());
				}
				
				
			}
		});
		
		JButton feierabend = new JButton("Feierabend");
		feierabend.setActionCommand(ACTION_FEIERABEND);
		JButton schliessen = new JButton("Schliessen");
		schliessen.setActionCommand(ACTION_SCHLIESSEN);
		
		ActionListener schaltFlaechenListener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals(ACTION_FEIERABEND)){
					System.out.println("Wann wollen wir Feierabend? " + zeitAuswahl.getSelectedItem());
				}else if(e.getActionCommand().equals(ACTION_SCHLIESSEN)){
					System.exit(0);
				}
				
			}
		};
		
		feierabend.addActionListener(schaltFlaechenListener);
		schliessen.addActionListener(schaltFlaechenListener);
		
		this.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		this.add(zeitAuswahl);
		this.add(feierabend);	
		this.add(schliessen);
			
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		new MeinInteraktivesUI("Interaktiv");

	}

}
