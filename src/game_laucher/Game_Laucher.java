package game_laucher;

import rng_guess.Rng_Guess_GUI;
import mastermind.Mastermind_Setdiffcutly;
import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.CardLayout;
import javax.swing.JPanel;



public class Game_Laucher {

	public  JFrame frmGameLaucher;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game_Laucher window = new Game_Laucher();
					window.frmGameLaucher.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Game_Laucher() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGameLaucher = new JFrame();
		frmGameLaucher.setTitle("Game Launcher");
		frmGameLaucher.getContentPane().setBackground(Color.WHITE);
		frmGameLaucher.getContentPane().setLayout(new CardLayout(0, 0));
		frmGameLaucher.setResizable(false);
		
		JPanel panel_GameLauch = new JPanel();
		
		
		panel_GameLauch.setBackground(Color.WHITE);
		frmGameLaucher.getContentPane().add(panel_GameLauch, "name_20893951424100");
		panel_GameLauch.setLayout(null);
		
		JLabel lbl_Selectagame = new JLabel("Select a Game");
		lbl_Selectagame.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbl_Selectagame.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Selectagame.setBounds(232, 11, 156, 32);
		panel_GameLauch.add(lbl_Selectagame);
		

		
		//JPanel panel_RNB_guess = new JPanel();
		
		JButton btn_Rnb_guess = new JButton("Random  Number Guess");
		btn_Rnb_guess.setBounds(33, 140, 186, 23);
		
		
		btn_Rnb_guess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmGameLaucher.dispose();
				
				Rng_Guess_GUI rng_guess = new Rng_Guess_GUI();
				
				rng_guess.frmRnguess.setVisible(true);
				
				//panel_GameLauch.setVisible(false);
				//frmGameLaucher.setTitle("MOVE ON");
				//panel_RNB_guess.setVisible(true);
				
				
			}
		});
		panel_GameLauch.add(btn_Rnb_guess);
		
		JButton btn_mastermind = new JButton("Mastermind");
		btn_mastermind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmGameLaucher.dispose();
				Mastermind_Setdiffcutly mastermind = new Mastermind_Setdiffcutly();
				mastermind.frmSetDiffcutly.setVisible(true);
				
			}
		});
		btn_mastermind.setBounds(316, 140, 186, 23);
		panel_GameLauch.add(btn_mastermind);
	
		
	
		frmGameLaucher.setBounds(100, 100, 638, 478);
		frmGameLaucher.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frmGameLaucher.setLocationRelativeTo(null);
	}
}



