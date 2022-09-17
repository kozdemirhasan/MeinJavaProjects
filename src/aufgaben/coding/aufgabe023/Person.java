package aufgaben.coding.aufgabe023;

public class Person {
	String name;
	static int counter;

	public Person() {
		counter++;
	}

	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person();
		Person person4 = new Person();
		
		System.out.println(Person.counter + " Person Object wird created");
	}
	

}