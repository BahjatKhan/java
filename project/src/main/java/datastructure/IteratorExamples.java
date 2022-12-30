package datastructure;
import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class IteratorExamples {
    public static void main(String[] args) {
        int [] array= new int [] {1,4};
        int newArray[] = new int[array.length];
        for(int i = 0 ; i<array.length ; i++){
            newArray[i]= array[i]*array[i];
        }
       // Arrays.sort(newArray);

        System.out.println("Arrays.toString(newArray) = " + Arrays.toString(newArray));
    }
}
