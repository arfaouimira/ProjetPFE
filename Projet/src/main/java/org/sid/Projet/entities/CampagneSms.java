package org.sid.Projet.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity 
@Table( name = "campagneSms" )
@PrimaryKeyJoinColumn( name = "code" )
public class CampagneSms extends Campagne {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3403280746735600210L;
			
	public CampagneSms() {
		super();
	}
	
	public CampagneSms(String nom, Date dateCreation, String format, String message, Date dateEnvoi, String telephone,
			String nombreCaractere) {
		super(nom, dateCreation, format, message, dateEnvoi);
		this.telephone = telephone;
		this.nombreCaractere = nombreCaractere;
	}

	@Column(name="telephone",       nullable=false)
	private String telephone;
	@Column(name="nombreCaractere", nullable=false)
	private String nombreCaractere;

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getNombreCaractere() {
		return nombreCaractere;
	}

	public void setNombreCaractere(String nombreCaractere) {
		this.nombreCaractere = nombreCaractere;
	}
	
	

}
