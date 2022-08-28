package function;

import java.util.function.Function;

public class FunctionPractice {
    public static void main(String[] args) {
        Function<String, Integer> s = o -> o.length();
        System.out.println(s.apply("durga"));
    }
}