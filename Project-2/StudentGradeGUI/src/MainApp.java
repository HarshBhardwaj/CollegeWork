import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
@SuppressWarnings("serial")

public class MainApp extends JFrame {

	private JPanel contentPane;
	private JTextField txtStudentID;
	private JTextField txtFirst;
	private JTextField txtLast;
	private JTextField txtCourse;
	private JTextField txtLabPoints;
	private JTextField txtProjectPoints;
	private JTextField txtExamPoints;
	private JTextField txtTotalPoints;
	private JTextField txtGrade;
	private final Action action = new SwingAction();

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
		setTitle("Student Grade");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblStudentId = new JLabel("Student ID:");
		lblStudentId.setBounds(10, 11, 70, 30);
		contentPane.add(lblStudentId);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setBounds(10, 50, 70, 30);
		contentPane.add(lblFirstName);
		
		JLabel lblCourse = new JLabel("Course:");
		lblCourse.setBounds(10, 94, 70, 30);
		contentPane.add(lblCourse);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setBounds(295, 50, 70, 30);
		contentPane.add(lblLastName);
		
		JLabel lblTotalPointsLab = new JLabel("Total Points Lab Exercises (Max 750 pts):");
		lblTotalPointsLab.setBounds(10, 131, 250, 30);
		contentPane.add(lblTotalPointsLab);
		
		JLabel lblTotalPointsProjects = new JLabel("Total Points Projects (Max 150 pts):");
		lblTotalPointsProjects.setBounds(10, 171, 250, 30);
		contentPane.add(lblTotalPointsProjects);
		
		JLabel lblTotalPointsFinal = new JLabel("Total Points Final Exam (Max 100 pts):");
		lblTotalPointsFinal.setBounds(10, 212, 250, 30);
		contentPane.add(lblTotalPointsFinal);
		
		JLabel lblTotalPointsEarned = new JLabel("Total Points Earned:");
		lblTotalPointsEarned.setBounds(10, 253, 250, 30);
		contentPane.add(lblTotalPointsEarned);
		
		JLabel lblCourseGrade = new JLabel("Course Grade:");
		lblCourseGrade.setBounds(10, 295, 250, 30);
		contentPane.add(lblCourseGrade);
		
		txtStudentID = new JTextField();
		txtStudentID.setFont(new Font("Tahoma", Font.PLAIN, 19));
		txtStudentID.setBounds(110, 11, 105, 30);
		contentPane.add(txtStudentID);
		txtStudentID.setColumns(10);
		
		txtFirst = new JTextField();
		txtFirst.setFont(new Font("Tahoma", Font.PLAIN, 19));
		txtFirst.setBounds(110, 53, 105, 30);
		contentPane.add(txtFirst);
		txtFirst.setColumns(10);
		
		txtLast = new JTextField();
		txtLast.setFont(new Font("Tahoma", Font.PLAIN, 19));
		txtLast.setBounds(375, 47, 105, 30);
		contentPane.add(txtLast);
		txtLast.setColumns(10);
		
		txtCourse = new JTextField();
		txtCourse.setText("COMSC-51 Java Programming Part 1");
		txtCourse.setFont(new Font("Tahoma", Font.PLAIN, 19));
		txtCourse.setBounds(75, 91, 345, 30);
		contentPane.add(txtCourse);
		txtCourse.setColumns(10);
		
		txtLabPoints = new JTextField();
		txtLabPoints.setFont(new Font("Tahoma", Font.PLAIN, 19));
		txtLabPoints.setBounds(330, 131, 90, 30);
		contentPane.add(txtLabPoints);
		txtLabPoints.setColumns(10);
		
		txtProjectPoints = new JTextField();
		txtProjectPoints.setFont(new Font("Tahoma", Font.PLAIN, 19));
		txtProjectPoints.setBounds(330, 171, 90, 30);
		contentPane.add(txtProjectPoints);
		txtProjectPoints.setColumns(10);
		
		txtExamPoints = new JTextField();
		txtExamPoints.setFont(new Font("Tahoma", Font.PLAIN, 19));
		txtExamPoints.setBounds(330, 212, 90, 30);
		contentPane.add(txtExamPoints);
		txtExamPoints.setColumns(10);
		
		txtTotalPoints = new JTextField();
		txtTotalPoints.setFont(new Font("Tahoma", Font.PLAIN, 19));
		txtTotalPoints.setBounds(330, 253, 90, 30);
		contentPane.add(txtTotalPoints);
		txtTotalPoints.setColumns(10);
		
		txtGrade = new JTextField();
		txtGrade.setFont(new Font("Tahoma", Font.PLAIN, 19));
		txtGrade.setBounds(330, 295, 90, 30);
		contentPane.add(txtGrade);
		txtGrade.setColumns(10);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtExamPoints.setText(null);
				txtFirst.setText(null);
				txtGrade.setText(null);
				txtLabPoints.setText(null);
				txtLast.setText(null);
				txtProjectPoints.setText(null);
				txtStudentID.setText(null);
				txtTotalPoints.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnClear.setBounds(10, 336, 90, 30);
		contentPane.add(btnClear);
		
		JButton btnCalculateGrade = new JButton("Calculate Grade");
		btnCalculateGrade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					int ptsExercises, ptsProjects, ptsExam, totalPoints;
					String letterGrade;
					
					Grade student = new Grade();
					
					ptsExercises = Integer.parseInt(txtLabPoints.getText());
					ptsProjects = Integer.parseInt(txtProjectPoints.getText());
					ptsExam = Integer.parseInt(txtExamPoints.getText());
					
					totalPoints = student.calcTotPoints(ptsExercises, ptsProjects, ptsExam);
					letterGrade = student.calcGrade();
					
					txtTotalPoints.setText(String.format("%s", totalPoints));
					txtGrade.setText(letterGrade);
				} catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Invalid data entered");
					
					txtLabPoints.setText(null);
					txtProjectPoints.setText(null);
					txtExamPoints.setText(null);
					txtTotalPoints.setText(null);
					txtGrade.setText(null);
				}
			}
		});
		btnCalculateGrade.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCalculateGrade.setBounds(147, 336, 160, 30);
		contentPane.add(btnCalculateGrade);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExit.setBounds(363, 336, 90, 30);
		contentPane.add(btnExit);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
