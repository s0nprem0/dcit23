/**
 *
 * @author Jayson Bulugagao | BSIT 1-4
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListLab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sentence");
        String sentence = sc.nextLine(); // Use nextLine() to read the entire line
        
        String words[] = sentence.split(" ");
        
        ArrayList<String> wordList = new ArrayList<>(); // Specify the type of ArrayList
        
        // Add words to the ArrayList
        for(String word : words) {
            wordList.add(word);
        }
        
        // Display the words in the ArrayList
        System.out.print("\nSentences in the ArrayList: ");
        for(String word : wordList) {
            System.out.print(word + " ");
        }
        
        // conditional display them in all plurals in capitalized
        System.out.print ("\nplurals capitalized:  ");
        for(String word : wordList) {
            if(word.endsWith("s")){
                System.out.print(word.toUpperCase() + " "); 
            } else {
                System.out.print(word + " ");
            }
        }
        
        // conditional display them in all plurals deleted
        System.out.print ("\nnon-plurals:  ");
        for(String word : wordList) {
            if(!word.endsWith("s")){
                System.out.print(word + " "); 
            }
        }
            
        // Display the words in reverse
        System.out.print ("\nReversed List:  ");
        ArrayList<String> reversedList = new ArrayList<>(wordList);
        Collections.reverse(reversedList);
        for(String word : reversedList) {
            System.out.print(word + " ");
        }
    }
}