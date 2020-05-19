package mastermind;


import game_laucher.Game_Laucher;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.LineBorder;

import java.awt.GridBagLayout;







public class Mastermind_GUI {

	public JFrame frmMastermind;

	private Mastermind_Controller game_con;
	
	
	private int uc_focus =0;

	private int gridrow=1;
	private char uc_answer[] = new char[5];
	
	
	
	JButton btn_uc0;
	JButton btn_uc1;
	JButton btn_uc2;
	JButton btn_uc3;
	JButton btn_uc4;
	private void removecurrentfocus() {
		
		if(uc_focus ==0)
			btn_uc0.setBorder(null);
		else if(uc_focus ==1)
			btn_uc1.setBorder(null);
		else if(uc_focus ==2)
			btn_uc2.setBorder(null);
		else if(uc_focus ==3)
			btn_uc3.setBorder(null);
		else if(uc_focus ==4)
			btn_uc4.setBorder(null);
		
		
	}
	
	
	private void set_uc_code(int colorcode[]) {
		
		removecurrentfocus();
		 
		 
		//Set the color code and focus to next  
		if(uc_focus ==0) {
			btn_uc0.setBackground(new Color(colorcode[0], colorcode[1], colorcode[2]));
			btn_uc1.setBorder(new LineBorder(new Color(255, 69, 0), 5));
			uc_focus +=1;
		}
		else if(uc_focus ==1) {
			btn_uc1.setBackground(new Color(colorcode[0], colorcode[1], colorcode[2]));
			btn_uc2.setBorder(new LineBorder(new Color(255, 69, 0), 5));
			uc_focus +=1;
		}
		else if(uc_focus ==2) {
			btn_uc2.setBackground(new Color(colorcode[0], colorcode[1], colorcode[2]));
			btn_uc3.setBorder(new LineBorder(new Color(255, 69, 0), 5));
			uc_focus +=1;
		}
		else if(uc_focus ==3) {
			btn_uc3.setBackground(new Color(colorcode[0], colorcode[1], colorcode[2]));
			btn_uc4.setBorder(new LineBorder(new Color(255, 69, 0), 5));
			uc_focus +=1;
			
		}
		else if(uc_focus ==4) {
			btn_uc4.setBackground(new Color(colorcode[0], colorcode[1], colorcode[2]));
			btn_uc4.setBorder(new LineBorder(new Color(255, 69, 0), 5));
			uc_focus =4;
	
			
		}
		
	}
	
	/**
	 * Create the application.
	 */
	
