
public class TooHot {
	public static void main(String[] args)
	{
		System.out.println(isHot(100,false));
	}
	public static boolean isHot(int temperature, boolean isSummer)
	{
		if (isSummer) {
			if ((temperature>=60)&&(temperature<=100)) {
				return true;
			} else {
				return false;
			}
		} else {
			if ((temperature>=60)&&(temperature<=90)) {
				return true;
			} else {
				return false;
			}
		}
	}
}
