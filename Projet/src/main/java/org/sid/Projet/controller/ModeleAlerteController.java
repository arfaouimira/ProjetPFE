package org.sid.Projet.controller;

import java.util.List;

import org.sid.Projet.entities.ModeleAlerte;
import org.sid.Projet.iservice.IModeleAlerteService;
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
@RequestMapping("/modeleAlerte")
public class ModeleAlerteController {
	
	@Autowired
	IModeleAlerteService modeleAlerteService; 
	
	@GetMapping("/all")
	public ResponseEntity<List<ModeleAlerte>> getAllModeleAlerte(){
		List<ModeleAlerte> ModeleAlertes =  modeleAlerteService.getAllModeleAlerte();
		return new ResponseEntity<>(ModeleAlertes, HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity <ModeleAlerte> getModeleAlerte(@PathVariable("id") Long id){
		ModeleAlerte modeleAlerte =  modeleAlerteService.getModeleAlerte(id);
		return new ResponseEntity<>(modeleAlerte, HttpStatus.OK);
	}
	
	@PostMapping("/ajouter")
    public ResponseEntity<ModeleAlerte> ajouter(@RequestBody ModeleAlerte modeleAlerte) {
		ModeleAlerte newModeleAlerte = modeleAlerteService.ajouter(modeleAlerte);
        return new ResponseEntity<>(newModeleAlerte, HttpStatus.CREATED);
    }
	
	@PutMapping("/modifier")
    public ResponseEntity<ModeleAlerte> modifier(@RequestBody ModeleAlerte modeleAlerte) {
		ModeleAlerte modifierModeleAlerte = modeleAlerteService.modifier(modeleAlerte);
        return new ResponseEntity<>(modifierModeleAlerte, HttpStatus.OK);
    }
	
	@DeleteMapping("/supprimer/{id}")
	public ResponseEntity<?> supprimer(@PathVariable("id") Long id) {
		modeleAlerteService.SupprimerById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
