import java.util.Scanner;

public class Capstone1 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        String input;
    
        String output;
        // Do While Example: Always runs the first time, then checks after.
        do {
            // While Loop Example: Check before running the first time.
            System.out.println("What word would you like to translate into Pig Latin? ");
            input = scnr.nextLine();
            
            
            
            
            
            //Put to lower case
            input.toLowerCase();
            input=input.toLowerCase();
            
            
            
            
            
            //find where vowels are
            System.out.println(input.contains("i"));
            System.out.println(input.indexOf("i"));
            System.out.println(input.startsWith("i"));
            
            
            
            
            
            //Make sure word starts with vowel
            //if starts with vowel add -way to end
            //Use String.startsWith
            
            
            
            
            //else if word is consonant, move all consonants 
            //before first vowel to end of word and add "ay
            
            
            
            //print word
            System.out.println(input);
            
            
            
            
            
            
            
            
            
            System.out.println("Do you want to play again? (y/n)");
            input = scnr.nextLine();
        } while (input.equals("y"));
        
        System.out.println("Goodbye.");
        

        scnr.close();
    } 
    
    //Find the first vowel of a word
    //The return 
    private static int findVowel (String [] vowels) {
    	
    }
    
}

