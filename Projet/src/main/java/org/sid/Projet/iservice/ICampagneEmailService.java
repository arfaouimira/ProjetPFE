package org.sid.Projet.iservice;

import java.util.List;

import org.sid.Projet.entities.CampagneEmail;

public interface ICampagneEmailService {
	
	CampagneEmail ajouter(CampagneEmail campagneEmail); 
	CampagneEmail modifier(CampagneEmail campagneEmail); 
	void supprimer(CampagneEmail campagneEmail);
	void SupprimerById(Long id);
	CampagneEmail getCampagneEmail(Long id);
	List<CampagneEmail> getAllCampagneEmail();

}
