package org.sid.Projet.entities;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity 
@Table( name = "notificationSms" )
@PrimaryKeyJoinColumn( name = "code" )
public class NotificationSms extends Notification {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5634922686780052660L;

}
