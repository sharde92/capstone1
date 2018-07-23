package capstone1;
 import java.io.*;
 import java.util.Scanner;
public class PigLatin1 {


	public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String englishWord,pigLatinWord;
        char userInput;
    
        
        boolean response;
        do {
        System.out.println("Enter a word: ");
        englishWord = scnr.next();
        pigLatinWord = convert(englishWord);
        System.out.println("The result is: " + pigLatinWord );
        
        System.out.println("Would you like to enter another word? (y/n)");
        userInput = scnr.next().charAt(0);
        if (userInput =='y') {
            response = true;
        }else {response = false;
        System.out.println("Goodbye! ");
        }
        }while (response == true);
        scnr.close();
}
    public static String convert (String s)
    {
    String consonants,firstVowel,finalWord;
    int l, i;
    char letter;
    s = s.toLowerCase();
    l = s.length();
    
    
    for(i = 0; i < l; i++) {
    
        letter = s.charAt(i);
        if (letter=='a'|| letter=='e'|| letter=='i'|| letter=='o'||letter=='u') {
            break;
        }
    }
    
    if (i == 0) {
        finalWord = s + "way";
    }
    
    else {
    consonants = s.substring(0,i);
    firstVowel = s.substring(i);
    finalWord = firstVowel + consonants + "ay";
    }
    
    return finalWord;
}
}
