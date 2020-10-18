import java.util.Scanner;

public class EmailAddressProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the Colgan Shark Mail Email Provider.");
		System.out.println(" ");
		
		//If your variable contains two words, the first letter of the second word is capitalized
		//For instance, firstName is correct Java style.
		
		System.out.println("Please enter your First Name.");// Asks first question
		String firstname = keyboard.nextLine(); // Stores user input for First name
		
		System.out.println(" ");
		System.out.println("Your First Name is: " + firstname); // Shows response to user for verification
		System.out.println("Please enter your Last Name."); // Asks second question
		String lastname = keyboard.nextLine(); // Stores user input for Last Name
		
		System.out.println(" ");
		System.out.println("Your Last Name is: " + lastname); // Shows response for verification
		System.out.println("Please enter your Middle Name."); // Asks third question
		String middlename = keyboard.nextLine(); // Stores user input for Middle Initial
		
		System.out.println(" ");
		System.out.println("Your Middle Name is: " + middlename); // Shows response for verification
		System.out.println("Please enter your Birthdate. (mm-dd-yyyy)"); // Asks fourth question
		String birthdate = keyboard.nextLine(); // Stores user input for Birthdate
		
		System.out.println(" ");
		System.out.println("Your Birthdate is: " + birthdate);// Shows response for verification
		System.out.println(" ");
		
		// converts inputs to correct punctuation
		//you can update the variable to be lowercase. for instance middleName = middleName.toLowerCase() will overwrite the value with an all lowercase string
		//these lines are redundant
		String lowercaselast = lastname.toLowerCase();
		String capitalfirst = firstname.toUpperCase();
		String capitalmiddlei = middlename.toUpperCase();
		
		//changing to form of email
		//String lastnameemail = lowercaselast.substring(0, 6); // This part introduces a bug that will error out if the last name is less than 6 characters. A  solution would be to add an if else statement for this but currently I do not know how to use it
		String firstnameemail = capitalfirst.substring(0, 1);
		String middleinitemail = capitalmiddlei.substring(0, 1);
		
		//changes birthdate to email password by picking out numbers and individually storing each as a string
		String epasswordmm = birthdate.substring(0, 2);
		String epassworddd = birthdate.substring(3, 5);
		String epasswordyyyy = birthdate.substring(6, 10);
		
		//you can concatenate the email address with the necessary part of each first, middle, and last name.
		// prints a sentence that notifies user of generation of email and password
		System.out.println(" ");
		System.out.println("Your Email Address and Temporary Password have been generated.");
		System.out.println(" ");
		
		System.out.println("Email: " + /*lastnameemail*/lowercaselast + firstnameemail + middleinitemail + "@sharkmail.com");
		System.out.println("");
		
		//you can also process the birthdate as one substring, instead of storing each part into a separate variable.
		System.out.println("Temporary Password: " + epasswordmm + "" + epassworddd + "" + epasswordyyyy);
		
		System.out.println("NOTE: *** THIS PASSWORD IS TEMPORARY AND VERY INSECURE. PLEASE CHANGE PASSWORD AS SOON AS POSSIBLE! ***");
		

	}
}

//Your code works. And, that's the whole point. But, learn to make more efficient use of your code. Doing, so will greatly reduce time with debugging (because there are fewer variables)
//100/100
