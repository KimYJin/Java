package myPackage;

public class MovieDemo {

	public static void main(String[] args) {
		
        Movie m = new Movie();
        Movie n = new Movie();

        m.setName("The Shawshank Redemption");
        m.setMpaaRating("PG");
        m.addRating(5);
        m.addRating(5);
        m.addRating(5);
        m.addRating(4);
        m.addRating(3);
        m.printMovie();
        System.out.println();
        
        n.setName("The Godfather");
        n.setMpaaRating("PG-13");
        n.addRating(5);
        n.addRating(5);
        n.addRating(4);
        n.addRating(4);
        n.addRating(3);
        n.printMovie();
        System.out.println();

        System.out.println(m.equals(n));
	}

}
