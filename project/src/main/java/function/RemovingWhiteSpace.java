package function;

import java.sql.SQLOutput;
import java.util.function.Function;

public class RemovingWhiteSpace {
    public static void main(String[] args) {
        String name = "   Schwab   4";
        Function<String, String> s = p -> p.replaceAll("\\s", "");
        System.out.println(s.apply(name));

        String shopName= "The meat shop             ";
        Function<String, Integer> s1 = p -> p.length() - p.replaceAll("\\s","").length();
        System.out.println(s1.apply(shopName));

        String a ="123";
        a.toString();
    }
}