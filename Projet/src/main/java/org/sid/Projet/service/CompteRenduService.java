package org.sid.Projet.service;

import java.util.List;

import org.sid.Projet.entities.CompteRendu;
import org.sid.Projet.idao.ICompteRenduDao;
import org.sid.Projet.iservice.ICompteRenduService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CompteRenduService implements ICompteRenduService {
	
	@Autowired
    ICompteRenduDao compteRenduDao;

	@Override
	public CompteRendu ajouter(CompteRendu compteRendu) {
		
		return compteRenduDao.save(compteRendu);
	}

	@Override
	public CompteRendu modifier(CompteRendu compteRendu) {
		return compteRenduDao.save(compteRendu);
	}

	@Override
	public void supprimer(CompteRendu compteRendu) {
		compteRenduDao.delete(compteRendu);
		
	}

	@Override
	public void SupprimerById(Long id) {
		compteRenduDao.deleteById(id);
		
	}

	@Override
	public CompteRendu getCompteRendu(Long id) {
		return compteRenduDao.findById(id).get();
	}

	@Override
	public List<CompteRendu> getAllCompteRendu() {
		return compteRenduDao.findAll();
	}

	@Override
	public List<CompteRendu> chercherParTypeCampagne(String typeCampagne) {
		return compteRenduDao.chercherParTypeCampagne(typeCampagne);
	}
	
	

}
