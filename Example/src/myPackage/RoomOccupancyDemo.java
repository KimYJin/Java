package myPackage;

public class RoomOccupancyDemo {

	public static void main(String[] args) {
		RoomOccupancy r1 = new RoomOccupancy(101, 2);
		RoomOccupancy r2 = new RoomOccupancy(102, 3);
		System.out.println(RoomOccupancy.getTotal());
		
		r1.addOneToRoom();	//3
		r1.addOneToRoom();	//4
        r1.addOneToRoom();	//5
        r2.removeOneFromRoom();	//2
        
        System.out.println(r1.getPeopleInRoom());	//5
        System.out.println(r2.getPeopleInRoom());	//2
		System.out.println(RoomOccupancy.getTotal());	//7
	}

}
