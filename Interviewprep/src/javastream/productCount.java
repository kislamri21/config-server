package javastream;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class productCount {

    public static void main(String[] args){

        List<Product> prodList = new ArrayList<>();
        prodList.add(new Product(1, "iPhone14", 101, "stocked", 700));
        prodList.add(new Product(2, "SamSung Mobile", 101, "stocked", 900));
        prodList.add(new Product(3, "HP", 102, "sold", 1700));
        prodList.add(new Product(4, "Dell", 101, "stocked", 1200));
        prodList.add(new Product(5, "Mac", 102, "sold", 2700));
        prodList.add(new Product(6, "iPhone12", 101, "stocked", 1000));
        prodList.add(new Product(7, "Note book", 101, "stocked", 600));
        prodList.add(new Product(8, "Google phone", 102, "sold", 1800));
        prodList.add(new Product(9, "HP HiTech", 103, "stocked", 1400));
        prodList.add(new Product(10, "Chrome note", 102, "sold", 1500));
        prodList.add(new Product(11, "Nokia XX", 104, "stocked", 2000));
        prodList.add(new Product(12, "Blue Berry", 103, "stocked", 800));
        prodList.add(new Product(13, "Intel Desk", 102, "sold", 1800));
        prodList.add(new Product(14, "Metro Mak", 104, "stocked", 3000));
        prodList.add(new Product(15, "Hipo Cal", 102, "sold", 2800));

        // Mapping product count in each store

      Map<Integer, Long>  prodCountDept = prodList.stream().collect(Collectors.groupingBy(Product::getStoreNumber, Collectors.counting()));

      prodCountDept.entrySet().forEach(entry -> {
          System.out.println("Store: " + entry.getKey() + "----" + entry.getValue());
      });

      // print sold and stocked products in the given collection
       long soldProCount = prodList.stream().filter(e -> "sold".equals(e.getStatus())).count();
       long stockedProCount = prodList.stream().filter(e -> "stocked".equals(e.getStatus())).count();

       System.out.println("Sold product count: " + soldProCount);
       System.out.println("Stocked product count: " + stockedProCount);

       //Print Max and Min product price in the given collection

       Optional<Product> prod1 = prodList.stream().max(Comparator.comparing(Product::getPrice));
       Optional<Product> prod2 = prodList.stream().min(Comparator.comparing(Product::getPrice));
       System.out.println("Maximum Price: " + prod1);
       System.out.println("Minimum Price: " + prod2);

       // print the max price of a product from each store

       Map<Integer, Optional<Product>> topPriceProDeptWise  = prodList.stream().collect(Collectors.groupingBy(Product::getStoreNumber,
                Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Product::getPrice)))));

       topPriceProDeptWise.entrySet().forEach(entry ->{
           System.out.println("Store: " + entry.getKey() + " top product:" + entry.getValue());
       });


    }
}
