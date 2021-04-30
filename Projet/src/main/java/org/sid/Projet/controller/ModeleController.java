package org.sid.Projet.controller;

import java.util.List;

import org.sid.Projet.entities.Modele;
import org.sid.Projet.iservice.IModeleService;
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
@RequestMapping("/modele")
public class ModeleController {
	
	@Autowired
	IModeleService modeleService;
	
	@GetMapping("/all")
	public ResponseEntity<List<Modele>> getAllModele(){
		List<Modele> Modeles =  modeleService.getAllModele();
		return new ResponseEntity<>(Modeles, HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity <Modele> getModele(@PathVariable("id") Long id){
		Modele modele =  modeleService.getModele(id);
		return new ResponseEntity<>(modele, HttpStatus.OK);
	}
	
	@PostMapping("/ajouter")
    public ResponseEntity<Modele> ajouter(@RequestBody Modele modele) {
		Modele newModele = modeleService.ajouter(modele);
        return new ResponseEntity<>(newModele, HttpStatus.CREATED);
    }
	
	@PutMapping("/modifier")
    public ResponseEntity<Modele> modifier(@RequestBody Modele modele) {
		Modele modifierModele = modeleService.modifier(modele);
        return new ResponseEntity<>(modifierModele, HttpStatus.OK);
    }
	
	@DeleteMapping("/supprimer/{id}")
	public ResponseEntity<?> supprimer(@PathVariable("id") Long id) {
		modeleService.SupprimerById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}


}
