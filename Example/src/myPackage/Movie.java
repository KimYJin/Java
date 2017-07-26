package myPackage;

public class Movie {
	
	private String name,mpaaRating;
	
	 private int countTerrible;
	 private int countBad;
	 private int countOk;
	 private int countGood;
	 private int countGreat;
	
	private double average;
	private int sum=0;
	private int count =0;
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setMpaaRating(String mpaaRating){
		this.mpaaRating=mpaaRating;
	}
	public String getMpaaRating(){
		return mpaaRating;
	}
	
	public void addRating(int num){
		switch(num){
		case 1:	countTerrible++; break;
		case 2:	countBad++; break;
		case 3:	countOk++; break;
		case 4:	countGood++; break;
		case 5:	countGreat++; break;
		}
		count++;
	}
	public double getAverage(){
		sum=countTerrible*1+countBad*2+countOk*3+countGood*4+countGreat*5;
		average = sum / count;
		return average;
	}
	
	 public void printMovie() {
	        System.out.println("Name: " + name + "\nMPAA rating: " + mpaaRating);
	        System.out.println("Average rating: " + getAverage());
	    }
	
	public boolean equals(Movie movie){
		return 
		this.name.equals(movie.name) &&
        this.mpaaRating.equals(movie.mpaaRating) &&
        this.countTerrible == movie.countTerrible &&
        this.countBad == movie.countBad &&
        this.countOk == movie.countOk &&
        this.countGood == movie.countGood &&
        this.countGreat == movie.countGreat;
	}
	
}
