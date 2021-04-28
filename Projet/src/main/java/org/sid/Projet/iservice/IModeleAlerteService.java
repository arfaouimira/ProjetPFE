package org.sid.Projet.iservice;

import java.util.List;

import org.sid.Projet.entities.ModeleAlerte;

public interface IModeleAlerteService {
	
	ModeleAlerte ajouter(ModeleAlerte modeleAlerte); 
	ModeleAlerte modifier(ModeleAlerte modeleAlerte); 
	void supprimer(ModeleAlerte modeleAlerte);
	void SupprimerById(Long id);
	ModeleAlerte getModeleAlerte(Long id);
	List<ModeleAlerte> getAllModeleAlerte();

}
