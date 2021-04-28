package org.sid.Projet.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity 
@Table( name = "modeleEmail" )
@PrimaryKeyJoinColumn( name = "code" )
public class ModeleEmail extends Modele {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1129314983893765505L;
	
	public ModeleEmail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ModeleEmail(String titre, String message, String email) {
		super(titre, message);
		this.email = email;
	}

	@Column(name="email",   nullable=false)
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
