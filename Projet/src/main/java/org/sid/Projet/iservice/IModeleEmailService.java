package org.sid.Projet.iservice;

import java.util.List;

import org.sid.Projet.entities.ModeleEmail;


public interface IModeleEmailService {
	
	ModeleEmail ajouter(ModeleEmail modeleEmail); 
	ModeleEmail modifier(ModeleEmail modeleEmail); 
	void supprimer(ModeleEmail modeleEmail);
	void SupprimerById(Long id);
	ModeleEmail getModeleEmail(Long id);
	List<ModeleEmail> getAllModeleEmail();

}
