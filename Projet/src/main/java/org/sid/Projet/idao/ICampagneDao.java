package org.sid.Projet.idao;

import java.util.List;

import org.sid.Projet.entities.Campagne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ICampagneDao extends JpaRepository<Campagne, Long> {

	@Query(value="Select c.* from Campagne c where c.nom = :nom", nativeQuery=true)
	List<Campagne> chercherParNom(@Param("nom") String nom);
	
	
	
	
}
