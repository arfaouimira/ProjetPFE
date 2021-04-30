package org.sid.Projet.controller;

import java.util.List;

import org.sid.Projet.entities.NotificationAlerte;
import org.sid.Projet.iservice.INotificationAlerteService;
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
@RequestMapping("/notificationAlerte")

public class NotificationAlerteController {
	
	@Autowired
	INotificationAlerteService notificationAlerteService;
	
	@GetMapping("/all")
	public ResponseEntity<List<NotificationAlerte>> getAllnotificationAlerte(){
		List<NotificationAlerte> notificationAlertes =  notificationAlerteService.getAllNotificationAlerte();
		return new ResponseEntity<>(notificationAlertes, HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity <NotificationAlerte> getnotificationAlerte(@PathVariable("id") Long id){
		NotificationAlerte notificationAlerte =  notificationAlerteService.getNotificationAlerte(id);
		return new ResponseEntity<>(notificationAlerte, HttpStatus.OK);
	}
	
	@PostMapping("/ajouter")
    public ResponseEntity<NotificationAlerte> ajouter(@RequestBody NotificationAlerte notificationAlerte) {
		NotificationAlerte newNotificationAlerte = notificationAlerteService.ajouter(notificationAlerte);
        return new ResponseEntity<>(newNotificationAlerte, HttpStatus.CREATED);
    }
	
	@PutMapping("/modifier")
    public ResponseEntity<NotificationAlerte> modifier(@RequestBody NotificationAlerte notificationAlerte) {
		NotificationAlerte modifierNotificationAlerte = notificationAlerteService.modifier(notificationAlerte);
        return new ResponseEntity<>(modifierNotificationAlerte, HttpStatus.OK);
    }
	
	@DeleteMapping("/supprimer/{id}")
	public ResponseEntity<?> supprimer(@PathVariable("id") Long id) {
		notificationAlerteService.SupprimerById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
