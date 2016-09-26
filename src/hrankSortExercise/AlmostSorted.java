package hrankSortExercise;

/**
 * Created by Abu on 16/05/2016.
 */
public class AlmostSorted
{
    public static void main(String[] args)
    {
        int[] _array = {1, 2, 3, 4, 10, 9, 8, 7, 6, 5, 11, 12};
        AlmostSorted _almost = new AlmostSorted();
        _almost.execute(_array);
    }

    public void execute(int[] array)
    {
        Integer _beginningOfAnomaly = 0;
        Integer _endingOfAnomaly = 0;
        Integer _lengthOfAnomaly = 0;

        boolean _state = this.decision(array, _beginningOfAnomaly, _endingOfAnomaly, _lengthOfAnomaly);
        System.out.println(_beginningOfAnomaly);
    }

    private boolean decision(int[] array, Integer beginningOfAnomaly, Integer endOfAnomaly, Integer lengthOfAnomaly)
    {
        for(int index = 0; index < array.length - 1; index++)
        {
            if(array[index] > array[index + 1])
            {
                this.findAnomaly(array, beginningOfAnomaly, endOfAnomaly, lengthOfAnomaly);
                break;
            }
        }
        return true;
    }

    private void findAnomaly(int[] array, Integer beginningOfAnomaly, Integer endOfAnomaly, Integer lengthOfAnomaly)
    {

    }
}
