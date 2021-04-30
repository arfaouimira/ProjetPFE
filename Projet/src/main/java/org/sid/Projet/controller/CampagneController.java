package org.sid.Projet.controller;



import java.util.List;

import org.sid.Projet.entities.Campagne;
import org.sid.Projet.iservice.ICampagneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/campagne")
public class CampagneController {
	
	@Autowired
	ICampagneService campagneService;
	
	@GetMapping("/all")
	public ResponseEntity<List<Campagne>> getAllCampagne(){
		List<Campagne> campagnes =  campagneService.getAllCampagne();
		return new ResponseEntity<>(campagnes, HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity <Campagne> getCampagne(@PathVariable("id") Long id){
		Campagne campagne =  campagneService.getCampagne(id);
		return new ResponseEntity<>(campagne, HttpStatus.OK);
	}
	
	@PostMapping("/ajouter")
    public ResponseEntity<Campagne> ajouter(@RequestBody Campagne campagne) {
		Campagne newCampagne = campagneService.ajouter(campagne);
        return new ResponseEntity<>(newCampagne, HttpStatus.CREATED);
    }
	
	@PutMapping("/modifier")
    public ResponseEntity<Campagne> modifier(@RequestBody Campagne campagne) {
		Campagne modifierCampagne = campagneService.modifier(campagne);
        return new ResponseEntity<>(modifierCampagne, HttpStatus.OK);
    }
	
	@DeleteMapping("/supprimer/{id}")
	public ResponseEntity<?> supprimer(@PathVariable("id") Long id) {
		campagneService.SupprimerById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	
	
	

}
