package org.sid.Projet.controller;

import java.util.List;

import org.sid.Projet.entities.ModeleEmail;
import org.sid.Projet.iservice.IModeleEmailService;
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
@RequestMapping("/modeleEmail")
public class ModeleEmailController {
	
	@Autowired
	IModeleEmailService modeleEmailService;
	
	@GetMapping("/all")
	public ResponseEntity<List<ModeleEmail>> getAllModeleEmail(){
		List<ModeleEmail> ModeleEmails =  modeleEmailService.getAllModeleEmail();
		return new ResponseEntity<>(ModeleEmails, HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity <ModeleEmail> getModeleEmail(@PathVariable("id") Long id){
		ModeleEmail modeleEmail =  modeleEmailService.getModeleEmail(id);
		return new ResponseEntity<>(modeleEmail, HttpStatus.OK);
	}
	
	@PostMapping("/ajouter")
    public ResponseEntity<ModeleEmail> ajouter(@RequestBody ModeleEmail modeleEmail) {
		ModeleEmail newModeleEmail = modeleEmailService.ajouter(modeleEmail);
        return new ResponseEntity<>(newModeleEmail, HttpStatus.CREATED);
    }
	
	@PutMapping("/modifier")
    public ResponseEntity<ModeleEmail> modifier(@RequestBody ModeleEmail modeleEmail) {
		ModeleEmail modifierModeleEmail = modeleEmailService.modifier(modeleEmail);
        return new ResponseEntity<>(modifierModeleEmail, HttpStatus.OK);
    }
	
	@DeleteMapping("/supprimer/{id}")
	public ResponseEntity<?> supprimer(@PathVariable("id") Long id) {
		modeleEmailService.SupprimerById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}


}
