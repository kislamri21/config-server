package JavaCollection;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateArrayUseHashSet {
    public static void main(String[] args){
        String [] arr = {"A","B", "C", "A" , "C", "D"};
        Set<String> duplicate = new HashSet<>();
        for(String arrs : arr){
            if(duplicate.add(arrs) == false){
                System.out.println("Duplicates: " + arrs);
            }
            
        }
    }
}
