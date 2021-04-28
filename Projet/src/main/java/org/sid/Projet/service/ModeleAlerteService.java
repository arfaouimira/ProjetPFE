package org.sid.Projet.service;

import java.util.List;

import org.sid.Projet.entities.ModeleAlerte;
import org.sid.Projet.idao.IModeleAlerteDao;
import org.sid.Projet.iservice.IModeleAlerteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ModeleAlerteService implements IModeleAlerteService  {

	@Autowired
	IModeleAlerteDao modeleAlerteDao;
	
	@Override
	public ModeleAlerte ajouter(ModeleAlerte modeleAlerte) {
		
		return modeleAlerteDao.save(modeleAlerte);
	}

	@Override
	public ModeleAlerte modifier(ModeleAlerte modeleAlerte) {
		return modeleAlerteDao.save(modeleAlerte);
	}

	@Override
	public void supprimer(ModeleAlerte modeleAlerte) {
		modeleAlerteDao.delete(modeleAlerte);
		
	}

	@Override
	public void SupprimerById(Long id) {
		modeleAlerteDao.deleteById(id);
		
	}

	@Override
	public ModeleAlerte getModeleAlerte(Long id) {
		return modeleAlerteDao.findById(id).get();
	}

	@Override
	public List<ModeleAlerte> getAllModeleAlerte() {
		
		return modeleAlerteDao.findAll();
	}

}
