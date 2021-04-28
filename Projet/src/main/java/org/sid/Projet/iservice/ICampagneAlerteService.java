package org.sid.Projet.iservice;

import java.util.List;

import org.sid.Projet.entities.CampagneAlerte;

public interface ICampagneAlerteService {
	
	CampagneAlerte ajouter(CampagneAlerte campagneAlerte); 
	CampagneAlerte modifier(CampagneAlerte campagneAlerte); 
	void supprimer(CampagneAlerte campagneAlerte);
	void SupprimerById(Long id);
	CampagneAlerte getCampagneAlerte(Long id);
	List<CampagneAlerte> getAllCampagneAlerte();


}
