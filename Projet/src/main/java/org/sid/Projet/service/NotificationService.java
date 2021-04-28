package org.sid.Projet.service;

import java.util.List;

import org.sid.Projet.entities.Notification;
import org.sid.Projet.idao.INotificationDao;
import org.sid.Projet.iservice.INotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class NotificationService implements INotificationService {

	@Autowired
	INotificationDao notificationDao;

	@Override
	public Notification ajouter(Notification notification) {
		
		return notificationDao.save(notification);
	}

	@Override
	public Notification modifier(Notification notification) {
		return notificationDao.save(notification);
	}

	@Override
	public void supprimer(Notification notification) {
		notificationDao.delete(notification);
		
	}

	@Override
	public void SupprimerById(Long id) {
		notificationDao.deleteById(id);
		
	}

	@Override
	public Notification getNotification(Long id) {
		
		return notificationDao.findById(id).get();
	}

	@Override
	public List<Notification> getAllNotification() {
		
		return notificationDao.findAll();
	}
	
	

	

}
