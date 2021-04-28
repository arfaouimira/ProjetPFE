package org.sid.Projet.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity 
@Table( name = "modeleSms" )
@PrimaryKeyJoinColumn( name = "code" )
public class ModeleSms extends Modele {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4324792248956340926L;
	
	
	
	public ModeleSms() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ModeleSms(String titre, String message, String telephone) {
		super(titre, message);
		this.telephone = telephone;
	}

	@Column(name="telephone", nullable=false)
	private String telephone;

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	

}
