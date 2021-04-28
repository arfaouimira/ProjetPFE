package org.sid.Projet.iservice;

import java.util.List;

import org.sid.Projet.entities.NotificationSms;



public interface INotificationSmsService {
	
	NotificationSms ajouter(NotificationSms notificationSms); 
	NotificationSms modifier(NotificationSms notificationSms); 
	void supprimer(NotificationSms NotificationSms);
	void SupprimerById(Long id);
	NotificationSms getNotificationSms(Long id);
	List<NotificationSms> getAllNotificationSms();

}
