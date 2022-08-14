package net.javaguides.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.model.LeaveType;
import net.javaguides.springboot.repository.LeaveTypeRepository;



@CrossOrigin(origins="http://localhost:4200", maxAge = 4800, allowCredentials = "false"  )
@RestController
@RequestMapping("/api")
public class LeaveTypeController {

	@Autowired
	private LeaveTypeRepository leaveTypeRepository;
	
	//get all Types
	 
		 @GetMapping("leaveTypes")
		  public List<LeaveType> getAllTypes() {
		    return leaveTypeRepository.findAll();
		  }
		 
		//get type by id
		 @GetMapping("/leaveTypes/{id}")
		  public  ResponseEntity<LeaveType> getLeaveTypeById(@PathVariable("id") long id) {
			 LeaveType leaveType = leaveTypeRepository.findById(id)
						.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
				return 
				ResponseEntity.ok(leaveType);
		  }
		 
		//get type by title
		 @GetMapping("/ltype/{leaveTitle}")
		  public  ResponseEntity<LeaveType> getLeaveTypeByTitle(@PathVariable("leaveTitle") String leaveTitle) {
			 LeaveType leaveType = leaveTypeRepository.findByTitle(leaveTitle);
				return 
				ResponseEntity.ok(leaveType);
		  }
}
