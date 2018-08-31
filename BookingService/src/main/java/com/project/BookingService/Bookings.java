package com.project.BookingService;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="booking")
public class Bookings {

	//private String username;
	private static int availability=100;
	public static int getAvailability() {
		return availability;
	}
	public static void setAvailability(int availability) {
		Bookings.availability = availability;
	}
	private int amount;
	@Id
	private int bookingId;
	private String categoryName;
	private int no_Of_Seats;
	
	
	private int price;
	
	

	private String uname;

	

	/*public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}

*/


	public Bookings() {
		super();
	}



	public Bookings( String uname, String categoryName,int no_Of_Seats) {
		super();
		this.uname=uname;
		this.categoryName = categoryName;
		this.no_Of_Seats = no_Of_Seats;
		
		//this.price = price;
	//	this.amount = amount;
		//this.username=username;
	}



	public int getAmount() {
		return amount;
	}
	public int getBookingId() {
		return bookingId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public int getNo_Of_Seats() {
		return no_Of_Seats;
	}
	
	public int getPrice() {
		return price;
	}

	public String getUname() {
		return uname;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public void setNo_Of_Seats(int no_Of_Seats) {
		this.no_Of_Seats = no_Of_Seats;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	
	
}
