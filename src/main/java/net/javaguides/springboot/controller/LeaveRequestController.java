package net.javaguides.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import net.javaguides.springboot.model.LeaveRequest;
import net.javaguides.springboot.repository.LeaveRequestRepository;


@CrossOrigin(origins="http://localhost:4200", maxAge = 4800, allowCredentials = "false"  )
@RestController
@RequestMapping("/api")
public class LeaveRequestController {
	
	
	@Autowired
	private LeaveRequestRepository leaveRequestRepository;

	

	 //get all requests
	 
	 @GetMapping("/leaveRequests")
	  public List<LeaveRequest> getAllRequests() {
	    return leaveRequestRepository.findAll();
	  }
	 
	 //create request
	 @PostMapping("/leaveRequests")  
	 public LeaveRequest createLeaveRequest( @RequestBody LeaveRequest leaveRequest) {
		 return leaveRequestRepository.save(leaveRequest);
		 
	 }
	 
}
