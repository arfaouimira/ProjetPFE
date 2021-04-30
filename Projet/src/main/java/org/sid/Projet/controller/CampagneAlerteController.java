package org.sid.Projet.controller;

import java.util.List;

import org.sid.Projet.entities.CampagneAlerte;
import org.sid.Projet.iservice.ICampagneAlerteService;
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
@RequestMapping("/campagneAlerte")
public class CampagneAlerteController {
	
	@Autowired
	ICampagneAlerteService campagneAlerteService;
	
	@GetMapping("/all")
	public ResponseEntity<List<CampagneAlerte>> getAllCampagneAlerte(){
		List<CampagneAlerte> campagneAlertes =  campagneAlerteService.getAllCampagneAlerte();
		return new ResponseEntity<>(campagneAlertes, HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity <CampagneAlerte> getCampagneAlerte(@PathVariable("id") Long id){
		CampagneAlerte campagneAlerte =  campagneAlerteService.getCampagneAlerte(id);
		return new ResponseEntity<>(campagneAlerte, HttpStatus.OK);
	}
	
	@PostMapping("/ajouter")
    public ResponseEntity<CampagneAlerte> ajouter(@RequestBody CampagneAlerte campagneAlerte) {
		CampagneAlerte newCampagneAlerte = campagneAlerteService.ajouter(campagneAlerte);
        return new ResponseEntity<>(newCampagneAlerte, HttpStatus.CREATED);
    }
	
	
	  @PutMapping("/modifier") public ResponseEntity<CampagneAlerte>
	  modifier(@RequestBody CampagneAlerte campagneAlerte) { CampagneAlerte
	  modifierCampagneAlerte = campagneAlerteService.modifier(campagneAlerte);
	  return new ResponseEntity<>(modifierCampagneAlerte, HttpStatus.OK); }
	 
	
	@DeleteMapping("/supprimer/{id}")
	public ResponseEntity<?> supprimer(@PathVariable("id") Long id) {
		campagneAlerteService.SupprimerById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	

}
