package StringAssignments;
import java.util.*;

public class Prog5_1 {

    public static void main(String[] args) {

        System.out.println("Enter a sentence:");
        Scanner sc=new Scanner(System.in);
        String sentence = sc.nextLine();
        List<String> words = Arrays.asList(sentence.split(" "));

        String shortestWord = words.stream().min(
                Comparator.comparing(
                        word -> word.length()))
                .get();

        System.out.println(shortestWord);
    }
}
