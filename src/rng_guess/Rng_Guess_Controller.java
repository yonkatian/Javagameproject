package rng_guess;

import java.util.Random;

public class Rng_Guess_Controller {

	static Random ran = new Random(); 
	
	private static  int answer = ran.nextInt(10000)+1; 
	
	private static  int tries = 1;
	
	private static int answer_different = 0;
	
	
	public static int getTries() {
		return tries;
	}
	
	
	public void reset_game() {
		
		
		answer = ran.nextInt(10000)+1; 
		tries =1;
		
	}
	
	public static int getanswer() {
		
		return answer;
	}
	
	public  String getAnswer_different_result() {
		
		String result ="";
		
		
		if(answer_different < 0) 
			result = "WOAH... you overshot try scalling down ur response.";
		
		
		else if(answer_different > 1000) 
			result ="Incorrect... The different between the answer and yours is extremely huge >1000";
		
		else if(answer_different >500)
			result ="Not quite there yet.  Quite a huge different >900 between your response and the answer.";
		
		else if(answer_different > 100) 
			result ="Nope... still a couple more distance to go >100  before you guess the correct answer...keep trying";
		
		else if(answer_different >50)
			result="Keep trying.. the different between the your response and the answer is getting smaller but it more than half ";
		
		else if(answer_different > 25 )
			result ="The difference between your reponse and the answer is more than a quarter but less than an half ";
		
		else if(answer_different >= 5 )
			result ="Getting... really close but you can do better";
		else if(answer_different <5)
			result ="WOAH... ALMOST THERE !!!!!! (Last message)";
			
			
		/*else if (answer_different <10)
			result ="Almost there ";
		
		else if (answer_different <50)
			result ="Not quite but at least you geting there... Keep trying !";
		
		else if (answer_different <100) 
		*/
		return result;
	}

	
	public boolean checkanswer(int user_answer ) {
		
		
		if( answer == user_answer)
			return true;
		else {
			
			tries +=1;
			
			answer_different = answer - user_answer ;
			
						
			return false ;
			
		}
		
		
	}
	

	
	
}