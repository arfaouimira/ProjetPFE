package org.sid.Projet.iservice;

import java.util.List;

import org.sid.Projet.entities.Notification;


public interface INotificationService {
	
	Notification ajouter(Notification notification); 
	Notification modifier(Notification notification); 
	void supprimer(Notification notification);
	void SupprimerById(Long id);
	Notification getNotification(Long id);
	List<Notification> getAllNotification();
	

}
