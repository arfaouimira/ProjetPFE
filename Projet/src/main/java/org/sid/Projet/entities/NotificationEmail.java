package org.sid.Projet.entities;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity 
@Table( name = "notificationEmail" )
@PrimaryKeyJoinColumn( name = "code" )
public class NotificationEmail extends Notification{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4050050640150052651L;

}
