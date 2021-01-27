package sample;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Hash {





    public static void main(String[] args) {

//      create scanner object instance called input
        Scanner input = new Scanner(System.in);

//      create HashMap
        HashMap<String, String> carDealer = new HashMap<>();
        carDealer.put("Civic", "Honda");
        carDealer.put("Accord", "Honda");
        carDealer.put("CR-V", "Honda");
        carDealer.put("Forester", "Subaru");
        carDealer.put("WRX", "Subaru");
        carDealer.put("Outback", "Subaru");
        carDealer.put("Crosstrek", "Subaru");
        carDealer.put("Tacoma", "Toyota");
        carDealer.put("Tundra", "Toyota");
        carDealer.put("Prius", "Toyota");
        carDealer.put("RAV4", "Toyota");
        carDealer.put("Camry", "Toyota");
        carDealer.put("F150", "Ford");
        carDealer.put("Mustang", "Ford");
        carDealer.put("Wrangler", "Jeep");
        carDealer.put("Renegade", "Jeep");



//      If the user answers yes the while loop beings
        System.out.println("Would you like to browse vehicles? ");
        String userBrowse = input.nextLine();

        while (userBrowse.equals("yes") || userBrowse.equals("Yes") || userBrowse.equals("y") || userBrowse.equals("sure")) {

//          Get the make input from the user
            System.out.println("Which model would you like to view? ");
            String userModel = input.nextLine();

//          Get the model from the hash map
            String userMake = carDealer.get(userModel);

//          Respond by pulling the appropriate make and model from the hashmap if it exists.
//          If the model does not exist use the conditional to respond appropriately.
            if (carDealer.containsKey(userModel)) {
                System.out.printf(("Oh, you're looking for a %s? Our %s selection is right over here..."), userModel, userMake);
            } else {
                System.out.println("Sorry! We don't have that model.");
            }

//          Prevent questions from stacking, and allows user to hit enter when they are ready
            input.nextLine();

//          Ask the user if they'd like to continue, if yes,  reenter while loop, else break the loop
            System.out.println("\n\nWould you like to continue browsing vehicles? ");
            userBrowse = input.nextLine();

        }
//      Farewell to user, and program ends
        System.out.println("\nHave a good day!");
    }
}
