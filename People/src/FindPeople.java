import java.util.ArrayList;

public class FindPeople {
	ArrayList <Person> people = new ArrayList <Person>();
	public void method1(Person happy)
	{
		people.add(happy);
	}
	public void nameFinder(String nice)
	{
		for (Person i : people) {
			System.out.println(i);
		}
		for (Person person : people) {
			if (person.name == nice) {
				System.out.println(person);
			} else {
			}
		}
	}
}