package org.sid.Projet.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity 
@Table( name = "campagneEmail" )
@PrimaryKeyJoinColumn( name = "code" )
public class CampagneEmail extends Campagne{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2658457454355657757L;
	
	
	public CampagneEmail() {
		super();
		
	}
	
	
	public CampagneEmail(String nom, Date dateCreation, String format, String message, Date dateEnvoi,
			String emailExpediteur, String emailDestinataire) {
		super(nom, dateCreation, format, message, dateEnvoi);
		this.emailExpediteur = emailExpediteur;
		this.emailDestinataire = emailDestinataire;
	}


	@Column(name="emailExpediteur",   nullable=false)
	private String emailExpediteur;
	@Column(name="emailDestinataire", nullable=false)
	private String emailDestinataire;


	public String getEmailExpediteur() {
		return emailExpediteur;
	}


	public void setEmailExpediteur(String emailExpediteur) {
		this.emailExpediteur = emailExpediteur;
	}


	public String getEmailDestinataire() {
		return emailDestinataire;
	}


	public void setEmailDestinataire(String emailDestinataire) {
		this.emailDestinataire = emailDestinataire;
	}
	
	

}
