package org.sid.Projet.service;

import java.util.List;

import org.sid.Projet.entities.NotificationSms;
import org.sid.Projet.idao.INotificationSmsDao;
import org.sid.Projet.iservice.INotificationSmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class NotificationSmsService implements INotificationSmsService{

	@Autowired
	INotificationSmsDao notificationSmsDao;

	@Override
	public NotificationSms ajouter(NotificationSms notificationSms) {
		
		return notificationSmsDao.save(notificationSms);
	}

	@Override
	public NotificationSms modifier(NotificationSms notificationSms) {
		return notificationSmsDao.save(notificationSms);
	}

	@Override
	public void supprimer(NotificationSms notificationSms) {
		notificationSmsDao.delete(notificationSms);
		
	}

	@Override
	public void SupprimerById(Long id) {
		notificationSmsDao.deleteById(id);
		
	}

	@Override
	public NotificationSms getNotificationSms(Long id) {
		
		return notificationSmsDao.findById(id).get();
	}

	@Override
	public List<NotificationSms> getAllNotificationSms() {
		
		return notificationSmsDao.findAll();
	}
	
	

}
