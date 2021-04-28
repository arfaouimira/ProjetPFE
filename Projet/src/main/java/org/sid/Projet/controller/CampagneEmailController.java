package org.sid.Projet.controller;

import org.sid.Projet.iservice.ICampagneEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CampagneEmailController {
	
	@Autowired
	ICampagneEmailService campagneEmailService;

}
