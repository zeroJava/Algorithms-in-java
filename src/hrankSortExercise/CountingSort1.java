package hrankSortExercise;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created on 04/09/2016.
 */
public class CountingSort1
{
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        String numberLine = input.nextLine();
        CountingSort1 countingsort1 = new CountingSort1();
        countingsort1.execute(numberLine);
    }

    public CountingSort1()
    {
        //
    }

    public void execute(String numberLine)
    {
        String[] numberLineSpilt = numberLine.split(" ");
        List<Integer> numbers = Arrays.stream(numberLineSpilt).mapToInt(Integer::parseInt).boxed()
                .collect(Collectors.toList());
        countingSort1Algorithm(numbers);
    }

    private void countingSort1Algorithm(List<Integer> list)
    {
        int[] numbersArray = new int[100];

        for (int index = 0; index < numbersArray.length; index++)
        {
            //numbersArray[index] = list.stream().collect(x -> x == index);
            int numb = index;
            System.out.print(" " + IntStream.range(0, list.size()).filter(x -> list.get(x) == numb).toArray().length);
        }
    }
}
