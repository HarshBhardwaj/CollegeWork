import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
@SuppressWarnings("serial")

public class MainApp extends JFrame {

	private JPanel contentPane;
	private JTextField textFeet;
	private JTextField textWeight;
	private JTextField textInches;
	private JTextField textBMI;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainApp frame = new MainApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainApp() {
		setTitle("BMI Calculator");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeight = new JLabel("Height:");
		lblHeight.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHeight.setBounds(22, 11, 71, 30);
		contentPane.add(lblHeight);
		
		JLabel lblWeight = new JLabel("Weight:");
		lblWeight.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblWeight.setBounds(22, 71, 71, 30);
		contentPane.add(lblWeight);
		
		JLabel lblBmi = new JLabel("BMI:");
		lblBmi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBmi.setBounds(22, 148, 71, 30);
		contentPane.add(lblBmi);
		
		textFeet = new JTextField();
		textFeet.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFeet.setBounds(96, 11, 71, 30);
		contentPane.add(textFeet);
		textFeet.setColumns(10);
		
		textWeight = new JTextField();
		textWeight.setBounds(96, 75, 71, 30);
		contentPane.add(textWeight);
		textWeight.setColumns(10);
		
		textInches = new JTextField();
		textInches.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textInches.setBounds(230, 11, 71, 30);
		contentPane.add(textInches);
		textInches.setColumns(10);
		
		textBMI = new JTextField();
		textBMI.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textBMI.setBounds(96, 148, 71, 30);
		contentPane.add(textBMI);
		textBMI.setColumns(10);
		
		JLabel lblFeet = new JLabel("feet");
		lblFeet.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFeet.setBounds(180, 13, 40, 30);
		contentPane.add(lblFeet);
		
		JLabel lblInches = new JLabel("inches");
		lblInches.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblInches.setBounds(311, 13, 40, 30);
		contentPane.add(lblInches);
		
		JLabel lblPounds = new JLabel("pounds");
		lblPounds.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPounds.setBounds(177, 73, 59, 30);
		contentPane.add(lblPounds);
		
		JButton btnComputeBmi = new JButton("Compute BMI");
		btnComputeBmi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double feet, inches, height, weight, BMI;

                try {
                    feet = Double.parseDouble(textFeet.getText());
                    inches = Double.parseDouble(textInches.getText());
                    weight = Double.parseDouble(textWeight.getText());

                    height = (feet * 12)+inches;

                    BMI = (weight / (height * height))*703;

                    textBMI.setText(String.format("%.2f", BMI));
                } catch (Exception e1){
                    JOptionPane.showMessageDialog(null, "Please Enter Valid Number");

                    textBMI.setText(null);
                    textFeet.setText(null);
                    textInches.setText(null);
                    textWeight.setText(null);
                }
			}
		});
		btnComputeBmi.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnComputeBmi.setBounds(22, 189, 145, 45);
		contentPane.add(btnComputeBmi);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textBMI.setText(null);
                textFeet.setText(null);
                textInches.setText(null);
                textWeight.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnClear.setBounds(199, 189, 89, 45);
		contentPane.add(btnClear);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnExit.setBounds(311, 189, 89, 45);
		contentPane.add(btnExit);
	}
}
