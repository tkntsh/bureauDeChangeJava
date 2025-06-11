import java.util.Scanner;

public class ticketAvailability
{
    //amount of tickets availabe
    private static int ticketsAvailable = 50;

    //method to flag boolean value if tickets are still available
    public static boolean ticketsAreAvailable(int ticketsUser)
    {
        //checking if requested tickets are above the amount of tickets in-store
        if(ticketsUser<=ticketsAvailable)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //method to confirm user booking
    public static void confirmBooking(int ticketsUser, String location)
    {
        //updating tickets available
        ticketsAvailable = ticketsAvailable - ticketsUser;
        //printing out where tickets will be sent and how many tickets were bought
        System.out.println(ticketsUser + " will be sent to " + location);
        //printing out remaining tickets
        System.out.println("Tickets remaining: " + ticketsAvailable);
    }

    public static void main(String[] args)
    {
        //scanner to read in user input
        Scanner userInput = new Scanner(System.in);
        //present available tickets
        System.out.println("Tickets available: " + ticketsAvailable +
                "\nHow many tickets would you like to purchase");
        //store how many tickets user wants to purchase
        int ticketsUser = userInput.nextInt();

        //checking if the amount of tickets user wants to purchase are available
        if(ticketsAreAvailable(ticketsUser))
        {
            //asking for user location if ticket amount is available
            System.out.println("Tickets are available!\nPlease enter your location");
            String location = userInput.next();

            //calling confirm booking method to print
            confirmBooking(ticketsUser, location);
        }
        //notify user amount of tickets requested aren't available
        else
        {
            System.out.println("Tickets requested aren't available.");
        }
        userInput.close();
    }
}
