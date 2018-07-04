package kapitel10;

import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.ParseException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.JFrame;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.text.MaskFormatter;

public class LogonVariante2 extends JFrame{
	
	
	private JComboBox<String> myComboBox;
	
	public LogonVariante2(){
		
		this.setTitle("Logon");
		
		String[] valueHelp = {"FTP", "Telnet", "SMTP", "HTTP"};
		myComboBox = new JComboBox<String>(valueHelp);
		
		// initialize Panels
		JPanel mainPanel = new JPanel(new BorderLayout());
		
		JPanel southPanel = new JPanel(new FlowLayout());
		
		FlowLayout centerPanelLayout = new FlowLayout();
		centerPanelLayout.setHgap(10);
		centerPanelLayout.setVgap(20);
		
		JPanel centerPanel = new JPanel(centerPanelLayout);
		
		GridLayout entryMaskLayout = new GridLayout(0,2);
		entryMaskLayout.setVgap(5);
		
		JPanel connectionPanel = new JPanel(entryMaskLayout);
		JPanel filePanel = new JPanel(entryMaskLayout);

		
		JFormattedTextField portField = null;
		try {
			 portField = new JFormattedTextField(new MaskFormatter("#####"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//create & assign elements for connection area
		JComponent[][] connectionElementLines = {
				{new JLabel("User:"), new JTextField(5)},
				{new JLabel("Passwort:"), new JPasswordField(7)},
				{new JLabel("Art:"), myComboBox},
				{new JLabel("Host:"), new JTextField(7)},
				{new JLabel("Port:"), portField}
		};
		
		addElementsToGridPanel(connectionPanel, connectionElementLines);
		
		
		// create & add Fields for File Area
		JComponent[][] fileElementLines = {
				{new JLabel("Quelle:"), new JTextField(10)},
				{new JLabel("Ziel:"), new JTextField(7)}
		};
		
		addElementsToGridPanel(filePanel, fileElementLines);
		
		// create & assign Buttons
		JButton okButton = new JButton("OK");		
		JButton cancelButton = new JButton("Cancel");
		
		
		southPanel.add(okButton);
		southPanel.add(cancelButton);
		

		// create & assign Borders
		Border etchedBorder = BorderFactory.createEtchedBorder();
		Border connectionBorder = BorderFactory.createTitledBorder(etchedBorder, "Verbindung");
		Border fileBorder = BorderFactory.createTitledBorder(etchedBorder, "Datei");
		Border centerBorder = BorderFactory.createBevelBorder(BevelBorder.LOWERED);
		
		connectionPanel.setBorder(connectionBorder);
		filePanel.setBorder(fileBorder);
		centerPanel.setBorder(centerBorder);
		
		// combine Panels
		centerPanel.add(connectionPanel);
		centerPanel.add(filePanel);
		
		mainPanel.add(centerPanel, BorderLayout.CENTER);
		mainPanel.add(southPanel, BorderLayout.SOUTH);
		
		this.setContentPane(mainPanel);
		
		// set JFrame behavior
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		
	}
	
	public static void main(String[] args){
		new LogonVariante2();

	}
	
	private static void addElementsToGridPanel(JPanel gridPanel, JComponent[][] elementLines){
		for(JComponent[] elementLine : elementLines){
			gridPanel.add(new JPanel(new FlowLayout()).add(elementLine[0]));
			gridPanel.add(new JPanel(new FlowLayout()).add(elementLine[1]));
		}
	}

}