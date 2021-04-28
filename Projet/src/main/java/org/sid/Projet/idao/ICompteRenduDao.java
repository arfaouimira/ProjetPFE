package org.sid.Projet.idao;

import java.util.List;

import org.sid.Projet.entities.CompteRendu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ICompteRenduDao extends JpaRepository<CompteRendu, Long> {

	
	@Query(value="Select cr.* from CompteRendu cr where cr.typeCampagne = :typeCampagne", nativeQuery=true)
	public List<CompteRendu> chercherParTypeCampagne(String typeCampagne);

}
