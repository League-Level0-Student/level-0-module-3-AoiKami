//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extra;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String Person = JOptionPane.showInputDialog("Do you like bananas?");
		if(Person.equalsIgnoreCase("yes")){
			String Person2 = JOptionPane.showInputDialog("What is your Favorite Hobby?");
			if(Person2.equalsIgnoreCase(Person2)){
				JOptionPane.showMessageDialog(null, Person2 + "is much better than bananas!");
					}else {
						if(Person.equalsIgnoreCase("no")){
						JOptionPane.showMessageDialog(null, "Quiz has ended!");
						}
	}
}
}

		//2. if they say no, 
			//tell them they are crazy 
			//and end quiz
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"

		//4. OPTIONAL: if they say something other than â€œyesâ€? or â€œnoâ€?
		//	show a pop up that says â€œYou are bananas!â€?
	
	}



