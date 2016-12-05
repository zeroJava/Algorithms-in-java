package hrankSortExercise;

import java.util.Arrays;

/**
 * Created by Abu.
 */
public class QuickSortInPlace
{
    public static void main(String[] args)
    {
        Execute("7 5 5 82 58 64 5 8 1 33 12");
    }

    public static void Execute(String number)
    {
        int[] array = convertStringToInt(number);
        sorting(array, 0, array.length - 1);
    }

    private static void  sorting(int[] array, int li, int hi)
    {
        if (array.length < 2)
            System.out.println(Arrays.toString(array));

        if (li < hi)
        {
            int partition = partition(array, li, hi);
            sorting(array, li, partition - 1);
            sorting(array, partition + 1, hi);
        }
    }

    private static int partition(int[] array, int li, int hi)
    {
        int pivot = array[hi];
        int j = li;
        int i = j;

        while (j < hi)
        {
            if (array[j] < pivot)
            {
                swap(array, i, j);
                j++;
                i++;
                continue;
            }

            j++;
        }

        swap(array, hi, i);
        System.out.println(Arrays.toString(array));
        return i;
    }

    private static void swap(int[] array, int num1, int num2)
    {
        int tempNumber1 = array[num1];
        int tempNumber2 = array[num2];
        array[num1] = tempNumber2;
        array[num2] = tempNumber1;
    }

    private static int[] convertStringToInt(String word)
    {
        String[] words = word.split(" ");
        int[] array = new int[words.length];

        for (int index = 0; index < array.length; index++)
        {
            array[index] = Integer.parseInt(words[index]);
        }

        return array;
    }
}
