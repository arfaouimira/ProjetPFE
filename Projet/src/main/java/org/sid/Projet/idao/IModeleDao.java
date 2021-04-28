package org.sid.Projet.idao;

import java.util.List;

import org.sid.Projet.entities.Modele;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IModeleDao extends JpaRepository<Modele, Long> {
	
	@Query(value = "Selete m.* from Modele m where  m.titre = :titre",nativeQuery = true)
	List<Modele> chercherParTitre(String titre);

}
