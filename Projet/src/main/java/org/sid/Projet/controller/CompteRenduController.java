package org.sid.Projet.controller;

import java.util.List;

import org.sid.Projet.entities.CompteRendu;
import org.sid.Projet.iservice.ICompteRenduService;
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
@RequestMapping("/compteRendu")
public class CompteRenduController {
	
	@Autowired
	ICompteRenduService compteRenduService;
	
	@GetMapping("/all")
	public ResponseEntity<List<CompteRendu>> getAllCompteRendu(){
		List<CompteRendu> compteRendus =  compteRenduService.getAllCompteRendu();
		return new ResponseEntity<>(compteRendus, HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity <CompteRendu> getCompteRendu(@PathVariable("id") Long id){
		CompteRendu compteRendu =  compteRenduService.getCompteRendu(id);
		return new ResponseEntity<>(compteRendu, HttpStatus.OK);
	}
	
	@PostMapping("/ajouter")
    public ResponseEntity<CompteRendu> ajouter(@RequestBody CompteRendu compteRendu) {
		CompteRendu newCompteRendu = compteRenduService.ajouter(compteRendu);
        return new ResponseEntity<>(newCompteRendu, HttpStatus.CREATED);
    }
	
	@PutMapping("/modifier")
    public ResponseEntity<CompteRendu> modifier(@RequestBody CompteRendu compteRendu) {
		CompteRendu modifierCompteRendu = compteRenduService.modifier(compteRendu);
        return new ResponseEntity<>(modifierCompteRendu, HttpStatus.OK);
    }
	
	@DeleteMapping("/supprimer/{id}")
	public ResponseEntity<?> supprimer(@PathVariable("id") Long id) {
		compteRenduService.SupprimerById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
