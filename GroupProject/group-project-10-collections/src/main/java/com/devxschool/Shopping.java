package com.devxschool;

import java.util.*;

public class Shopping {

    public static void main(String[] args) {
        /**
         * Create a shopping cart List so that when you add it doesn't repeat
         * It would return a List of product name and quantity
         *
         * ex:
         * out: Please enter a product item:
         *  in: Apple
         * out: Are you done?
         *  in: No
         * out: Please enter a product item:
         *  in: Pear
         * out: Are you done?
         *  in: No
         * out: Please enter a product item:
         *  in: Apple
         * out: Are you done?
         *  in: Yes
         * out: Your cart has:
         * out: [apple: 2, pear: 1]
         *
         * Note: your list should be [item: numberOfItem, item: numberOfItem]
         */

        Shopping shopping = new Shopping();
        Scanner scanner = new Scanner(System.in);

        List<String> cartInfo = shopping.createCart(scanner);
        System.out.println("Your cart has:\n" + cartInfo);
    }

    public List<String> createCart(Scanner scanner) {
        //TODO implement this method
        List<String> shoppingList= new ArrayList<>();

//        System.out.println("Please enter a product item: ");
//        String product=scanner.nextLine();
//        if(product.trim().length()>0){
//            shoppingList.add(product);
//        }
//        System.out.println("Are you done?");
        String response= "no";
        int numOfItems=0;

        while (response.equalsIgnoreCase("no")){
            System.out.println("Please enter a product item: ");
            String product=scanner.nextLine();
            if(!shoppingList.contains(product)){
                shoppingList.add(product+": "+numOfItems);
            }
            else{

            }
            System.out.println("Are you done");
            response=scanner.nextLine();
        }


//        Map<String, Integer> shoppingList = new HashMap<>();



        return null;
    }
}