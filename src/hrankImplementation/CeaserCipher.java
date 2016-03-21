package hrankImplementation;

import java.util.Scanner;

/**
 * Created by Abu.
 */
public class CeaserCipher
{
    public CeaserCipher()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the string you want encrypted, and the number positions");
        String s = input.nextLine();
        int k = input.nextInt();
        System.out.println("\n"+"you enter: " + s + " and " + k);
        this.execute(s, k);
    }

    private void execute(String string, int k)
    {
        char[] unencryptedData = string.toCharArray();
        char[] encryptedData = this.encrypt(unencryptedData, k);
        String nwString = new String(encryptedData);
        System.out.println("\n"+"you result \n" + nwString);
    }

    private char[] encrypt(char[] data, int k)
    {
        char[] value = data;

        for(int index = 0; index < value.length; index++)
        {
            value[index] = this.getEncryptedLetters(value[index], k);
        }

        return value;
    }

    private char getEncryptedLetters(char ch, int k)
    {
        char character = ch;
        int ascii = (int)ch;

        if (ascii > 64 && ascii < 91)
        {
            for(int iteration = 0; iteration < k; iteration++)
            {
                if(ascii >= 90)
                {
                    ascii = 64;
                }

                ascii = ascii + 1;
                character = (char)ascii;
            }
        }
        else if (ascii > 96 && ascii < 123)
        {
            for (int iteration = 0; iteration < k; iteration++)
            {
                if (ascii >= 122)
                {
                    ascii = 96;
                }

                ascii = ascii + 1;
                character = (char)ascii;
            }
        }

        return character;
    }

    public static void main(String[] args)
    {
        CeaserCipher cipher = new CeaserCipher();
    }
}
