package org.sid.Projet.controller;

import java.util.List;

import org.sid.Projet.entities.Notification;
import org.sid.Projet.iservice.INotificationService;
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
@RequestMapping("/notification")
public class NotificationController {
	
	@Autowired
	INotificationService notificationService;
	
	@GetMapping("/all")
	public ResponseEntity<List<Notification>> getAllnotification(){
		List<Notification> notifications =  notificationService.getAllNotification();
		return new ResponseEntity<>(notifications, HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity <Notification> getnotification(@PathVariable("id") Long id){
		Notification notification =  notificationService.getNotification(id);
		return new ResponseEntity<>(notification, HttpStatus.OK);
	}
	
	@PostMapping("/ajouter")
    public ResponseEntity<Notification> ajouter(@RequestBody Notification notification) {
		Notification newNotification = notificationService.ajouter(notification);
        return new ResponseEntity<>(newNotification, HttpStatus.CREATED);
    }
	
	@PutMapping("/modifier")
    public ResponseEntity<Notification> modifier(@RequestBody Notification notification) {
		Notification modifierNotification = notificationService.modifier(notification);
        return new ResponseEntity<>(modifierNotification, HttpStatus.OK);
    }
	
	@DeleteMapping("/supprimer/{id}")
	public ResponseEntity<?> supprimer(@PathVariable("id") Long id) {
		notificationService.SupprimerById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
