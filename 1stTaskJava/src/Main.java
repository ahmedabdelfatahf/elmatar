import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<String> values = Arrays.asList("apple", "car" ,"bat", "dog", "elephant");
        // first solution with built-in function with lambda
        values.sort((s1, s2) -> {
            int lengthComparison = Integer.compare(s1.length(), s2.length());
            if (lengthComparison != 0) {
                return lengthComparison; // If lengths are different, use length comparison.
            } else {
                return s1.compareTo(s2); // If lengths are the same, use lexicographical comparison.
            }
        });
        System.out.println("first solution with built-in function with lambda");
        System.out.println(values);
        // second solution with normal  for loop
        for (int i = 0; i < values.size() - 1; i++) {
            for (int j = i + 1; j < values.size(); j++) {
                String s1 = values.get(i);
                String s2 = values.get(j);
                if (s1.length() > s2.length() || (s1.length() == s2.length() && s1.compareTo(s2) > 0))
                {
                    values.set(i, s2);
                    values.set(j, s1);
                }
            }
        }
        System.out.println("second solution with normal  for loop");
        System.out.println(values);
    }

}