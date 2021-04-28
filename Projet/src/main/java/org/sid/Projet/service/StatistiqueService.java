package org.sid.Projet.service;

import java.util.List;

import org.sid.Projet.entities.Statistique;
import org.sid.Projet.idao.IStatistiqueDao;
import org.sid.Projet.iservice.IStatistiqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StatistiqueService implements IStatistiqueService {

	@Autowired
    IStatistiqueDao statistiqueDao;

	@Override
	public Statistique ajouter(Statistique statistique) {
		
		return statistiqueDao.save(statistique);
	}

	@Override
	public Statistique modifier(Statistique statistique) {
		return statistiqueDao.save(statistique);
	}

	@Override
	public void supprimer(Statistique statistique) {
		statistiqueDao.delete(statistique);
		
	}

	@Override
	public void SupprimerById(Long id) {
		statistiqueDao.deleteById(id);
		
	}

	@Override
	public Statistique getStatistique(Long id) {
		
		return statistiqueDao.findById(id).get();
	}

	@Override
	public List<Statistique> getAllStatistique() {
		
		return statistiqueDao.findAll();
	}
	

	
	

}
