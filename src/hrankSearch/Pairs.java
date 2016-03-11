package hrankSearch;

/**
 * Created by Abu on 21/02/2016.
 */
public class Pairs
{
    public static void main(String[] args)
    {
        int[] array = { 1, 5, 3, 4, 2, 8, 10, 6 };
        int dif = 2;
        System.out.println(getNumberOfPairs(array, dif));
    }

    static int getNumberOfPairs(int[] array, int difference_of_threshold)
    {
        int number = 0;

        // we are going to compare two number
        for(int firstIndex = 0; firstIndex < array.length - 1; firstIndex++) // here, we are select the first digit
        {
            for(int secondIndex = firstIndex + 1; secondIndex < array.length; secondIndex++) // here we select the second digit
            {
                int checkOne = array[firstIndex] - array[secondIndex]; // here we are getting the value, so we can compare it to see if it meets the threshold
                int checkTwo = array[secondIndex] - array[firstIndex]; // we doing the same as above, but we changed it around
                // e.g. "1 compared to 3 would not match the threshold of 2 " but "3 compared to 1 will match the threshold of 2 "

                System.out.println("checkOne -> " + "array[firstIndex] : " + array[firstIndex] + " array[secondIndex] : " + array[secondIndex]);
                System.out.println("checkTwo -> " + "array[secondIndex] : " + array[secondIndex] + " array[firstIndex] : " + array[firstIndex]);

                if(checkOne == difference_of_threshold || checkTwo == difference_of_threshold) // checks if it matches threshold at any case
                {
                    number++;
                }
            }
        }

        return number;
    }
}
