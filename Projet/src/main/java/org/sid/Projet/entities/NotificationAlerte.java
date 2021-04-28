package org.sid.Projet.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity 
@Table( name = "notificationAlerte" )
@PrimaryKeyJoinColumn( name = "code" )
public class NotificationAlerte extends Notification {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3873593884327068358L;
	
	public NotificationAlerte() {
		super();
	}
		
	public NotificationAlerte(String titre, String message, String urlDoc, String demande, Date date, String lu) {
		super(titre, message);
		this.urlDoc = urlDoc;
		this.demande = demande;
		this.date = date;
		this.lu = lu;
	}

	@Column(name="urlDoc", nullable=false)
	private String urlDoc;
	@Column(name="demande", nullable=false)
	private String demande;
	@Column(name="date", nullable=false)
	private Date date;
	@Column(name="lu", nullable=false)
	private String lu;

	public String getUrlDoc() {
		return urlDoc;
	}


	public void setUrlDoc(String urlDoc) {
		this.urlDoc = urlDoc;
	}


	public String getDemande() {
		return demande;
	}


	public void setDemande(String demande) {
		this.demande = demande;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getLu() {
		return lu;
	}


	public void setLu(String lu) {
		this.lu = lu;
	}
	
	

}
