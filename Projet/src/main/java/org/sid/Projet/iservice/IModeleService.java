package org.sid.Projet.iservice;

import java.util.List;

import org.sid.Projet.entities.Modele;

public interface IModeleService {
	
	Modele ajouter(Modele modele); 
	Modele modifier(Modele modele); 
	void supprimer(Modele modele);
	void SupprimerById(Long id);
	Modele getModele(Long id);
	List<Modele> getAllModele();
	List<Modele> chercherParTitre(String titre);
	
	

}
