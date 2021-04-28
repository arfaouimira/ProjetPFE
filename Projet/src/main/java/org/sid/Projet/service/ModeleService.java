package org.sid.Projet.service;

import java.util.List;

import org.sid.Projet.entities.Modele;
import org.sid.Projet.idao.IModeleDao;
import org.sid.Projet.iservice.IModeleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ModeleService implements IModeleService {

	@Autowired
	IModeleDao modeleDao;

	@Override
	public Modele ajouter(Modele modele) {
		
		return modeleDao.save(modele);
	}

	@Override
	public Modele modifier(Modele modele) {
		return modeleDao.save(modele);
	}

	@Override
	public void supprimer(Modele modele) {
		modeleDao.delete(modele);
		
	}

	@Override
	public void SupprimerById(Long id) {
		modeleDao.deleteById(id);
		
	}

	@Override
	public Modele getModele(Long id) {
		return modeleDao.findById(id).get();
	}

	@Override
	public List<Modele> getAllModele() {
		
		return modeleDao.findAll();
	}

	@Override
	public List<Modele> chercherParTitre(String titre) {		
		return modeleDao.chercherParTitre(titre);
	}

	
	
	

	

}
