/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class exercice2{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        sc.nextLine();

        while (numberOfCases > 0) {
            String sequence = sc.nextLine();
            LinkedList<Character> List = new LinkedList<>();
            for (int i = 0; i < sequence.length(); i++) {
                char charc = sequence.charAt(i);
                if (charc >= 'a' && charc <= 'z') {
                    System.out.print(charc);

                } else if (charc == ')') {
                    System.out.print(List.removeLast());
                } else if (charc == '(') {
                } else {
                    List.addLast(charc);
                }
            }

            System.out.println();
            numberOfCases--;
        }
    }
}