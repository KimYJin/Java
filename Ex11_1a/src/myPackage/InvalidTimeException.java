package myPackage;


public class InvalidTimeException {
	
	public static boolean checkTime(String t){ //t="hh:mm xx"
		try{
			
			String hh= t.substring(0,2);

			String mm= t.substring(3,5);

			String ap= t.substring(6,8);

			
			int h=Integer.parseInt(hh);

			int m=Integer.parseInt(mm);

			
			int colon = t.indexOf(':'); // Create a String index called 'colon'.
			int space = t.indexOf(' '); // Create a String index called 'space'.
			
			if(h<0 || h>12)
				throw new Exception("Exception: wrong hour value!");
			if(m<0 || m>59)
				throw new Exception("Exception: wrong minute value!");
			if(!ap.equals("am")&& !ap.equals("pm"))
				throw new Exception("Exception: wrong am/pm value!");
			
			if (colon != 2 || space != 5) { // If colon is not present.
			  
				throw new Exception(			
			  "You entered " + t + "\nFormat must be H:MM XX");	
				
			} 				

		}
		catch(NumberFormatException e){
			System.out.println("Cannot change string to integer of "+e.getMessage());
			return false;
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println("Enter the right value");
			return false;
		}
		return true;
		
		
	}

}
