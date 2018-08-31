package com.project.BookingService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="CategoryService", url= "http://localhost:9003")
public interface BookingProxy {

	@PostMapping("/api/category/{category}")
	Bookings retrieveCategory(@PathVariable("category") String categoryName);

	/*@PostMapping("/api/validate")
	Login retrieveUsername(@RequestBody Login login);*/

}
