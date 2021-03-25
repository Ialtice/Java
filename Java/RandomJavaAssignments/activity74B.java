import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class  activity74B{
public static void main(String[] args) throws IOException{
	File file = new File("accounts.txt");

	Scanner input = new Scanner(System.in);
	PrintWriter fileOutput = new PrintWriter(file);
	System.out.println("");
	int choice;
	do {
		System.out.println("Enter a user name: ");
		String user =input.next() + " ";
		System.out.println("Enter a password: " );
		String pass = input.next();
		String total = user + pass;
		fileOutput.println(total);
		fileOutput.println();
		System.out.println("Enter another account( 1 for yes , -1 for no)");
		choice = input.nextInt();
	}while (choice != -1); 
	fileOutput.close();
	System.out.println("Goodbye");
//part 2
	ArrayList<String> userName = new ArrayList<String>();
	ArrayList<String>password = new ArrayList<String>();
	Scanner fileInput = new Scanner(file);
	while (fileInput.hasNext()) {
		userName.add(fileInput.next());
		password.add(fileInput.next());
		
	}
	fileInput.close();
	String user;
	String pass;
	System.out.println("Please login:");
	System.out.println("Enter your username : ");
	user = input.next();
	while (!userName.contains(user)) {
		System.out.println("That account does not exist, try again");
		System.out.println("Enter your username : ");
		user = input.next();
	}
	int index = userName.indexOf(user);
	String correctPassword = password.get(index);
	System.out.println("Enter your password: ");
	pass = input.next();
	while (!correctPassword.equals(pass)) {
		System.out.println("Wrong password, try again");
		System.out.println("Enter your password: ");
		pass = input.next();
	}
	System.out.println("Login sucessful");
}
}