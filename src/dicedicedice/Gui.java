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

public class Gui {

	private JFrame frmGui;
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
					Gui window = new Gui();
					window.frmGui.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGui = new JFrame();
		frmGui.setTitle("Dice Roller");
		frmGui.setBounds(100, 100, 450, 167);
		frmGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGui.getContentPane().setLayout(null);
		
		/*
		 * Roll button: checks for input, then sets display to computation
		 */
		JButton btnRoll = new JButton("Roll!");
		btnRoll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!textField_1.getText().equals("")) { //Check if there's any input
					double d = Damage.dmg(textField_1.getText());
					String s = Double.toString(d);
				textField.setText(s);
				} else {
					textField.setText("plz type something");
				}
			}
		});
		btnRoll.setBounds(159, 93, 89, 23);
		frmGui.getContentPane().add(btnRoll);
		
		//-------------------------------------
		
		txtResult = new JTextField();
		txtResult.setEditable(false);
		txtResult.setText("Result:");
		txtResult.setBounds(10, 11, 109, 20);
		frmGui.getContentPane().add(txtResult);
		txtResult.setColumns(10);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(131, 11, 293, 20);
		frmGui.getContentPane().add(textField);
		textField.setColumns(10);
		
		txtInsertDiceFormula = new JTextField();
		txtInsertDiceFormula.setEditable(false);
		txtInsertDiceFormula.setText("Insert Dice Formula:");
		txtInsertDiceFormula.setBounds(10, 41, 109, 20);
		frmGui.getContentPane().add(txtInsertDiceFormula);
		txtInsertDiceFormula.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(131, 42, 293, 20);
		frmGui.getContentPane().add(textField_1);
		textField_1.setColumns(10);
	}
}
