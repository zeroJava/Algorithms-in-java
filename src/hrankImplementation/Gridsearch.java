package hrankImplementation;

public class Gridsearch {

	public static void main(String[] args)
	{
		@SuppressWarnings("unused")
		Gridsearch gri = new Gridsearch();
	}

	public Gridsearch()
    {

            // [row, column]
            String[][] str = { { "7", "2", "8", "3", "4", "5", "5", "8", "6", "4" },
                              { "6", "7", "3", "1", "1", "5", "8", "6", "1", "9" },
                              { "8", "9", "8", "8", "2", "4", "2", "6", "4", "3" },
                              { "3", "8", "3", "0", "5", "8", "9", "3", "2", "4" },
                              { "2", "2", "2", "9", "5", "0", "5", "8", "1", "3" },
                              { "5", "6", "3", "3", "8", "4", "5", "3", "7", "4" },
                              { "6", "4", "7", "3", "5", "3", "0", "2", "9", "3" },
                              { "7", "0", "5", "3", "1", "0", "6", "6", "0", "1" },
                              { "0", "8", "3", "4", "2", "8", "2", "9", "5", "6" },
                              { "4", "6", "0", "7", "9", "2", "4", "1", "3", "7" }
                            };

            String[][] fin = { { "9", "5", "0", "5" },
                              { "3", "8", "4", "5" },
                              { "3", "5", "3", "0" }
                            };

            String endResult = result(fin);
            String re = "NO";

            outloop :
            for (int rowI = 0; rowI < str.length; rowI++)
            {
                //intloop:
            	for (int columnI = 0; columnI < str[0].length; columnI++)
                {
                    String df = ConstrctionPatterStr(str, fin, rowI, columnI);

                    if (df.equals(endResult))
                    {
                        re = "YES";
                        break outloop;
                    }
                }
                //System.Console.WriteLine("y");
            }

            if (re.equals("YES"))
            {
                System.out.println(re);
            }
            else
            {
                System.out.println(re);
            }
	}
	
	private String ConstrctionPatterStr(String[][] strMatrix, String[][] find, int pointerRow, int pointerColumn)
    {
        int constraintRow = pointerRow + find.length;
        int constraintColumn = pointerColumn + find[0].length;

        String val = "";

        if ((constraintRow > (strMatrix.length) || (constraintColumn > (strMatrix[0].length))))
        {
            return val;
        }

        for (int row = pointerRow; row < constraintRow; row++)
        {
            for (int column = pointerColumn; column < constraintColumn; column++)
            {
                val = val + strMatrix[row][column];
            }
        }

        return val;
    }

    private String result(String[][] str)
    {
        String value = "";

        for (int row = 0; row < str.length; row++)
        {
            for (int column = 0; column < str[0].length; column++)
            {
                value = value + str[row][column];
            }
        }

        /*
         * dfghjk
         * dfghj
         * sdfghjk
         * dfgh
         */
        return value;
    }
}
