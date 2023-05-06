/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class exercice2{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in); //New instance of Scanner class
        int numberOfCases = sc.nextInt(); //read an integer from the User entry
        sc.nextLine(); //Empty the next line

        while (numberOfCases > 0) {
            String sequence = sc.nextLine();
            LinkedList<Character> List = new LinkedList<>(); //Store a list
            for (int i = 0; i < sequence.length(); i++) {
                char letter = sequence.charAt(i); //take the letter
                if (letter >= 'a' && letter <= 'z') {
                    System.out.print(letter);
                } else if (letter == ')') {
                    System.out.print(List.removeLast());//take out the last element
                } else if (letter == '(') {
                } else {
                    List.addLast(letter);//add the element to the list
                }
            }
            System.out.println();
            numberOfCases--; //for continue the while
        }
    }
}