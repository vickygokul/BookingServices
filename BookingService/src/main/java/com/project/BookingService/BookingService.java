package com.project.BookingService;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class BookingService {

	private static AtomicInteger counter = new AtomicInteger();
	
	private static int nextValue() {
		return counter.getAndIncrement();
	}
	
	@Autowired
	private BookingProxy proxy;
	
	
	@Autowired
	private BookingRepo repo;
	
	
	public Bookings getCategoryAndCreate( String uname, String categoryName,int no_Of_Seats) {
		//bookingId= nextValue()+1;
		
		Bookings bookingBean = proxy.retrieveCategory(categoryName);
		
		//bookingBean.setLogin(proxy.retrieveUsername(login));
		
		bookingBean.setCategoryName(categoryName);
		bookingBean.setPrice(bookingBean.getPrice());
		bookingBean.setAmount(bookingBean.getPrice()*no_Of_Seats);
		Bookings.setAvailability(Bookings.getAvailability()-no_Of_Seats);
		Bookings bookings = new Bookings();
		//bookings.setBookingId(bookingId);
		bookings.setCategoryName(categoryName);
		bookings.setNo_Of_Seats(no_Of_Seats);
		bookings.setPrice(bookingBean.getPrice());
		bookings.setAmount(bookingBean.getAmount());
		bookings.setUname(uname);
		int id = (int)repo.count()+1;
		bookings.setBookingId(id);
		repo.save(bookings);
		return bookings;
	}
	
	
}
