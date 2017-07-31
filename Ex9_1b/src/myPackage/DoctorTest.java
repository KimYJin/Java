package myPackage;

public class DoctorTest {

	public static void main(String[] args) {
		Doctor d1 = new Doctor("Kevin","Dentist",50);
		Doctor d2 = new Doctor("Clara","Medicine",30);
		
		System.out.println(d1.toString());
		System.out.println("\n"+d2.toString());
		
		System.out.println("\n"+d1.getName()+" and "+d2.getName()+ " equals? : " +d1.equals(d2));

	}

}
