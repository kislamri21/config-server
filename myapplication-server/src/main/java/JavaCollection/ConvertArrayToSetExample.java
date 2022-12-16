package JavaCollection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ConvertArrayToSetExample {
    public static void main(String[] args){
        Integer[] sourcArray = {0, 1, 2, 3, 4, 5,5, 2};

        // Convert Array to set
        Set<Integer> targetSet = new HashSet<Integer>(Arrays.asList(sourcArray));
        //print set
        targetSet.forEach(s -> System.out.println(s));

    }
}
