/*
 * Muzammil Shafiq, CSC200
 * Initialize all variables at the beginning
 * Ask for account type(Staff, Student, Admin)
 * Show Input Dialog asking for username
 * If the username is correct, ask for password
 * If username is incorrect, retry asking for username (3 tries altogether)
 * If password is incorrect, retry asking for username (3 tries altogether)
 * If incorrect 3 times, Show Message Box saying to contact admin
 * If password is correct, use switch method
 * In case1, Admin account was chosen so write Welcome admin
 * In case1, Student account was chosen so write Welcome student
 * In case1, Staff account was chosen so write Welcome staff
 * Exit the application
 */
import javax.swing.JOptionPane;
public class Assignment3 {

	public static void main(String[] args) { 
		String[] choices = { "Admin", "Student", "Staff"};
		String input = (String) JOptionPane.showInputDialog(null, "Choose account type...","Account Type",JOptionPane.QUESTION_MESSAGE, null,choices,choices[1]);
		
		int count = 0;
		String userInput = JOptionPane.showInputDialog("Enter username:");
		while(count < 3)
		{
		if(userInput.equals(input.toLowerCase()))
		{
			String passInput = JOptionPane.showInputDialog("Enter password:");
			if(passInput.equals("password"))
			{switch(input)
				{
				case "Admin":
					JOptionPane.showMessageDialog(null, "Welcome Admin!");
					System.exit(0);
					break;
				case "Student":
					JOptionPane.showMessageDialog(null, "Welcome Student!");
					System.exit(0);
					break;
				case "Staff":
					JOptionPane.showMessageDialog(null, "Welcome Staff!");
					System.exit(0);
					break;
				}
			}
			else
			{
			count++;
			JOptionPane.showMessageDialog(null, "Password incorrect.");
			userInput = JOptionPane.showInputDialog("Enter username:");
			}
		}
		else
		{
		count++;
		JOptionPane.showMessageDialog(null, "Invalid username.");
		if(count < 3)
		userInput = JOptionPane.showInputDialog("Enter username:");
		}
		if(count >= 3)
		{
		JOptionPane.showMessageDialog(null, "Contact administrator.");
		System.exit(0);
		}
		}
		
	}

}
