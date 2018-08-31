package com.project.BookingService;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins="http://localhost:4200")
@RestController
public class BookingController {
	@Autowired
	private BookingService service;
	
	@PostMapping("/api/booking")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Bookings validateLogin(@RequestBody Bookings booking) {
		
		Bookings bookings=service.getCategoryAndCreate(booking.getUname(), booking.getCategoryName(),booking.getNo_Of_Seats());
	
		return bookings;
	}
	
	@GetMapping("/api/booking")
	public String work() {
		return "Working";
	}
}
