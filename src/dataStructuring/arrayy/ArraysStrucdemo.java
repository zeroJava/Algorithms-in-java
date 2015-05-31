package dataStructuring.arrayy;

public class ArraysStrucdemo {

	public static void main(String[] args)
	{
		Arraystruc arraystruc = new Arraystruc();
		arraystruc.linearSearch(5, arraystruc.array3);
		arraystruc.binarySearch(48, arraystruc.array3);
		int[][] array = { { 1, 5, 14, 82 }, { 63, 43, 48, 37 },
				{ 71, 31, 72, 124 } };

		int[][] array2 = { { 458, 34, 214, 1 }, { 3282, 347, 92145, 634 },
				{ 6547, 5, 2, 3 } };
		arraystruc.matrixMultipication(array, array2);
	}
}
