package hrankImplementation;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Abu.
 */
public class StickCutting
{
    public StickCutting()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your array in one long string form. i.e. 1 2 3 5 8");
        String[] stringArray = input.nextLine().split(" ");
        int[] array = this.convertToIntegerArrayUsingLambda(stringArray);
        this.execute(array);
    }

    private void execute(int[] array)
    {
        int[] temp = array;
        boolean state = true;

        while(state)
        {
            long _NumberOfSticks = this.numberOfSticksUsingLmbda(temp);
            if(_NumberOfSticks == 0)
            {
                break;
            }
            System.out.println(_NumberOfSticks);
            int _shortestStick = this.findShortestNumberUsingLambda(temp);
            this.subtractEachElementsUsingShorestStick(temp, _shortestStick);
        }
    }

    private int[] convertToIntegerArrayUsingLambda(String[] array)
    {
        return Arrays.stream(array).mapToInt(Integer::parseInt).toArray();
    }

    private long numberOfSticksUsingLmbda(int[] array)
    {
        return Arrays.stream(array).filter(x -> x > 0).count();
    }

    private int findShortestNumberUsingLambda(int[] array)
    {
        return Arrays.stream(array).filter(x -> x > 0).min().getAsInt();
    }

    private void subtractEachElementsUsingShorestStick(int[] array, int shortestStick)
    {
        for(int index = 0; index < array.length; index++)
        {
            if(array[index] > 0)
            {
                array[index] = array[index] - shortestStick;
            }
        }
    }

    private int[] convertToInteger(String[] array)
    {
        int[] value = new int[array.length];
        for(int index = 0; index < array.length; index++)
        {
            value[index] = Integer.parseInt(array[index]);
        }
        return value;
    }

    public static void main(String[] args)
    {
        StickCutting stickCutting = new StickCutting();
    }
}
