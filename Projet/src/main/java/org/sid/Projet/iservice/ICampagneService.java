package org.sid.Projet.iservice;

import java.util.List;

import org.sid.Projet.entities.Campagne;

public interface ICampagneService {
	Campagne ajouter(Campagne campagne); 
	Campagne modifier(Campagne campagne); 
	void supprimer(Campagne campagne);
	void SupprimerById(Long id);
	Campagne getCampagne(Long id);
	List<Campagne> getAllCampagne();
	List<Campagne> chercherParNom(String nom);
	
	
	
	

}
