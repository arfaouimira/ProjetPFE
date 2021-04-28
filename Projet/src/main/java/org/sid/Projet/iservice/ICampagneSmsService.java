package org.sid.Projet.iservice;

import java.util.List;

import org.sid.Projet.entities.CampagneSms;

public interface ICampagneSmsService {
	
	CampagneSms ajouter(CampagneSms campagneSms); 
	CampagneSms modifier(CampagneSms campagneSms); 
	void supprimer(CampagneSms campagneSms);
	void SupprimerById(Long id);
	CampagneSms getCampagneSms(Long id);
	List<CampagneSms> getAllCampagneSms();

}
