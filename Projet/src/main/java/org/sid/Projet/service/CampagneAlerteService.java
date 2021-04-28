package org.sid.Projet.service;

import java.util.List;

import org.sid.Projet.entities.CampagneAlerte;
import org.sid.Projet.idao.ICampagneAlerteDao;
import org.sid.Projet.iservice.ICampagneAlerteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CampagneAlerteService implements ICampagneAlerteService {

	@Autowired
	ICampagneAlerteDao campagneAlerteDao;
	
	@Override
	public CampagneAlerte ajouter(CampagneAlerte campagneAlerte) {
		
		return campagneAlerteDao.save(campagneAlerte);
	}

	@Override
	public CampagneAlerte modifier(CampagneAlerte campagneAlerte) {
		return campagneAlerteDao.save(campagneAlerte);
	}

	@Override
	public void supprimer(CampagneAlerte campagneAlerte) {
		campagneAlerteDao.delete(campagneAlerte);
		
	}

	@Override
	public void SupprimerById(Long id) {
		campagneAlerteDao.deleteById(id);
		
	}

	@Override
	public CampagneAlerte getCampagneAlerte(Long id) {
		return campagneAlerteDao.findById(id).get();
	}

	@Override
	public List<CampagneAlerte> getAllCampagneAlerte() {
		return campagneAlerteDao.findAll();
	}

}
