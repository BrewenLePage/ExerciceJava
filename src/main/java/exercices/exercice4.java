package exercices;

import java.util.*;

public class exercice4 {
    public static void main(String[] args) {
        //Recovers what is in the array + to display the result
        String[] array = {"Alexis", "BREwen", "Théo", "Theo", "Lucas", "Yann", "yaNn", "Osman", "osmaN"};
        Scanner sc = new Scanner(System.in);
        int numberOfNames = sc.nextInt();
        String lastName = lastNameLetters(array, numberOfNames);
        System.out.println(lastName);
    }
    public static String lastNameLetters(String[] name, int numberOfNames){
        //Find how many time you have each name
        String firstName = null;
        for (int i = name.length - 1; i >= 0; i--) {
            if (name[i].length() == numberOfNames) {
                firstName = name[i];
                break;
            }
        }
        return firstName;
    }
}
