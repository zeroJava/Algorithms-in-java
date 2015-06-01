package dataStructuring.arrayy;

public class ArraysStrucdemo {

	public static void main(String[] args)
	{
		int[] arrayVal = new int[]{8, 5, 3, 7 ,2, 48, 672, 347, 348};
		Arraystruc arraystruc = new Arraystruc();
		arraystruc.linearSearch(5, arraystruc.array3);
		arraystruc.binarySearch(48, arraystruc.array3);
		arraystruc.assignValue();
		arraystruc.printArray(arrayVal);
		System.out.println(arraystruc.getValueOfIndex(5, arrayVal));
	}
}
