package myPackage;

public class Time {

	private int hour, minute;
	
	Time(){
		hour = 0;
		minute = 0;
	}
	
	public static boolean isValid(int hour, int minute){
		if(hour<24 && hour>=0 && minute<60 && minute>=0)
			return true;
		else
			return false;
	}
	
	public void setTime(int hour, int minute){
		if(isValid(hour,minute))
		{
			this.hour = hour;
			this.minute=minute;
		}
		else
			System.out.println("Error");
	}
	
	public void setTime2(int hour, int minute, boolean isPM) 
	{
		if(hour>=0 && hour<=12 && isPM)
		{
			hour = hour + 12;
			setTime(hour,minute);
		}
	}
	 public void printTime() {
	        System.out.println("The time is: " + hour + ":" + minute);
	    }
	 
	 public String getTime24() {
	        return String.format("%02d:%02d", hour, minute);
	    }

	 public String getTime12() {
		 int hour = this.hour; boolean isPM = false;
		 if (hour > 12) {
	        	
	            hour = hour - 12; isPM = true;
	        }
		 return String.format("%d:%02d %s", hour, minute, (isPM) ? ("pm") : ("am"));
	 }
}
