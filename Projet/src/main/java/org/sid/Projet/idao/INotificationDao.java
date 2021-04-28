package org.sid.Projet.idao;

import org.sid.Projet.entities.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface INotificationDao extends JpaRepository<Notification, Long> {

}
