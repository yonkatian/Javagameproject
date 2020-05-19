package mastermind;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Mastermind_Setdiffcutly {

	public JFrame frmSetDiffcutly;



	/**
	 * Create the application.
	 */
	public Mastermind_Setdiffcutly() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSetDiffcutly = new JFrame();
		frmSetDiffcutly.setTitle("Set Diffcutly");
		frmSetDiffcutly.setBounds(100, 100, 458, 111);
		frmSetDiffcutly.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSetDiffcutly.getContentPane().setLayout(null);
		frmSetDiffcutly.setResizable(false);
		JLabel lblNewLabel = new JLabel("Set Diffcutly:");
		lblNewLabel.setBounds(37, 11, 99, 14);
		frmSetDiffcutly.getContentPane().add(lblNewLabel);
		
		JComboBox<String> cbx_choice = new JComboBox<String>();
		cbx_choice.setModel(new DefaultComboBoxModel<String>(new String[] {"Easy", "Medium", "Hard", "Impossible( As it say)"}));
		cbx_choice.setBounds(146, 7, 170, 22);
		frmSetDiffcutly.getContentPane().add(cbx_choice);
		
		JButton btn_submit = new JButton("Submit");
		btn_submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int number = 10 ; // default value
				
				if (cbx_choice.getSelectedIndex() ==0) 
					number = 15;
				else if (cbx_choice.getSelectedIndex() == 1) 
					number = 8;
				else if (cbx_choice.getSelectedIndex() == 2)
					number = 5;
				else if (cbx_choice.getSelectedIndex() == 3)
					number = 3;
				
				frmSetDiffcutly.dispose();
				Mastermind_GUI game_Gui = new Mastermind_GUI(number);
				game_Gui.frmMastermind.setVisible(true);
				
				
			}
		});
		btn_submit.setBounds(173, 49, 89, 23);
		frmSetDiffcutly.getContentPane().add(btn_submit);
		frmSetDiffcutly.setLocationRelativeTo(null);
	}
}
