package myPackage;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student("Jane", 201433753);
    	Student s2 = new Student("Marry", 201433767);
    	
    	s1.writeOutput();
    	s2.writeOutput();
    	
    	System.out.println(s1.getName()+" and "+s2.getName()+ " equals? : " +s1.equals(s2));
    	
    	

	}

}
