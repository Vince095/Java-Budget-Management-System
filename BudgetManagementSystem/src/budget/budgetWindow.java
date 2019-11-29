package budget;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTabbedPane;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

//Database connection
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class budgetWindow {

	private JFrame frmBudgetAsisstant;
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextArea textArea;

	//--------------------Calculator tab -------------------------
			double firstNum;
			double secondNum;
			double result;
			String operation;
			String answer;
			

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					budgetWindow window = new budgetWindow();
					window.frmBudgetAsisstant.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public budgetWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBudgetAsisstant =  new JFrame();
		frmBudgetAsisstant.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\kb Kabangila\\Desktop\\JavaProject\\saving-up-32-168751.png"));
		frmBudgetAsisstant.setBackground(new Color(250, 128, 114));
		frmBudgetAsisstant.setTitle("Budget Asisstant");
		frmBudgetAsisstant.getContentPane().setBackground(new Color(250, 128, 114));
		frmBudgetAsisstant.setBounds(0, 0, 1368, 689);
		frmBudgetAsisstant.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBudgetAsisstant.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Budget Management System");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(558, 33, 410, 45);
		frmBudgetAsisstant.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(245, 222, 179));
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		panel.setBounds(61, 98, 421, 288);
		frmBudgetAsisstant.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblName = new JLabel("Name :");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblName.setBounds(10, 27, 95, 22);
		panel.add(lblName);
		
		JLabel lblUserName = new JLabel("User Name : ");
		lblUserName.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblUserName.setBounds(10, 78, 115, 22);
		panel.add(lblUserName);
		
		JLabel lblAge = new JLabel("Age :");
		lblAge.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblAge.setBounds(10, 124, 95, 22);
		panel.add(lblAge);
		
		JLabel lblOccupation = new JLabel("Occupation :");
		lblOccupation.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblOccupation.setBounds(10, 171, 95, 22);
		panel.add(lblOccupation);
		
		JLabel lblSalary = new JLabel("Salary/Income :");
		lblSalary.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblSalary.setBounds(10, 228, 132, 22);
		panel.add(lblSalary);
		
		textField = new JTextField();
		textField.setBounds(147, 22, 221, 27);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(147, 73, 221, 27);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(147, 125, 107, 27);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(147, 171, 221, 27);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(147, 223, 107, 27);
		panel.add(textField_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 222, 173));
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		panel_1.setBounds(505, 98, 421, 288);
		frmBudgetAsisstant.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblMonthlyExpenditure = new JLabel("Monthly Expenditure :");
		lblMonthlyExpenditure.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblMonthlyExpenditure.setBounds(10, 25, 185, 26);
		panel_1.add(lblMonthlyExpenditure);
		
		JLabel lblYearlyExpenditure = new JLabel("Yearly Expenditure :");
		lblYearlyExpenditure.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblYearlyExpenditure.setBounds(10, 203, 185, 26);
		panel_1.add(lblYearlyExpenditure);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblNewLabel_1.setBounds(182, 28, 123, 23);
		panel_1.add(lblNewLabel_1);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label.setBounds(182, 206, 123, 23);
		panel_1.add(label);
		
		JLabel lblBills = new JLabel("Bills :");
		lblBills.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblBills.setBounds(10, 75, 46, 14);
		panel_1.add(lblBills);
		
		JLabel label_1 = new JLabel("");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_1.setBounds(115, 66, 123, 23);
		panel_1.add(label_1);
		
		JLabel lblLivingExpeses = new JLabel("Living expeses : ");
		lblLivingExpeses.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblLivingExpeses.setBounds(10, 240, 141, 26);
		panel_1.add(lblLivingExpeses);
		
		JLabel lblFood = new JLabel("Food :");
		lblFood.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblFood.setBounds(10, 100, 123, 26);
		panel_1.add(lblFood);
		
		JLabel label_2 = new JLabel("");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_2.setBounds(115, 100, 123, 23);
		panel_1.add(label_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(255, 222, 173));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 17));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Living expenses", "Trasportation", "Leasure", "Cloting", "Cosmetics"}));
		comboBox.setBounds(10, 134, 157, 20);
		panel_1.add(comboBox);
		
		JLabel label_3 = new JLabel("");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_3.setBounds(182, 134, 123, 23);
		panel_1.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_4.setBounds(182, 240, 123, 23);
		panel_1.add(label_4);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(24, 178, 319, 14);
		panel_1.add(separator);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 228, 181));
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		panel_2.setBounds(61, 397, 865, 226);
		frmBudgetAsisstant.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel label_5 = new JLabel("Bills :");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label_5.setBounds(24, 32, 46, 14);
		panel_2.add(label_5);
		
		textField_6 = new JTextField();
		textField_6.setBackground(new Color(176, 224, 230));
		textField_6.setColumns(10);
		textField_6.setBounds(104, 29, 107, 27);
		panel_2.add(textField_6);
		
		JLabel label_6 = new JLabel("Food :");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label_6.setBounds(24, 70, 123, 26);
		panel_2.add(label_6);
		
		textField_7 = new JTextField();
		textField_7.setBackground(new Color(176, 224, 230));
		textField_7.setColumns(10);
		textField_7.setBounds(104, 67, 107, 27);
		panel_2.add(textField_7);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(new Color(255, 218, 185));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Living expenses", "Trasportation", "Leasure", "Cloting", "Cosmetics"}));
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		comboBox_1.setBounds(24, 126, 157, 20);
		panel_2.add(comboBox_1);
		
		textField_8 = new JTextField();
		textField_8.setBackground(new Color(176, 224, 230));
		textField_8.setColumns(10);
		textField_8.setBounds(212, 119, 221, 27);
		panel_2.add(textField_8);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.setForeground(new Color(240, 248, 255));
		btnTotal.setBackground(new Color(30, 144, 255));
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double bills = Double.parseDouble(textField_6 .getText());
				double food = Double.parseDouble(textField_7 .getText());
				double  living = Double.parseDouble(textField_8 .getText());
				double total;
				double transpot;
				double cometics;
				double clothing;
				double leasure;
				
				total = (bills + food + living);
				String expens = String.format("%.2f", total);
				lblNewLabel_1.setText(expens);
				
				
				String bill= String.format("%.2f", bills);
				label_1.setText(bill);
				
				String eat = String.format("%.2f", food);
				label_2.setText(eat);
				
				/*String live = String.format("%.2f", living);
				label_3.setText(live);*/
				
				
				label.setText("00");

				label_4.setText("00");
				//////////////Living expenses////////////////////
				if( comboBox_1.getSelectedItem().equals("Living expenses")) {
					String live = String.format("%.2f", living);
					label_3.setText(live);
				}else
					label_3.setText("00");
				
			}
		});
		btnTotal.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnTotal.setBounds(167, 176, 89, 27);
		panel_2.add(btnTotal);
		
		JButton btnReceipt = new JButton("Report");
		btnReceipt.setForeground(new Color(240, 248, 255));
		btnReceipt.setBackground(new Color(119, 136, 153));
		btnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					textArea.append("\t\t Monthly Budget\n\n" +
							"==================================================================\n\n"
									+ "Name: \t" + 	textField.getText()+"\n"+
									"User name:\t"+ textField_1.getText()+"\n"
									+ "Age:\t"+ textField_2.getText()+"\n"
									+ "Ocupation:\t"+ textField_3.getText()+"\n"
									+ "Salary/Income:\t"+ textField_4.getText()+"\n\n"
						+"====================================================================="	
									
			
							
							
				);	
			}
		});
		btnReceipt.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnReceipt.setBounds(364, 176, 89, 27);
		panel_2.add(btnReceipt);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setForeground(new Color(255, 250, 250));
		btnExit.setBackground(new Color(205, 92, 92));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if(JOptionPane.showConfirmDialog(frame, "comfirm if you want to exit", "Budget management System",
						JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnExit.setBounds(723, 176, 89, 27);
		panel_2.add(btnExit);
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.setForeground(new Color(240, 248, 255));
		btnNewButton.setBackground(new Color(60, 179, 113));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_1.setText(null);
				 label_1.setText(null);
				 label_2.setText(null);
				 label_3.setText(null);
				 label_4.setText(null);
				textArea.setText(null);	
			
				 
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.setBounds(546, 176, 89, 30);
		panel_2.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Monthly budget");
		lblNewLabel_2.setFont(new Font("Imprint MT Shadow", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_2.setBounds(436, 11, 229, 27);
		panel_2.add(lblNewLabel_2);
		
		JCheckBox chckbxSavings = new JCheckBox("Savings");
		chckbxSavings.setBackground(new Color(255, 228, 181));
		chckbxSavings.setFont(new Font("Tahoma", Font.PLAIN, 17));
		chckbxSavings.setBounds(508, 48, 97, 23);
		panel_2.add(chckbxSavings);
		
		JCheckBox chckbxExtraExenses = new JCheckBox("Extra exenses");
		chckbxExtraExenses.setBackground(new Color(255, 222, 173));
		chckbxExtraExenses.setFont(new Font("Tahoma", Font.PLAIN, 17));
		chckbxExtraExenses.setBounds(648, 51, 164, 20);
		panel_2.add(chckbxExtraExenses);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 222, 173));
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		panel_3.setBounds(947, 104, 365, 519);
		frmBudgetAsisstant.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(21, 47, 334, 461);
		panel_3.add(tabbedPane);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(240, 240, 240));
		tabbedPane.addTab("Report", null, panel_5, null);
		panel_5.setLayout(null);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.BOLD, 17));
		textArea.setBounds(0, 0, 329, 433);
		panel_5.add(textArea);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(204, 204, 153));
		tabbedPane.addTab("calculator", null, panel_6, null);
		panel_6.setLayout(null);
		
		textField_9 = new JTextField();
		textField_9.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_9.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_9.setForeground(Color.WHITE);
		textField_9.setBackground(Color.BLACK);
		textField_9.setBounds(27, 53, 280, 43);
		panel_6.add(textField_9);
		textField_9.setColumns(10);
		
		//--------------------Calculator tab -------------------------
		
		JLabel lblBudgetCalculator = new JLabel("Budget calculator");
		lblBudgetCalculator.setFont(new Font("Imprint MT Shadow", Font.BOLD | Font.ITALIC, 17));
		lblBudgetCalculator.setBounds(78, 15, 229, 27);
		panel_6.add(lblBudgetCalculator);
		
		JButton btn_7= new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = 	textField_9.getText() + btn_7.getText();
				textField_9.setText(EnterNum);	
						
			}
		});
		btn_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_7.setBounds(27, 161, 54, 43);
		panel_6.add(btn_7);
		
		JButton btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = 	textField_9.getText() + btn_8.getText();
				textField_9.setText(EnterNum);	
				
			}
		});
		btn_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_8.setBounds(98, 161, 54, 43);
		panel_6.add(btn_8);
		
		JButton btn_9 = new JButton("9");
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = 	textField_9.getText() + btn_9.getText();
				textField_9.setText(EnterNum);	
						
			}
		});
		 btn_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		 btn_9.setBounds(174, 161, 54, 43);
		panel_6.add( btn_9);
		
		JButton btn_Plus = new JButton("-");
		btn_Plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(textField_9.getText());
				textField_9.setText("");
				operation = "-";
			}
		});
		btn_Plus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_Plus.setBounds(253, 161, 54, 43);
		panel_6.add(btn_Plus);
		
		/*      Row 2          */
		
		JButton btn_4= new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = 	textField_9.getText() + btn_4.getText();
				textField_9.setText(EnterNum);	
						
			}
		});
		btn_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_4.setBounds(27, 215, 54, 43);
		panel_6.add(btn_4);
		
		JButton btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = 	textField_9.getText() + btn_5.getText();
				textField_9.setText(EnterNum);	
						
			}
		});
		btn_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_5.setBounds(98, 215, 54, 43);
		panel_6.add(btn_5);
		
		JButton btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = 	textField_9.getText() + btn_6.getText();
				textField_9.setText(EnterNum);	
						
			}
		});
		btn_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_6.setBounds(174, 215, 54, 43);
		panel_6.add( btn_6);
		
		JButton btn_minus = new JButton("+");
		btn_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(textField_9.getText());
				textField_9.setText("");
				operation = "+";
				
			}
		});
		btn_minus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_minus.setBounds(253, 107, 54, 43);
		panel_6.add(btn_minus);
		 
	
		
		JButton btn_1= new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = 	textField_9.getText() + btn_1.getText();
				textField_9.setText(EnterNum);	
						
			}
		});
		btn_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_1.setBounds(27, 279, 54, 43);
		panel_6.add(btn_1);
		
		JButton btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = 	textField_9.getText() + btn_2.getText();
				textField_9.setText(EnterNum);	
						
			}
		});
		btn_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_2.setBounds(98, 279, 54, 43);
		panel_6.add(btn_2);
		
		JButton btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = 	textField_9.getText() + btn_3.getText();
				textField_9.setText(EnterNum);	
						
			}
		});
		btn_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_3.setBounds(174, 279, 54, 43);
		panel_6.add( btn_3);
		
		JButton btn_div = new JButton("/");
		btn_div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(textField_9.getText());
				textField_9.setText("");
				operation = "/";
			}
		});
		btn_div.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_div.setBounds(253, 279, 54, 43);
		panel_6.add(btn_div);
		
		JButton button = new JButton("0");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = 	textField_9.getText() + button.getText();
				textField_9.setText(EnterNum);	
						
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 18));
		button.setBounds(27, 332, 54, 43);
		panel_6.add(button);
		
		JButton button_1 = new JButton(".");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = 	textField_9.getText() + button_1.getText();
				textField_9.setText(EnterNum);	
						
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_1.setBounds(98, 332, 54, 43);
		panel_6.add(button_1);
		
		JButton btnUb = new JButton("\u00B1");
		btnUb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(textField_9.getText()));
				ops = ops * (-1);
				textField_9.setText(String.valueOf(ops));
						
			}
		});
		btnUb.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnUb.setBounds(174, 333, 54, 43);
		panel_6.add(btnUb);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondNum = Double.parseDouble(textField_9.getText());
				
				if(operation == "+") {
					
					result = firstNum + secondNum;
					answer = String.format("%.2f", result);
					textField_9.setText(answer);
					
				}
				else if(operation == "-") {
					
					result = firstNum - secondNum;
					answer = String.format("%.2f", result);
					textField_9.setText(answer);
					
				}
				else if(operation == "/") {
					
					result = firstNum / secondNum;
					answer = String.format("%.2f", result);
					textField_9.setText(answer);
					
				}
				else if(operation == "*") {
					
					result = firstNum * secondNum;
					answer = String.format("%.2f", result);
					textField_9.setText(answer);
					
				}
				else if(operation == "%") {
					
					result = firstNum % secondNum;
					answer = String.format("%.2f", result);
					textField_9.setText(answer);
					
				}
			
			
				
				
			}
		});
		btnEqual.setBackground(new Color(153, 255, 255));
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEqual.setBounds(253, 332, 54, 43);
		panel_6.add(btnEqual);
		
		JButton button_2 = new JButton("*");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(textField_9.getText());
				textField_9.setText("");
				operation = "*";
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_2.setBounds(253, 215, 54, 43);
		panel_6.add(button_2);
		
		JButton button_4 = new JButton("%");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(textField_9.getText());
				textField_9.setText("");
				operation = "%";
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_4.setBounds(174, 107, 54, 43);
		panel_6.add(button_4);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_9.setText(null);	
				
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnC.setBounds(98, 107, 54, 43);
		panel_6.add(btnC);
		
		JButton btnu = new JButton("\uF0E7");
		btnu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bSpace = null;
				
				if(textField_9.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(textField_9.getText());
					strB.deleteCharAt(textField_9.getText().length()-1);
					bSpace = strB.toString();
					textField_9.setText(bSpace);
					
				}
				
			}
		});
		btnu.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnu.setBounds(27, 107, 54, 43);
		panel_6.add(btnu);
		 
		
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(20, 26, -9, 23);
		panel_3.add(panel_4);
		
		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon("C:\\Users\\kb Kabangila\\Desktop\\JavaProject\\business-person-57-5578.png"));
		label_7.setBounds(505, 17, 57, 70);
		frmBudgetAsisstant.getContentPane().add(label_7);
		
	}
}
