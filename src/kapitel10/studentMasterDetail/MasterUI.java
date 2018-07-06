package kapitel10.studentMasterDetail;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

import kapitel9.Student;

public class MasterUI extends JFrame{

	private final String COMMAND_DETAILS = "CMD_DETAILS";
	private Student[] auswahlListe = {
			new Student(1234, "Martin", "Mueller", 23),
			new Student(6372, "Gabi", "Hase", 19),
			new Student(7283, "Moni", "Franz", 25),
			new Student(6273, "Karl", "Grau", 21)
	};
	
	
	
	public MasterUI(){
		super("Studierenden Auswahl");
		
		JComboBox<Student> studentenAuswahl = new JComboBox<Student>(auswahlListe);
		JButton details = new JButton("Details");
		details.setActionCommand(COMMAND_DETAILS);
		
		ActionListener btnListener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals(COMMAND_DETAILS)){
					Student selektierterStudent = (Student)studentenAuswahl.getSelectedItem();
					new DetailsUI(selektierterStudent);
				}
			}
		};
		
		details.addActionListener(btnListener);
		
		this.setLayout(new FlowLayout(FlowLayout.CENTER));
		this.add(studentenAuswahl);
		this.add(details);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new MasterUI();
		

	}

}
