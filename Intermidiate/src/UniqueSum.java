
public class UniqueSum {
	public static void main(String[] args)
	{
		//DO SOMETHING
		int[] array = {3,3,2};
		System.out.println(uniqueSum(array));
	}
	
	public static int uniqueSum(int[] array)
	{
		boolean a = true;
		int g = 0;
		for (int i : array)
			
		{
			for (int j : array)
			{
				if (i != j) {
					a = true;
				} else
					a = false;
					break;
			}
			if (a) {
				g = g + i;
			}
		}
		return g;
	}
}