package datastructure;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> season = new ArrayList<>();
        season.add("Winter");
        season.add("Summer");
        season.add("Spring");

        System.out.println("season = " + season);
        System.out.println("season.indexOf(\"Summer\") = " + season.indexOf("Summer"));
        season.remove("Summer");
        System.out.println("season.indexOf(\"Summer\") = " + season.indexOf("Summer"));

        for (int i = 0; i < 10_000; i++) {
            season.add("Pretty Warm");
        }
        season.removeIf(seasons -> seasons.equals("Pretty Warm"));
        System.out.println("season = " + season);
        season.trimToSize();
    }
}
