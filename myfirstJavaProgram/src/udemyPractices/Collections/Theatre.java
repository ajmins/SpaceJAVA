package udemyPractices.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class Theatre {

	private final String theatreName;
	//if we use collections
	//		with arraylist, linkedlist it's ordered
	//		with hashset will get unordered  and with linkedhashset, it's agin ordered
	//      with treeset will create error, cast error
	private List<Seat> seats = new ArrayList<>();
	
	
	public Theatre(String theatreName, int numRows, int seatsPerRow) {
		this.theatreName = theatreName;
		int lastRow = 'A' +(numRows -1);
		for (char row = 'A';  row<= lastRow; row++) {
			for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
				Seat seat = new Seat(row + String.format("%02d", seatNum));
				seats.add(seat);
			}
		}
	}


	public String getTheatreName() {
		return theatreName;
	}
	
	public boolean reserveSeat(String seatNumber) {
		Seat requestSeat = new Seat(seatNumber);
		int foundSeat = Collections.binarySearch(seats, requestSeat, null);
		if (foundSeat >= 0) {
			return seats.get(foundSeat).reserve();
			}
		else {
			System.out.println("There is no seat " +seatNumber);
			return false;
		}
//		for (Seat seat : seats) {
//			System.out.print(".");
//			if (seat.getSeatNumber().equals(seatNumber)) {
//				requestSeat = seat;
//				break;
//			}
//		}
//		if (requestSeat == null) {
//			System.out.println("There is no seat "+ seatNumber);
//			return false;
//		}
//		return requestSeat.reserve();
		
	} 
	public void getSeats() {
		for (Seat seat : seats) {
			System.out.println(seat.getSeatNumber());
		}
	}
	
	private class Seat implements Comparable<Seat>{
		private final String seatNumber;
		private boolean reserved = false;
		
		
		public Seat(String seatNumber) {
			this.seatNumber = seatNumber;
		}


		@Override
		public int compareTo(Seat seat) {
			
			return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
		}

		public String getSeatNumber() {
			return seatNumber;
		}
		public boolean reserve() {
			if (!this.reserved) {
				this.reserved = true;
				System.out.println("Seat "+ seatNumber +" reserved");
				return true;
			}
			else {
				return false;
			}
		}
		
		public boolean cancel() {
			if (this.reserved) {
				this.reserved = false;
				System.out.println("Reservation of seat "+ seatNumber + " cancelled");
				return true;
			}
			return false;
		}


		
		
		
	}
	
	
	
	
	
	
	
	
}
