package org.sid.Projet.controller;

import org.sid.Projet.iservice.ICampagneAlerteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CampagneAlerteController {
	
	@Autowired
	ICampagneAlerteService campagneAlerteService;

}
