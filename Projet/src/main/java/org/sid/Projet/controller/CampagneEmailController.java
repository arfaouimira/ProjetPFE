package org.sid.Projet.controller;

import java.util.List;

import org.sid.Projet.entities.CampagneEmail;
import org.sid.Projet.iservice.ICampagneEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/campagneEmail")
public class CampagneEmailController {
	
	@Autowired
	ICampagneEmailService campagneEmailService;
	
	@GetMapping("/all")
	public ResponseEntity<List<CampagneEmail>> getAllCampagneEmail(){
		List<CampagneEmail> campagneEmails =  campagneEmailService.getAllCampagneEmail();
		return new ResponseEntity<>(campagneEmails, HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity <CampagneEmail> getCampagneEmail(@PathVariable("id") Long id){
		CampagneEmail campagneEmail =  campagneEmailService.getCampagneEmail(id);
		return new ResponseEntity<>(campagneEmail, HttpStatus.OK);
	}
	
	@PostMapping("/ajouter")
    public ResponseEntity<CampagneEmail> ajouter(@RequestBody CampagneEmail campagneEmail) {
		CampagneEmail newCampagneEmail = campagneEmailService.ajouter(campagneEmail);
        return new ResponseEntity<>(newCampagneEmail, HttpStatus.CREATED);
    }
	
	
	  @PutMapping("/modifier") public ResponseEntity<CampagneEmail>
	  modifier(@RequestBody CampagneEmail campagneEmail) { CampagneEmail
	  modifierCampagneEmail = campagneEmailService.modifier(campagneEmail); return
	  new ResponseEntity<>(modifierCampagneEmail, HttpStatus.OK); }
	 
	
	@DeleteMapping("/supprimer/{id}")
	public ResponseEntity<?> supprimer(@PathVariable("id") Long id) {
		campagneEmailService.SupprimerById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}


}
