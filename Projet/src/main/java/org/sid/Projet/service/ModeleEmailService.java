package org.sid.Projet.service;

import java.util.List;

import org.sid.Projet.entities.ModeleEmail;
import org.sid.Projet.idao.IModeleEmailDao;
import org.sid.Projet.iservice.IModeleEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ModeleEmailService implements IModeleEmailService {

	@Autowired
	IModeleEmailDao modeleEmailDao;
	
	@Override
	public ModeleEmail ajouter(ModeleEmail modeleEmail) {
		return modeleEmailDao.save(modeleEmail);
	}

	@Override
	public ModeleEmail modifier(ModeleEmail modeleEmail) {
		return modeleEmailDao.save(modeleEmail);
	}

	@Override
	public void supprimer(ModeleEmail modeleEmail) {
		modeleEmailDao.delete(modeleEmail);
		
	}

	@Override
	public void SupprimerById(Long id) {
		modeleEmailDao.deleteById(id);
		
	}

	@Override
	public ModeleEmail getModeleEmail(Long id) {
		return modeleEmailDao.findById(id).get();
	}

	@Override
	public List<ModeleEmail> getAllModeleEmail() {
		return modeleEmailDao.findAll();
	}

}
