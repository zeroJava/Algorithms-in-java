package hrankImplementation;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Abu on 17/02/2016.
 */
public class LongFactorials {

    public static void main(String[] args)
    {
        LongFactorials longFactorials = new LongFactorials();
    }

    public LongFactorials()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of times to loop");
        int number = input.nextInt();
        businessLogic(number);
    }

    private void businessLogic(int n)
    {
        BigInteger bigInt = new BigInteger("1");

        for(int i = 1; i <= n; i++)
        {
            bigInt = bigInt.multiply(new BigInteger(Integer.toString(i)));
        }

        System.out.println(bigInt);
    }
}
