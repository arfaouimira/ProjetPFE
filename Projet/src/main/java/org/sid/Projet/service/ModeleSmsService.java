package org.sid.Projet.service;

import java.util.List;

import org.sid.Projet.entities.ModeleSms;
import org.sid.Projet.idao.IModeleSmsDao;
import org.sid.Projet.iservice.IModeleSmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ModeleSmsService implements IModeleSmsService {

	@Autowired
	IModeleSmsDao modeleSmsDao;
	
	@Override
	public ModeleSms ajouter(ModeleSms modeleSms) {
		
		return modeleSmsDao.save(modeleSms);
	}

	@Override
	public ModeleSms modifier(ModeleSms modeleSms) {
		return modeleSmsDao.save(modeleSms);
	}

	@Override
	public void supprimer(ModeleSms modeleSms) {
		modeleSmsDao.delete(modeleSms);
		
	}

	@Override
	public void SupprimerById(Long id) {
		modeleSmsDao.deleteById(id);
		
	}

	@Override
	public ModeleSms getModeleSms(Long id) {
		return modeleSmsDao.findById(id).get();
	}

	@Override
	public List<ModeleSms> getAllModeleSms() {
		return modeleSmsDao.findAll();
	}

}
