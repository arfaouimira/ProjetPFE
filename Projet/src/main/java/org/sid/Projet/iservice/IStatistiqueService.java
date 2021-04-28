package org.sid.Projet.iservice;

import java.util.List;


import org.sid.Projet.entities.Statistique;

public interface IStatistiqueService {
	
	Statistique ajouter(Statistique statistique); 
	Statistique modifier(Statistique statistique); 
	void supprimer(Statistique statistique);
	void SupprimerById(Long id);
	Statistique getStatistique(Long id);
	List<Statistique> getAllStatistique();

}
