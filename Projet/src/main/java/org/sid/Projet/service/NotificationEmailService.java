package org.sid.Projet.service;

import java.util.List;

import org.sid.Projet.entities.NotificationEmail;
import org.sid.Projet.idao.INotificationEmailDao;
import org.sid.Projet.iservice.INotificationEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class NotificationEmailService implements INotificationEmailService  {

	@Autowired
	INotificationEmailDao notificationEmailDao; 
	
	@Override
	public NotificationEmail ajouter(NotificationEmail notificationEmail) {
		return notificationEmailDao.save(notificationEmail);
	}

	@Override
	public NotificationEmail modifier(NotificationEmail notificationEmail) {
		return notificationEmailDao.save(notificationEmail);
	}

	@Override
	public void supprimer(NotificationEmail notificationEmail) {
		notificationEmailDao.delete(notificationEmail);
		
	}

	@Override
	public void SupprimerById(Long id) {
		notificationEmailDao.deleteById(id);
		
	}

	@Override
	public NotificationEmail getNotificationEmail(Long id) {
		
		return notificationEmailDao.findById(id).get();
	}

	@Override
	public List<NotificationEmail> getAllNotificationEmail() {
		
		return notificationEmailDao.findAll();
	}

}
