package com.gui;

import javax.swing.*;

import com.det.Details;

import java.awt.*;
import java.awt.event.*;

public class IndRegister extends Login{
	JTextField txtfName,txtmName,txtlName,txtuAdd,txtuName, txtcNum, txtuEmail;
	JPasswordField passwordField, confirmpasswordField;

	public IndRegister() {
		getContentPane().removeAll();
		setBackground(new Color(255, 244, 228));
		setBounds(100, 100, 375, 812);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		ImageIcon smallpic = new ImageIcon("smalleguard.png"); //small welcome eguard pic
	    JLabel SmallPicture = new JLabel(smallpic);
	    add(SmallPicture);
	    SmallPicture.setBounds(55,43,40,40);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setBounds(10, 194, 64, 14);
		getContentPane().add(lblFirstName);
		
		JLabel lblMidName = new JLabel("Middle Name:");
		lblMidName.setBounds(10, 250, 117, 14);
		getContentPane().add(lblMidName);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setBounds(10, 308, 64, 14);
		getContentPane().add(lblLastName);
		
		txtfName = new JTextField();
		txtfName.setBounds(20, 219, 305, 20);
		getContentPane().add(txtfName);
		
		txtmName = new JTextField();
		txtmName.setBounds(20, 275, 305, 20);
		getContentPane().add(txtmName);
		
		txtlName = new JTextField();
		txtlName.setBounds(20, 333, 305, 20);
		getContentPane().add(txtlName);
		
		JLabel lbluAdd = new JLabel("Complete Address:");
		lbluAdd.setBounds(10, 364, 140, 14);
		getContentPane().add(lbluAdd);
		
		txtuAdd = new JTextField();
		txtuAdd.setBounds(20, 389, 305, 20);
		getContentPane().add(txtuAdd);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(10, 538, 64, 14);
		getContentPane().add(lblUsername);
		
		txtuName = new JTextField();
		txtuName.setBounds(20, 563, 305, 20);
		getContentPane().add(txtuName);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(10, 594, 64, 14);
		getContentPane().add(lblPassword);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password:");
		lblConfirmPassword.setBounds(10, 650, 140, 14);
		getContentPane().add(lblConfirmPassword);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(38, 717, 89, 23);
		btnCancel.addActionListener(backListener);
		setBtnProps(btnCancel);
		getContentPane().add(btnCancel);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(clearListener);
		btnClear.setBounds(137, 717, 89, 23);
		setBtnProps(btnClear);
		getContentPane().add(btnClear);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(236, 717, 89, 23);
		btnSubmit.addActionListener(submitListener);
		setBtnProps(btnSubmit);
		getContentPane().add(btnSubmit);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(20, 619, 305, 20);
		getContentPane().add(passwordField);
		
		confirmpasswordField = new JPasswordField();
		confirmpasswordField.setBounds(20, 675, 305, 20);
		getContentPane().add(confirmpasswordField);
		
		JButton btnBack = new JButton("< Back");
		btnBack.addActionListener(backListener);
		btnBack.setBounds(10, 11, 89, 23);
		setBtnProps(btnBack);
		getContentPane().add(btnBack);
		
		txtcNum = new JTextField();
		txtcNum.setBounds(20, 445, 305, 20);
		getContentPane().add(txtcNum);
		
		JLabel lblcNum = new JLabel("Contact Number:");
		lblcNum.setBounds(10, 420, 140, 14);
		getContentPane().add(lblcNum);
		
		txtuEmail = new JTextField();
		txtuEmail.setBounds(20, 507, 305, 20);
		getContentPane().add(txtuEmail);
		
		JLabel lbluEmail = new JLabel("Email Address");
		lbluEmail.setBounds(10, 482, 140, 14);
		getContentPane().add(lbluEmail);
		
		JLabel lblWelc = new JLabel("Welcome to E-Guard!");
		lblWelc.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		lblWelc.setBounds(75, 45, 232, 39);
		getContentPane().add(lblWelc);
		
		JLabel lblDesc1 = new JLabel("<html>In accordance with the Data Privacy Act of 2012 (DPA), its Implementing" +
			"<br>Rules and Regulations (IRR), other issuances of the National Privacy" +
			"<br>Commission (NPC) and other relevant laws of the Philippines, the" + 
			"<br>personal data that will collected through this form is to be used in a clear" +
			"<br>protocols to notify, interview, and advise close contacts to patients with" + 
			"<br>confirmed or probable COVID-19. Rest assured that the E-Guard Online" +
			"<br>Tracer will handle the information gathered with utmost confidentiality. <html>");
		lblDesc1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDesc1.setForeground(UIManager.getColor("Button.darkShadow"));
		lblDesc1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 9));
		lblDesc1.setBounds(38, 81, 287, 102);
		getContentPane().add(lblDesc1);
		
	}

	ActionListener clearListener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			txtfName.setText("");
			txtmName.setText("");
			txtlName.setText("");
			txtuAdd.setText("");
			txtuName.setText("");
			txtuEmail.setText("");
			txtcNum.setText("");
			passwordField.setText("");
			confirmpasswordField.setText("");
		}	
	};
	
	ActionListener submitListener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			String password = new String(passwordField.getPassword());
			String confirmPassword = new String(confirmpasswordField.getPassword());
			if(txtfName.getText().isBlank()||txtmName.getText().isBlank()||txtlName.getText().isBlank()||txtuAdd.getText().isBlank()||txtuName.getText().isBlank()
					||passwordField.getPassword().length < 1||confirmpasswordField.getPassword().length < 1) {
				JOptionPane.showMessageDialog(null,"Error:\nPlease complete the form","Error",JOptionPane.ERROR_MESSAGE);
			}
			else if(!password.equals(confirmPassword)) {
				JOptionPane.showMessageDialog(null,"Error:\nPasswords don't correspond","Error",JOptionPane.ERROR_MESSAGE);
				//System.out.println(password);
				//System.out.println(confirmPassword);
			}
				
			else {
				Details person = new Details();
				person.setfName(txtfName.getText());
				person.setmName(txtmName.getText());
				person.setlName(txtlName.getText());
				person.setuAdd(txtuAdd.getText());
				person.setuEmail(txtuEmail.getText());
				person.setcNum(txtcNum.getText());
				person.setuName(txtuName.getText());
				person.setuPass(password);
				person.setiID();
				person.setInd(pathComb);
				person.setiPass(pathPass);
				JOptionPane.showMessageDialog(null,"Success:\nAccount Created. Please Login","Success",JOptionPane.DEFAULT_OPTION);
				dispose();
			}
		}	
	};
}
