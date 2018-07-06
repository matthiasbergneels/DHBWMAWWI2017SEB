package kapitel10.studentMasterDetail;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import kapitel9.Student;

public class DetailsUI extends JFrame{
	
	private final String COMMAND_SAVE = "CMD_SAVE";
	private final String COMMAND_CLOSE = "CMD_CLOSE";

	protected DetailsUI(Student student){
		super("Details: " + student.getMatrikelNummer());
		
		this.setLayout(new GridLayout(0, 2));
		
		JLabel lblMatrikelNr = new JLabel("Matrikel#:");
		JTextField txtMatrikelNr = new JTextField();
		txtMatrikelNr.setEnabled(false);
		txtMatrikelNr.setText(String.valueOf(student.getMatrikelNummer()));
		
		JLabel lblNachname = new JLabel("Nachname:");
		JTextField txtNachname = new JTextField(student.getNachname());
		
		
		JLabel lblVorname = new JLabel("Vorname:");
		JTextField txtVorname = new JTextField(student.getVorname());
		
		
		JLabel lblAlter = new JLabel("Alter:");
		
		MaskFormatter alterFormat = null;
		try {
			alterFormat = new MaskFormatter("##");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		JFormattedTextField txtAlter = new JFormattedTextField(alterFormat);
		txtAlter.setText(String.valueOf(student.getAlter()));
		
		this.add(lblMatrikelNr);
		this.add(txtMatrikelNr);
		
		this.add(lblNachname);
		this.add(txtNachname);
		
		this.add(lblVorname);
		this.add(txtVorname);
		
		this.add(lblAlter);
		this.add(txtAlter);
		
		JButton save = new JButton("Speichern");
		save.setActionCommand(COMMAND_SAVE);
		JButton close = new JButton("Schliessen");
		close.setActionCommand(COMMAND_CLOSE);
		
		ActionListener btnListener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				switch (e.getActionCommand()) {
				case COMMAND_SAVE:
					student.setNachname(txtNachname.getText());
					student.setVorname(txtVorname.getText());
					student.setAlter(Integer.valueOf(txtAlter.getText()));
					System.out.println("Student gespeichert: " + student);
					break;
				case COMMAND_CLOSE:
					dispose();
					break;
				}
			}

		};
		
		save.addActionListener(btnListener);
		close.addActionListener(btnListener);

		this.add(save);
		this.add(close);
		
		
		JMenuBar auswahlLeiste = new JMenuBar();
		
		JMenu dateiMenu = new JMenu("Datei");
		
		JMenuItem saveMenu = new JMenuItem("Speicher");
		saveMenu.setActionCommand(COMMAND_SAVE);
		saveMenu.addActionListener(btnListener);
		JMenuItem closeMenu = new JMenuItem("Schliessen");
		closeMenu.setActionCommand(COMMAND_CLOSE);
		closeMenu.addActionListener(btnListener);
		
		dateiMenu.add(saveMenu);
		dateiMenu.add(closeMenu);
		
		auswahlLeiste.add(dateiMenu);
		this.setJMenuBar(auswahlLeiste);
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		
	}
	
	private void disposeFrame(){
		this.dispose();
	}
	
}
