import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        /*As a user I want to add a new items in the restaurant menu and get all list of items.
        Test Data:
        {“Teriyaki”, “Fried Chicken Tempura”, “California Roll”, “Crunchy Tuna Roll”, “Spring Roll”, “Pad Thai”, “Spicy Noodle”, “Sake Nigiri”, “Green Salad”, “Tomyum soup”}
        Please use [ ArrayList and loop ] in your code.
                Example:
        output: What food would you like to add?
                input: Teriyaki
        output: Great, menu was updated!
                output: Would you like to see a full menu?
        input: yes
        Output:
        Full menu items:
        1."Fried Chicken Tempura"
        2."California Roll"
        3."Crunchy Tuna Roll"
        4."Spring Roll"
        5."Pad Thai"
        6."Spicy Noodle"
        7."Sake Nigiri"
        8."Green Salad"
        9."Tomyum soup",
                10."Teriyaki" */
        ArrayList<String> menu= new ArrayList<>(Arrays.asList("Fried Chicken Tempura", "California Roll", "Crunchy Tuna Roll", "Spring Roll", "Pad Thai", "Spicy Noodle", "Sake Nigiri", "Green Salad", "Tomyum soup"));
        Scanner inputMenu= new Scanner(System.in);

        System.out.printf("What food would you like to add? ");
        String food= inputMenu.nextLine();
        System.out.println("Great, menu was updated!");
        menu.add(food);

        System.out.printf("Would you like to see a full menu? ");

        String reply= inputMenu.next();

        while(!reply.equals("yes") && !reply.equals("no") ){
            System.out.printf("Would you like to see a full menu? ");
            reply= inputMenu.next();
        }
        switch (reply){
            case "yes":
                System.out.println("Full menu items:");
                int count=1;

                for (String item: menu
                     ) {
                    System.out.println(count + "." +item);
                    count++;
                }
                break;
            case "no":
                System.exit(0);
                break;
        }

    }
}
