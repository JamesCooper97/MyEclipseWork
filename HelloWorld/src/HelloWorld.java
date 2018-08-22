
public class HelloWorld {
	public static void main(String[] args)
	{
		System.out.println("Hello World 1");
		String m = "Hello World 2";
		System.out.println(m);
		printing();
		System.out.println(printingTwo());
		int[] intArray = {4,8,4,2,4,6,7,5,3,5};
		for (int i = 0; i < 10; i++)
		{
			System.out.println(addOrMultiply(intArray[i],7,true) + "outputs of method");
		}
		for (int j = 0; j < 10; j++)
		{
			System.out.println(intArray[j] + "values of array");
		}
		int[] arrayTwo = {1,5,3,2,1,5,3};
		System.out.println(arrayTwo);
		loopArray(arrayTwo);
	}

	public static void printing()
	{
		System.out.println("Hello world 3");
	}
		
	public static String printingTwo()
	{
		return "Hello World 4";
	}
	
	public static int addOrMultiply(int numberOne, int numberTwo, boolean check){	
		if (numberOne == 0 || numberTwo == 0) {
			return numberOne + numberTwo;
		} else if (check) {
			return numberOne + numberTwo;
		} else {
			return numberOne * numberTwo;
		}
	}
	
	public static int[] loopArray(int[] array) {
		for (int i : array) {
			System.out.println(i);
		}
		for (int num : array) {
			num = num*10;
			System.out.println(num);
		}
		return array;
	}
}