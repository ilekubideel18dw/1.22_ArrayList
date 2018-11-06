import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ArrayListEx {
	public static void main(String args[]) {
		
		// I define a int, to close the loop I'm going to create.
		int loopnum = 0;
		
		// Scanner to ask numbers in this program.
		Scanner sc = new Scanner(System.in);
		
		// I'm going to use while, to create a loop to use more than one option when we use the program.
		while (loopnum != 1) {
			System.out.println("Options:");
			System.out.println("1.- Enter a sentence and count how many times appear one digit as first letter of a word");
			System.out.println("2.- Enter a sentence and count how many times appear one digit as last letter of a word");
			System.out.println("Choose your option:");
			
			// Here I use Scanner to use one number between 1 & 7.
			int enternum = sc.nextInt();
			
			// With Switch, I can ask for any option between 1 & 7.
			switch (enternum) {
            	
            	case 1:
            		// First we define variables for letter and sentence
            		System.out.println("Enter a letter:");
            		char l5 = sc.next().charAt(0);
        			
        			// Here we are going to delete the "spaces" that are left over
        			sc.nextLine();
            		
            		// Sentence
        			System.out.println("Enter a sentence:");
        			String st5 = sc.nextLine();
        			
        			// With split, spaces are going to be deleted, to have a String
        			// without spaces to count well the digit
        			String st50[] = st5.split(" ");
        			
        			// ArrayList
        			ArrayList<String> list5 = new ArrayList<String>();
        			
        			// Loop
        			for (int x5 = 0; x5 < st50.length; x5++) {
        				list5.add(st50[x5]);
        			}
        			
            		// Counter
            		int count5 = 0;
            		
            		// Loop
        			for (int x5 = 0; x5 < list5.size(); x5++) {
        				if (list5.get(x5).charAt(0) == l5) {
        					count5++;
        				}
        			}
        			
        			// Result
        			System.out.println("There are " + count5 + " words with " + l5 + " letter");
        					
            		// Here, I create a little program to access to another option
            		// without restart the program
        			System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
            		int continue5 = sc.nextInt();
            		if (continue5 < 1) {
            			loopnum = 1;
            		}
            		break;
            		
            	case 2:
            		// First we define variables for letter and sentence
            		System.out.println("Enter a letter:");
            		char l6 = sc.next().charAt(0);
        			
        			// Here we are going to delete the "spaces" that are left over
        			sc.nextLine();
            		
            		// Sentence
        			System.out.println("Enter a sentence:");
        			String st6 = sc.nextLine();
        			
        			// With split, spaces are going to be deleted, to have a String
        			// without spaces to count well the digit
        			String st60[] = st6.split(" ");
        			
        			// ArrayList
        			ArrayList<String> list6 = new ArrayList<String>();
        			
        			// Loop
        			for (int x6 = 0; x6 < st60.length; x6++) {
        				list6.add(st60[x6]);
        			}
        			
            		// Counter
            		int count6 = 0;
            		
            		// Loop
        			for (int x6 = 0; x6 < list6.size(); x6++) {
        				if (st60[x6].lastIndexOf(l6) == (st60[x6].length()-1) ) {
        					count6++;
        				}
        			}
        			
        			// The result
        			System.out.println("There are " + count6 + " words with " + l6 + " letter");
            		
            		// Here, I create a little program to access to another option
            		// without restart the program
        			System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
            		int continue6 = sc.nextInt();
            		if (continue6 < 1) {
            			loopnum = 1;
            		}
            		break;
            	
            	// If we put an option that it's not a number between 1 & 7,
            	// the program return this sentence	
            	default:
            		System.out.println("Incorrect option, try again.");
            		break;
			}		
        }
    }
}