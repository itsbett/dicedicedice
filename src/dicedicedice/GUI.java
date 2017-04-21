/*
 * This is an application to test the dice roller/computer.
 */

package dicedicedice;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class GUI {

	private JFrame frmGUI;
	private JTextField txtResult;
	private JTextField textField;
	private JTextField txtInsertDiceFormula;
	private JTextField textField_1;

	
	
	/**
	 * Launch the application.
	 */
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frmGUI.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGUI = new JFrame();
		frmGUI.setTitle("Dice Roller");
		frmGUI.setBounds(100, 100, 450, 167);
		frmGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGUI.getContentPane().setLayout(null);
		
		/*
		 * Roll button: checks for input, then sets display to computation
		 */
		JButton btnRoll = new JButton("Roll!");
		btnRoll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!textField_1.getText().equals("")) { //Check if there's any input
					double d = dmg.damage(textField_1.getText());
					String s = Double.toString(d);
				textField.setText(s);
				} else {
					textField.setText("plz type something");
				}
			}
		});
		btnRoll.setBounds(159, 93, 89, 23);
		frmGUI.getContentPane().add(btnRoll);
		
		//-------------------------------------
		
		txtResult = new JTextField();
		txtResult.setEditable(false);
		txtResult.setText("Result:");
		txtResult.setBounds(10, 11, 109, 20);
		frmGUI.getContentPane().add(txtResult);
		txtResult.setColumns(10);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(131, 11, 293, 20);
		frmGUI.getContentPane().add(textField);
		textField.setColumns(10);
		
		txtInsertDiceFormula = new JTextField();
		txtInsertDiceFormula.setEditable(false);
		txtInsertDiceFormula.setText("Insert Dice Formula:");
		txtInsertDiceFormula.setBounds(10, 41, 109, 20);
		frmGUI.getContentPane().add(txtInsertDiceFormula);
		txtInsertDiceFormula.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(131, 42, 293, 20);
		frmGUI.getContentPane().add(textField_1);
		textField_1.setColumns(10);
	}
}
