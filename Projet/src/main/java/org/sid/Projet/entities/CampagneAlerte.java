package org.sid.Projet.entities;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity 
@Table( name = "campagneAlerte" )
@PrimaryKeyJoinColumn( name = "code" )
public class CampagneAlerte extends Campagne {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5338426054278231658L;
	
	

}
