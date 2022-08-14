package net.javaguides.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.model.Collaborator;
import net.javaguides.springboot.model.Collaborator;
import net.javaguides.springboot.repository.CollaboratorRepository;
import net.javaguides.springboot.repository.CollaboratorRepository;

@CrossOrigin(origins="http://localhost:4200", maxAge = 4800, allowCredentials = "false"  )
@RestController
@RequestMapping("/api")
public class CollaboratorController {

	@Autowired
	private CollaboratorRepository collaboratorRepository;

	 //get all collaborators 
	 
	 @GetMapping("/collaborators")
	  public List<Collaborator> getAllCollaborators() {
	    return collaboratorRepository.findAll();
	  }
	 //get collaborator by id
	 @GetMapping("/collaborators/{id}")
	  public  ResponseEntity<Collaborator> getCollaboratorById(@PathVariable("id") long id) {
		 Collaborator collaborator = collaboratorRepository.findById(id)
					.orElseThrow(() -> new ResourceNotFoundException("Collaborator not exist with id :" + id));
			return 
			ResponseEntity.ok(collaborator);
	  }
	 
	 //create collaborator
	 @PostMapping("/collaborators")  
	 public Collaborator createCollaborator( @RequestBody Collaborator collaborator) {
		 return collaboratorRepository.save(collaborator);
		 
	 }
	 
	
	 
	 //delete collaborator
	 @DeleteMapping(path ="/collaborators/{id}")

	 public void deleteCollaborator(@PathVariable long id)
	 {
		 collaboratorRepository.deleteById(id);
	 }

}
