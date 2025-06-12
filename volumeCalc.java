import java.util.Scanner;

public class volumeCalc
{
    public static void main(String[] args)
    {
        //calling print method
        printVolume();
    }

    public static void printVolume()
    {
        //try and catch for dangerous code
        try
        {
            //using system.in to store height, width, breath to calc volume
            Scanner lineH = new Scanner(System.in);
            System.out.println("Enter the height (e.g.: 3): ");
            int height = lineH.nextInt();

            Scanner lineW = new Scanner(System.in);
            System.out.println("\nEnter the width (e.g.: 2): ");
            int width = lineW.nextInt();

            Scanner lineB = new Scanner(System.in);
            System.out.println("\nEnter the breath (e.g.: 4): ");
            int breath = lineH.nextInt();

            //calculating object volume
            int totalVolume = height*width*breath;

            //printing out object volume
            System.out.println("\nThe volume of your object is: " + height + "x" + width + "x" + breath + " = " + totalVolume);
        }
        //exception if user enters object that isn't an int
        catch(Exception e)
        {
            System.out.println("\nError: Input invalid!");
        }
    }
}
