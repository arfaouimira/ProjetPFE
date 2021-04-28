package org.sid.Projet.service;

import java.util.List;

import javax.transaction.Transactional;

import org.sid.Projet.entities.NotificationAlerte;
import org.sid.Projet.idao.INotificationAlerteDao;
import org.sid.Projet.iservice.INotificationAlerteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class NotificationAlerteService implements INotificationAlerteService {
	
	@Autowired
	INotificationAlerteDao  notificationAlerteDao;

	@Override
	public NotificationAlerte ajouter(NotificationAlerte notificationAlerte) {
		
		return notificationAlerteDao.save(notificationAlerte);
	}

	@Override
	public NotificationAlerte modifier(NotificationAlerte notificationAlerte) {
		return notificationAlerteDao.save(notificationAlerte);
	}

	@Override
	public void supprimer(NotificationAlerte notificationAlerte) {
		notificationAlerteDao.delete(notificationAlerte);
		
	}

	@Override
	public void SupprimerById(Long id) {
		notificationAlerteDao.deleteById(id);
		
	}

	@Override
	public NotificationAlerte getNotificationAlerte(Long id) {
		return notificationAlerteDao.findById(id).get();
	}

	@Override
	public List<NotificationAlerte> getAllNotificationAlerte() {
		
		return notificationAlerteDao.findAll();
	}

}
