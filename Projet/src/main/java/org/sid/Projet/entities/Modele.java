package org.sid.Projet.entities;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "modele")
@AttributeOverride(name = "id", column = @Column(name = "code"))
@Inheritance( strategy = InheritanceType.JOINED )
public abstract class Modele extends ObjetPersistant {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1655627500927855599L;
		
	public Modele() {
		super();
	}
	
	public Modele(Long id) {
		setId(id);
	}
	
	public Modele(String titre, String message) {
		super();
		this.titre = titre;
		this.message = message;
	}

	@Column(name="titre",   nullable=false)
	private String titre;
	@Column(name="message", nullable=false)
	private String message;
	
	@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="code_camp", nullable=false)
    private Campagne campagne;
	
	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public Campagne getCampagne() {
		return campagne;
	}

	public void setCampagne(Campagne campagne) {
		this.campagne = campagne;
	}

}
