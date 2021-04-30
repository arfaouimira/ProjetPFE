package org.sid.Projet.controller;

import java.util.List;

import org.sid.Projet.entities.NotificationEmail;
import org.sid.Projet.iservice.INotificationEmailService;
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
@RequestMapping("/notificationEmail")
public class NotificationEmailController {
	
	@Autowired
	INotificationEmailService notificationEmailService; 
	
	@GetMapping("/all")
	public ResponseEntity<List<NotificationEmail>> getAllnotificationEmail(){
		List<NotificationEmail> notificationEmails =  notificationEmailService.getAllNotificationEmail();
		return new ResponseEntity<>(notificationEmails, HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity <NotificationEmail> getnotificationEmail(@PathVariable("id") Long id){
		NotificationEmail notificationEmail =  notificationEmailService.getNotificationEmail(id);
		return new ResponseEntity<>(notificationEmail, HttpStatus.OK);
	}
	
	@PostMapping("/ajouter")
    public ResponseEntity<NotificationEmail> ajouter(@RequestBody NotificationEmail notificationEmail) {
		NotificationEmail newNotificationEmail = notificationEmailService.ajouter(notificationEmail);
        return new ResponseEntity<>(newNotificationEmail, HttpStatus.CREATED);
    }
	
	@PutMapping("/modifier")
    public ResponseEntity<NotificationEmail> modifier(@RequestBody NotificationEmail notificationEmail) {
		NotificationEmail modifierNotificationEmail = notificationEmailService.modifier(notificationEmail);
        return new ResponseEntity<>(modifierNotificationEmail, HttpStatus.OK);
    }
	
	@DeleteMapping("/supprimer/{id}")
	public ResponseEntity<?> supprimer(@PathVariable("id") Long id) {
		notificationEmailService.SupprimerById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
