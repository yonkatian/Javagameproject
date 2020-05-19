package rng_guess;


import game_laucher.Game_Laucher;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;


import java.awt.Font;
import java.awt.CardLayout;
import javax.swing.JPanel;
import java.awt.Cursor;

import javax.swing.JTextArea;


import javax.swing.JScrollPane;



public class Rng_Guess_GUI {

	public JFrame frmRnguess;
	private JTextArea txba_result;


	
	
	/**
	 * Create the application.
	 */
	public Rng_Guess_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRnguess = new JFrame();
		frmRnguess.setTitle("RNG_Guess");
		frmRnguess.getContentPane().setBackground(Color.WHITE);
		frmRnguess.getContentPane().setLayout(new CardLayout(0, 0));
		frmRnguess.setResizable(false);
		
		JPanel panel_RNB_guess = new JPanel();
		
	
		panel_RNB_guess.setBackground(Color.BLACK);
		frmRnguess.getContentPane().add(panel_RNB_guess, "name_20938481430500");
		
		panel_RNB_guess.setVisible(true);
		
		
		JLabel lblNewLabel = new JLabel("Guess the number between 1 to 10 ,000");
		lblNewLabel.setBounds(147, 11, 346, 34);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setForeground(Color.WHITE);
		
		JPanel panel_RNB_choice = new JPanel();
		panel_RNB_choice.setBounds(10, 358, 612, 81);
		panel_RNB_choice.setBackground(Color.LIGHT_GRAY);
		panel_RNB_choice.setLayout(null);
		
		txba_result = new JTextArea();
		txba_result.setEditable(false);
		txba_result.setBackground(Color.WHITE);
		txba_result.setText("");
		txba_result.setBounds(30, 56, 540, 231);
	
		//panel_RNB_guess.add(txba_result);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.BLACK);
		scrollPane.setBounds(33, 43, 612, 259);
		panel_RNB_guess.add(scrollPane);
		
		scrollPane.setViewportView(txba_result);
		
		JButton btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txba_result.append("1");
			}
		});
		btn_1.setBounds(0, 0, 51, 48);
		panel_RNB_choice.add(btn_1);
		
		JButton btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txba_result.append("2");
			}
		});
		btn_2.setBounds(48, 0, 52, 48);
		panel_RNB_choice.add(btn_2);
		
		JButton btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txba_result.append("3");
			}
		});
		btn_3.setBounds(98, 0, 58, 48);
		panel_RNB_choice.add(btn_3);
		
		JButton btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txba_result.append("4");
			}
			
		});
		btn_4.setBounds(152, 0, 58, 48);
		panel_RNB_choice.add(btn_4);
		
		JButton btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txba_result.append("5");
				
			}
		});
		btn_5.setBounds(205, 0, 58, 48);
		panel_RNB_choice.add(btn_5);
		
		JButton btn_6 = new JButton("6");
		btn_6.setBounds(261, 0, 58, 48);
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txba_result.append("6");
				
			}
		});
		
		panel_RNB_choice.add(btn_6);
		
		JButton btn_7 = new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txba_result.append("7");
				
			}
		});
		btn_7.setBounds(318, 0, 58, 48);
		panel_RNB_choice.add(btn_7);
		
	
		
		
		JButton btn_8 = new JButton("8");
		
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txba_result.append("8");
				
			}
		});
		btn_8.setBounds(371, 0, 58, 48);
		panel_RNB_choice.add(btn_8);
		
		
		
		JButton btn_9 = new JButton("9");
		
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txba_result.append("9");
				
			}
		});
		btn_9.setBounds(426, 0, 58, 48);
		panel_RNB_choice.add(btn_9);
		
		JButton btn_0 = new JButton("0");
		
		btn_0.setBounds(483, 0, 58, 48);
		
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txba_result.append("0");
				
			}
		});
		panel_RNB_choice.add(btn_0);
		
		JButton btn_clear = new JButton("CLEAR");
		btn_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Document doc = txba_result.getDocument();
				
					try {
						doc.remove(doc.getLength() - 1,1);
					} catch (BadLocationException e1) {
						// TODO Auto-generated catch block
					}
				
				
				
			}
		});
		btn_clear.setBounds(532, 0, 80, 48);
		panel_RNB_choice.add(btn_clear);
		
		JButton btn_enter = new JButton("ENTER");
		btn_enter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			Rng_Guess_Controller  control = new Rng_Guess_Controller();
			
	
			
			String[] wordsArray = txba_result.getText().split("\n");
			String lastWord = wordsArray[wordsArray.length - 1];
			
			try {
				//System.out.println(lastWord);
				int user_answer =   Integer.parseInt(  lastWord.trim() );
				
			
				boolean result = control.checkanswer(user_answer);
				
				if(result) {
					 int user_response = JOptionPane.showConfirmDialog(null, "Congratz ... that the correct answer " +'"' + user_answer +'"' + " using " + Rng_Guess_Controller.getTries() +" tries \n"
					 		+ "Do you wish to continue ?", "CONGRATZ", JOptionPane.YES_NO_OPTION);
					
					 //YES IS 0 No is 1 
					 if(user_response == JOptionPane.YES_OPTION) {
						 control.reset_game();
						 txba_result.setText("");
			
						 
					 } else {
						 
						 	frmRnguess.dispose();
					    	Game_Laucher lauch = new Game_Laucher();
					    	
					    	lauch.frmGameLaucher.setVisible(true);
						 
					 }
				
				} else {
					txba_result.append("   " + control.getAnswer_different_result() +"\n");
				}
			
				
				
			} catch( NumberFormatException e1 ) {
				
				txba_result.append("Try again \n");
			}
			
			//doc.get
			
		 }
		});
		btn_enter.setBounds(85, 48, 445, 33);
		panel_RNB_choice.add(btn_enter);
		panel_RNB_guess.setLayout(null);
		panel_RNB_guess.add(lblNewLabel);
		panel_RNB_guess.add(panel_RNB_choice);
		
		JLabel lbl_goback = new JLabel("<HTML><U>Click here to go back </U></HTML>");
		lbl_goback.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_goback.setOpaque(true);
		lbl_goback.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_goback.setBounds(43, 321, 514, 26);
		panel_RNB_guess.add(lbl_goback);
		lbl_goback.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		lbl_goback.addMouseListener(new MouseAdapter()  
		{  
		    public void mouseClicked(MouseEvent e)  
		    {  
		    	frmRnguess.dispose();
		    	Game_Laucher lauch = new Game_Laucher();
		    	
		    	lauch.frmGameLaucher.setVisible(true);
		    	//panel_RNB_guess.setVisible(false);
		    	//frmRnguess.setTitle("Game launcher");
		    	//panel_GameLauch.setVisible(true);
		    	
		   

		    }  
		});
		lbl_goback.setForeground(Color.RED);
		lbl_goback.setBackground(Color.BLACK);
		


	
		frmRnguess.setBounds(100, 100, 683, 478);
		frmRnguess.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRnguess.setLocationRelativeTo(null);
	}
}



