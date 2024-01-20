import java.util.Random;

import javax.swing.JTextField;

public class NumberGenerator {
	Random random = new Random();
	
	public  int randomNumber() {
		return random.nextInt(100);
	}
	public String getUserNumber(JTextField textField,int num) {
		String result = textField.getText();
		
		try {
		   int res = Integer.parseInt(result);
		   
		   if(Math.abs(num-res)==0) {
			   return "You Guesed the Correct Number.";
		   }
		   else if(Math.abs(num-res)>=60) {
			   return "Guesed Number is too High";
		   }
		   else {
			   return "Guessed Number is too Low";
		   }
		}
		catch(Exception e) {
			return "Enter Numeric values..";
		}
	}
}
