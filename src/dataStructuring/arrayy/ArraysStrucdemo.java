package dataStructuring.arrayy;

public class ArraysStrucdemo {

	public static void main(String[] args)
	{
		int[] arrayVal = new int[]{8, 5, 3, 7 ,0 , 48, 672, 347, 348};
		Arraystruc arraystruc = new Arraystruc();
		arraystruc.printArray(arrayVal);
		
		System.out.println(arraystruc.getValueOfIndex(5, arrayVal));
		System.out.println(arraystruc.doesThisElementExist(48, arrayVal));
		
		arraystruc.deleteIndex(6, arrayVal);
		arraystruc.printArray(arrayVal);
		arraystruc.insertValue(7541, arrayVal);
		arraystruc.printArray(arrayVal);
	}
}
