package myPackage;

public class Doctor extends Person{
	
	private String specialty;
	private double visit_fee;
	
	public Doctor(String name, String specialty, double visit_fee){
		super(name);
		setSpecialty(specialty);
		setVisitFee(visit_fee);
	}
	
	public void setSpecialty(String specialty){
		String major[] = {"Medicine", "Surgery", "Dentist", "Oriental" };
		for(int i=0;i<major.length;i++){
			if(specialty.equals(major[i])){	
				this.specialty = specialty;
				return;
			}
		}
		System.out.println("Error.no such specialty");
	}
	
	public void setVisitFee(double visit_fee){
		if(visit_fee >= 0.0)
			this.visit_fee = visit_fee;
		else
			System.out.println("Error:negative visit fee");
	}
	
	public String getSpecialty(){
		return specialty;
	}
	public double getVisitFee(){
		return visit_fee;
	}
	
	@Override
	public String toString(){
		return "Name: " + getName() +
	            "\nSpecialty: " + getSpecialty() +
	            "\nVisit Fee: " + getVisitFee();
	}
	
	
	public boolean equals(Doctor otherDoctor){
		return this.hasSameName(otherDoctor) 
		&& this.specialty.equals(otherDoctor.getSpecialty())
		&& this.visit_fee== otherDoctor.visit_fee;
	}
	
	
}
