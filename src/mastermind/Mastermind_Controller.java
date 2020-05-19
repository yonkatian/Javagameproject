package mastermind;

import java.util.Random;

import java.util.ArrayList;


public class Mastermind_Controller {
	
	private int tries ;
	
	
	private ArrayList <Character> code_answer = new ArrayList<>();
	
	public Mastermind_Controller(int num) {
		tries =  num ;
		setCode();
	}


	public int getTries() {
		return tries;
	}
	
	public void setTries(int num ) {
		tries =  num ;
	}
	
	
	public void setCode() {
		
		Random ran = new Random(); 
		for(int i=0; i<5 ; i++) {
			
			
			int buffer = ran.nextInt(4)+1;
			switch(buffer) {
				
				case 1:
					code_answer.add('P');
					break;
				
				case 2:
					code_answer.add('B');
					break;
					
				case 3:
					code_answer.add('Y');
					break;
				
				case 4:
					code_answer.add('G');
					break;
				
					
			}
			
			
			
		}
		
		System.out.println(code_answer);

		
		
	}
	
	
	public ArrayList<Character> getCode() {
		
		
		return code_answer;
	}
	

	@SuppressWarnings("unchecked")
	public char[] checkcode(char user_answer[]) {
		
		/*
		 * C mean correct location and color
		 * L mean correct color but wrong location
		 * W mean completely wrong 
		 * 
		 * 
		 * N is user for the clone of the answer to denote it been checked 
		 */

	
		tries--;
		char result[] = new char[5];
		
	
		ArrayList<Character> code_checker = new ArrayList<Character>();
		code_checker=(ArrayList<Character>)code_answer.clone();


		for(int arrayindex =0 ; arrayindex < user_answer.length; arrayindex++) {
			
			
			if(code_checker.contains(user_answer[arrayindex])) {
				
			    int code_checker_index = code_checker.indexOf(user_answer[arrayindex]);
				if (  code_checker_index == arrayindex ) {
				
					result[arrayindex]='C';
				
				} else {
				
					result[arrayindex]='L';
				}
				
				
				code_checker.set(code_checker_index, 'N');
				
				
			} else {
				
				
				result[arrayindex]='W';
				
				
			}
			
			
			
			
			
		}
		
	
		return result;
		
		
		
		
	}
	
}
