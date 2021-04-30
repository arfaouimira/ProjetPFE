package org.sid.Projet.controller;

import java.util.List;

import org.sid.Projet.entities.ModeleSms;
import org.sid.Projet.iservice.IModeleSmsService;
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
@RequestMapping("/modeleSms")
public class ModeleSmsController {
	
	@Autowired
	IModeleSmsService modeleSmsService;
	
	@GetMapping("/all")
	public ResponseEntity<List<ModeleSms>> getAllModeleSms(){
		List<ModeleSms> ModeleSmss =  modeleSmsService.getAllModeleSms();
		return new ResponseEntity<>(ModeleSmss, HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity <ModeleSms> getModeleSms(@PathVariable("id") Long id){
		ModeleSms modeleSms =  modeleSmsService.getModeleSms(id);
		return new ResponseEntity<>(modeleSms, HttpStatus.OK);
	}
	
	@PostMapping("/ajouter")
    public ResponseEntity<ModeleSms> ajouter(@RequestBody ModeleSms modeleSms) {
		ModeleSms newModeleSms = modeleSmsService.ajouter(modeleSms);
        return new ResponseEntity<>(newModeleSms, HttpStatus.CREATED);
    }
	
	@PutMapping("/modifier")
    public ResponseEntity<ModeleSms> modifier(@RequestBody ModeleSms modeleSms) {
		ModeleSms modifierModeleSms = modeleSmsService.modifier(modeleSms);
        return new ResponseEntity<>(modifierModeleSms, HttpStatus.OK);
    }
	
	@DeleteMapping("/supprimer/{id}")
	public ResponseEntity<?> supprimer(@PathVariable("id") Long id) {
		modeleSmsService.SupprimerById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
