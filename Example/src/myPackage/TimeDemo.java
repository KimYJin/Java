package myPackage;

public class TimeDemo {
    public static void main(String[] args) {
       
    	Time t = new Time();
    	t.setTime(15,30);
    	t.setTime2(3,30,true);
    	
    	t.printTime();
    	
        System.out.println(t.getTime24());
        System.out.println(t.getTime12());
    
        
    }
}