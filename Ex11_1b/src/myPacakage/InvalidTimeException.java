package myPacakage;


public class InvalidTimeException extends Exception{
	public InvalidTimeException (){}
	public InvalidTimeException (String message) { super(message); }
	
	public static boolean checkTime(String t){ //t="hh:mm xx"
		try{
			if(!InvalidHourException.checkTime(t) || !InvalidMinuteException.checkTime(t))
				return false;
			
			String ap= t.substring(6,8);

			int colon = t.indexOf(':'); // Create a String index called 'colon'.
			int space = t.indexOf(' '); // Create a String index called 'space'.
	
			if(!ap.equals("am")&& !ap.equals("pm"))
				throw new InvalidTimeException("Exception: wrong am/pm value!");
			
			if (colon != 2 || space != 5) { // If colon is not present.
			  
				throw new InvalidTimeException(			
			  "You entered " + t + "\nFormat must be H:MM XX");			   
			} 				

		}
		catch(NumberFormatException e){
			System.out.println("Cannot change string to integer of "+e.getMessage());
			return false;
			
		}
		catch(InvalidTimeException e){
			System.out.println(e.getMessage());
			System.out.println("Enter the right value");
			return false;
		}

		return true;
		
		
	}

}
