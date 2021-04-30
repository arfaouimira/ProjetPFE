package org.sid.Projet.entities;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "campagne")
@AttributeOverride(name = "id", column = @Column(name = "code"))
@Inheritance( strategy = InheritanceType.JOINED )
public abstract class Campagne extends ObjetPersistant {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6991183321784856111L;
	
	public Campagne() {
		super();
	}
	
	public Campagne(Long id) {
		setId(id);
	}
	
	public Campagne(String nom, Date dateCreation, String format, String message, Date dateEnvoi) {
		super();
		this.nom = nom;
		this.dateCreation = dateCreation;
		this.format = format;
		this.message = message;
		this.dateEnvoi = dateEnvoi;
	}


	@Column(name="nom",          nullable=false)
	private String nom;
	@Column(name="dateCreation", nullable=false)
	private Date dateCreation;
	@Column(name="format",       nullable=false)
	private String format;
	@Column(name="message",      nullable=false)
	private String message;
	@Column(name="dateEnvoi",    nullable=false)
	private Date dateEnvoi;
	
	/*
	 * @OneToMany( targetEntity=CompteRendu.class, mappedBy="campagne" ) private
	 * List<CompteRendu> compteRendus = new ArrayList<>();
	 */
	
	@OneToMany( targetEntity=Statistique.class, mappedBy="campagne" )
    private List<Statistique> statistiques = new ArrayList<>();
	
	@OneToMany( targetEntity=Notification.class, mappedBy="campagne" )
    private List<Notification> notifications = new ArrayList<>();
	
	@OneToMany( targetEntity=Modele.class, mappedBy="campagne" )
	private List<Modele> modeles = new ArrayList<>();
	 

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getDateEnvoi() {
		return dateEnvoi;
	}

	public void setDateEnvoi(Date dateEnvoi) {
		this.dateEnvoi = dateEnvoi;
	}

	/*
	 * public List<CompteRendu> getCompteRendus() { return compteRendus; }
	 * 
	 * public void setCompteRendus(List<CompteRendu> compteRendus) {
	 * this.compteRendus = compteRendus; }
	 */

	public List<Statistique> getStatistiques() {
		return statistiques;
	}

	public void setStatistiques(List<Statistique> statistiques) {
		this.statistiques = statistiques;
	}

	public List<Notification> getNotifications() {
		return notifications;
	}

	public void setNotifications(List<Notification> notifications) {
		this.notifications = notifications;
	}

	
	public List<Modele> getModeles() { 
		return modeles; 
	}
	  
	public void setModeles(List<Modele> modeles) { 
		this.modeles = modeles; 
	}
	 
	
	
	

}
