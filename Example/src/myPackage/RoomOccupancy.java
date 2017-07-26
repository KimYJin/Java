package myPackage;

public class RoomOccupancy {
	private int roomNumber, peopleInRoom;
	private static int totalNumber;
	
	RoomOccupancy(int roomNumber, int peopleInRoom){
		this.roomNumber = roomNumber;
		this.peopleInRoom = peopleInRoom;
		totalNumber +=peopleInRoom;
	}
	
	public void addOneToRoom(){
		peopleInRoom++;
		totalNumber++;
	}
	
	public void removeOneFromRoom(){
		if(roomNumber>0 || peopleInRoom>0){
			peopleInRoom--;
			totalNumber--;
		}
	}
	
	public int getNumber(){
		return roomNumber;
	}
	
	public int getPeopleInRoom(){
		return peopleInRoom;
	}
	
	public static int getTotal(){
		return totalNumber;
	}
}
