/*
  *Rachel Mc Grane Maher
   *12th April
    *This is an application of a calculator that can add,subtract,multiply and divide
    *
*/
package calculator1;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator extends JFrame {

	private JPanel contentPane;
    private JTextField textArea;
   
    double firstNum;//variables are short and precise
    double secNum;
    
    double result;
    String newNumber;
    double doubleNumber;
    
    String activity;
    double  answer;
    //blank spaces between variables and the methods , making the code easier to read

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	
	public static double addNumbers(double num, double number){ //method beginning with a lower case letter
		return num + number;
		
	}
	
	
	public static double divideNumbers(double num, double number){
		return num / number;
		
	}
	
	public static double multiplyNumbers(double num, double number){
		return num  * number;
		
	}
	
	public static double subtractNumbers(double num, double number){
		return num - number;
		
	}
	
	
	
	
	
	
	public Calculator() {
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 334, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(6, 4, 0, 0));
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		contentPane.add(panel_1);
		
		textArea = new JTextField();
		textArea.setHorizontalAlignment(SwingConstants.RIGHT);
		textArea.setColumns(25);
		
		panel_1.add(textArea);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3);
		
		JButton btnNewButton_4 = new JButton("1");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(textArea.getText()+("1"));
			}
		});
		panel_3.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("2");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(textArea.getText()+("2"));
			}
		});
		panel_3.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("3");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(textArea.getText()+("3"));
			}
		});
		panel_3.add(btnNewButton_6);
		
		JButton btnNewButton = new JButton("+");
		panel_3.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				firstNum = Double.parseDouble(textArea.getText());
				textArea.setText("");
				activity = "+";
				
			}
		});
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4);
		
		JButton btnNewButton_7 = new JButton("4");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(textArea.getText()+("4"));
			}
		});
		panel_4.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("5");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(textArea.getText()+("5"));
			}
		});
		panel_4.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("6");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(textArea.getText()+("6"));
			}
		});
		panel_4.add(btnNewButton_9);
		
		JButton btnNewButton_1 = new JButton("-");
		panel_4.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textArea.getText());
				textArea.setText("");
				activity = "-";
			}
		});
		
		JPanel panel_5 = new JPanel();
		contentPane.add(panel_5);
		
		JButton btnNewButton_10 = new JButton("7");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(textArea.getText()+("7"));
			}
		});
		panel_5.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("8");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(textArea.getText()+("8"));
			}
		});
		panel_5.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("9");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(textArea.getText()+("9"));
			}
		});
		panel_5.add(btnNewButton_12);
		
		JButton btnNewButton_2 = new JButton("/");
		panel_5.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textArea.getText());
				textArea.setText("");
				activity = "/";
			}
		});
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
		JButton button_1 = new JButton("0");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(textArea.getText()+("0"));
			}
		});
		
		JButton button = new JButton(".");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(textArea.getText()+("."));
			}
		});
		panel.add(button);
		panel.add(button_1);
		
		JButton button_2 = new JButton("=");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secNum = Double.parseDouble(textArea.getText());
				if (activity == "+"){//if-else-if-else statement
					
					result = firstNum + secNum;
					
					answer = String.format("%.2f", result);//two decimal places 
					textArea.setText(answer);
				}
				
				
				else if (activity == "-"){
					
					result = firstNum - secNum;
					answer = String.format("%.2f", result);
					textArea.setText(answer);
				}
				
	           else if (activity == "*"){
					
					result = firstNum * secNum;
					answer = String.format("%.2f", result);
					textArea.setText(answer);
				}
				
	       	else if (activity == "/"){
				
				result = firstNum / secNum;
				answer = String.format("%.2f", result);
				textArea.setText(answer);
			}
			
				
				
				
				
				
			}
		});
		
		JButton btnNewButton_3 = new JButton("*");
		panel.add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textArea.getText());
				textArea.setText("");
				activity = "*";
			}
		});
		panel.add(button_2);
		
		JPanel panel_6 = new JPanel();
		contentPane.add(panel_6);
		
		JButton btnClear = new JButton("Clear ");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(" ");
			}
		});
		panel_6.add(btnClear);
		
		JButton btnNewButton_13 = new JButton("Delete");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//textArea.setText();
				String delete = null;
				if(textArea.getText().length()>0){
					
					StringBuilder strB = new StringBuilder (textArea.getText());
					strB.deleteCharAt(textArea.getText().length() - 1);
					delete = strB.toString();
					textArea.setText(delete); 
				}
				
			}
		});
		panel_6.add(btnNewButton_13);
	}




}
