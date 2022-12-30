package datastructure;

import java.util.Arrays;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        //Arrays.asList doesnot allow add, remove and allow. It is mutable list
        List<String> nameList = Arrays.asList("Rahim", "Kianna", "Arteta");
        // nameList.add("Kaha");
        nameList.set(2, "Shouky");
        System.out.println(nameList.contains("Rahum"));
        System.out.println(nameList.get(0));
        System.out.println(nameList);
        //Effient way to store anything
        List<String> carNames = List.of("Jeep", "Toyota");
        System.out.println(carNames);
        System.out.println(carNames.contains("Rahum"));
        //  carNames.add("Cadillac");
        //carNames.set(0,"Jeep");
        //  System.out.println(carNames);

    }
}
