package org.domagals;

public class House{
	
	int numberOfRooms;
	
	public House(final int roomAmount){
		numberOfRooms = roomAmount;
	}
	
	public boolean isBig(){
		return this.numberOfRooms > 15;
	}
	
	@Override
	public String toString() {
		return "Domek z "+numberOfRooms+" pokojami";
	}
}