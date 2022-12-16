package JavaCollection;

public class FindDuplicateInArrayBruteForce {

    public static void main(String[] args){
        String[] arr = {"A","B", "C", "A" , "C", "D"};

        for(int i = 0; i <arr.length; i++){
            for(int j = i + 1; j < arr.length ; j++){
                if(arr[i].equals(arr[j])){
                    System.out.println("Duplicates: " + (arr[i]));
                }
            }
        }
    }
}
