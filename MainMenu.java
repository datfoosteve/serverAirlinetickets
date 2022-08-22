import java.util.Scanner;


public class MainMenu {


    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // create a (While) loop menu with exit parameter
        // or
        // create a menu method with the above
        int userChoice;

        new AirlineSeating();
        do {
            System.out.println("1. Show the Seating of the Airline");
            System.out.println("2. Buy a ticket");
            System.out.println("3. Exit the Menu");


            userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1:
                    AirlineSeating.printDeck();
                    break;
                case 2:
                    AirlineSeating.ticketing();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Enter the correct Menu Number Choice. Either 1-3");
            }
        } while (userChoice != 3);
    }
}