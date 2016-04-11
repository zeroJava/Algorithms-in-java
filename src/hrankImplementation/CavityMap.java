package hrankImplementation;

import java.util.Scanner;

/**
 * Created by Abu.
 */
public class CavityMap
{

    public CavityMap()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("The cavity map algorithm");
        System.out.println("Please enter the size of the matrix. e.g. 5 == 5 x 5");
        int size = Integer.parseInt(input.nextLine());

        String[][] matrix = new String[size][size];

        for(int row = 0; row < size; row++)
        {
            System.out.println("Enter you column data");
            char[] columnData = input.nextLine().toCharArray();

            for(int column = 0; column < columnData.length; column++)
            {
                matrix[row][column] = Character.toString(columnData[column]);
            }
        }

        this.execute(matrix);
    }

    private void execute(String[][] matrix)
    {
        for(int row = 1; row < matrix.length - 1; row++)
        {
            for(int coulmn = 1; coulmn < matrix[row].length - 1; coulmn++)
            {
                //System.out.println("Data test run " + matrix[row].length + " " + matrix[row][coulmn]);
                if(this.cellContainsX(matrix, row, coulmn))
                {
                    continue;
                }

                if(this.meetsCondition(matrix, row, coulmn, matrix[row][coulmn]))
                {
                    matrix[row][coulmn] = "X";
                }
            }
        }

        display(matrix);
    }

    private boolean meetsCondition(String[][] matrix, int current_row, int current_column, String current_position)
    {
        int top = Integer.parseInt(matrix[current_row - 1][current_column]);
        int bottom = Integer.parseInt(matrix[current_row + 1][current_column]);
        int left = Integer.parseInt(matrix[current_row][current_column - 1]);
        int right = Integer.parseInt(matrix[current_row][current_column + 1]);

        int currentPosition = Integer.parseInt(current_position);

        if(top < currentPosition && bottom <currentPosition && left < currentPosition && right < currentPosition)
        {
            return true;
        }

        return false;
    }

    private boolean cellContainsX(String[][] matrix, int current_row, int current_column)
    {
        String top = matrix[current_row - 1][current_column];
        String bottom = matrix[current_row + 1][current_column];
        String left = matrix[current_row][current_column - 1];
        String right = matrix[current_row][current_column + 1];

        if(top.equals("X") || bottom.equals("X") || left.equals("X") || right.equals("X"))
        {
            return true;
        }

        return false;
    }

    private void display(String[][] matrix)
    {
        for(int row = 0; row < matrix.length; row++)
        {
            for(int column = 0; column < matrix[row].length; column++)
            {
                System.out.print(matrix[row][column]);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args)
    {
        CavityMap cavityMap = new CavityMap();
    }
}
