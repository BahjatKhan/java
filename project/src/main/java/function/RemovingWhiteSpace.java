package function;

import java.util.function.Function;

public class RemovingWhiteSpace {
    public static void main(String[] args) {
        String name = "   Schwab   4";
        Function<String, String> s = p -> p.replaceAll("   ", "");
        System.out.println(s.apply(name));

        String shopName= "The meat shop             ";
        Function<String, Integer> s1 = p -> p.length() - p.replaceAll(" ","").length();
        System.out.println(s1.apply(shopName));
    }
}