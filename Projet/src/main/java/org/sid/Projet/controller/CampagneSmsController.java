package org.sid.Projet.controller;

import java.util.List;

import org.sid.Projet.entities.CampagneSms;
import org.sid.Projet.iservice.ICampagneSmsService;
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
@RequestMapping("/campagneSms")
public class CampagneSmsController {
	
	@Autowired
	ICampagneSmsService campagneSmsService;
	
	@GetMapping("/all")
	public ResponseEntity<List<CampagneSms>> getAllCampagneSms(){
		List<CampagneSms> campagneSmss =  campagneSmsService.getAllCampagneSms();
		return new ResponseEntity<>(campagneSmss, HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity <CampagneSms> getCampagneSms(@PathVariable("id") Long id){
		CampagneSms campagneSms =  campagneSmsService.getCampagneSms(id);
		return new ResponseEntity<>(campagneSms, HttpStatus.OK);
	}
	
	@PostMapping("/ajouter")
    public ResponseEntity<CampagneSms> ajouter(@RequestBody CampagneSms campagneSms) {
		CampagneSms newCampagneSms = campagneSmsService.ajouter(campagneSms);
        return new ResponseEntity<>(newCampagneSms, HttpStatus.CREATED);
    }
	
	@PutMapping("/modifier")
    public ResponseEntity<CampagneSms> modifier(@RequestBody CampagneSms campagneSms) {
		CampagneSms modifierCampagneSms = campagneSmsService.modifier(campagneSms);
        return new ResponseEntity<>(modifierCampagneSms, HttpStatus.OK);
    }
	
	@DeleteMapping("/supprimer/{id}")
	public ResponseEntity<?> supprimer(@PathVariable("id") Long id) {
		campagneSmsService.SupprimerById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	

}
