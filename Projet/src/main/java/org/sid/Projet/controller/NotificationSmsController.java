package org.sid.Projet.controller;

import java.util.List;

import org.sid.Projet.entities.NotificationSms;
import org.sid.Projet.iservice.INotificationSmsService;
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
@RequestMapping("/notificationSms")
public class NotificationSmsController {
	
	@Autowired
	INotificationSmsService notificationSmsService;
	
	@GetMapping("/all")
	public ResponseEntity<List<NotificationSms>> getAllnotificationSms(){
		List<NotificationSms> notificationSmss =  notificationSmsService.getAllNotificationSms();
		return new ResponseEntity<>(notificationSmss, HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity <NotificationSms> getnotificationSms(@PathVariable("id") Long id){
		NotificationSms notificationSms =  notificationSmsService.getNotificationSms(id);
		return new ResponseEntity<>(notificationSms, HttpStatus.OK);
	}
	
	@PostMapping("/ajouter")
    public ResponseEntity<NotificationSms> ajouter(@RequestBody NotificationSms notificationSms) {
		NotificationSms newNotificationSms = notificationSmsService.ajouter(notificationSms);
        return new ResponseEntity<>(newNotificationSms, HttpStatus.CREATED);
    }
	
	@PutMapping("/modifier")
    public ResponseEntity<NotificationSms> modifier(@RequestBody NotificationSms notificationSms) {
		NotificationSms modifierNotificationSms = notificationSmsService.modifier(notificationSms);
        return new ResponseEntity<>(modifierNotificationSms, HttpStatus.OK);
    }
	
	@DeleteMapping("/supprimer/{id}")
	public ResponseEntity<?> supprimer(@PathVariable("id") Long id) {
		notificationSmsService.SupprimerById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
