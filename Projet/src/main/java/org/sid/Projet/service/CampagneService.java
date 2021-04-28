package org.sid.Projet.service;


import java.util.List;

import org.sid.Projet.entities.Campagne;
import org.sid.Projet.idao.ICampagneDao;
import org.sid.Projet.iservice.ICampagneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CampagneService implements ICampagneService {

	@Autowired
    ICampagneDao campagneDao;

	@Override
	public Campagne ajouter(Campagne campagne) {
		return campagneDao.save(campagne);
	}

	@Override
	public Campagne modifier(Campagne campagne) {
		return campagneDao.save(campagne);
	}

	@Override
	public void supprimer(Campagne campagne) {
		campagneDao.delete(campagne);
		
	}

	@Override
	public void SupprimerById(Long id) {
		campagneDao.deleteById(id);
		
	}

	@Override
	public Campagne getCampagne(Long id) {
		return campagneDao.findById(id).get();
		
	}

	@Override
	public List<Campagne> getAllCampagne() {
		return campagneDao.findAll();
	}

	@Override
	public List<Campagne> chercherParNom(String nom) {
		return campagneDao.chercherParNom(nom);
	}
	
	

	

	

	

}
