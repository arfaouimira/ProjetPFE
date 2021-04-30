package org.sid.Projet.entities;


import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "compteRendu")
@AttributeOverride(name = "id", column = @Column(name = "code"))
public class CompteRendu extends ObjetPersistant {

	/**
	 * 
	 */
	private static final long serialVersionUID = -105946087124045658L;

	public CompteRendu() {
		super();
		
	}
	
	public CompteRendu(Long id) {
		setId(id);	
	}
	
	public CompteRendu(String message, String destinataire, String typeCampagne, Integer nombreEmail, Integer nombreSms,
			Integer nombreAlerte, String dateCreation, String dateEnvoi, String etat) {
		super();
		this.message = message;
		this.destinataire = destinataire;
		this.typeCampagne = typeCampagne;
		this.nombreEmail = nombreEmail;
		this.nombreSms = nombreSms;
		this.nombreAlerte = nombreAlerte;
		this.dateCreation = dateCreation;
		this.dateEnvoi = dateEnvoi;
		this.etat = etat;
	}

	@Column(name="message", 	 nullable=false)
	private String message;
	@Column(name="destinataire", nullable=false)
	private String destinataire;
	@Column(name="typeCampagne", nullable=false)
	private String typeCampagne;
	@Column(name="nombreEmail",  nullable=false)
	private Integer nombreEmail;
	@Column(name="nombreSms",    nullable=false)
	private Integer nombreSms;
	@Column(name="nombreAlerte", nullable=false)
	private Integer nombreAlerte;
	@Column(name="dateCreation", nullable=false)
	private String dateCreation;
	@Column(name="dateEnvoi",    nullable=false)
	private String dateEnvoi;
	@Column(name="etat", nullable=false)
	private String etat;
	
	
	  @ManyToOne(fetch=FetchType.EAGER)
	  
	  @JoinColumn(name="code_camp", nullable=false) private Campagne campagne;
	 
	 

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDestinataire() {
		return destinataire;
	}

	public void setDestinataire(String destinataire) {
		this.destinataire = destinataire;
	}

	public String getTypeCampagne() {
		return typeCampagne;
	}

	public void setTypeCampagne(String typeCampagne) {
		this.typeCampagne = typeCampagne;
	}

	public Integer getNombreEmail() {
		return nombreEmail;
	}

	public void setNombreEmail(Integer nombreEmail) {
		this.nombreEmail = nombreEmail;
	}

	public Integer getNombreSms() {
		return nombreSms;
	}

	public void setNombreSms(Integer nombreSms) {
		this.nombreSms = nombreSms;
	}

	public Integer getNombreAlerte() {
		return nombreAlerte;
	}

	public void setNombreAlerte(Integer nombreAlerte) {
		this.nombreAlerte = nombreAlerte;
	}

	public String getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}

	public String getDateEnvoi() {
		return dateEnvoi;
	}

	public void setDateEnvoi(String dateEnvoi) {
		this.dateEnvoi = dateEnvoi;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}
	
	
	
	  public Campagne getCampagne() { return campagne; }
	  
	  public void setCampagne(Campagne campagne) { this.campagne = campagne; }
	 
	 

}
