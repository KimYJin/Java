package myPackage;

public class InvalidTimeExceptionTest {
	
	public static void main(String[] args) {
	    try {
	    	String t1= "11:23 am";
	    	String t2= "15:00 pm";
	        
	       if(InvalidTimeException.checkTime(t1))
	    	   System.out.println(t1+ " -> right time value."+'\n'+'\n');
	       if(InvalidTimeException.checkTime(t2))
	    	   System.out.println(t1+ " -> right time value.");
	        
	    } catch(Exception e) {
	        System.out.println(e.getMessage());
	    }
	}


}
