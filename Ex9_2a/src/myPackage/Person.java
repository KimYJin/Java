package myPackage;

public class Person {

	private String name;
	
    public Person() {              //default constructor.
        name = "No name yet";
    }
    
    public Person(String initialName) { // constructor.
        name = initialName;
    }
    public void setName(String newName) {
        name = newName;
    }
    public String getName() {
        return name;
    }
    public void writeOutput() {
        System.out.println("Name: " + name);
    }
    public boolean hasSameName(Person otherPerson) {
        return this.name.equalsIgnoreCase(otherPerson.name);
    }


}
