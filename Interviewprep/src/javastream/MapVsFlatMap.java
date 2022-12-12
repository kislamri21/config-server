package javastream;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {

    public static void main(String[] args){

        // Get List of Customer
        List<Customer> customers = CustDatabase.getAll();

        //List<Customer> convert List<String>  -> Data Transformation
        // So here we can do Map() method that we are mapping all the email list for customer
        // and returning as a string that is called data transformation

       List<String> emails = customers.stream()
               .map(customer -> customer.getEmail())
               .collect(Collectors.toList());
       System.out.println(emails);

       /* Explanation:
       From List of customer we are mapping only email to a list of String.
       this is mapping logic:  map(customer -> customer.getEmail()) and we are converting into List<String> -> Data Transformation.
       If you observe one customer has only one email id so map() function we can use when we have one to one mapping
       customer -> customer.getEmail() -> one to one mapping that means one customer has one email Id

        */

        // Get all the phone numbers One to many mapping
        List<List<String>> phones = customers
                .stream().map(customer -> customer.getPhoneNumbers())
                .collect(Collectors.toList());
        System.out.println(phones);

        // Use flatMap() method --> one to many mapping : customer -> customer.getPhoneNumbers()
        // flatMap() takes stream as stream output as a single stream
        //List<Customer > convert List<String> -> Data Transformation
        //mapping: customer -> phone Numbers
        //customer -> customer.getPhoneNumbers() --> one to many mapping
       List<String> phoneNumbers =  customers.stream()
               .flatMap(customer -> customer.getPhoneNumbers().stream())
               .collect(Collectors.toList());
       System.out.println(phoneNumbers);



    }
}
