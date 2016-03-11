package hrankImplementation;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Abu on 11/03/2016.
 */
public class ServiceLane
{
    private Scanner scanner = new Scanner(System.in);

    public ServiceLane()
    {
        // Getting and setting the length of the lane, and setting number of testcases;
        System.out.println("Enter the length of lane and number of testcases. E.g. 8 5");
        String[] inputLine = scanner.nextLine().split(" ");
        int _length = Integer.parseInt(inputLine[0]);
        int _testcase = Integer.parseInt(inputLine[1]);

        // Getting and setting the width of each segment in our service lane
        // int[] _width = Arrays.asList(scanner.nextLine()).stream().mapToInt(Integer::parseInt).toArray(); // Lambda expression
        System.out.println("Please enter the width for each segment. E.g. 3 2 1 3 1 2");
        int[] _width = this.convertTo(scanner.nextLine().split(" ")); // converts string array to int array

        // Execute the algorithm
        this.execute(_testcase, _width);
    }

    private int[] convertTo(String[] strings)
    {
        int[] _ArrayInInteger = new int[strings.length];
        int i = 0;

        for(String str : strings)
        {
            _ArrayInInteger[i] = Integer.parseInt(str);
            i++;
        }

        return _ArrayInInteger;
    }

    private void execute(int _testcase, int[] _width)
    {
        for (int i = 0; i < _testcase; i++)
        {
            // Getting and setting the entry and exit point for each testacase
            System.out.println("plase enter entry and exit points. E.g. 0 3");
            String[] _InputOfEntryAndExit = scanner.nextLine().split(" ");
            int _entry = Integer.parseInt(_InputOfEntryAndExit[0]);
            int _exit = Integer.parseInt(_InputOfEntryAndExit[1]);
            System.out.println(this.typeOfVehicle(_entry, _exit, _width));
        }
    }

    private int typeOfVehicle(int _entry, int _exit, int[] _width)
    {
        int _typeOfVehicle = 3;
        int _cycle = _entry;

        while (_cycle <= _exit)
        {
            if(_width[_cycle] < _typeOfVehicle)
            {
                _typeOfVehicle = _width[_cycle];
            }
            _cycle++;
        }

        return _typeOfVehicle;
    }

    public static void main(String[] args)
    {
        ServiceLane lane = new ServiceLane();
    }
}
