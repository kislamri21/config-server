package javastream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductFindByStoreId {

    public static void main(String[] args){

        List<Product> prodList = new ArrayList<>();

        prodList.add(new Product(1, "iPhone14", 101, "stocked", 7000));
        prodList.add(new Product(2, "SamSung Mobile", 101, "stocked", 9000));
        prodList.add(new Product(3, "HP", 102, "sold", 17000));
        prodList.add(new Product(4, "Dell", 101, "stocked", 1200));
        prodList.add(new Product(5, "Mac", 102, "stocked", 2700));

        //Find product by storeId
        Map<Integer, List<Product>> prodListBaseOnStore= prodList.stream().collect(Collectors.groupingBy(Product::getStoreNumber, Collectors.toList()));

            prodListBaseOnStore.entrySet().forEach(entry ->{
                System.out.println(entry.getKey() + "-------------" + entry.getValue());
            });

    }
}
