package myPacakage;

public class InvalidTimeExceptionTest {
	
	public static void main(String[] args) {
	    try {
	    	String t1= "11:23 am";
	    	String t2= "15:00 pm";
	    	String t3= "08:60 pm";
	        
	        if(InvalidTimeException.checkTime(t1))
	        		System.out.println(t1+" -> right time value!");
	        System.out.println();
	        
	        if(InvalidTimeException.checkTime(t2))
	        	System.out.println(t2+" -> right time value!");
	        System.out.println();
	        
	        if(InvalidTimeException.checkTime(t3))
	        	System.out.println(t3+" -> right time value!");
	        
	    } catch(Exception e) {
	        System.out.println(e.getMessage());
	        e.printStackTrace();
            System.exit(0);
	    }
	}


}