	public Mastermind_GUI(int num ) {
		// create the game controller and set the try before initialize the content of the JFRAME
		game_con = new Mastermind_Controller(num);
		
		for(int i=0; i < uc_answer.length; i++) {
			
			uc_answer[i]='P';
			
		}
		initialize();
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMastermind = new JFrame();
		frmMastermind.setTitle("Mastermind");
		frmMastermind.getContentPane().setBackground(Color.WHITE);
		frmMastermind.getContentPane().setLayout(new CardLayout(0, 0));
		frmMastermind.setResizable(false);
	
		
		JPanel MainPanel = new JPanel();
		MainPanel.setForeground(Color.GREEN);
		
	
		MainPanel.setBackground(SystemColor.windowBorder);
		frmMastermind.getContentPane().add(MainPanel, "name_20938481430500");
		
		MainPanel.setVisible(true);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBackground(SystemColor.windowBorder);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(286, 35, 381, 317);
		MainPanel.add(scrollPane);
		
		
		JPanel panel_displayresult = new JPanel();
		panel_displayresult.setAutoscrolls(true);
		panel_displayresult.setBackground(SystemColor.windowBorder);
		scrollPane.setViewportView(panel_displayresult);
		panel_displayresult.setBorder(null);
		
		
		GridBagLayout gbl_panel_displayresult = new GridBagLayout();
		gbl_panel_displayresult.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_displayresult.rowHeights = new int[] {5,5,5,5,5,5};
		gbl_panel_displayresult.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		gbl_panel_displayresult.rowWeights = new double[]{50.0, 50.0, 50.0};
		
		
		panel_displayresult.setLayout(gbl_panel_displayresult);
		
		
		
		JLabel lblNewLabel = new JLabel("MasterMind");
		lblNewLabel.setBounds(35, 11, 227, 74);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel.setForeground(Color.WHITE);
		
		JLabel lbl_noof_try = new JLabel( game_con.getTries() + " attempt(s) left" );
		lbl_noof_try.setBounds(370, 11, 203, 21);
		lbl_noof_try.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_noof_try.setForeground(Color.WHITE);
		lbl_noof_try.setFont(new Font("Tahoma", Font.BOLD, 12));
		MainPanel.add(lbl_noof_try);
		
		JPanel Panel_Choices = new JPanel();
		Panel_Choices.setBounds(104, 357, 441, 92);
		
		JButton btn_sumbit = new JButton("Submit");
		btn_sumbit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				
			
					char result[] = game_con.checkcode(uc_answer);
					
					
					System.out.println(result);
					
					
					lbl_noof_try.setText(game_con.getTries() + " attempt(s) left");
					
					if(result[0]=='C'&& result[1]=='C' && result[2]=='C' && result[3]=='C' && result[4]=='C') {
						
						 int user_response = JOptionPane.showConfirmDialog(null, "Congratz ... You had solve the Code" + "\n"
							 		+ "Do you wish to start again ?", "CONGRATZ", JOptionPane.YES_NO_OPTION);
							
							 //YES IS 0 No is 1 
							 if(user_response == JOptionPane.YES_OPTION) {
								 frmMastermind.dispose();
								 Mastermind_Setdiffcutly startnew = new Mastermind_Setdiffcutly();
								 
								 startnew.frmSetDiffcutly.setVisible(true);
					
								 
							 } else {
								     
								 frmMastermind.dispose();
								 
							    Game_Laucher lauch = new Game_Laucher();
							    	
							    	lauch.frmGameLaucher.setVisible(true);
								 
							 }
						
					} else {
						
						
						
						if(game_con.getTries() >0) {
							
							
							
							// setRowMinHeight(gridbag, 1, 10);
							//System.out.println(uc_answer);
							
							
							
							
							JButton  btn_response[] = new JButton [5];
							JButton  btn_uc_answer[] = new JButton [5];
							 
							
							 GridBagConstraints gbc = new GridBagConstraints();  
							 gbc.fill=GridBagConstraints.BOTH;
							
							 
							 gbc.gridy= gridrow+2;
							
							 int xlocation= 0;
							 
							 
							 for(int i=0; i< uc_answer.length; i++ ) {
								 gbc.gridx=xlocation;
								 
								 btn_uc_answer[i] = new JButton("");
								 btn_uc_answer[i].setOpaque(true);
								 btn_uc_answer[i].setEnabled(false);
								 
								 
								 if(uc_answer[i]=='P') {
									 
									 btn_uc_answer[i].setBackground(new Color(255,0, 255));
									
									 
								 } else if (uc_answer[i]=='B') {
									 
									 btn_uc_answer[i].setBackground(new Color(0,0, 255));
									 
								 } else if(uc_answer[i]=='Y') {
									 
									 btn_uc_answer[i].setBackground(new Color(255,255,0));
									 
									 
									 
								 } else if(uc_answer[i] =='G') {
									 
									 btn_uc_answer[i].setBackground(new Color(218, 165, 32));
									 
								 }
								 
								 
								 
								 panel_displayresult.add(btn_uc_answer[i],gbc);
								 xlocation++;
								 
							 }
							 
							 
							 
							 
							 
							 for(int i = 0; i < btn_response.length; i++) {
								
								   
								 gbc.gridx=xlocation;
								   
										   
								   btn_response[i] = new JButton("");
								   btn_response[i].setOpaque(true);
								   btn_response[i].setEnabled(false);
								   
					
								   
								  
								   
								   if(result[i] == 'L') {
									   
									 
									  btn_response[i].setBackground(Color.WHITE);
									   
								   } else if (result[i] =='W') {
									   
									   
									   btn_response[i].setBackground(Color.RED); 
									   
									   
								   } else if (result[i]=='C') {
									   
									   btn_response[i].setBackground(Color.GREEN); 
								   }
									   
								   
								   panel_displayresult.add(btn_response[i],gbc);
								   xlocation++;
								   }
							
							
							gridrow++;
							panel_displayresult.validate();
							panel_displayresult.repaint();
							
							
							
						} else {
							
							 int user_response = JOptionPane.showConfirmDialog(null, "Dang it  ... You had run out of attempt "
								 		+ "Do you wish to try again ?", "Try again ?", JOptionPane.YES_NO_OPTION);
								
								 //YES IS 0 No is 1 
								 if(user_response == JOptionPane.YES_OPTION) {
									 frmMastermind.dispose();
									 Mastermind_Setdiffcutly startnew = new Mastermind_Setdiffcutly();
									 
									 startnew.frmSetDiffcutly.setVisible(true);
						
									 
								 } else {
									     
									 frmMastermind.dispose();
									 
								    Game_Laucher lauch = new Game_Laucher();
								    	
								    	lauch.frmGameLaucher.setVisible(true);
									 
								 }
							
							
							
						}
						
						
						
						
					}
					
					
					
					

				
				
					//game_con.setTries(game_con.getTries()-1);
					//lbl_noof_try.setText(game_con.getTries() + " tries left");
					
					
				
			
				
			}
		});
		btn_sumbit.setBounds(557, 357, 120, 95);
		
		JButton btnGoBack = new JButton("Go Back");
		btnGoBack.setBounds(0, 357, 94, 92);
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmMastermind.dispose();
				Game_Laucher laucher = new Game_Laucher();
				
				laucher.frmGameLaucher.setVisible(true);
				
				
				
			}
		});
		
	
		
		

		
		JPanel panel_resultinfo = new JPanel();
		panel_resultinfo.setBounds(0, 121, 248, 73);
		panel_resultinfo.setBackground(SystemColor.windowBorder);
		panel_resultinfo.setLayout(null);
		
		JLabel lblerror = new JLabel("S");
		lblerror.setBounds(10, 0, 16, 14);
		panel_resultinfo.add(lblerror);
		lblerror.setForeground(Color.RED);
		lblerror.setOpaque(true);
		lblerror.setBackground(Color.RED);
		
		JLabel lbl_correct = new JLabel("S");
		lbl_correct.setBounds(10, 25, 16, 14);
		panel_resultinfo.add(lbl_correct);
		lbl_correct.setOpaque(true);
		lbl_correct.setForeground(Color.GREEN);
		lbl_correct.setBackground(Color.GREEN);
		
		JLabel lbl_correct_1 = new JLabel("S");
		lbl_correct_1.setBounds(10, 47, 16, 14);
		panel_resultinfo.add(lbl_correct_1);
		lbl_correct_1.setOpaque(true);
		lbl_correct_1.setForeground(Color.WHITE);
		lbl_correct_1.setBackground(Color.WHITE);
		
		JLabel lblNewLabel_1 = new JLabel("Entirely not part of code");
		lblNewLabel_1.setForeground(SystemColor.text);
		lblNewLabel_1.setBounds(41, 0, 144, 14);
		panel_resultinfo.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Correct Color and Location");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setBounds(40, 25, 161, 14);
		panel_resultinfo.add(lblNewLabel_1_1);
		Panel_Choices.setLayout(null);
		MainPanel.setLayout(null);
		MainPanel.add(btnGoBack);
		MainPanel.add(Panel_Choices);
		
		
		
	
		
		
		btn_uc0 = new JButton("");
		btn_uc0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removecurrentfocus();
				btn_uc0.setBorder(new LineBorder(new Color(255, 69, 0), 5));
				uc_focus=0;
					
				
			}
			
		});
		btn_uc0.setBorder(new LineBorder(new Color(255, 69, 0), 5));
		btn_uc0.setForeground(new Color(255, 0, 255));
		btn_uc0.setBackground(new Color(255, 0, 255));
		btn_uc0.setBounds(10, 11, 75, 70);
		Panel_Choices.add(btn_uc0);
		
		
		btn_uc1 = new JButton("");
		btn_uc1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removecurrentfocus();
				btn_uc1.setBorder(new LineBorder(new Color(255, 69, 0), 5));
				uc_focus=1;
			}
		});
		btn_uc1.setForeground(new Color(255, 0, 255));
		btn_uc1.setBackground(new Color(255, 0, 255));
		btn_uc1.setBounds(95, 11, 75, 70);
		Panel_Choices.add(btn_uc1);
		
		btn_uc2 = new JButton("");
		btn_uc2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				removecurrentfocus();
				btn_uc2.setBorder(new LineBorder(new Color(255, 69, 0), 5));
				uc_focus=2;
			}
			
		});
		btn_uc2.setForeground(new Color(255, 0, 255));
		btn_uc2.setBackground(new Color(255, 0, 255));
		btn_uc2.setBounds(180, 11, 75, 70);
		Panel_Choices.add(btn_uc2);
		
		btn_uc3 = new JButton("");
		btn_uc3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removecurrentfocus();
				btn_uc3.setBorder(new LineBorder(new Color(255, 69, 0), 5));
				uc_focus=3;
			}
		});
		btn_uc3.setForeground(new Color(255, 0, 255));
		btn_uc3.setBackground(new Color(255, 0, 255));
		btn_uc3.setBounds(265, 11, 75, 70);
		Panel_Choices.add(btn_uc3);
		
	
		btn_uc4 = new JButton("");
		btn_uc4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removecurrentfocus();
				btn_uc4.setBorder(new LineBorder(new Color(255, 69, 0), 5));
				uc_focus=4;
			}
		});
		btn_uc4.setBounds(350, 11, 75, 70);
		Panel_Choices.add(btn_uc4);
		btn_uc4.setForeground(new Color(255, 0, 255));
		btn_uc4.setBackground(new Color(255, 0, 255));
		
		
		MainPanel.add(btn_sumbit);
		MainPanel.add(lblNewLabel);
		MainPanel.add(panel_resultinfo);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Correct Color but Wrong Location");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setBounds(40, 47, 170, 14);
		panel_resultinfo.add(lblNewLabel_1_1_1);
		
	
		JLabel lbl_codeAvilable = new JLabel("Select the Code");
		lbl_codeAvilable.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_codeAvilable.setForeground(Color.WHITE);
		lbl_codeAvilable.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl_codeAvilable.setBounds(38, 243, 117, 29);
		MainPanel.add(lbl_codeAvilable);
		
		JPanel panel_resultinfo_1 = new JPanel();
		panel_resultinfo_1.setLayout(null);
		panel_resultinfo_1.setBackground(new Color(0, 0, 0));
		panel_resultinfo_1.setBounds(0, 278, 248, 73);
		MainPanel.add(panel_resultinfo_1);
		
		
		
		
		// This is where the user will click
		
		JLabel cc_pink = new JLabel("S");
		cc_pink.setOpaque(true);
		cc_pink.setForeground(new Color(255, 0, 255));
		cc_pink.setBackground(new Color(255, 0, 255));
		cc_pink.setBounds(10, 11, 53, 51);
		
		cc_pink.addMouseListener(new MouseAdapter()  
		{  
		    public void mouseClicked(MouseEvent e)  
		    {  
		    	
		    	int [] color_code= {255,0,255 };
		    	uc_answer[uc_focus]='P';
		    	set_uc_code(color_code);

		    }  
		});
		panel_resultinfo_1.add(cc_pink);
		
		JLabel cc_blue = new JLabel("S");
		cc_blue.setOpaque(true);
		cc_blue.setForeground(new Color(0, 0, 255));
		cc_blue.setBackground(new Color(0, 0, 255));
		cc_blue.setBounds(67, 11, 53, 51);
		
		cc_blue.addMouseListener(new MouseAdapter()  
		{  
		    public void mouseClicked(MouseEvent e)  
		    {  
		    	
		    	int [] color_code= {0,0,255 };
		    	uc_answer[uc_focus]='B';
		    	set_uc_code(color_code);

		   

		    }  
		});
		
		panel_resultinfo_1.add(cc_blue);
		
		JLabel cc_yellow = new JLabel("S");
		cc_yellow.setOpaque(true);
		cc_yellow.setForeground(new Color(255, 255, 0));
		cc_yellow.setBackground(new Color(255, 255, 0));
		cc_yellow.setBounds(125, 11, 53, 51);
		
		cc_yellow.addMouseListener(new MouseAdapter()  
		{  
		    public void mouseClicked(MouseEvent e)  
		    {  
		    	
		    	int [] color_code= {255,255,0 };
		    	uc_answer[uc_focus]='Y';
		    	set_uc_code(color_code);

		   

		    }  
		});
		
		panel_resultinfo_1.add(cc_yellow);
		
		JLabel cc_brown = new JLabel("S");
		cc_brown.setOpaque(true);
		cc_brown.setForeground(new Color(218, 165, 32));
		cc_brown.setBackground(new Color(218, 165, 32));
		cc_brown.setBounds(185, 11, 53, 51);
		
		cc_brown.addMouseListener(new MouseAdapter()  
		{  
		    public void mouseClicked(MouseEvent e)  
		    {  
		    	
		    	int [] color_code= {218,165,32};
		    	uc_answer[uc_focus]='G';
		    	set_uc_code(color_code);

		   

		    }  
		});
		panel_resultinfo_1.add(cc_brown);
		
		
		
		
		

		  
		frmMastermind.setBounds(100, 100, 683, 492);
		frmMastermind.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMastermind.setLocationRelativeTo(null);
	}
}



