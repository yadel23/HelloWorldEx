
/**
 * Yadel Negash
 * 02/23/2021
 */
import java.io.FileWriter;
import java.io.IOException;

import java.util.Scanner;

public class ProfileProcessor {

	public static void main(String[] args) {

		Profile profile = new Profile();
		boolean saveNQuit = true;
		while (saveNQuit) {
			System.out.println("Would you like to: \n1. [View Profile]\n2. [Edit Profile]\n3. [Save and Quit]");
			Scanner scanner = new Scanner(System.in);
			String userInput = scanner.nextLine();
			if (userInput.equalsIgnoreCase("view profile")) {
				profile.ViewProfile();
			} else if (userInput.equalsIgnoreCase("Edit Profile")) {

				System.out.println(
						"Which field in your profile would like to edit? OPTIONS:\n############\n#FIRST NAME#\n#LAST NAME #\n#   EMAIL  #\n#   MAJOR  #\n#   DOB    #\n############");
				String userInput1 = scanner.nextLine();
				if (userInput1.equalsIgnoreCase("first name")) {
					System.out.println("what would you like to change it into?");
					String userInput2 = scanner.nextLine();
					profile.setFirstName(userInput2);
				} else if (userInput1.equalsIgnoreCase("last name")) {
					System.out.println("what would you like to change it into?");
					String userInput2 = scanner.nextLine();
					profile.setLastName(userInput2);
				} else if (userInput1.equalsIgnoreCase("email")) {
					System.out.println("what would you like to change it into?");
					String userInput2 = scanner.nextLine();
					profile.setEmail(userInput2);
				} else if (userInput1.equalsIgnoreCase("email")) {
					System.out.println("what would you like to change it into?");
					String userInput2 = scanner.nextLine();
					profile.setEmail(userInput2);
				} else if (userInput1.equalsIgnoreCase("major")) {
					System.out.println("what would you like to change it into?");
					String userInput2 = scanner.nextLine();
					profile.setMajor(userInput2);
				} else if (userInput1.equalsIgnoreCase("email")) {
					System.out.println("what would you like to change it into?");
					String userInput2 = scanner.nextLine();
					profile.setDOB(userInput2);
				} else
					System.out.println("Invalid Input try again :(");

			} else if (userInput.equalsIgnoreCase("save and quit")) {
				FileWriter fileWriter = null;
				try {
					fileWriter = new FileWriter("src/profile.txt");
					fileWriter.write(profile.getFirstName());
					fileWriter.write(String.format("%n"));
					fileWriter.write(profile.getLastName());
					fileWriter.write(String.format("%n"));
					fileWriter.write(profile.getEmail());
					fileWriter.write(String.format("%n"));
					fileWriter.write(profile.getMajor());
					fileWriter.write(String.format("%n"));
					fileWriter.write(profile.getDOB());
					fileWriter.write(String.format("%n"));

					fileWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println("Error did not work :(");
				}
				System.out.println("your profile has been saved. Here is a cat:)");
				System.out.println(" /\\_/\\\n( o.o )\n > ^ <");
				saveNQuit = false;

			}
		}
	}
}
