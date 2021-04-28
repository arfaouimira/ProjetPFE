package org.sid.Projet.entities;

import java.util.Date;

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
			Integer nombreAlerte, Date dateCreation, Date dateEnvoi, String statut) {
		super();
		this.message = message;
		this.destinataire = destinataire;
		this.typeCampagne = typeCampagne;
		this.nombreEmail = nombreEmail;
		this.nombreSms = nombreSms;
		this.nombreAlerte = nombreAlerte;
		this.dateCreation = dateCreation;
		this.dateEnvoi = dateEnvoi;
		this.Statut = statut;
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
	private Date dateCreation;
	@Column(name="dateEnvoi",    nullable=false)
	private Date dateEnvoi;
	@Column(name="Statut",       nullable=false)
	private String Statut;
	
	@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="code_camp", nullable=false)
    private Campagne campagne;

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

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Date getDateEnvoi() {
		return dateEnvoi;
	}

	public void setDateEnvoi(Date dateEnvoi) {
		this.dateEnvoi = dateEnvoi;
	}

	public String getStatut() {
		return Statut;
	}

	public void setStatut(String statut) {
		this.Statut = statut;
	}
	
	public Campagne getCampagne() {
		return campagne;
	}

	public void setCampagne(Campagne campagne) {
		this.campagne = campagne;
	}

}
