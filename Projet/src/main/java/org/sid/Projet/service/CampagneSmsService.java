package org.sid.Projet.service;

import java.util.List;

import org.sid.Projet.entities.CampagneSms;
import org.sid.Projet.idao.ICampagneSmsDao;
import org.sid.Projet.iservice.ICampagneSmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CampagneSmsService implements ICampagneSmsService {

	@Autowired
	ICampagneSmsDao campagneSmsDao;
	
	@Override
	public CampagneSms ajouter(CampagneSms campagneSms) {
		
		return campagneSmsDao.save(campagneSms);
	}

	@Override
	public CampagneSms modifier(CampagneSms campagneSms) {
		return campagneSmsDao.save(campagneSms);
	}

	@Override
	public void supprimer(CampagneSms campagneSms) {
		campagneSmsDao.delete(campagneSms);
		
	}

	@Override
	public void SupprimerById(Long id) {
		campagneSmsDao.deleteById(id);
		
	}

	@Override
	public CampagneSms getCampagneSms(Long id) {
		return campagneSmsDao.findById(id).get();
	}

	@Override
	public List<CampagneSms> getAllCampagneSms() {
		return campagneSmsDao.findAll();
	}

}
