package org.sid.Projet.service;

import java.util.List;

import org.sid.Projet.entities.CampagneEmail;
import org.sid.Projet.idao.ICampagneEmailDao;
import org.sid.Projet.iservice.ICampagneEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class CampagneEmailService implements ICampagneEmailService {

	@Autowired
    ICampagneEmailDao campagneEmailDao;
	
	@Override
	public CampagneEmail ajouter(CampagneEmail campagneEmail) {
		return campagneEmailDao.save(campagneEmail);
	}

	@Override
	public CampagneEmail modifier(CampagneEmail campagneEmail) {
		return campagneEmailDao.save(campagneEmail);
	}

	@Override
	public void supprimer(CampagneEmail campagneEmail) {
		campagneEmailDao.delete(campagneEmail);
		
	}

	@Override
	public void SupprimerById(Long id) {
		campagneEmailDao.deleteById(id);
		
	}

	@Override
	public CampagneEmail getCampagneEmail(Long id) {
		return campagneEmailDao.findById(id).get();
		
	}

	@Override
	public List<CampagneEmail> getAllCampagneEmail() {
		
		return campagneEmailDao.findAll();
	}

}
