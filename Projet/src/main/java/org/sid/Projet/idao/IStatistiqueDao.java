package org.sid.Projet.idao;

import org.sid.Projet.entities.Statistique;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStatistiqueDao extends JpaRepository<Statistique, Long> {

	public Statistique findStatistiqueById(Long id);

}
