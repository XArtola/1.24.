/**
 * 
 */

/**
 * @author ik013043z1
 *
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex_1_24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a sentence:\n");
		//Initialize the ArrayList
		ArrayList<String> words = new ArrayList<String>();
		//Initialize the string
		String sentence = " ";
		//Scan the line
		sentence = sc.nextLine();
		//Separate the sentence in words
		String separatedWords[] = sentence.split(" ");
		//Add each word in a position of the list
		for (int a = 0; separatedWords.length - 1 >= a; a++) {
			//Add the string of the actual cell the list
			words.add(separatedWords[a]);

		}
		//Print the list
		System.out.println("This is your list " + words);
		//Print the size of the list
		System.out.println("The ArrayList has " + words.size() + " words\n");
		//Print the first and the last strings in th elist
		System.out.println("The first word is " + words.get(0) + " and the last " + words.get(words.size() - 1) + "\n");
		//Ask for a word
		System.out.println("Enter a word to know if it is stored on the list:\n");
		//Scan the words
		String search = sc.next();
		//See if the list contains the word
		if (words.contains(search)) {
			// Print the position in the list of this words
			System.out.println("Yes, it is in the " + (words.indexOf(search) - 1)
					+ " position the first time, and in the " + (words.lastIndexOf(search) - 1) + " the last.\n");

		}

		else {

			System.out.println("No it is not\n");

		}
		//Print the options
		System.out.println("Do you want to remove any information from the list?\n" + "1- Remove a word\n"
				+ "2- Remove a position in the list\n" + "3- Do a security copy\n" + "4- Erase all the list\n"
				+ "5- Convert the list into an aray\n" + "6- Add a word at begginnig and at the ending of the word\n");
		//Initialize the an int to store what the user has chosen
		int option = 0;
		//Scan th eoption
		option = sc.nextInt();
		//While the user keeps entering an invalid option...
		while (option != 1 && option != 2 && option != 3 && option != 4 && option != 5 && option != 6) {
			
			System.out.println("Please enter a one of the valid options\n");

			option = sc.nextInt();

		}

		switch (option) {

		case 1:
			//ask for the word to remove
			System.out.println("Which word do you want to remove?\n");
			//Scan the word
			String toRemove = sc.next();
			//Remove it
			words.remove(toRemove);
			break;

		case 2:
			//Ask for the position we want to erase
			System.out.println("Which list position do you want to remove?\n");
			int toRemovePos = 0;
			sc.nextInt();
			//Remove the word in the position
			words.remove(toRemovePos);
			break;

		case 3:
			//Copy the list to another ArrayList
			ArrayList<String> securityCopy = (ArrayList) words.clone();
			break;

		case 4:
			//Erasse all th evalues in the list
			words.clear();
			//If th e list is empty...
			if (words.isEmpty()) {

				System.out.println("The list is now empty\n");

			}
			break;

		case 5:
			//Convert the list into an array
			Object[] array = words.toArray();
			//Print the array we have created
			System.out.println(Arrays.toString(array));
			break;

		case 6:
			//Add a word in the first list position (Index starts from 0)
			words.add(0, "FirstWord");
			//Add a word in the last list position
			words.add("LastWord");
			//Print the list
			System.out.println(words);

		}

	}

}
