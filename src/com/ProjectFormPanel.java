package com;

import java.awt.GridLayout;
import java.io.FileWriter;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ProjectFormPanel extends JPanel {
	
	LocalDateTime myDateObj = LocalDateTime.now();
	DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/YY, HH:mm:ss");
	String formattedDate = myDateObj.format(myFormatObj);
	
	private JTextField f1, f2, f3;
	 private JComboBox<String> teamSize, projectType;
	private JButton b1, b2;
	
	public ProjectFormPanel() {
		setLayout(new GridLayout(6,2));
		
		 f1 = new JTextField(15);
		 f2 = new JTextField(15);
		 f3 = new JTextField(15);
		
	   teamSize = new JComboBox<>();
	    projectType = new JComboBox<>();
		
		teamSize.addItem("1-3");
		teamSize.addItem("4-6");
		teamSize.addItem("7-10");
		teamSize.addItem("10+");
		projectType.addItem("Web");
		projectType.addItem("Mobile");
		projectType.addItem("Desktop");
		projectType.addItem("API");
		
		b1 = new JButton("Save");
		b2 = new JButton("Clear");
		
		add(new JLabel("Project name"));
		add(f1);
		
		add(new JLabel("Team leader"));
		add(f2);
		
		add(new JLabel("Team size"));
		add(teamSize);
		
		add(new JLabel("Project type"));
		add(projectType);
		
		add(new JLabel("Start date"));
		add(f3);
		
		add(b1);
		add(b2);
		
		b1.addActionListener(e -> {
			String projectName = f1.getText();
			String teamLeader = f2.getText();
			String size = (String) teamSize.getSelectedItem();
			String type = (String) projectType.getSelectedItem();
			String startDate = f3.getText();
			
			 if(projectName.isEmpty() || teamLeader.isEmpty() || startDate.isEmpty()) {
			        JOptionPane.showMessageDialog(ProjectFormPanel.this, "Please fill all required fields!");
			        return; 
			    }
			 
			 try (FileWriter fw = new FileWriter("projects.txt", true)) {
			        fw.write("=== Project Entry ==="+ "\n" +"Project Name: " + "["+projectName+"]" + "\n" + "Team Leader: " 
			 + "[" + teamLeader + "]" + "\n" + "Team Size: " + "["+size+"]" + "\n" + "Project Type: "+ "["+type+"]" + "\n" +
			      "Start Date: "+ "["+startDate+"]" + "\n" + "Record Time: "+ "["+formattedDate +"]" + "\n" + ""
			      		+ "====================\n\n");
			        JOptionPane.showMessageDialog(ProjectFormPanel.this, "Project saved successfully!");
			    } catch(Exception ex) {
			        JOptionPane.showMessageDialog(ProjectFormPanel.this, "Error: " + ex.getMessage());
			    }
		});
		
		b2.addActionListener(e -> {
			f1.setText("");
			f2.setText("");
			f3.setText("");
			teamSize.setSelectedIndex(0);
		    projectType.setSelectedIndex(0);
		});
	}
	
}
