package org.sid.Projet.iservice;

import java.util.List;

import org.sid.Projet.entities.NotificationAlerte;

public interface INotificationAlerteService {
	
	NotificationAlerte ajouter(NotificationAlerte notificationAlerte); 
	NotificationAlerte modifier(NotificationAlerte notificationAlerte); 
	void supprimer(NotificationAlerte notificationAlerte);
	void SupprimerById(Long id);
	NotificationAlerte getNotificationAlerte(Long id);
	List<NotificationAlerte> getAllNotificationAlerte();

}
