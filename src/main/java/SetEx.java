import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SetEx {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Lion");
        treeSet.add("tiger");
        treeSet.add("giraffe");

        System.out.println(treeSet);
        treeSet.add("tiger");
        System.out.println(treeSet);

        Set<String> wordSet = new TreeSet<>(Comparator.comparing(String::length));
        wordSet.add("tiger");
        wordSet.add("deer");
        wordSet.add("monkey");

        System.out.println(wordSet);
    }
}
