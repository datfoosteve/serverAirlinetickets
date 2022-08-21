import java.util.Scanner;
public class Airliner {

    private static char[][] airlinerDeckSeats;
    // 2 dimensional array that stores a character matrix. Each element of the array stores a character
    // which at this point will store an (E)Empty or (T)Taken. The row and columns will be the Access to seating

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        // create a (While) loop menu with exit parameter
        // or
        // create a menu method with the above


    }

    public static void createSeatingDeck() {
        System.out.println("Enter Number of Rows");
        int numberOfRows = scanner.nextInt();
        System.out.println("Enter Number of seats in each row");
        int numberOfSeats = scanner.nextInt();

        airlinerDeckSeats = new char[numberOfRows][numberOfSeats];
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfSeats; j++) {
                airlinerDeckSeats[i][j] = 'E';
            }
        }
    }

    // Print Method of the cinema Seats
    public static void printDeck() {
        System.out.println("AirLine Seating: ");
        System.out.print(" ");
        for (int i = 0; i < airlinerDeckSeats.length; i++) {
            System.out.print(" " + i);
            //for the first row, this loops and prints out the column number

        }
            System.out.println();
        for (int i = 0; i < airlinerDeckSeats.length; i++) {
            System.out.print(i + 1);
            // this prints out the number of the row
            for (int j = 0; j < airlinerDeckSeats[0].length; j++) {
                System.out.print(" " + airlinerDeckSeats[i][j]);
                // this prints out index at the certain row and  certain column
            }
            System.out.println();
            // at the end of each row , this prints out a new line
        }
    }

    public static void ticketing(){
        System.out.println("Enter the Row Number");
        int seatRow = scanner.nextInt();
        System.out.println("Enter the seat Number");
        int seatNumber = scanner.nextInt();

        int totalNumberOfSeats = airlinerDeckSeats.length * airlinerDeckSeats[0].length;

        double priceOfTicket;

        if(totalNumberOfSeats <= 300){
            priceOfTicket = 300.00;
        }
        else{
            int firstClassRow = airlinerDeckSeats.length / 2;
            if (seatRow <= firstClassRow){
                priceOfTicket = 150.00;
            }
            else{
                priceOfTicket = 80.00;
            }
        }
        System.out.println("Ticket Price: $" + priceOfTicket);
        // now update the array if the ticket has been purchased, the minus one is because arrays start at 0
        airlinerDeckSeats[seatRow - 1][seatNumber - 1] = 'T';
    }

}