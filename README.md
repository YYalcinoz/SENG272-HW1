# Software-Project-Tracker

Description
Project Tracker GUI is a desktop application built with Java Swing. It allows users to easily track and save project information through a simple form interface. All records are stored in a text file (projects.txt) in a clear and readable format.

Features
-Enter project details: Project Name, Team Leader, Team Size, Project Type, and Start Date.
-Save project records to projects.txt with a structured layout.
-Input validation: required fields must be filled; otherwise, an error message is displayed.
-Clear the form easily with the Clear button.
-Automatically logs the Record Time for each entry.

Technologies
-Java SE
-Java Swing (JFrame, JPanel, JButton, JTextField, JComboBox)
-File I/O (FileWriter)
-JOptionPane for user messages
-DateTimeFormatter for date and time

Usage
1.Open the project in Eclipse or any Java IDE.
2.Fill out the project form:
-Project Name
-Team Leader
-Team Size
-Project Type
-Start Date
3.Click Save:
-If all required fields are filled, the project is saved and a success message appears.
-If fields are missing, an error message is shown.
4.Click Clear to reset the form.
5.Check projects.txt in the project’s root folder for saved records.

Example Record in projects.txt
=== Project Entry ===
Project Name: [MyBazaar Application]
Team Leader: [Yağız Yalçınöz]
Team Size: [1-3]
Project Type: [Web]
Start Date: [1/12/2025]
Record Time: [02/03/26, 22:33:46]
====================

Notes
-The file is opened in append mode, so new projects are added without overwriting previous entries.
-Multiple projects can be tracked in the same file.
