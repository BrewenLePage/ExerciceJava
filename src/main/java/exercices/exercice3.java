import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class exercice3 {
    public static void main(String[] args) {
        List<Integer> names = new ArrayList<>();
        String[] array = {"Alexis","BREwen","Théo","Theo","Lucas","Yann","yaNn","Osman","osmaN"};
        List<String> finalArray = new ArrayList<>();
        for (String element : array) {
            String finalArrays = parsedString(element);
            finalArray.add(finalArrays);
        }
        names.add(frequencyNames(finalArray, "alexis"));
        names.add(frequencyNames(finalArray, "brewen"));
        names.add(frequencyNames(finalArray, "theo"));
        names.add(frequencyNames(finalArray, "lucas"));
        names.add(frequencyNames(finalArray, "yann"));
        names.add(frequencyNames(finalArray, "osman"));
        System.out.println(names);
    }
    private static String parsedString(String array) {
        String element = array;
        element = element.toLowerCase().replaceAll("[éèêë]", "e");
        return element;
    }
    private static Integer frequencyNames(List<String> list, String research) {
        return Collections.frequency(list, parsedString(research));
    }
}
