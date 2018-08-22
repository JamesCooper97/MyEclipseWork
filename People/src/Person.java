
public class Person {
	public String name;
	public int age;
	public String jobTitle;
	public String toString()
	{
		return String.format("The persons name is %s, their Age is %d, and their job title is %s\n", name, age, jobTitle);
	}
}
