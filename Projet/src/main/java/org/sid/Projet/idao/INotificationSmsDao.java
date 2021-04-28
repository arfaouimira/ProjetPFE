package org.sid.Projet.idao;

import org.sid.Projet.entities.NotificationSms;
import org.springframework.data.jpa.repository.JpaRepository;

public interface INotificationSmsDao extends JpaRepository<NotificationSms, Long> {

}
