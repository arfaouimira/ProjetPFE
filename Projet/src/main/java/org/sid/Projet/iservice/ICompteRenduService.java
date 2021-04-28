package org.sid.Projet.iservice;

import java.util.List;
import org.sid.Projet.entities.CompteRendu;

public interface ICompteRenduService {
		
	CompteRendu ajouter(CompteRendu compteRendu); 
	CompteRendu modifier(CompteRendu compteRendu); 
	void supprimer(CompteRendu compteRendu);
	void SupprimerById(Long id);
	CompteRendu getCompteRendu(Long id);
	List<CompteRendu> getAllCompteRendu();
	List<CompteRendu> chercherParTypeCampagne(String typeCampagne );
	

}
