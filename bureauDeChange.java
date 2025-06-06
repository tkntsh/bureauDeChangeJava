import java.util.Scanner;

public class bureauDeChange
{
    public static void main(String[] args)
    {
        changeCurrency();
    }

    public static void changeCurrency()
    {
        double currentBalanceR = 100.00;

        //try and catch for dangerous code
        try
        {
            //scanner used for storing user input
            Scanner userInput = new Scanner(System.in);
            System.out.println("Your current balance in Rands is: R" + currentBalanceR +
                    "\nEnter which currency you'd like to change to:" +
                    "\n1. Euros" +
                    "\n2. Pounds" +
                    "\n3. Dollars");
            int userOption = userInput.nextInt();

            //switch statement for different cases
            switch(userOption)
            {
                case 1:
                    currentBalanceR = currentBalanceR * 0.05;
                    System.out.println("Your new balance in Euros is: €" + currentBalanceR);
                    break;
                case 2:
                    currentBalanceR = currentBalanceR * 0.04;
                    System.out.println("Your new balance in Pounds is: £" + currentBalanceR);
                    break;
                case 3:
                    currentBalanceR = currentBalanceR * 0.05;
                    System.out.println("Your new balance in Dollars is: $" + currentBalanceR);
                    break;
                default:
                    System.out.println("Error: Invalid option selected!");
                    break;
            }
        }
        catch (Exception e)
        {
            //throw new RuntimeException(e);
            System.out.println("Error: Invalid input!");
        }
    }
}
