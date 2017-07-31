package myPackage;

public class Student extends Person {
	
	    private int studentNumber;
	    
	    public Student() {  //default constructor
	        super();
	        studentNumber = 0;
	    }
	    
	    public Student(String initialName, int initialStudentNumber) { //constructor
	        super(initialName);
	        studentNumber = initialStudentNumber;
	    }
	    public void reset(String newName, int newStudentNumber) {
	        setName(newName);
	        studentNumber = newStudentNumber;
	    }
	    public int getStudentNumber() {
	        return studentNumber;
	    }
	    public void setStudentNumber(int newStudentNumber) {
	        studentNumber = newStudentNumber;
	    }
	    
	    @Override
	    public void writeOutput() {
	        super.writeOutput();  //overriding
	         System.out.println("Student Number: " + studentNumber);
	    }
	    public boolean equals(Student otherStudent) {
	        return this.hasSameName(otherStudent)
	                       &&(this.studentNumber == otherStudent.studentNumber);
	    }
	    

}
