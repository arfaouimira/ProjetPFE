package org.sid.Projet.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity 
@Table( name = "statistique" )
@PrimaryKeyJoinColumn( name = "code" )
public class Statistique extends ObjetPersistant {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1680305873294107865L;
	
	public Statistique() {
		super();
	}
	
	public Statistique(Long id) {
		setId(id);
	} 
	public Statistique(String typeCampagne, Date dateEnvoi, Integer ouvert, Integer clique, Integer erreur,
			Integer spam) {
		super();
		this.typeCampagne = typeCampagne;
		this.dateEnvoi = dateEnvoi;
		this.ouvert = ouvert;
		this.clique = clique;
		this.erreur = erreur;
		this.spam = spam;
	}

	@Column(name="typeCampagne",   nullable=false)
	private String typeCampagne;
	@Column(name="dateEnvoi",   nullable=false)
	private Date dateEnvoi;
	@Column(name="ouvert",   nullable=false)
	private Integer ouvert;
	@Column(name="clique",   nullable=false)
	private Integer clique;
	@Column(name="erreur",   nullable=false)
	private Integer erreur;
	@Column(name="spam",   nullable=false)
	private Integer spam;
	
	@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="code_camp", nullable=false)
    private Campagne campagne;


	public String getTypeCampagne() {
		return typeCampagne;
	}

	public void setTypeCampagne(String typeCampagne) {
		this.typeCampagne = typeCampagne;
	}

	public Date getDateEnvoi() {
		return dateEnvoi;
	}

	public void setDateEnvoi(Date dateEnvoi) {
		this.dateEnvoi = dateEnvoi;
	}

	public Integer getOuvert() {
		return ouvert;
	}

	public void setOuvert(Integer ouvert) {
		this.ouvert = ouvert;
	}

	public Integer getClique() {
		return clique;
	}

	public void setClique(Integer clique) {
		this.clique = clique;
	}

	public Integer getErreur() {
		return erreur;
	}

	public void setErreur(Integer erreur) {
		this.erreur = erreur;
	}

	public Integer getSpam() {
		return spam;
	}

	public void setSpam(Integer spam) {
		this.spam = spam;
	}
	
	public Campagne getCampagne() {
		return campagne;
	}

	public void setCampagne(Campagne campagne) {
		this.campagne = campagne;
	}

}
