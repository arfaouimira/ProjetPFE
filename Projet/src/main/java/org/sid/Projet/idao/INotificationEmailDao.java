package org.sid.Projet.idao;

import org.sid.Projet.entities.NotificationEmail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface INotificationEmailDao extends JpaRepository<NotificationEmail, Long> {

}
