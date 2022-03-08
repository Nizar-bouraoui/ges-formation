package com.esprit.examen.services;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.examen.entities.Formateur;
import com.esprit.examen.entities.TypeCours;
import com.esprit.examen.repositories.FormateurRepository;

@Service
public class FormateurService implements IFormateurService{
	private static final org.apache.logging.log4j.Logger l  = LogManager.getLogger(FormateurService.class);
	@Autowired
	FormateurRepository formateurRepository;
	@Override
	public void addFormateur(Formateur formateur) {
		try {
			l.info("je vais lancer l'ajout d'un formateur" );
			l.debug("testing logging ");
		formateurRepository.save(formateur);
		l.info(" je viens de finir l'opération de l'ajout");
		l.debug(" out without errors");
	}catch (Exception e) {
		l.error("Erreur dans l'ajout(): ", e);
	}
	}

	@Override
	public Long modifierFormateur(Formateur formateur) {
		formateurRepository.save(formateur);
		return formateur.getId();
	}

	@Override
	public void supprimerFormateur(Long formateurId) {
		formateurRepository.deleteById(formateurId);
		
	}

//	@Override
//	public Long nombreFormateursImpliquesDansUnCours(TypeCours typeCours) {
//		return formateurRepository.nombreFormateursImpliquesDansUnCours(typeCours);
//		
//	}



	@Override
	public List<Formateur> listFormateurs() {
		
		return formateurRepository.findAll();
	}
	
	@Override
 public Long countFormateurs() {
	return formateurRepository.count();
	 
 }

	
	

}
