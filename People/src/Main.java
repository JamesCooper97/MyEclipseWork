
public class Main{
	// ArrayList <Person> people = new ArrayList <Person>();
	public static void main (String[] args)
	{
		Person stephen = new Person();
		stephen.name = "Stephen";
		stephen.age = 24;
		stephen.jobTitle = "Fireman";
		
		Person geoff = new Person();
		geoff.name = "Geoff";
		geoff.age = 70;
		geoff.jobTitle = "IT Consultant";
		
		Person harold = new Person();
		harold.name = "Harold";
		harold.age = 12;
		harold.jobTitle = "Proffessional Mastermind of Destruction";
		
		FindPeople steph = new FindPeople();
		steph.method1(stephen);
		steph.method1(geoff);
		steph.method1(harold);
		
		steph.nameFinder("Geoff");
	}
}