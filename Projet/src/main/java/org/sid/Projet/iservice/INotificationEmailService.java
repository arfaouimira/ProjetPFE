package org.sid.Projet.iservice;

import java.util.List;

import org.sid.Projet.entities.NotificationEmail;

public interface INotificationEmailService {
	
	NotificationEmail ajouter(NotificationEmail notificationEmail); 
	NotificationEmail modifier(NotificationEmail notificationEmail); 
	void supprimer(NotificationEmail notificationEmail);
	void SupprimerById(Long id);
	NotificationEmail getNotificationEmail(Long id);
	List<NotificationEmail> getAllNotificationEmail();

}
