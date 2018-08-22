
public class BlackJack {
	public static void main(String[] args) 
	{
		System.out.println(twentyOne(19,23));
	}
	public static int twentyOne(int a, int b)
	{
		int c = 21 - a;
		int d = 21 - b;
		if (((c<d)&&(c>0))||((c>0)&&(d<0))) {
			return a;
		} else if (((c>d)&&(d>0))||((c<0)&&(d>0))) {
			return b;
		} else if ((c==d)&&(c>0)) {
			return a;
		} else {
			return 0;
		}
	}
}