package org.sid.Projet.entities;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity 
@Table( name = "modeleAlerte" )
@PrimaryKeyJoinColumn( name = "code" )
public class ModeleAlerte extends Modele {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1869525861836366067L;

}
