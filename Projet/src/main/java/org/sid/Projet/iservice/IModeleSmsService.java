package org.sid.Projet.iservice;

import java.util.List;

import org.sid.Projet.entities.ModeleSms;

public interface IModeleSmsService {
	
	ModeleSms ajouter(ModeleSms modeleSms); 
	ModeleSms modifier(ModeleSms modeleSms); 
	void supprimer(ModeleSms modeleSms);
	void SupprimerById(Long id);
	ModeleSms getModeleSms(Long id);
	List<ModeleSms> getAllModeleSms();

}
