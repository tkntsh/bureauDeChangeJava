public class bureauDeChange1
{
    //objects for currency conversions
    private static final double baseCurrency = 1.0;

    //currency conversion rates
    private static final double randToEuro = 0.053;
    private static final double randToDollar = 0.055;
    private static final double randToPound = 0.044;

    //methods to convert currencies
    public double convertRandToEuro(double randAmount)
    {
        return randAmount * randToEuro;
    }
    public double convertRandToDollar(double randAmount)
    {
        return randAmount * randToDollar;
    }
    public double convertRandToPound(double randAmount)
    {
        return randAmount * randToPound;
    }

    //main method
    public static void main(String[] args)
    {
        bureauDeChange1 BDC = new bureauDeChange1();
        double randAmount = 100.00;

        //printing different currencies and current currency
        System.out.println("Your current balance in Rands is: R" + randAmount);
        System.out.println("Your current balance in Pounds is: £" + BDC.convertRandToPound(randAmount));
        System.out.println("Your current balance in Dollars is: $" + BDC.convertRandToDollar(randAmount));
        System.out.println("Your current balance in Euros is: €" + BDC.convertRandToEuro(randAmount));
    }
}
