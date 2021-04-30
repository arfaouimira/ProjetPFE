package org.sid.Projet.controller;

import java.util.List;

import org.sid.Projet.entities.Statistique;
import org.sid.Projet.iservice.IStatistiqueService;
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
@RequestMapping("/statistique")
public class StatistiqueController {
	
	@Autowired
	IStatistiqueService statistiqueService;
	
	@GetMapping("/all")
	public ResponseEntity<List<Statistique>> getAllstatistique(){
		List<Statistique> statistiques =  statistiqueService.getAllStatistique();
		return new ResponseEntity<>(statistiques, HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity <Statistique> getstatistique(@PathVariable("id") Long id){
		Statistique statistique =  statistiqueService.getStatistique(id);
		return new ResponseEntity<>(statistique, HttpStatus.OK);
	}
	
	@PostMapping("/ajouter")
    public ResponseEntity<Statistique> ajouter(@RequestBody Statistique statistique) {
		Statistique newstatistique = statistiqueService.ajouter(statistique);
        return new ResponseEntity<>(newstatistique, HttpStatus.CREATED);
    }
	
	@PutMapping("/modifier")
    public ResponseEntity<Statistique> modifier(@RequestBody Statistique statistique) {
		Statistique modifierstatistique = statistiqueService.modifier(statistique);
        return new ResponseEntity<>(modifierstatistique, HttpStatus.OK);
    }
	
	@DeleteMapping("/supprimer/{id}")
	public ResponseEntity<?> supprimer(@PathVariable("id") Long id) {
		statistiqueService.SupprimerById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
